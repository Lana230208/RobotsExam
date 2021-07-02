package exam;

import java.util.Random;

public class Letters {
    static final String LETTERS = "QWEASDZXC";

    public static String random5(){
        Random randomNumbers = new Random();
        String line = "";
        while (line.length() < 5){
            int i = randomNumbers.nextInt(LETTERS.length());
            //If line doesn't contain letter from LETTERS
            if (!line.contains(LETTERS.substring(i, i+1))){
                line = line + LETTERS.substring(i, i+1);
            }
        }
        return line;
    }
}

//    public static void main(String[] args) {
//        String l5 = random5();
//        System.out.println(l5);

//    String alphabet = "QWEASDZXC";
//    char getRandomKey(){
//    int randIdx = new Random().nextInt(alphabet.length());
//    char randChar = alphabet.charAt(randIdx);
//    alphabet = alphabet.replace(String.valueOf(randChar),"");
//    return randChar;
//    }
