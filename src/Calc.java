public class Calc {
    //  private int calcdollar;
    // public int getCalcdollar(){
    //    return calcdollar;
    // }
    public static double convertDollar(double rubles) {

        return rubles / 71;
    }


    public static double convertToRub(double dollars) {
        return dollars * 71;
    }

    public static void buyProperty(Man man) {
        if (man != null) {
            double propertyDollar = 1000;
            while (Calc.convertDollar(man.getSalary()) >= propertyDollar) {
                double dollarBalance = Calc.convertDollar(man.getSalary()) - propertyDollar;
                man.setProperty(man.getProperty() + 1);
                man.setSalary(convertToRub(dollarBalance));
            }
        }
    }
}

