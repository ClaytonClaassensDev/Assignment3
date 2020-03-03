public class SoftwareTester extends Employee implements MyInterface {

    double bonus;

    public SoftwareTester(String name, String surname, String empID, double salary, double bonus){

        super(name, surname, empID, salary);
        this.bonus = bonus;

    }

    @Override
    public double calcBonus(double salary) {

        bonus = salary * 0.5;

        return bonus;
    }
}
