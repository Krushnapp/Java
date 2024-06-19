import java.util.EnumSet;

public class EnumSetExample {
public enum Days {
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FR

// Initialization
EnumSet<Days> set = EnumSet.of(Days.MONDAY, Days.WEDNESDAY);

// Insertion
set.add(Days.TUESDAY);

// Deletion
set.remove(Days.WEDNESDAY);

// Other methods
set.size();
set.contains(Days.MONDAY);
set.complementOf(EnumSet.of(Days.MONDAY));
}
}