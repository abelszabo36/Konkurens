import Employee.*;

public class Main{
    public static void main(String[] args) {
        
        Manager man = new Manager("Raffael", 200);
        Subordinate sub = new Subordinate("Abel", 100);
        Subordinate sub2 = new Subordinate("Kitti", 80);
        man.addEmployee(sub);
        man.addEmployee(sub2);
        System.out.println(man.getName() + " " + man.getSalary());
        
       
    }
    
   
    
}

   