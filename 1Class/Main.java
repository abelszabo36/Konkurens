public class Main{
    public static void main(String[] args) {
       
    }
    
   
    class Employee{
        private String name;
        private int salary;

        public Employee(String name, int salary)
        {
            this.name = name;
            this.salary = salary;
        }

        public int getSalary()
        {
            return this.salary;
        }

        public String getName()
        {
            return this.name;
        }

        public void increaseSalary(int value)
        {
            this.salary += this.salary*value/100;
        }

    }
}

   