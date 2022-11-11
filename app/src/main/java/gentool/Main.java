package gentool;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random rand = new Random();

    public static void main(String args[]) {
	int l;
	if(args.length==0) {
		l = rand.nextInt(20)+1;
	} else {
        	l = Integer.parseInt(args[0]);
	}
        Gen gen = new Gen();
        System.out.println(gen.getRandomString(l));
    }
}
