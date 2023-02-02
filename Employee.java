public class Employee {
    private String name;
    private String lastname;
    private double monthlySalary;

    public Employee (String name,String lastname, double monthlySalary) {
        this.name = name;
        this.lastname = lastname;
        this.monthlySalary =(monthlySalary > 0) ? monthlySalary : 0.0;
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

    public void raise(double raise10) {
        this.monthlySalary *= (10 / 100);
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


// (?:) = ternary operator, den sætter enten instance variablen til at være 0,0 hvis det ikke er positivt.
//Eller så forbliver den bare som værdien monthlySalary.
//Det er afhængigt af betingelsen monthlySalary > 0.
//koden tjekker om monthlySalary er positiv og hvis ikke er den så 0.0.