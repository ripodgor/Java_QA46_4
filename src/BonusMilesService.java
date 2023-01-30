public class BonusMilesService {
    public int calculate(int amount) {
        int percent = 20;
        int bonus = amount / percent;
        return bonus;
    }
}
