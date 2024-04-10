import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<Technology>technologies;
    public String name;
    public String surname;
    public String adress;
    public String email;
    public int pesel;
    public int rokZatrudnienia;

    public Developer (String name, String surname, String adress, String email, int pesel, int rokZatrudnienia){
        this.name =name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
        this.pesel= pesel;
        this.rokZatrudnienia = rokZatrudnienia;
        this.technologies = new ArrayList<Technology>();
    }
    public void addTechnology(Technology t){
        technologies.add(t);
        System.out.println(technologies);
    }
}
