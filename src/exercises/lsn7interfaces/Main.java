package exercises.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        // 1. To sort the flavors list, first create a new FlavorComparator object.
        Comparator comparator = new FlavorComparator();
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator coneCostComparator = new ConeCostComparator();


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nBefore sorting:");
        for (Flavor flavor:flavors) {
            System.out.println(flavor.getName());
        }
        // 2. Next, call the sort method on flavors and pass the comparator object as the argument.
        flavors.sort(comparator);
        System.out.println("\nAfter sorting:");
        for (Flavor flavor:flavors) {
            System.out.println(flavor.getName());
        }

        System.out.println("\nBefore sorting:");
        for (Cone cone:cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        // 2. Next, call the sort method on flavors and pass the comparator object as the argument.
        cones.sort(coneCostComparator);
        System.out.println("\nAfter sorting:");
        for (Cone cone:cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

    }
}
