import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args){
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("John Smith", "john.smith@mail.com", 30, 5000);
        employees[1] = new Employee("Emma Johnson", "emma.johnson@mail.com", 28, 6200);
        employees[2] = new Employee("Michael Brown", "michael.brown@mail.com", 35, 7200);
        employees[3] = new Employee("Olivia Davis", "olivia.davis@mail.com", 26, 4800);
        employees[4] = new Employee("William Miller", "william.miller@mail.com", 40, 8500);
        employees[5] = new Employee("Sophia Wilson", "sophia.wilson@mail.com", 32, 6900);
        employees[6] = new Employee("James Moore", "james.moore@mail.com", 29, 5400);
        employees[7] = new Employee("Isabella Taylor", "isabella.taylor@mail.com", 27, 5100);
        employees[8] = new Employee("Benjamin Anderson", "ben.anderson@mail.com", 38, 9100);
        employees[9] = new Employee("Mia Thomas", "mia.thomas@mail.com", 31, 6300);

        try(FileWriter fw = new FileWriter("employee.txt")){
            for(Employee emp : employees){
                fw.write(emp.getDetails() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}