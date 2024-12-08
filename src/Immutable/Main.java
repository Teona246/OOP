package Immutable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MutableClass mc = new MutableClass(1);
        ImmutableClass random = new ImmutableClass("one", List.of(1, 2, 3), mc);

        System.out.println(mc);
        System.out.println(random);

        mc.setValue(43);
        System.out.println(mc);
        System.out.println(random);

        Map<ImmutableClass, Integer> nums = new HashMap<>();
        nums.put(random, 1);
        mc.setValue(56);
        System.out.println(mc);
        System.out.println(nums);


    }
}
