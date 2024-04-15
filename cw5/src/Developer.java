import java.util.ArrayList;

public class Developer extends Employee{
    ArrayList<Technology>technologies;

    public Developer (String name, String surname, String adress, String email, int pesel, int rokZatrudnienia){
        super(name, surname, adress, email, pesel, rokZatrudnienia);

        this.technologies = new ArrayList<Technology>();
    }
    public void addTechnology(Technology t){
        technologies.add(t);
        System.out.println(technologies);
    }
    public int calculateSalary() {
        int pensja = super.calculateSalary();
        int bonus = 0;
        for (Technology t : technologies) {
            bonus += t.getBonus();
        }
        return pensja + bonus;
    }
}
