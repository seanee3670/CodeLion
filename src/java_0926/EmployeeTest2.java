package java_0926;

public class EmployeeTest2 {

    class Employee {
        /*
        클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
        필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
        생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
        -메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력
        */

        String name;
        int age;
        String address;
        String department;
        int salary;


        public Employee(String name, int age, String address, String department, int salary) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.department = department;
            this.salary = salary;
        }

        void printInfo() {
            System.out.println("name = " + name);
            System.out.println("age = " + age);
            System.out.println("address = " + address);
            System.out.println("department = " + department);
            System.out.println("salary = " + salary);
        }
    }

    class Regular extends Employee {

        Regular(String name, int age, String address, String department, int salary) {
            super(name, age, address, department, salary);
        }

        public void setSalary() {
            this.salary = salary;
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("정규직");
            System.out.println("salary = " + salary);
        }
    }

    class Temporary extends Employee {
        /*
        클래스 Temporary는 위 클래스 Employee의 하위 클래스
        필드 : 일한 시간, 시간당 보수를 선언하고 시간당 보수의 초기 값으로 10000 저장
        생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
        Setter : 일한 시간을 지정하면서 급여를 일한 시간 * 시간당 보수로 계산하여 저장
        메소드 printInfo() : 인자는 없고 "비정규직"이라는 정보와 일한 시간과 급여를 출력
        또한 다음 프로그램으로 클래스 Employee, Regular, Temporary를 점검하는 프로그램 실행
         */

        public Temporary(String name, int age, String address, String department, int salary) {
            super(name, age, address, department, salary);
        }

        int hoursWorked;
        int wagePerHour = 10000;

        public void setSalary(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            this.salary = hoursWorked * wagePerHour;
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("비정규직");
            System.out.println("hoursWorked = " + hoursWorked);
            System.out.println("salary = " + salary);
            System.out.println();
        }
    }

}

