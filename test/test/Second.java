package test;

public class Second {
	private int fnum, snum;

	Second(int fnum, int snum) {
		this.fnum = fnum;
		this.snum = snum;
	}

	int add() {

		return this.fnum + this.snum;
	}

	int multiply() {

		return this.fnum * this.snum;
	}

	void doubleme() {
		this.fnum = this.fnum * 2;
		this.snum = this.snum * 2;
	}

	public int getFnum() {
		return this.fnum;
	}

	public int getSnum() {
		return this.snum;
	}

}
