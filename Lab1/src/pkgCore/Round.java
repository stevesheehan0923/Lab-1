package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out

		// TODO: value the eGameResult after the round is complete
		rollDice();
		if (rolls.getLast().isCraps()) {
			eGameResult = eGameResult.CRAPS;
		}
		else if (rolls.getLast().isNatural()) {
			eGameResult = eGameResult.NATURAL;
		}
		else {
			do {
				rollDice();
			}
			while ((rolls.getLast().getScore() != 7)
				&& (rolls.getLast().getScore() != rolls.getFirst().getScore())); 
				
			if (rolls.getLast().getScore() == 7) {
				eGameResult = eGameResult.SEVEN_OUT;
			}
			else {
				eGameResult = eGameResult.POINT;
			}
		}
		//eGameResult = eGameResult.NATURAL;
	}
	
	public void rollDice() {
		Roll r = new Roll();
		rolls.add(r);
	}
	
	public eGameResult geteGameResult() {
		return this.eGameResult;
	}
	public boolean isComeOut() {
		return (rolls.size() == 1 ? true: false);
	}
	public Roll ComeOutRoll() {
		return rolls.getFirst();
	}
	
	public byte ComeOutRollScore() {
		return ComeOutRoll().getScore();
	}
	public boolean isNatural() {
		return ComeOutRoll().isNatural();
	}
	public boolean isCraps() {
		return ComeOutRoll().isCraps();
	}

	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}

}
