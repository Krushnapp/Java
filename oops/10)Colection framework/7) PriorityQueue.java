import java.util.PriorityQueue;

public class PriorityQueueExample {
  public static void main(String[] args) {
    // Initialization
    PriorityQueue<Integer> pq = new
PriorityQueue<>(Comparator.reverseOrder());

// Insertion
pq.add(2);
pq.add(1);
pq.add(3);

// Deletion
pq.poll();

// Other methods
pq.size();
pq.peek();
pq.offer(4);
}}