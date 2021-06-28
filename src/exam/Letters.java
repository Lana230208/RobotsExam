package exam;

import java.util.Random;

public class Letters {
    static final String LETTERS = "QWEASDZXC";

    public static String random5(){
        Random r = new Random();
        String s = "";
        while (s.length() < 5){
            int i = r.nextInt(LETTERS.length());
            if (!s.contains(LETTERS.substring(i, i+1))){
                s = s + LETTERS.substring(i, i+1);
            }
        }
        return s;
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
