import java.time.LocalDate;

public class Goal {
    public int year;
    public int month;
    public int day;
    public String nameOfGoal;
    public int bonus;

    public Goal (int year, int month, int day, String nameOfGoal, int bonus){
        this.year = year;
        this.month = month;
        this.day = day;
        this.nameOfGoal = nameOfGoal;
        this.bonus=bonus;

    }
    public boolean isAchievedThisMonth() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() == year && currentDate.getMonthValue() == month;
    }

    public int getBonus() {
        return bonus;
    }
}

