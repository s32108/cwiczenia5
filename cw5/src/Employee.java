import java.time.LocalDate;
import java.util.ArrayList;
public class Employee {
    ArrayList<Employee> employees;
    public String name;
    public String surname;
    public String adress;
    public String email;
    public int pesel;
    public int rokZatrudnienia;

    public Employee (String name, String surname, String adress, String email, int pesel, int rokZatrudnienia) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
        this.employees = new ArrayList<Employee>();
    }
    public int calculateSalary() {
        int pensja = 3000;
        int przepracowanyRok = LocalDate.now().getYear() - rokZatrudnienia;
        int dodatekDoPensji = przepracowanyRok * 1000;
        return pensja + dodatekDoPensji;
    }
}
