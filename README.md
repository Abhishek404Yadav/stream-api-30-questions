# ✅ Stream API Practice Set for Interviews & Mastery

A collection of 30 carefully crafted Java Stream API problems categorized by difficulty — designed to help you crack interviews and master Java functional programming.

## 📘 What's in this Repo?

- 🧠 30 real-world Stream API problems: Easy → Hard  
- 👨‍💻 Realistic object-based challenges (filter, map, sort, group, reduce, etc.)  
- 🧪 Built on a clean `Person` class with mock data  
- 🔍 Each question is listed below — with full answers linked in Notion

## 🚀 How to Use

1. **Clone the repo**
   ```bash
   git clone https://github.com/YOUR_USERNAME/stream-api-practice-set.git
   cd stream-api-practice-set
   ```

2. Open `Main.java` and test each question using the provided mock data.

3. Run using:
   ```bash
   javac Main.java
   java Main
   ```

4. Try solving the problems first, then compare with solutions:  
   👉 [🔗 View Notion Sheet with Answers](https://www.notion.so/Stream-API-Practice-Set-for-Interviews-Mastery-22893db0557c80e4acb5d4a75bedf665?source=copy_link)


## 🧑‍🎓 Sample `Person` Class

```java
public class Person {
    private String name;
    private int age;
    private String gender;
    private LocalDate birthDate;
    private String city;

    public Person(String name, int age, String gender, LocalDate birthDate, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public LocalDate getBirthDate() { return birthDate; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name + " (" + age + ", " + gender + ", " + city + ")";
    }
}
```


## 💾 Sample Data (SampleData.java)

```java
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
```


## 🧪 Main.java

```java
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
```


## 📋 Practice Problems (Easy → Hard)


### 🟢 Easy Level

1. Filter all people above the age of 30  
2. Get names of all people living in "Delhi"  
3. Count people below 18  
4. Create a list of names in uppercase  
5. Find the first person whose name starts with "A"  
6. Check if any person is older than 60  
7. Get a list of people whose name length > 5  
8. Sort people by age in ascending order  
9. List all unique cities  
10. Check if all people are above 10 years old  

---

### 🟡 Medium Level

11. Group people by city  
12. Group people by gender and count them  
13. Get average age of all people  
14. Find the oldest person  
15. Get the youngest female  
16. Sort people by birth year (from `birthDate`)  
17. List people born before the year 2000  
18. Get sum of ages of all people  
19. Group people by decade of birth (e.g., 1990s, 2000s)  
20. Partition people into two groups: age < 18 and ≥ 18  

---

### 🔴 Hard Level

21. Group people by city and then by gender  
22. Find the average age by city  
23. Group people by age group (0–18, 19–35, 36–50, 51+)  
24. Get the most populated city  
25. Find the month with the most number of births  
26. Generate a `Map<City, Oldest Person>`  
27. For each city, find the average age of females  
28. List all names born in leap years  
29. Create a summary report: total, average, max, min age  
30. Sort people by age, then name, then birthdate  

## 🔗 Solutions Page (Notion)

👉 [View Full Solutions in Notion](https://www.notion.so/Stream-API-Practice-Set-for-Interviews-Mastery-22893db0557c80e4acb5d4a75bedf665?source=copy_link)

Each question expands to show the full Java code solution using Streams.

## 🙌 Maintained By

Made with ❤️ by **[Abhishek Yadav](https://github.com/Abhishek404Yadav)**  
Feel free to connect or drop a ⭐ if this helped you!

## 📣 Contributions Welcome!

Have a cool idea or found a bug?  
Want to add advanced problems like `flatMap`, `reduce`, or `Optional` chaining?

> Open a Pull Request and be a part of this learning journey 💪
