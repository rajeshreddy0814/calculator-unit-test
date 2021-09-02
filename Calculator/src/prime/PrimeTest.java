package prime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import calculator.CAL;

class PrimeTest {
@Test
	void testAdd() {
		EXample ts = new EXample();
		int x=20;
		
		
		int actual =ts.Prime(x);
		int expected=0;
		assertEquals(expected, actual);
	}

}
