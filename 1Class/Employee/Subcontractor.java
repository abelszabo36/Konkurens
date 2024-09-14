package Employee;

public class Subcontractor implements SalariedEntity{
    private long taxId;
    private int salary;

    public Subcontractor(long taxId,int salary)
    {
        this.taxId = taxId;
        this.salary = salary;
    }

    public long getTaxId()
    {
        return this.taxId;
    }

    @Override
    public int getSalary()
    {
        return this.salary;
    }
}