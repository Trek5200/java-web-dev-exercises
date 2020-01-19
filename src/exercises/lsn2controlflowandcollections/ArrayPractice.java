package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main (String[] args){
        int[] practiceArray = {1, 1, 2, 3, 5, 8};
                    //Prints practiceArray: Must use Arrays.toString() or result is like [I@5eb1404f
//        System.out.println(Arrays.toString(practiceArray));
                    //for loop to print entire practiceArray
//        for(int i : practiceArray){
//            System.out.println(i);
//        }
                    //for loop modified to print only odd integers in practiceArray
                    //note the use of i in the if statement; using practiceArray[i] does not work
        for(int i : practiceArray){
            if( !(i%2 == 0) ){      // did not figure out how to use .equals() instead of ==
                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String sentence1 =  "I would not, could not, in a box: " +
                "I would not, could not with a fox: " +
                "I will not eat them in a house: " +
                "I will not eat them with a mouse:";

                    //Use the split method to divide the string at each space and store the individual words in an array
        String[] sentenceArrayWords = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArrayWords));

                    //Split the string into separate sentences.
        String[] sentenceArrayPeriod = sentence.split("\\.");
                    //https://www.xyzws.com/Javafaq/how-to-use-java-stringsplit-method-to-split-a-string-by-dot/214
                    // metacharacters . and \ , so must use \ in front of \. to denote period
        System.out.println(Arrays.toString(sentenceArrayPeriod));

    }

}
