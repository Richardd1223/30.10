public class Employee implements Person {
        private String name;
        private String surname;
        private int age;
        private int yearsToWork;

        public Employee(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.yearsToWork = 62 - this.age;  // Predpokladaný vek odchodu do dôchodku je 62
        }

        @Override
        public void getInfo() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Surname: " + surname);
            System.out.println("Employee Age: " + age);
            System.out.println("Years to work: " + yearsToWork + "\n");
        }
    }


