public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amount = 12_499;
        int bonus = service.calculate(amount);
        System.out.println(bonus);
    }
}