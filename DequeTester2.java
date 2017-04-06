/**************************************
 * DequeTester2                       *
 * AllCAMerasOnDeck                   *
 * HW31- That We May All Relax Harder *
 **************************************/

public class DequeTester2{



    public static void main( String[] args ) 

    {
        QQKachoo<String> deque = new QQKachoo<String>();
       
	//Print out the current size, should be 0
	System.out.println("\nis it empty?");
	System.out.println(deque.isEmpty());

	//starting to add values from the front
	System.out.println("\naddFirst..."); 
	deque.addFirst("1");
	deque.addFirst("2");
	deque.addFirst("3");

	//String should look like "3 2 1"
	System.out.println( deque ); //for testing toString()...

	//should return a 3
	System.out.println("\npeek first");
	System.out.println(deque.peekFirst());

	//should return a 1
	System.out.println("\npeek last"); 	
	System.out.println(deque.peekLast()); 

	//starting to add values from the back
	System.out.println("\naddLast..."); 
	deque.addLast("4");
	deque.addLast("5");
	deque.addLast("6");

	//String should look like "3 2 1 4 5 6"
	System.out.println( deque );

	//should return a 3
	System.out.println("\npeeking first");
	System.out.println(deque.peekFirst());

	//should return a 6
	System.out.println("\npeeking last"); 	
	System.out.println(deque.peekLast()); 

	//should have a size of 6
	System.out.println("\nis it empty?");
	System.out.println(deque.isEmpty());

	//String should look like "3 2 1 4 5 6"
	System.out.println("\nnow testing toString()..."); 
	System.out.println( deque );

	//starting to remove values from the front
	System.out.println("\nnow removing first..."); 
	System.out.println( deque.removeFirst() ); //3
	System.out.println( deque.removeFirst() ); //2
	System.out.println( deque.removeFirst() ); //1

	//String should look like "4 5 6"
	System.out.println("\nnow testing toString()..."); 
	System.out.println( deque );

	//Starting to remove values from the back
	System.out.println("\nnow removing last..."); 
	System.out.println( deque.removeLast() ); //6
	System.out.println( deque.removeLast() ); //5
	System.out.println( deque.removeLast() ); //4
	//Removing 4 yields an error; size remains 1
	
	//should have a size of 0
	System.out.println("\nshould be empty");
	System.out.println(deque.isEmpty());

	//should throw an error
	System.out.println("\nDeque from empty deque should yield error..."); 
	System.out.println( deque.removeFirst() );
	/********************************
	 * Error received: ClassCastException
	 * Incorrect exception
	 ********************************/

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

	 ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
	
    }//end main

}
