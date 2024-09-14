package Employee;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee
{
    private List<Employee> subordinates;
    public Manager(String name, int salary)
    {
        super(name,salary);
        subordinates = new ArrayList<>();
    }

    public void addEmployee(Employee emp)
    {
        this.subordinates.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        this.subordinates.remove(emp);
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
    {   
        int plus = 0;
        for (Employee emp : subordinates)
        {
            plus += emp.getSalary() * 5/100;
        }
        return this.salary + plus;
    }
}