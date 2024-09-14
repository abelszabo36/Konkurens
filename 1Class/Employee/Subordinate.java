package Employee;

public class Subordinate extends Employee{
    public Subordinate(String name, int sal)
    {
        super(name, sal);
    }

    @Override
    public int getSalary()
    {
        return salary;
    }
}