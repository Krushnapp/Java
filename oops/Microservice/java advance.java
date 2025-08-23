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

        # Extended Spring Container & Bean - Revision Keywords & Definitions

## **Container Initialization & Startup**

        **SpringApplication.run()** - Entry point that bootstraps Spring container

**AnnotationConfigApplicationContext** - Container implementation for annotation-based configuration

**ClassPathXmlApplicationContext** - Container implementation for XML-based configuration

**Environment** - Abstraction for property sources and profiles

**PropertyResolver** - Interface for resolving properties from various sources

**ConversionService** - Service for type conversion during property binding

**BeanDefinitionReader** - Component that reads and registers bean definitions

**AnnotationBeanDefinitionReader** - Reads bean definitions from annotated classes

**ClassPathBeanDefinitionScanner** - Scans classpath for stereotype annotations

**ComponentScanBeanDefinitionParser** - Parses @ComponentScan annotations

## **Advanced Bean Creation**

        **InstantiationStrategy** - Strategy for creating bean instances (reflection vs CGLIB)

**ObjectFactory** - Functional interface for lazy bean creation

**FactoryBean** - Interface for custom bean creation logic

**SmartFactoryBean** - Extended FactoryBean with additional lifecycle callbacks

**BeanWrapper** - Wrapper providing property access and type conversion

**PropertyAccessor** - Interface for accessing object properties

**BeanInstantiationException** - Exception during bean instantiation

**BeanDefinitionValidationException** - Invalid bean definition error

## **Dependency Resolution**

        **DependencyDescriptor** - Describes a dependency injection point

**AutowireCandidateResolver** - Determines which beans are candidates for autowiring

**QualifierAnnotationAutowireCandidateResolver** - Handles @Qualifier annotations

**InjectionPoint** - Represents where dependency injection occurs

**@Autowired** - Annotation for automatic dependency injection

**@Qualifier** - Annotation to specify which bean to inject when multiple candidates exist

**@Primary** - Marks bean as primary choice when multiple candidates exist

**@Value** - Injects property values from environment

**SpEL (Spring Expression Language)** - Expression language for runtime value evaluation

## **Bean Lifecycle Hooks**

        **BeanNameAware** - Interface to get bean's name in container

        **BeanFactoryAware** - Interface to get reference to BeanFactory

**ApplicationContextAware** - Interface to get reference to ApplicationContext

**EnvironmentAware** - Interface to get reference to Environment

**InitializingBean.afterPropertiesSet()** - Callback after property setting

**DisposableBean.destroy()** - Callback before bean destruction

**@EventListener** - Method-level annotation for handling application events

**SmartInitializingSingleton** - Callback after all singletons are instantiated

## **Event System**

        **ApplicationEvent** - Base class for application events

**ApplicationListener** - Interface for listening to application events

**ApplicationEventPublisher** - Interface for publishing events

**ContextRefreshedEvent** - Event fired when ApplicationContext is refreshed

**ContextClosedEvent** - Event fired when ApplicationContext is closed

**@EventListener** - Annotation-based event handling

**@Async** - Asynchronous event processing

**ApplicationEventMulticaster** - Multicasts events to registered listeners

## **Advanced Scoping**

        **ScopeMetadata** - Metadata about bean scope

**ScopeMetadataResolver** - Resolves scope metadata from bean definition

**Scope** - Interface for custom scope implementations

**RequestScope** - Implementation of request scope

**SessionScope** - Implementation of session scope

**SimpleThreadScope** - Thread-scoped beans implementation

**CustomScopeConfigurer** - Configures custom scopes

**ScopedProxyFactoryBean** - Creates scoped proxies

## **Proxy & AOP Integration**

        **ProxyFactory** - Factory for creating AOP proxies

**ProxyFactoryBean** - FactoryBean for creating proxies

**AopProxy** - Interface for AOP proxy implementations

**JdkDynamicAopProxy** - JDK-based proxy implementation

**CglibAopProxy** - CGLIB-based proxy implementation

**ProxyTargetClass** - Force CGLIB proxying

**ExposeProxy** - Make current proxy available via AopContext

**AopContext** - ThreadLocal access to current proxy

## **Transaction Management**

        **@Transactional** - Declarative transaction management

**PlatformTransactionManager** - Core interface for transaction management

**TransactionStatus** - Information about transaction status

**TransactionDefinition** - Transaction properties (isolation, propagation)

**TransactionInterceptor** - AOP interceptor for transaction management

**TransactionProxyFactoryBean** - Creates transactional proxies

**@EnableTransactionManagement** - Enables annotation-driven transactions

**TransactionSynchronization** - Callbacks for transaction events

## **Validation & Conversion**

        **Validator** - Interface for bean validation

**LocalValidatorFactoryBean** - JSR-303 validator integration

**@Valid** - Triggers validation

**BindingResult** - Holds validation results

**ConversionService** - Type conversion service

**Converter** - Interface for type conversion

**Formatter** - Interface for string formatting/parsing

**PropertyEditor** - Legacy property conversion interface

## **Conditional Bean Creation**

        **@Conditional** - Create beans based on conditions

**Condition** - Interface for conditional logic

**@ConditionalOnClass** - Create bean if class is present

**@ConditionalOnMissingBean** - Create bean if no other bean exists

**@ConditionalOnProperty** - Create bean based on property value

**@ConditionalOnWebApplication** - Create bean only in web environment

**@Profile** - Create beans for specific profiles

**ProfileCondition** - Condition based on active profiles

## **Resource Management**

        **Resource** - Abstraction for external resources

**ResourceLoader** - Interface for loading resources

**ResourcePatternResolver** - Extended resource loading with pattern matching

**PathMatchingResourcePatternResolver** - Ant-style pattern matching

**ClassPathResource** - Classpath-based resource

**FileSystemResource** - File system-based resource

**UrlResource** - URL-based resource

**@PropertySource** - Load properties from resources

## **Internationalization**

        **MessageSource** - Interface for message resolution

**ResourceBundleMessageSource** - Properties file-based messages

**ReloadableResourceBundleMessageSource** - Reloadable message source

**MessageSourceAccessor** - Convenient access to MessageSource

**LocaleResolver** - Determines current locale

**@EnableWebMvc** - Enables internationalization support

## **Caching**

        **@Cacheable** - Cache method return values

**@CacheEvict** - Remove values from cache

**@CachePut** - Update cache with method result

**CacheManager** - Manages cache instances

**Cache** - Single cache instance

**@EnableCaching** - Enables annotation-driven caching

**CacheResolver** - Resolves caches for operations

## **Testing Support**

        **@SpringBootTest** - Integration testing annotation

**@TestConfiguration** - Test-specific configuration

**@MockBean** - Mock beans in tests

**@SpyBean** - Spy on existing beans

**TestContext** - Testing context management

**@DirtiesContext** - Mark context as dirty for cleanup

**@Rollback** - Roll back transactions in tests

**@TestPropertySource** - Test-specific properties

## **Metrics & Monitoring**

        **MeterRegistry** - Micrometer metrics registry

**@Timed** - Method execution timing metrics

**@Counted** - Method invocation counting

**ApplicationStartup** - Startup process monitoring

**StartupStep** - Individual startup step measurement

**BeanCreationProfiler** - Profile bean creation performance

## **Security Integration**

        **@PreAuthorize** - Method-level security

**@PostAuthorize** - Post-execution security checks

**@Secured** - Role-based method security

**SecurityContext** - Current security context

**Authentication** - Current user authentication

**@EnableGlobalMethodSecurity** - Enable method-level security

This comprehensive list covers advanced Spring concepts essential for senior-level interviews and complex application development!