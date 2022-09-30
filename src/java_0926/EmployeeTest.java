package java_0926;

class Employee{
    private int salary;


    public Employee() {
        salary = 3000000; //기본급
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{

    public Manager() {
        super.setSalary(super.getSalary() + 200000);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

}

class Programmer extends Employee{

    public Programmer() {
        super.setSalary(super.getSalary() + 300000);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

}



public class EmployeeTest {

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.getSalary());

        Programmer programmer = new Programmer();
        System.out.println(programmer.getSalary());
    }
};
