import java.util.ArrayList;
import Employee.*;

public class Main{
    public static void main(String[] args) {

        Manager emp = new Manager("Raffael", 100);
        //System.out.println(emp.getName() + " " + emp.getSalary());
        emp.increaseSalary(20);
        //System.out.println(emp.getName() + " " + emp.getSalary());


        Subordinate x = new Subordinate("v", 200);
        System.out.println(x.getSalary());

        Subordinate abel = new Subordinate("Abel", 200);
        Subordinate raffeel = new Subordinate("Raffael", 200);
        
        System.out.println("Felvettek: ");
        emp.addEmp(abel);
        emp.addEmp(raffeel);
        emp.printEmp();

        System.out.println("Kirugottak: ");
        emp.removeEmp(raffeel);
        emp.printEmp();

       
    }
    
   
    
}

   