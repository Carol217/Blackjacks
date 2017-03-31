public class QQKachoo<D> implements Deque<D>{
    private LLNode<D> _front, _end;
    // default constructor creates an empty queue
    public LLQueue()
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

}
