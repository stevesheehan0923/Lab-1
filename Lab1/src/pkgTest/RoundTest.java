package pkgTest;

import static org.junit.Assert.fail;

import org.junit.Test;

import pkgCore.Round;
import pkgCore.eGameResult;

public class RoundTest {

	@Test
	public void TestRound() {

		for (int a = 0; a < 10000; a++) {
			Round r = new Round();
			// TODO: Make sure value of roll is between 1 and 12.
			if (r.geteGameResult() == eGameResult.NATURAL) {
				
			}
			else if(r.geteGameResult() == eGameResult.CRAPS) {
				
			}
			else if(r.geteGameResult() == eGameResult.POINT) {
				
			}
			else if(r.geteGameResult() == eGameResult.SEVEN_OUT) {
	
			}
			else {
				fail("result was not a result");
			}
		}
		

	}

}
