
public class FifoBuffer extends MyDefaultBuffer {

	int nbPageMisses=0;
	public boolean decalEntry() {
		this.myBufferElement.remove(0);
		return true;
	} 
	public boolean checkIfExist(Integer entry) {
		for(Integer en : this.myBufferElement) {
			if(en.equals(entry)) {
				return true;
			}
		}
		return false;
	}
	public void addElement(Integer entry) {
		 if (this.checkIfExist(entry)){
			 //do nothing
		 }
		 
		 else if(this.elemntNb==this.BUFFER_SIZE) {
			 this.decalEntry();
			 this.myBufferElement.add(entry);
			 this.nbPageMisses++;
		 }
		 else {
			 this.nbPageMisses++;
			 this.elemntNb++;
			 this.myBufferElement.add(entry);
		 }
}
}
