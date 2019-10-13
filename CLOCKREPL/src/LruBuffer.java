import java.util.ArrayList;
import java.util.HashMap;

public class LruBuffer extends  MyDefaultBuffer{

	int nbPageMisses=0;
	
	public LruBuffer() {
		super();
	}

	
	public boolean checkIfExist(Integer entry) {
		for(Integer en : this.myBufferElement) {
			if(en.equals(entry)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean decalEntry() {
		this.myBufferElement.remove(0);
		return true;
	} 
	
	
	public boolean deleteEntry(Integer entry) {
		this.myBufferElement.remove(entry);
		return true;
	}

	
	public Integer getLastEntry() {
		return this.myBufferElement.get(this.myBufferElement.size()-1);
	}
	
	
	public int getIndexOfELement(Entry entry) {
		
		return this.myBufferElement.indexOf(entry);
	}
	
	public void updateElement(Integer entry) {
		
			this.myBufferElement.remove(entry);
			this.myBufferElement.add(entry);
	}
	public void addElement(Integer entry) {
		 if (this.checkIfExist(entry)){
			 this.updateElement(entry);
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
	/*
	public void insertAtTheEnd(Entry entry) {
		if(this.checkIfExist(entry)) {
			this.updateEntry(entry);
		}
		else {
			if(this.elemntNb!=this.BUFFER_SIZE) {
				this.elemntNb=+1;
				this.myBufferElement.put(elemntNb, entry);
			}
			else {
				
				
			}
		}*/
		


	}





