Mapping: map, flatMap.
Filtering: filter, distinct, contains.
Sorting: sorted.
Reduction: reduce, collect.
Aggregation: sum, average, min, max, count.
Matching: allMatch, anyMatch, noneMatch.
Iteration: forEach.
Limiting: limit.
Skipping: skip.
Finding: findAny, findFirst.
Grouping: groupingBy.
Collecting: Collectors.toList(), Collectors.toSet(), Collectors.toMap(), Collectors.toCollection(), Collectors.joining(), Collectors.summarizingInt(), Collectors.summarizingDouble(), Collectors.summarizingLong(), Collectors.groupingBy(), Collectors.partitioningBy(), Collectors.mapping(), Collectors.reducing(), Collectors.counting(), Collectors.averagingInt(), Collectors.averagingDouble(), Collectors.averagingLong().

  Intermediate Operations:
  filter(): Keeps odd numbers.
  map(): Multiplies each odd number by 2.
  distinct(): Removes duplicates.
  sorted(): Sorts the elements.
  skip(): Skips the first 2 elements.

  Terminal Operation:
  collect(Collectors.toList()): Collects the elements into a list.
  filter(): Keeps even numbers (new stream).
  map(): Multiplies each even number by 3.
  reduce(Integer::sum): Sums all elements.

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .map(n -> n * 2)          // Multiply each number by 2
                .filter(n -> n % 2 == 0)  // Filter out the even numbers
                .map(n -> n + 10)         // Add 10 to the remaining numbers
                .collect(Collectors.toList());

        System.out.println(result);
    }
}



// Certainly! Below are the syntax and some key rules to remember when using Java streams:

// Syntax of Java Stream Operations:
// Obtain a Stream:

// Use the stream() method on a collection or array to obtain a stream.
// Example: stream() on a list List.stream() or on an array Arrays.stream(array).
  
 Intermediate Operations (Optional):
// Perform intermediate operations on the stream such as filtering, mapping, sorting, etc.
// These operations return a new stream and can be chained together.
// Examples: filter(), map(), sorted(), distinct(), etc.
                          
 Terminal Operations (Required):
// Perform terminal operations to produce a result or trigger stream processing.
// Terminal operations consume the stream and cannot be chained.
// Examples: forEach(), collect(), reduce(), findAny(), etc.
// Key Rules:
// Streams Are Lazy:

// Intermediate operations are lazy, meaning they do not process elements until a terminal operation is invoked.
// This allows for optimization and avoids unnecessary processing of elements.
// Streams Are Stateless:

// Intermediate operations do not maintain state. Each element is processed independently.
// This ensures that streams are easily parallelizable without the risk of race conditions.
// Terminal Operations Trigger Processing:

// Terminal operations are necessary to trigger the processing of the stream.
// Without a terminal operation, intermediate operations will not be executed.
// Streams Are Consumable Only Once:

// Streams can only be consumed once. After a terminal operation is invoked, the stream is considered consumed and cannot be reused.
// To perform multiple operations on the same data, obtain a new stream from the source.
// Stream Pipelines:

// Stream operations can be chained together to form a pipeline.
// Data flows through the pipeline from source to terminal operation.
// Functional Programming Paradigm:

// Streams encourage a functional programming style by providing declarative operations on data.
// This leads to more concise and readable code.
// Example:
// java
// Copy code
// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


  public class StreamExample {
      public static void main(String[] args) {
          // Create a list of integers
          List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

          // Intermediate and Terminal Operations combined
          Optional<Integer> result = numbers.stream()
                  .filter(n -> n % 2 != 0)            // Filtering: Keep odd numbers
                  .map(n -> n * 2)                    // Mapping: Multiply each odd number by 2
                  .distinct()                         // Distinct: Remove duplicates
                  .sorted()                           // Sorting: Sort the elements
                  .skip(2)                            // Skip: Skip the first 2 elements
                  .collect(Collectors.toList())      // Collect: Collect the elements into a list
                  .stream()                           // Convert back to a stream
                  .filter(n -> n % 2 == 0)            // Filtering: Keep even numbers
                  .map(n -> n * 3)                    // Mapping: Multiply each even number by 3
                  .reduce(Integer::sum);              // Reducing: Sum all elements

          // Terminal operation: Print the result
          result.ifPresentOrElse(
                  sum -> System.out.println("Intermediate and Terminal Operations Combined: Sum of even numbers multiplied by 3 = " + sum),
                  () -> System.out.println("No elements found after filtering, sorting, and mapping.")
          );
      }
  }


