### Advanced Java and Microservices Interview Questions for 5 Years of Experience

These 100 questions are tailored for a developer with 5 years of hands-on experience in Java and Spring Boot-based microservices. They focus on advanced, real-world scenarios involving debugging, optimization, architectural decisions, and production challenges. I've avoided basics (e.g., no "Explain OOP principles" or "What is a microservice?") and emphasized questions that require deep knowledge of Java internals, concurrency, performance tuning, and microservices-specific issues like resilience, scalability, and distributed systems. Questions are grouped into categories for better preparation. For each, prepare responses with specific examples from "your" experience, including tools like JVM profilers, Spring Cloud, Kafka, or Kubernetes.

        #### Java Core and Language Features (15 Questions)
1. Describe a scenario where you optimized Java garbage collection for a high-throughput application. What JVM flags did you use (e.g., -XX:MaxGCPauseMillis), and how did you monitor pause times with tools like G1 or ZGC?
        2. Explain handling a StackOverflowError in a recursive algorithm. How did you refactor it to use iteration or tail recursion, and what trade-offs did you consider for memory usage?
        3. In a multi-threaded Java app, how did you debug a race condition involving shared mutable state? What synchronization mechanisms (e.g., ReentrantLock vs. synchronized) did you apply, and why?
        4. Describe tuning Java's thread pool executor for a CPU-bound task. What custom rejection policies did you implement, and how did you balance corePoolSize vs. maxPoolSize under varying loads?
        5. How have you used Java's Method Handles or VarHandles for low-level optimizations? Give an example where they outperformed reflection in a performance-critical code path.
        6. Explain a production issue caused by Java's String interning. How did you mitigate excessive PermGen or Metaspace usage, and what alternatives like StringBuilder did you employ?
        7. In Java 17+, how did you leverage sealed classes and pattern matching in a complex domain model? Describe a refactoring that improved type safety and reduced boilerplate.
        8. Describe debugging a memory leak using tools like Eclipse MAT or VisualVM. What was the root cause (e.g., unclosed resources), and how did you implement try-with-resources or weak references?
        9. How have you implemented custom annotations with retention policies and processors? Share a use case where you created a compile-time check for security constraints.
        10. Explain handling Java's OutOfMemoryError in a containerized environment. What heap dump analysis techniques did you use, and how did you adjust -Xmx/-Xms based on pod limits?
        11. In a Java stream processing pipeline, describe optimizing parallel streams for I/O-bound operations. What pitfalls like ForkJoinPool contention did you encounter and resolve?
        12. How did you use Java's Phaser or CyclicBarrier for coordinating phased tasks in a distributed computation? Compare it to CountDownLatch in a real scenario.
        13. Describe a case where Java's lambda serialization caused issues in a distributed system. How did you make lambdas serializable or avoid them for better performance?
        14. Explain using Java's virtual threads (Project Loom) in a high-concurrency server. What migration challenges from platform threads did you face, and how did it impact throughput?
        15. How have you profiled Java code with JFR (Java Flight Recorder) to identify bottlenecks? Share a story where it revealed a hot method, and how you optimized it with intrinsics or JIT tuning.

        #### Java Concurrency and Multithreading (15 Questions)
16. In a concurrent Java app, describe resolving a deadlock using jstack or ThreadMXBean. What graph analysis did you perform, and how did you reorder locks to prevent it?
        17. Explain implementing a thread-safe cache with ConcurrentHashMap. How did you handle computeIfAbsent race conditions, and what eviction strategies did you add?
        18. How did you use Java's ExecutorCompletionService for asynchronous task management? Describe a scenario where it outperformed Future.get() in handling variable completion times.
        19. Describe a livelock issue in a Java system and how you resolved it by introducing randomness or backoff in retry logic.
20. In Java's ForkJoinPool, explain tuning parallelism for a recursive task. What work-stealing issues arose, and how did you adjust FJ's managedBlocker for I/O integration?
        21. How have you implemented optimistic locking with AtomicReference or LongAdder? Share a high-contention scenario where it reduced lock overhead compared to synchronized.
        22. Explain debugging a thread starvation problem in a priority-based executor. How did you use thread dumps to identify it, and what fair queuing did you implement?
        23. Describe using Java's StampedLock for read-write optimization. In what read-heavy workload did it outperform ReentrantReadWriteLock, and why?
        24. How did you handle context propagation in a reactive Java app using Reactor's Context? Share a propagation failure and how you fixed it with Hooks.onOperatorDebug().
        25. In a Java app with CompletableFuture, explain chaining asynchronous operations. What exception handling strategies (e.g., exceptionally) did you use in a production chain failure?
        26. Describe a scenario where Java's volatile keyword was insufficient for visibility, requiring fences. How did you use VarHandle fullFence() for stronger guarantees?
        27. How have you profiled contention in Java's synchronized blocks using JMH? Share optimizations like lock coarsening or elimination based on benchmark results.
        28. Explain implementing a custom ThreadFactory for monitoring thread creation. What metrics (e.g., thread count spikes) did you expose via JMX in a leaky thread pool?
        29. In Java's Semaphore usage, describe a permit overflow issue under high load. How did you bound it and integrate with Resilience4j for better control?
        30. How did you migrate a legacy Java app from wait/notify to Condition objects? What reentrant locking benefits did it provide in a producer-consumer setup?

        #### JVM Internals and Performance Tuning (10 Questions)
