package Employee;
import java.util.ArrayList;

public class Manager extends Employee
{

    public ArrayList<Employee> employee = new ArrayList<Employee>();

    public Manager(String name, int sal)
    {
        super(name, sal);
    }

    @Override
    public int getSalary()
    {
        return this.salary;
    }

    public void addEmp(Employee emp)
    {
        employee.add(emp);
    }

    public void removeEmp(Employee emp)
    {
        for(Employee emply : employee)
        {
            if(emply.equals(emp))
            {
                employee.remove(emply);
                break;
            }
        }
    }

    public void printEmp()
    {
        for(Employee emp : employee)
        {
            System.out.println(emp.getName() + " " + emp.getSalary());
        }
    }    
}