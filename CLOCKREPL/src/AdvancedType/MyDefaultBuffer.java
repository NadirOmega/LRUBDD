package AdvancedType;
import java.util.ArrayList;
import java.util.HashMap;

public class MyDefaultBuffer<T> {

	public ArrayList<T> myBufferElement;
	public final int BUFFER_SIZE =4;
	public int elemntNb;
	
	public MyDefaultBuffer() {
		this.myBufferElement= new ArrayList<T>();
		elemntNb=0;
	}
	


}
