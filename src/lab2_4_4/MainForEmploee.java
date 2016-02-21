package lab2_4_4;

/**
 * Created by R2-D2 on 20.02.2016.
 */
public class MainForEmploee {
    public static void main(String[] args) {
        Emploee emploee0 = null;
        System.out.println("Number of employees "+emploee0.getNumberOfEmployees());
        Emploee emploee1 = new Emploee("Rob", "Smith", "manager", 998211);
        System.out.println("Number of employees "+emploee0.getNumberOfEmployees());
        Emploee emploee2 = new Emploee("Bob", "Smith", "manager", 977211);
        Emploee emploee3 = new Emploee("Julina", "Smith", "manager", 911211);
        Emploee emploee4 = new Emploee("Kate", "Smith", "manager", 995511);
        System.out.println("Number of employees "+emploee0.getNumberOfEmployees());

    }
}