31. Describe analyzing a JVM safepoint pause issue. What biased locking optimizations did you disable, and how did escape analysis help reduce allocations?
        32. How have you tuned JVM's code cache for a large codebase? Explain a CodeCacheFull error and how you increased -XX:ReservedCodeCacheSize.
        33. Explain using JVM's tiered compilation to optimize startup time. In what scenario did you adjust CompileThreshold, and what JIT logs guided your changes?
        34. Describe a Metaspace OOM in a dynamic classloading app. How did you compress class pointers and monitor with jcmd GC.class_stats?
        35. How did you debug JVM crashes from native code (e.g., JNI)? What hs_err_pid logs revealed, and how did you isolate the faulty library?
        36. In a low-latency Java app, explain disabling NUMA awareness. What -XX:+UseNUMA flags did you tweak, and how did it impact multi-socket performance?
        37. Describe optimizing JVM ergonomics for container environments. How did you set -XX:MaxRAMPercentage to avoid overcommitment in Kubernetes?
        38. How have you used JVM's diagnostic commands (jcmd) to force a heap dump during an issue? Share analysis with jmap or MAT for retained objects.
        39. Explain a scenario where JVM's biased locking caused performance degradation. How did you revoke biases and monitor with -XX:+PrintBiasedLockingStatistics?
        40. Describe tuning JVM's survivor spaces in a young-gen heavy app. What ratio adjustments reduced promotion rates, and how did GC logs confirm improvements?

        #### Spring Boot and Java Frameworks (10 Questions)
41. In Spring Boot, describe customizing auto-configuration exclusion. How did you override a default bean in a complex dependency graph?
        42. Explain handling Spring's @Transactional propagation in nested services. What isolation level issues arose in a concurrent update, and how did you resolve them?
        43. How have you implemented custom argument resolvers in Spring MVC? Share a use case for injecting tenant context into controllers.
44. Describe optimizing Spring Boot's startup time with lazy initialization. What @Lazy pitfalls did you encounter in circular dependencies?
        45. In Spring Security, explain a custom filter chain for JWT validation. How did you handle token refresh in a stateless microservice?
        46. How did you use Spring's @Cacheable with custom key generators? Describe a cache poisoning issue and how you mitigated it with eviction policies.
        47. Explain debugging Spring's bean lifecycle hooks. What destruction callback failure did you face, and how did you ensure resource cleanup?
        48. In Spring Boot Actuator, describe exposing custom endpoints for business metrics. How did you secure them with roles in a production env?
        49. How have you configured Spring's task scheduling with @Scheduled? Share a cron misfire issue under load and how you used fixedRate vs. fixedDelay.
        50. Describe a Spring AOP aspect for logging method execution. What pointcut expression challenges did you face with generics or lambdas?

        #### Microservices Architecture and Design (15 Questions)
51. In decomposing a monolith to microservices, describe avoiding the distributed monolith anti-pattern. How did DDD bounded contexts guide your service boundaries?
        52. Explain implementing API composition in a microservices setup. What aggregation service challenges did you face, and how did you use Reactor for async merging?
        53. How did you handle service orchestration vs. choreography in a workflow? Share a saga implementation trade-off in a failure-prone system.
        54. Describe designing a microservices system for multi-tenancy. What data isolation strategies (e.g., schema per tenant) did you use, and why?
        55. In a microservices evolution, explain managing strangler patterns for legacy replacement. How did you route traffic gradually without downtime?
        56. How have you applied the bulkhead pattern in microservices? Describe isolating failure domains with separate thread pools in Resilience4j.
        57. Explain a microservices versioning strategy for backward compatibility. What contract evolution issues did you resolve with semantic versioning?
        58. Describe optimizing inter-service latency in a deep call chain. How did you use caching or denormalization to reduce hops?
        59. In a polyglot microservices env, how did you standardize error handling? Share a common error format across Java and Node services.
        60. How did you implement feature toggles in microservices for dark launches? Describe a toggle misconfiguration and its impact on canary releases.
        61. Explain handling domain events in a microservices system. What event schema evolution challenges did you face with Avro in Kafka?
        62. Describe a microservices governance strategy for API standards. How did you enforce OpenAPI specs across teams?
        63. In scaling microservices, how did you manage session affinity without sticky sessions? Share a stateless redesign using JWT.
        64. How have you used service mesh (e.g., Istio) alongside Spring Cloud? Describe a traffic shifting scenario for A/B testing.
        65. Explain refactoring a chatty microservices interface. What batching or GraphQL did you introduce to reduce network calls?

        #### Microservices Resilience and Fault Tolerance (15 Questions)
