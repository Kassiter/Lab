/*
 * Lab
 * version 1.1
 * T-double-U
 */
public class basic {
	private String name;
	private int amount;
	private double version;
	public basic(String n, int a, double v) {
		this.name=n;
		this.amount = a;
		this.version=v;
	}
	public boolean OldVersion(double v) {
		boolean b=false;
		if(v>this.version) {
			b=true;
		}
		return b;
	}
	public String getName() {
		return this.name;
	}
	public int getAmount() {
		return this.amount;
	}
	public double getVersion() {
		return this.version;
	}
}
