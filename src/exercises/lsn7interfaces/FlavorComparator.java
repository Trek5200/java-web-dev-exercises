package exercises.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override  // Added when selecting the compare methods option
    public int compare(Flavor o1, Flavor o2) {
//        return 0;
        // Always returning 0 results in no sorting, so replace line 8 with:
        return o1.getName().compareTo(o2.getName());
        //This returns an integer (negative, positive, or zero) depending on whether Flavor object o1 or o2 comes first, alphabetically
    }
}
