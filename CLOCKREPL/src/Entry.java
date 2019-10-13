
public class Entry {

	int val ;

	public Entry(int val) {
		super();
		this.val = val;
	}
	public boolean equals(Entry entry) {
		return (this.val==entry.val);
	}
	public String ToString() {
		return String.valueOf(this.val);
	}
}
