public interface Deque<Koenig>
{
    
    //Method used to add object at the "front" end of the deque. Takes an object as an input because it is that object which it adds.
    public void addFirst(Koenig e);
   
    //Method almost exactly alike to addFirst except that it adds the object to the "end" end of the deque. Takes an object as an input becuase it is that object which it adds.
    public void addLast(Koenig e);
    
    //Method used to remove an object from the "front" of the deque.  Returns the element which it removes.
    public Koenig removeFirst();

    //Same as above (removeFirst) except for the fact that you remove the object from the "end" rather than the "front".  Returns the object which it removes.
    public Koenig removeLast();

    //Allows the program to "see" the first element of the deque by returning it.  Takes no argument as it always returns the first element.
    public Koenig peekFirst();

    //Same as peekFirst except that it returns the last element of the deque rather than the first one.  Takes no input for the same reason (it always peeks at the end marker).
    public Koenig peekLast();
	/********Lather, Rinse, Repeat********
	********Lather, Rinse, Repeat********/
}
