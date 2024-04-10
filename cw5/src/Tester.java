import java.util.ArrayList;

public class Tester extends Employee {
    public ArrayList<String> tester;
    public String name;
    public String surname;
    public String adress;
    public String email;
    public int pesel;
    public int rokZatrudnienia;

    public Tester(String name, String surname, String adress, String email, int pesel, int rokZatrudnienia) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
        this.tester = new ArrayList<String>();
    }
    public void addTestType(String te){
        tester.add(te);
        System.out.println(te);
    }
}
