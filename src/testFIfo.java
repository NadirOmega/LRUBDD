package AdvancedType;

public class testFIfo {

	public static void main(String[] args) throws InterruptedException {

		FifoBuffer  cb1 = new FifoBuffer();	
		Integer [] elementToInsert = {1,2,3,4,5,4,3,6,7,8,4,3};
		System.out.println("FIFO TEST WITH SEQUENCE : ");
		
		System.out.print("{");
		for(Integer i :elementToInsert ) {
			System.out.print(" "+ i +" " );
		}
		System.out.println("}");
		for(Integer i :elementToInsert ) {
			Thread.sleep(1000);
			System.out.println("Insert the element "+ i +" to the buffer");
			cb1.addElement(i);
			Thread.sleep(2000);
			System.out.println(cb1.myBufferElement);
			Thread.sleep(1000);
			System.out.println("Total nb of page misses "+cb1.nbPageMisses);
			

		}



		System.out.println(cb1.myBufferElement);
		System.out.println("Total nb of page misses "+cb1.nbPageMisses);

	}
	

}
