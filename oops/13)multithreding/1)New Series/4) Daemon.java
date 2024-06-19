
  **User vs. Daemon Threads in Java**

  - **Threads:** Lightweight processes that run concurrently.
  - **User Threads (Foreground):**
      - Core application tasks (UI, I/O, user input).
      - JVM waits for them to finish before exiting.
  - **Daemon Threads (Background):**
      - Background tasks (garbage collection, monitoring).
      - JVM terminates them when user threads finish.
      - Lower priority than user threads.
  - **Setting Daemon Status:** Use `setDaemon(true)` **before** starting the thread.

  **Scenarios:**

  - **User Input & Background Processing:** User thread validates input, daemon thread performs long-running calculations in the background.
  - **Network I/O & Progress Updates:** User thread downloads a file, daemon thread updates a progress bar.
  - **Garbage Collection:** Daemon thread automatically reclaims unused memory.

  **Key Points:**

  - User threads are essential, daemon threads are for support.
  - Use daemon threads strategically for background tasks.
  - Set daemon status before starting the thread.
