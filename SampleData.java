import java.time.LocalDate;
import java.util.List;

public class SampleData {
    public static List<Person> getPeople() {
        return List.of(
            new Person("Alice", 22, "Female", LocalDate.of(2002, 4, 12), "Delhi"),
            new Person("Bob", 35, "Male", LocalDate.of(1989, 1, 3), "Mumbai"),
            new Person("Charlie", 17, "Male", LocalDate.of(2007, 6, 8), "Delhi"),
            new Person("Diana", 29, "Female", LocalDate.of(1995, 9, 21), "Bangalore"),
            new Person("Eva", 42, "Female", LocalDate.of(1982, 3, 15), "Kolkata"),
            new Person("Frank", 55, "Male", LocalDate.of(1969, 10, 5), "Mumbai")
        );
    }
}
