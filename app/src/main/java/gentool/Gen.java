package gentool;

import java.util.Random;

public class Gen {

    private Random rand = new Random();

    private String getLowerCase() {
        String res = "";
        for(int i=97; i<123; i++) {
            res += (char) i;
        }
        return res;
    }

    private String getUpperCase() {
        String res = "";
        for(int i=65; i<91; i++) {
            res += (char) i;
        }
        return res;
    }

    private String getDigits() {
        String res = "";
        for(int i=49; i<58; i++) {
            res += (char) i;
        }
        return res;
    }

    private String getLetters() {
        return getLowerCase()+getUpperCase()+getDigits();
    }

    public String getRandomString(int length) {
        String letters = getLetters();
        String res = "";
        for(int i=0; i<length; i++) {
            res += letters.charAt(rand.nextInt(letters.length()));
        }
        return res;
    }

}