66. Describe tuning Resilience4j's sliding window for circuit breakers. How did you adjust failure thresholds based on error rate metrics?
        67. In a microservices outage, explain using bulkheads to isolate faults. What semaphore vs. thread isolation trade-offs did you consider?
        68. How did you implement chaos engineering in microservices? Share a Gremlin experiment that exposed a retry storm.
69. Explain handling idempotency in asynchronous microservices events. What unique key strategies prevented duplicate processing in Kafka consumers?
        70. Describe a fallback implementation in a chained microservice call. How did you cache fallbacks during downstream failures?
        71. In microservices with Kafka, how did you manage consumer lag during spikes? What offset reset policies did you configure?
        72. How have you configured timeouts in Feign clients for resilience? Share a dynamic timeout adjustment based on service SLAs.
73. Explain debugging a microservices deadlock in distributed locks (e.g., Redis). How did you set lease times to prevent indefinite holds?
        74. Describe using rate limiters in microservices gateways. What token bucket issues arose under burst traffic, and how did you smooth them?
        75. In a microservices retry mechanism, how did you avoid amplification attacks? Share jitter addition in exponential backoff.
        76. How did you implement self-healing in microservices with Kubernetes probes? Describe a liveness probe misfire and its fix.
        77. Explain handling partial failures in a microservices transaction. What compensating actions did you add in a saga pattern?
        78. Describe optimizing circuit breaker recovery in production. How did you use half-open states and success thresholds?
        79. In microservices with RabbitMQ, how did you handle message redelivery loops? What TTL and dead-letter queues resolved it?
        80. How have you monitored resilience metrics in microservices? Share a Prometheus query for circuit breaker open rates.

        #### Microservices Data Management (10 Questions)
        81. Explain implementing CQRS in a microservices app. How did you synchronize command and query sides with event sourcing?
        82. In microservices with sharded databases, describe routing queries. What consistent hashing issues did you face during resharding?
        83. How did you manage distributed transactions without 2PC? Share a choreographed saga failure recovery.
        84. Describe schema migration in microservices databases using Flyway. What zero-downtime strategies did you use for breaking changes?
        85. In a microservices CDC setup with Debezium, explain event filtering. How did you handle out-of-order events in consumers?
        86. How have you optimized joins across microservices databases? Share a denormalization trade-off for performance.
        87. Explain handling data versioning in microservices events. What backward-compatible changes did you make in Protobuf schemas?
        88. Describe a microservices data consistency issue during network partitions. How did CRDTs or eventual consistency resolve it?
        89. In polyglot persistence, how did you sync data between SQL and NoSQL? Share a dual-write failure and its idempotent fix.
        90. How did you secure sensitive data in microservices? Describe key rotation in Vault integration without service disruption.

        #### Microservices Deployment, Monitoring, and Ops (10 Questions)
        91. Explain optimizing Docker layers for Spring Boot images. What multi-stage build issues did you resolve for faster deploys?
        92. In Kubernetes, describe handling microservices rollouts with readiness gates. How did you automate progressive delivery?
        93. How have you set up distributed tracing in microservices with Jaeger? Share a span correlation issue across async boundaries.
        94. Describe a microservices CI/CD pipeline with ArgoCD. What GitOps sync failure did you debug?
        95. In monitoring microservices, explain custom Grafana dashboards. What anomaly detection alerted on latency spikes?
        96. How did you handle log aggregation in microservices with Fluentd? Share a correlation ID propagation failure.
        97. Explain scaling microservices with HPA in Kubernetes. What custom metrics (e.g., queue depth) triggered autoscaling?
        98. Describe a microservices security scan in CI. How did you integrate Trivy for vulnerability fixes?
        99. In microservices migration to GraalVM, explain native image compatibility issues. How did it reduce startup time?
        100. How have you implemented observability in microservices with OpenTelemetry? Share a metric export for error budgeting.

        Prepare by simulating these scenarios in a personal project or recalling "experiences" from open-source examples. If you need sample answers or a focused list on a subcategory, let me know!