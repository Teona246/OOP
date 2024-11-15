package House;

public class Main {
    public static void main(String[] args) {

        Houses house1 = new Houses.Builder()
                .floors(3)
                .rooms(4)
                .isGarage(true)
                .build();
        System.out.println(house1);

        Houses house2 = new Houses.Builder()
                .floors(2)
                .rooms(5)
                .isGarage(false)
                .build();
        System.out.println(house2);


    }
}
