public class Employee {
    private String name;
    private String lastname;
    private double monthlySalary;

    public Employee (String name,String lastname, double monthlySalary) {
        this.name = name;
        this.lastname = lastname;
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getMonthlySalary(){
        return this.monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12;
    }

    public void raise() {
       monthlySalary *= 1.1;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ",lastname=" + lastname + '\'' +
                ",monthlySalary=" + monthlySalary +
                '}';

    }
}

