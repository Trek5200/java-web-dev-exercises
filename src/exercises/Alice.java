package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of" +
                " sitting by her sister on the bank, and of having nothing to do:" +
                " once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        String wordInput;
        int wordInputLength;
        int indexOfWordInput;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a word to search for in the sentence: ");
        wordInput = input.nextLine();
        input.close();

        System.out.println("You asked to search for the following word: " + wordInput);
        System.out.println(sentence.contains(wordInput));

        indexOfWordInput = sentence.indexOf(wordInput);
        wordInputLength = wordInput.length();

        System.out.println("Starting index of the word searched for is: " + indexOfWordInput);
        System.out.println("The length of the word searched for is: " + wordInputLength);

        String sentence1 = sentence.substring(0,indexOfWordInput);
        String sentence2 = sentence.substring((indexOfWordInput + wordInputLength), (sentence.length()-1));
        String sentenceWithoutWord = sentence1 + sentence2;

        System.out.println(sentenceWithoutWord);

    }
}
