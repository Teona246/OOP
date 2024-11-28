package MapsComporators.Comporator;

import java.util.Comparator;

public class PersNum implements Comparator<ForComp> {
    @Override
    public int compare(ForComp o1, ForComp o2) {
        if (Integer.compare(o1.getNumber(), o2.getNumber()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o1.getNumber(), o2.getNumber());
    }
}
