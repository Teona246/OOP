package House;

import java.util.ArrayList;
import java.util.List;

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

        Houses house3 = new Houses.Builder()
                .floors(3)
                .rooms(3)
                .isGarage(false)
                .build();
        System.out.println(house3);

        Houses house4 = new Houses.Builder()
                .floors(4)
                .rooms(4)
                .isGarage(true)
                .build();
        System.out.println(house4);

        List<Houses> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println("Есть ли среди домов дом номер 1 - " + houses.contains(house1));
        System.out.println("Есть ли среди домов дом номер 2 - " + houses.contains(house2));

        System.out.println("Индекс дома номер 3 - " + houses.indexOf(house3));
        System.out.println("Индекс дома номер 4 - " + houses.indexOf(house4));


    }
}
