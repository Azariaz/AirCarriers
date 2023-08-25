public class BonusMilesService {
    public int calculate (int ticketPrice) {
        int oneMillInRub = 20;
        int bonusRub = ticketPrice / oneMillInRub;
        return bonusRub;

    }
}
