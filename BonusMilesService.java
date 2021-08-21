public class BonusMilesService {
    public int calculate(int cost) {
        int priceForOneMili = 20;
        int totalMili = cost / priceForOneMili;
        return totalMili;
    }
}
