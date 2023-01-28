public class Man {
    private double dollars;
    private double property;

    private double salary;

    public double getProperty() {
        return property;
    }

    public void setProperty(double property) {
        this.property = property;
    }
    

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public Man(double salary) {
        this.salary = salary;
    }
}
