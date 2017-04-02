/*
Team Blackjacks
APCS2 Period 5
*/
/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode<T>
	{

    private T _cargo;    //cargo may only be of type T
    private DLLNode _nextNode; //pointer to next DLLNode
    private DLLNode _prevNode; //pointer to previous DLLNode

    // constructor -- initializes instance vars
    public DLLNode( T value, DLLNode next )
    {
	_cargo = value;
	_nextNode = next;
	_prevNode = null;
    }

    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev(){ return _prevNode;}
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo )
    {
	T temp = _cargo;
	_cargo = newCargo;
	return temp;
    }

    public DLLNode setNext( DLLNode newNext )
    {
	DLLNode temp = _nextNode;
	newNext.setPrev(this);
	_nextNode = newNext;
	return temp;
    }

    public DLLNode setPrev(DLLNode newPrev)
    {
	DLLNode temp = _prevNode;
	_prevNode = newPrev;
	return temp;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return (String) _cargo; }


    //main method for testing
    public static void main( String[] args )
	{


	//Below is an exercise in creating a linked list...

	//Create a node
	DLLNode first = new DLLNode( "do i", null );

	//Create a new node after the first
	first.setNext( new DLLNode( "wanna", null ) );

	//Create a third node after the second
	first.getNext().setNext( new DLLNode( "know", null ) );
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	//A naive list traversal:
	while( first != null ) {
	    System.out.println( "Before: "+ first.getPrev() + " Now: " + first );
	    first = first.getNext();
	}

	System.out.println(first);

	}//end main

    }//end class DLLNode
