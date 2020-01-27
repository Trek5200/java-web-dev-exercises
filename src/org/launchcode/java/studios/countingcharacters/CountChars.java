package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountChars {

    public static void main(String[] arg){

        String stringEntry = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";

                        //The next four lines are for Bonus 1
                        //Prompt the user to enter the string in the command line
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a few sentences: ");
        stringEntry = input.nextLine();
                        //System.out.println(stringEntry);

                        //The next two lines are for Bonus 2
                        //Make the character counts case-insensitive
        stringEntry = stringEntry.toLowerCase();
                        //System.out.println(stringEntry);

                        //The next three lines are for Bonus 3
                        //remove the non-alphanumeric characters from the sentence string
        String s = stringEntry;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
                        //System.out.println(s);
        stringEntry = s;

        HashMap<Character, Integer> parsedEntry = new HashMap<>();
//        parsedEntry.put('e', 0);      //this was used for debugging

        for ( int i=0; i<stringEntry.length(); i++){

                        //System.out.println(stringEntry.charAt(i));
                        //System.out.println(i);
            Character iKey = stringEntry.charAt(i);
                        //System.out.println(iKey);

            if (parsedEntry.containsKey(iKey)){ //stringEntry.charAt(i)
//                parsedEntry.put(stringEntry.charAt(i), parsedEntry.get(stringEntry.charAt(i))+1); //myMap.put(key, myMap.get(key) + 1)
                parsedEntry.put(iKey, parsedEntry.get(iKey)+1);
                        //System.out.println("contains i");
            } else {
//                parsedEntry.put(stringEntry.charAt(i), 1);
                parsedEntry.put(iKey, 1);
                        //System.out.println("does not contain i");
            }
        }
        System.out.println(parsedEntry);
        input.close();
    }
}
