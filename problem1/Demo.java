package problem1;

public class Demo {
    public static void main(String[] args) {
        Person Joe = new Person("Joe", 30, "M");
        System.out.println("Person: " + Joe);

        Student Sally = new Student("Sally", 20, "F", "123456", 3.6);
        System.out.println("Student: " + Sally);

        Teacher mrSmith = new Teacher("Mr. Smith", 45, "M", "Math", 50000);
        System.out.println("Teacher: " + mrSmith);

        CollegeStudent jill = new CollegeStudent("Jill", 22, "F", "654321", 3.8, "Computer Science", 4);
        System.out.println("College Student: " + jill);
    }
}
