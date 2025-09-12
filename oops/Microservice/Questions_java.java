# Advanced Java Interview Questions (5+ Years Experience)

## **Memory Management & JVM Internals (20 Questions)**

        1. **Explain the difference between G1GC, ZGC, and Shenandoah collectors. When would you choose each?**

        2. **How does JVM handle memory allocation for large objects (>32KB)? What is TLAB and how does it optimize allocation?**

        3. **Describe the memory layout of Java objects. What are object headers, compressed OOPs, and memory padding?**

        4. **What happens during a full GC cycle? Explain mark-sweep-compact vs copying collectors.**

        5. **How do WeakReference, SoftReference, and PhantomReference differ? Provide real-world use cases.**

        6. **Explain memory leaks in Java despite GC. How would you detect and fix a memory leak in production?**

        7. **What is escape analysis and how does it enable stack allocation and lock elision?**

        8. **Describe the difference between young generation sizing (-Xmn) vs ratio-based sizing (-XX:NewRatio).**

        9. **How does compressed OOPs work? What are the limitations and performance implications?**

        10. **Explain the concept of "allocation pressure" and how it affects GC performance.**

        11. **What is off-heap memory? Compare Chronicle Map, Hazelcast, and Ignite for off-heap storage.**

        12. **How does JVM handle direct memory allocation via ByteBuffers? What are the risks?**

        13. **Explain concurrent marking in G1GC. How does it achieve low-latency collection?**

        14. **What is region-based garbage collection? How does it differ from generational GC?**

        15. **Describe memory barriers and their role in concurrent programming and GC.**

        16. **How do you tune JVM for microservices vs monolithic applications?**

        17. **Explain the relationship between allocation rate, promotion rate, and GC frequency.**

        18. **What is card marking and how does it optimize cross-generational reference tracking?**

        19. **How does JVM handle large heap sizes (>32GB)? What challenges arise?**

        20. **Describe the memory implications of lambda expressions and method references.**

        ## **Concurrency & Multithreading (25 Questions)**

        21. **Implement a thread-safe LRU cache without using Collections.synchronizedMap().**

        22. **Explain the ABA problem in lock-free programming. How does AtomicStampedReference solve it?**

        23. **What is the difference between CompletableFuture.thenApply() and thenCompose()? When to use each?**

        24. **How does ForkJoinPool work stealing algorithm work? Compare it with ThreadPoolExecutor.**

        25. **Implement a custom semaphore using only synchronized blocks and wait/notify.**

        26. **Explain memory visibility issues. How do volatile, synchronized, and final keywords provide guarantees?**

        27. **What is lock striping? Implement a concurrent hash map with lock striping.**

        28. **How does ReentrantReadWriteLock handle lock upgrading/downgrading? What are the limitations?**

        29. **Explain the happens-before relationship and its role in concurrent programming.**

        30. **What is the difference between parallel and concurrent execution? How does Stream.parallel() work?**

        31. **How do you handle thread interruption properly? What are the best practices?**

        32. **Implement a bounded blocking queue using condition variables.**

        33. **Explain double-checked locking and why it was broken before Java 5.**

        34. **What is lock-free programming? Implement a lock-free stack using AtomicReference.**

        35. **How does ThreadLocal work internally? What are memory leak risks?**

        36. **Compare reactive programming (RxJava/Project Reactor) with traditional multithreading.**

        37. **What is the actor model? How does it solve concurrent programming challenges?**

        38. **Explain backpressure in reactive streams. How do you handle slow consumers?**

        39. **How does virtual threads (Project Loom) change concurrent programming paradigms?**

        40. **What is structured concurrency and how does it improve error handling?**

        41. **Implement a rate limiter using token bucket algorithm with concurrent access.**

        42. **How do you debug deadlocks in production? What tools and techniques do you use?**

        43. **Explain the performance implications of context switching and how to minimize it.**

        44. **What is CPU cache coherence and how does it affect multithreaded performance?**

        45. **How do you implement a thread-safe observer pattern without blocking all observers?**

        ## **JVM Optimization & Performance (20 Questions)**

        46. **How does JIT compilation work? Explain C1, C2 compilers and tiered compilation.**

        47. **What is method inlining and when does JVM decide to inline methods?**

        48. **Explain loop unrolling, dead code elimination, and constant folding optimizations.**

        49. **How do you use JProfiler/YourKit to identify performance bottlenecks in production?**

        50. **What is the difference between microbenchmarking and macrobenchmarking? How to use JMH effectively?**

        51. **How does branch prediction affect Java performance? How to write branch-predictor-friendly code?**

        52. **Explain the performance implications of autoboxing/unboxing in tight loops.**

        53. **How do you optimize string operations for high-performance applications?**

        54. **What is mechanical sympathy? How does understanding hardware improve Java performance?**

        55. **How does CPU cache utilization affect Java collections performance?**

        56. **Explain the performance characteristics of different data structures (ArrayList vs LinkedList vs ArrayDeque).**

        57. **How do you minimize object allocation in performance-critical code?**

        58. **What is the impact of polymorphism on JVM optimizations? How does devirtualization work?**

        59. **How do you profile memory allocation patterns and optimize for allocation rate?**

        60. **Explain the performance implications of exception handling. How to optimize exception-heavy code?**

        61. **What is NUMA and how does it affect JVM performance on multi-socket machines?**

        62. **How do you optimize JSON parsing/serialization for high-throughput applications?**

        63. **Explain the performance trade-offs between different serialization frameworks.**

        64. **How does JVM warm-up affect application performance? How to minimize warm-up time?**

        65. **What are the performance implications of using reflection extensively?**

        ## **Advanced Language Features (15 Questions)**

        66. **Implement a type-safe heterogeneous container using generics wildcards.**

        67. **Explain type erasure limitations and how to work around them.**

        68. **How do you implement a fluent API with method chaining and type safety?**

        69. **What is PECS (Producer Extends Consumer Super) principle? Provide complex examples.**

        70. **How do lambda expressions capture variables? Explain effectively final variables.**

        71. **Implement a recursive descent parser using functional programming concepts.**

        72. **How do you handle checked exceptions in streams and functional programming?**

        73. **Explain method references and when they're preferred over lambda expressions.**

        74. **How do you implement custom collectors for Stream API?**

        75. **What is the difference between map(), flatMap(), and reduce() in terms of performance?**

        76. **How do you use Optional effectively without creating performance overhead?**

        77. **Implement a memoization decorator using annotations and reflection.**

        78. **How do you create custom annotations with complex validation logic?**

        79. **Explain sealed classes and pattern matching enhancements in modern Java.**

        80. **How do you implement immutable objects with builder pattern using records?**

        ## **Design Patterns & Architecture (10 Questions)**

        81. **Implement a circuit breaker pattern for microservices resilience.**

        82. **How do you implement command pattern with undo/redo functionality using generics?**

        83. **Design a plugin architecture using ServiceLoader and custom classloaders.**

        84. **Implement a sophisticated caching layer with TTL, LRU, and write-through/write-behind strategies.**

        85. **How do you implement event sourcing pattern in Java? What are the challenges?**

        86. **Design a state machine implementation that's both type-safe and performant.**

        87. **Implement a custom dependency injection container with lifecycle management.**

        88. **How do you implement CQRS pattern with proper separation of read/write models?**

        89. **Design a distributed locking mechanism using Redis or Zookeeper.**

        90. **Implement a saga pattern for distributed transaction management.**

        ## **Integration & Frameworks (10 Questions)**

        91. **How do you handle database connection pooling optimization for high-concurrency applications?**

        92. **Implement custom Spring Boot starter with auto-configuration and conditional beans.**

        93. **How do you implement distributed tracing across microservices using OpenTelemetry?**

        94. **Design a message processing system with exactly-once delivery guarantees.**

        95. **How do you implement custom metrics and health checks for production monitoring?**

        96. **Implement a custom serialization protocol that's faster than JSON/XML.**

        97. **How do you handle graceful shutdown in containerized Java applications?**

        98. **Design a multi-tenant application with data isolation and performance considerations.**

        99. **Implement distributed caching with consistency guarantees across multiple nodes.**

        100. **How do you implement zero-downtime deployments with database schema migrations?**

        ---

        ## **Bonus System Design Questions**

        - **Design a high-throughput trading system that processes 1M+ transactions/second**
        - **Implement a distributed rate limiter that works across multiple data centers**
        - **Design a real-time analytics system for processing streaming data**
        - **Implement a scalable notification system supporting multiple channels**
        - **Design a distributed file storage system with replication and consistency**

These questions test deep understanding of Java internals, performance optimization, concurrent programming, and system design skills expected at senior levels.