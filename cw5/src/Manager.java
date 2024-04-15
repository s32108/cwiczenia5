import java.util.ArrayList;

public class Manager extends Employee {
    public ArrayList<Goal> goals;

    public Manager(String name, String surname, String adress, String email, int pesel, int rokZatrudnienia) {
        super(name, surname, adress, email, pesel, rokZatrudnienia);

        this.goals = new ArrayList<Goal>();
    }
    public void addGoals(Goal g){
        goals.add(g);
        System.out.println(g);
    }
    public int calculateSalary() {
        int pensja = super.calculateSalary();
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchievedThisMonth()) {
                bonus += goal.getBonus();
            }
        }
        return pensja + bonus;
    }
}
