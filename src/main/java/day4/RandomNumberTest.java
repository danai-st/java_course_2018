package day4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {

	@Test
	public void random_5() {
		Demo demo = new Demo();
		assertEquals(5, demo.generateNumber(new Random5()) );
	}

}

class Random5 implements MyRandom {
	@Override
	public int nextInt() {
		return 5;
	}			
}
