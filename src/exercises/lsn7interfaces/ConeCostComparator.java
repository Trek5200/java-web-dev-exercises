package exercises.lsn7interfaces;

import java.util.Comparator;

public class ConeCostComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
//        return 0;
//        return o1.getCost().compareTo(o2.getCost());  // not able since compareTo compares strings???
        if (o1.getCost() - o2.getCost() == 0){
            return 0;
        } else if (o1.getCost() - o2.getCost() < 0){
            return -1;
        } else {
            return 1;
        }
    }
}
