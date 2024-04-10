import java.util.ArrayList;

public class Manager extends Employee {
    public ArrayList<Goal> goals;
    public String name;
    public String surname;
    public String adress;
    public String email;
    public int pesel;
    public int rokZatrudnienia;
    public Manager(String name, String surname, String adress, String email, int pesel, int rokZatrudnienia) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
        this.goals = new ArrayList<Goal>();
    }
    public void addGoals(Goal g){
        goals.add(g);
        System.out.println(g);
    }
}
