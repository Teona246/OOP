package MapsComporators.Comporator;

import java.util.Comparator;

public class PersName implements Comparator<ForComp> {
    @Override
    public int compare(ForComp o1, ForComp o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return Integer.compare(o1.getNumber(), o2.getNumber());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
