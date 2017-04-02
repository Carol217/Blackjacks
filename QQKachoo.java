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
			tmp.setPrev(_end);
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
		D temp = (D)_end;
	  _end.setCargo(null);
    return temp;
	}

    public D peekFirst()
    {
		if (!isEmpty())
		{
			return (D) _front.toString();
		}
		return null;
    }//O(1)

	public D peekLast()
    {
		if (!isEmpty())
		{
			return (D) _end.getPrev().toString();
		}
		return null;
    }//O(1)

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
