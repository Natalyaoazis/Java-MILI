        public class Main {
            public static void main(String[] args) {
                BonusMilesService service = new BonusMilesService();
                int finelMiles = service.calculate(15600, 20);
                System.out.println(finelMiles);
            }
        }


