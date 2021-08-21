public class BonusMilesService {
    public int calculate(int price, int priceForOneMili) {
        int totalMili = price / priceForOneMili;
        return totalMili;
    }
}
