package AdvancedType;

public class testMru {

	public static void main(String[] args) throws InterruptedException {
		MruBuffer  mru = new MruBuffer();
		String [] elementToInsert = {"A","B","C","D","E","D","C","F","G","H","D","C"};
		System.out.println("MRU TEST WITH SEQUENCE : ");
		
		System.out.print("{");
		for(String i :elementToInsert ) {
			System.out.print(" "+ i +" " );
		}
		System.out.println("}");
		
		for(String i :elementToInsert ) {
			Thread.sleep(1000);
			System.out.println("Insert the element "+ i +" to the buffer");
			mru.addElement(i);
			Thread.sleep(2000);
			System.out.println(mru.myBufferElement);
			Thread.sleep(1000);
			System.out.println("Total nb of page misses "+mru.nbPageMisses);
		}

		System.out.println(mru.myBufferElement);

		System.out.println(mru.nbPageMisses);
	}

}
