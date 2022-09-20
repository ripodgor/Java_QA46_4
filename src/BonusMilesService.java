public class BonusMilesService {
    public int calculate(int cost) {
        int percent = 20;
        int miles = cost / percent;
        return miles;
    }
}
