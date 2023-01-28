public class Main {
    public static void main(String[] args) {
        Man man = new Man(71100);
        Calc.buyProperty(man);
        System.out.println("Имущество:" + man.getProperty() +  " Зарплата:" + man.getSalary());

    }
}