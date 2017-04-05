//Team Blackjacks

public class QQKachoo<D> implements Deque<D>{

    //instance vars keep track of front and end of the deque
    private DLLNode<D> _front, _end;

    //default constructor creates an empty deque
    public QQKachoo()
	{
	    _front=null;
	    _end=null;
	}

    //checks if the deque is empty
    public boolean isEmpty()
    {
	if (_front==_end){
	    return true;
	}
	return false;
    }

    //returns the deque in a string 
    public String toString()
    {
	String retStr = "";
	DLLNode<D> iter = _front;
	while (iter != null)
	    {
		if (iter.getCargo() != null)
		    retStr += iter.getCargo() + " ";
		iter = iter.getNext();
	    }
	return retStr;
    }

    //adds an object to the front of the deque
    public void addFirst(D e)
    {
	if (_front == null)
	    {
		//System.out.println("init");
		DLLNode<D> tmp = new DLLNode(e, null);
		_front = tmp;
		_end = tmp;
	    }
	else
	    {
		DLLNode<D> tmp = new DLLNode(e, _front);
		_front.setPrev(tmp);
		_front = tmp;
	    }
    }

    //adds an object to the end of the deque
    public void addLast(D e)
    {
	if (_front == null)
	    {
		//System.out.println("init");
		DLLNode<D> tmp = new DLLNode(e, null);
		_front = tmp;
		_end = tmp;
	    }
	else
	    {
		DLLNode<D> tmp = new DLLNode(e, null);
		_end.setNext(tmp);
		tmp.setPrev(_end);
		_end = tmp;
	    }
    }
    
    //removes the first item of the deque
    /** For Both remove methods: 
	Make a base case for empty deques using isEmpty() to throw an exception or return null
     **/

    public D removeFirst()
    {
	D tmp = (D)_front;
	_front = _front.getNext();
	_front.setPrev(null);
	return tmp;
    }

    //removes the last item of the deque
    public D removeLast()
    {
	D temp = (D)_end;
	_end.setCargo(null);
	return temp;
    }

    //returns the first item of the deque without removing it
    public D peekFirst()
    {
	if (!isEmpty())
	    {
		return (D) _front.toString();
	    }
	return null;
    }//O(1)

    //returns the last item of the deque without removing it
    public D peekLast()
    {
	if (!isEmpty())
	    {
		return (D) _end.getPrev().toString();
	    }
	return null;
    }//O(1)

    //tests
    public static void main(String[] args)
    {

	QQKachoo<String> ernie = new QQKachoo();
	ernie.addFirst("bert");
	ernie.addFirst("elmo");
	ernie.addLast("big bird");
	ernie.addLast("oscar the grouch");
	System.out.println(ernie); //expected:  elmo, bert, big bird, oscar the grouch
	ernie.removeFirst();
	System.out.println(ernie); //expected: bert, big bird, oscar the grouch
	ernie.removeLast();
	System.out.println(ernie); //expected: bert, big bird
	System.out.println(ernie.peekFirst());//expected: bert
	System.out.println(ernie.peekLast());//expected: big bird
    }
}
