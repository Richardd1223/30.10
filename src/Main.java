public class Main {
    public static void main(String[] args) {
        Person student = new Student("123", "Tommy", "Perry", 30);
        student.getInfo();

        Person employee = new Employee("Adam", "May", 50);
        employee.getInfo();
    }
}
