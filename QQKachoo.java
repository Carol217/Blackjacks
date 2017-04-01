public class QQKachoo<D> implements Deque<D>{
    private DLLNode<D> _front, _end;
    // default constructor creates an empty queue
    public QQKachoo()
        {
           _front=null;
           _end=null;
           }
		   
    public boolean isEmpty()
	{
	  if (_front==_end){
    		return true;
  	  }
 	 return false;
	}
	
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
			_end = tmp;
		}
	}
	
	public D removeFirst()
	{
		D tmp = (D)_front;
		_front = _front.getNext();
		_front.setPrev(null);
		return tmp;
	}

    public D removeLast()
	{
		D tmp = (D)_end;
		_end = _end.getPrev();
		_end.setNext(null);
		return tmp;
	}

    public D peekFirst() 
    {
		if (!isEmpty())
		{
			return (D) _front;
		}
		return null;
    }//O(1)

	public D peekLast() 
    {
		if (!isEmpty())
		{
			return (D) _end;
		}
		return null;
    }//O(1)

}
