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
