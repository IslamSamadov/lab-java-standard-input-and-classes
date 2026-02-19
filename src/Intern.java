public class Intern extends Employee{
    private static final double maxSalary = 20000;
    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }
    @Override
    public void setSalary(double salary) {
        if (salary > maxSalary) {
            System.out.println("Salary is greater than max salary");
        }else  {
            super.setSalary(salary);
        }
    }
}
