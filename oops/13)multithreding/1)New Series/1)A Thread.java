A thread is like a mini-program within a larger program (process). Here's a breakdown of its key aspects and what gets saved during context switching:

Thread Components:

 Thread Control Block (TCB): This is a data structure maintained by the operating system (OS) for each thread. It holds information vital for thread management, including:
     Thread ID: Unique identifier for the thread.
     Program Counter (PC):  Tracks the instruction currently being executed by the thread.
     Stack Pointer (SP):  Points to the top of the thread's private stack memory (more on that later).
     Thread State:  Indicates whether the thread is running, waiting, or terminated.
     Registers:  A set of registers used to store temporary data specific to the thread's execution (similar to CPU registers, but managed by the OS for each thread).
     Priority:  A value used by the OS for scheduling purposes (higher priority threads get CPU time more often).
     Owned Resources:  Tracks any resources (files, locks) owned by the thread.

Memory Management:

 Thread Local Storage (TLS):  Provides a private storage area within the process memory for each thread.  Thread-specific data like user ID or configuration settings are stored here (not saved during context switching).
 Stack Memory:  Each thread has its own private stack for storing temporary data specific to its execution path. This includes function calls, local variables, and return addresses. The stack pointer (SP) points to the top of the thread's stack (saved during context switching).
 Heap Memory:  Threads within a process share the heap memory of the process.  This is where dynamically allocated memory resides (not directly saved during context switching, but changes made can affect other threads).

Context Switching:

When the OS decides to switch between threads, it saves the current thread's context (the information needed to resume execution later). This includes:

 The contents of the thread's registers (saved for all threads)
 The program counter (PC) (saved for all threads)
 The stack pointer (SP) (saved for all threads)
 Any modified data in the Thread Control Block (TCB) (specific data might be updated)

Essentially, the OS preserves the state of the current thread so it can pick up exactly where it left off when it's scheduled to run again. The thread's private data in TLS and its impact on shared heap memory are managed differently depending on the programming language and synchronization mechanisms used.
