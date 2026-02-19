public class Employee {
    private String name;
    private String email;
    private int age;
    private double salary;

    public Employee(String name, String email, int age, double salary){
        setName(name);
        setEmail(email);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Name is null");
            return;
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Email is null");
            return;
        }
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public String getDetails(){
        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Salary: " + salary;
    }
}
