package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private byte Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'
		d1 = new Die();
		d2 = new Die();
		Score = (byte) (d1.getDieValue() + d2.getDieValue());
	}
	public byte ScoreRoll() {
		return (byte) (d1.getDieValue() + d2.getDieValue());
	}
	public boolean isSeven() {
		return (ScoreRoll() == 7) ? true: false;
	}
	public boolean isEleven() {
		return (ScoreRoll() == 11) ? true: false;
	}
	public boolean isNatural() {
		return isSeven() || isEleven();
	}
	public boolean isTwo() {
		return (ScoreRoll() == 2) ? true: false;
	}
	public boolean isThree() {
		return (ScoreRoll() == 3) ? true: false;
	}
	public boolean isTwelve() {
		return (ScoreRoll() == 12) ? true: false;
	}
	public boolean isCraps() {
		return isTwelve() || isThree() || isTwo();
	}
	public byte getScore() {
		return Score;
	}

}
