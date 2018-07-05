package day4;

import java.util.Random;

interface MyRandom {
	int nextInt();
}

public class Demo {

	public int generateNumber(MyRandom random) {
		return random.nextInt();
	}

}
