package AdvancedType;

public class TestCLOCK {


	public static void main(String[] args) throws InterruptedException {
		
		ClockBuffer  cb1 = new ClockBuffer();	
		
		
		// list of element with CLOCK BEtter than both of lru and fifo
		//{1,2,3,4,5,4,3,6,7,8,4,3}
		//{"A","B","C","D","E","D","C","F","G","H","D","C"}
		
		// LIST OF ELEMENT where LRU is better than fifo 
		//{1,2,3,4,5,4,3,6,7,3,4,3}
		String [] elementToInsert = {"A","B","C","D","E","D","C","F","G","H","D","C"};
		System.out.println("CLOCK REPLACEMET TEST WITH SEQUENCE : ");
		
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
			System.out.println(cb1.cptOfEachElement);
			
			System.out.println("Clock arrow position "+ (cb1.posOfArrow+1));
			Thread.sleep(1000);
			System.out.println("Total nb of page misses "+cb1.nbPageMisses);

		}
		
		
		
		System.out.println(cb1.myBufferElement);
		System.out.println("Total nb of page misses "+cb1.nbPageMisses);

	}
	
}

/*
cb1.addElement(new Integer(1));
cb1.addElement(new Integer(2));
cb1.addElement(new Integer(3));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(5));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(3));
cb1.addElement(new Integer(6));
cb1.addElement(new Integer(7));
cb1.addElement(new Integer(8));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(3));

/**

 ex 1 with one page misses improved
cb1.addElement(new Integer(1));
cb1.addElement(new Integer(2));
cb1.addElement(new Integer(3));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(5));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(6));
cb1.addElement(new Integer(7));
cb1.addElement(new Integer(8));
cb1.addElement(new Integer(9));
cb1.addElement(new Integer(1));
cb1.addElement(new Integer(4));


/*



cb1.addElement(new Integer(6));
cb1.addElement(new Integer(7));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(3));
cb1.addElement(new Integer(2));
cb1.addElement(new Integer(1));
cb1.addElement(new Integer(5));
cb1.addElement(new Integer(4));
cb1.addElement(new Integer(5));
cb1.addElement(new Integer(7));
cb1.addElement(new Integer(6));
cb1.addElement(new Integer(5));
cb1.addElement(new Integer(6));
cb1.addElement(new Integer(1));
cb1.addElement(new Integer(2));

/*
1 2 3 4 1 2 5 1 2 3 4 5



fb.addElement(new Integer(8));
fb.addElement(new Integer(9));*/
