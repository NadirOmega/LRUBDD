package AdvancedType;

public class testLru {

	public static void main(String[] args) throws InterruptedException {
		LruBuffer  cb1 = new LruBuffer();
		String [] elementToInsert = {"A","B","C","D","E","D","C","F","G","H","D","C"};
		System.out.println("LRU TEST WITH SEQUENCE : ");
		
		System.out.print("{");
		for(String i :elementToInsert ) {
			System.out.print(" "+ i +" " );
		}
		System.out.println("}");
		
		for(String i :elementToInsert ) {
			Thread.sleep(1000);
			System.out.println("Insert the element "+ i +" to the buffer");
			cb1.addElement(i);
			Thread.sleep(2000);
			System.out.println(cb1.myBufferElement);
			Thread.sleep(1000);
			System.out.println("Total nb of page misses "+cb1.nbPageMisses);
		}

		System.out.println(cb1.myBufferElement);

		System.out.println(cb1.nbPageMisses);
	}

}
