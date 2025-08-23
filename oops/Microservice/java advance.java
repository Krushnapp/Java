Core Concepts
Spring Container - IoC container that manages object lifecycle, creates beans, handles dependency injection
Bean - Any Java object managed by Spring container with full lifecycle support
IoC (Inversion of Control) - Design principle where framework controls object creation instead of you
Dependency Injection - Process of Spring automatically providing required dependencies to objects
BeanFactory - Basic Spring container interface providing core DI functionality
        ApplicationContext - Advanced container extending BeanFactory with additional features (events, internationalization)
Bean Discovery & Registration
Component Scanning - Process of automatically finding classes with stereotype annotations (@Service, @Component)
@ComponentScan - Annotation telling Spring where to look for components
@Component - Generic stereotype annotation marking class as Spring-managed bean
@Service - Specialized @Component for service layer classes
@Repository - Specialized @Component for data access layer classes
@Controller - Specialized @Component for presentation layer classes
BeanDefinition - Metadata object containing information about how to create a bean
BeanDefinitionRegistry - Storage for all bean definitions before object creation
Bean Lifecycle
@PostConstruct - Method called after dependency injection is complete
@PreDestroy - Method called before bean destruction during shutdown
InitializingBean - Interface with afterPropertiesSet() method for initialization logic
DisposableBean - Interface with destroy() method for cleanup logic
BeanPostProcessor - Hook for modifying bean instances during creation process
BeanFactoryPostProcessor - Hook for modifying bean definitions before instantiation
Scoping & Proxies
Singleton Scope - Default scope where one instance exists per container (cached)
Prototype Scope - New instance created every time bean is requested
Request Scope - New instance per HTTP request (web applications only)
Session Scope - New instance per HTTP session (web applications only)
@Scope - Annotation to define bean scope
Proxy - Wrapper object that delegates to real bean, enables advanced features
JDK Proxy - Interface-based proxy using reflection (slower)
CGLIB Proxy - Class-based proxy using bytecode manipulation (faster)
ScopedProxyMode - How Spring creates proxies for non-singleton scoped beans
Advanced Features
@Lazy - Delays bean creation until first access, creates proxy initially
@Lookup - Method-level injection for getting new instances of prototype beans
Circular Dependency - Situation where Bean A needs Bean B, and Bean B needs Bean A
3-Level Caching - Spring's mechanism to resolve circular dependencies:

Level 1: singletonObjects (fully ready beans)
Level 2: earlySingletonObjects (early references)
Level 3: singletonFactories (factories for early creation)

Early Bean Reference - Partially created bean object used to resolve circular dependencies
        Configuration
@Configuration - Class-level annotation marking configuration classes
@Bean - Method-level annotation for explicit bean creation
@Import - Import other configuration classes
@Conditional - Create beans only when certain conditions are met
@ConditionalOnProperty - Create bean based on property values
@ConfigurationProperties - Bind external properties to Java objects
@PropertySource - Specify location of property files
Internal Mechanisms
Reflection - Java API for examining/creating objects at runtime (how Spring works)
Class.forName() - Load class by name string
        Constructor.newInstance() - Create object using reflection
Method.invoke() - Call method using reflection
DefaultListableBeanFactory - Main implementation of bean factory
ConcurrentHashMap - Data structure Spring uses to cache singleton beans
ThreadLocal - Per-thread storage used for request/session scoped beans
Troubleshooting Keywords
BeanCurrentlyInCreationException - Error when circular dependency can't be resolved
NoSuchBeanDefinitionException - Bean not found in container
BeanCreationException - General error during bean creation
Actuator - Spring Boot feature providing management endpoints (/beans, /health)
Bean Creation Timing - Time taken to create each bean (performance monitoring)
Startup Optimization - Techniques to reduce Spring application startup time
Quick Reference Patterns
Constructor Injection - Dependencies provided via constructor (recommended)
Setter Injection - Dependencies provided via setter methods (allows circular deps)
Field Injection - Dependencies injected directly into fields via @Autowired (not recommended)
Prototype in Singleton Problem - Singleton bean always gets same prototype instance
Request Context Holder - Spring utility to access current HTTP request
Bean Validation - Automatic validation using @Valid annotations