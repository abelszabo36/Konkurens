
package Employee;

public abstract class Employee{
        private String name;
        protected int salary;

        public Employee(String name, int salary)
        {
            this.name = name;
            this.salary = salary;
        }

        abstract int getSalary();

        public String getName()
        {
            return this.name;
        }

        public void increaseSalary(int value)
        {
            this.salary += this.salary*value/100;
        }

    }

