package pkgTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			if ((d.getDieValue() >= 1) && (d.getDieValue() <= 6)) {
				
			}
			else {
				fail(" die value is out of range: " + d.getDieValue());
			}
		}

	}
	
	@Test
	public void TestRandomDie() {

		int iTotalTrials = 100000;
		int[] arrayInt = {0, 0, 0, 0, 0, 0};
		for (int a = 0; a < 100000; a++) {
			Die d = new Die();
			arrayInt[d.getDieValue() - 1]++;
		}
		for (int i: arrayInt) {
			assertEquals(iTotalTrials / 6, i, ((100000/6)/100) * 2);
		}
	}
	
	

}
