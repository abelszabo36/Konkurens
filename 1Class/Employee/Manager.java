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
        int plus = 0;
        for (Employee emp : subordinates)
        {
            plus += emp.getSalary() * 5/100;
        }
        return this.salary + plus;
    }


}