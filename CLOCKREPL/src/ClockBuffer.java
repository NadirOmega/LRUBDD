import java.util.ArrayList;

public class ClockBuffer extends MyDefaultBuffer{

	public ArrayList<Integer> myBufferElement = new ArrayList<Integer> ();
	public ArrayList<Integer> cptOfEachElement= new ArrayList<Integer> ();
	
	public ClockBuffer() {
		super();
		cptOfEachElement.add(0);
		cptOfEachElement.add(0);
		cptOfEachElement.add(0);
		cptOfEachElement.add(0);
	}
	public int cpt =0;
	public int posOfArrow=0;
	int nbPageMisses=0;
	public boolean checkIfExist(Integer entry) {
		for(Integer en : this.myBufferElement) {
			if(en.equals(entry)) {
				return true;
			}
		}
		return false;
	}
	public boolean deleteEntry(Integer entry) {
		this.myBufferElement.remove(entry);
		return true;
	}
	public int getIndexOfELement(Integer entry) {

		return this.myBufferElement.indexOf(entry);
	}
	public void updateElement(Integer entry) {
		if(this.cptOfEachElement.get(this.myBufferElement.indexOf(entry))==0) {
			this.cptOfEachElement.set(this.myBufferElement.indexOf(entry), 1);
		}


	}
	public int findVictim() {
		int n =posOfArrow;
		while(true) {
			if(this.cptOfEachElement.get(n)==0 ) { 
				//posOfArrow =(posOfArrow+1) %4;
				return n;
			}
			else {
				this.cptOfEachElement.set(n,0); 
				posOfArrow =(posOfArrow+1) %4;
				}
			n=((n+=1)%4);
			}
		}


	public void addElement(Integer entry) {
		if (this.checkIfExist(entry)){
			this.updateElement(entry);
		}
		else if(this.elemntNb==this.BUFFER_SIZE) {
			int posToDelete = this.findVictim();
			this.myBufferElement.remove(posToDelete);
			this.myBufferElement.add(posToDelete, entry);
			this.cptOfEachElement.set(myBufferElement.indexOf(entry),1);
			this.nbPageMisses++;
		}
		else {
			this.nbPageMisses++;
			this.elemntNb++;
			this.myBufferElement.add(entry);
			cptOfEachElement.set(myBufferElement.indexOf(entry),1);
		}



	}
}
