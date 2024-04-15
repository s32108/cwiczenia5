import java.util.ArrayList;

public class Tester extends Employee {
    public ArrayList<String> tester;

    public Tester(String name, String surname, String adress, String email, int pesel, int rokZatrudnienia) {
        super(name, surname, adress, email, pesel, rokZatrudnienia);

        this.tester = new ArrayList<String>();
    }
    public void addTestType(String te){
        tester.add(te);
        System.out.println(te);
    }
    public int calculateSalary() {
        int pensja = super.calculateSalary();
        return pensja + (tester.size() * 300);
    }
}
