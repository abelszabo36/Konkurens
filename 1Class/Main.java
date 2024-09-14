import Employee.*;

public class Main{
    public static void main(String[] args) {

        Employee emp = new Employee("Raffael", 100);
        System.out.println(emp.getName() + " " + emp.getSalary());
        emp.increaseSalary(20);
        System.out.println(emp.getName() + " " + emp.getSalary());
       
    }
    
   
    
}

   