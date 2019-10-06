package AdvancedType;
import java.util.ArrayList;
import java.util.HashMap;

public class LruBuffer<T> extends  MyDefaultBuffer <T>{

	int nbPageMisses=0;
	public LruBuffer() {
		myBufferElement = new ArrayList<T> ();
	}

	
	public boolean checkIfExist(T entry) {
		for(T en : this.myBufferElement) {
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

	
	public <T> T getLastEntry() {
		return (T) this.myBufferElement.get(this.myBufferElement.size()-1);
	}
	
	
	public int getIndexOfELement(Integer entry) {
		
		return this.myBufferElement.indexOf(entry);
	}
	
	public void updateElement(T entry) {
		
			this.myBufferElement.remove(entry);
			this.myBufferElement.add(entry);
	}
	public void addElement(T entry) {
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





