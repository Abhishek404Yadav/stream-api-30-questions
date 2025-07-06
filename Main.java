import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = SampleData.getPeople();

        // Example usage
        System.out.println("People older than 30:");
        people.stream()
              .filter(p -> p.getAge() > 30)
              .forEach(System.out::println);

        // 👇 Add your answers to each problem below one by one
    }
}
