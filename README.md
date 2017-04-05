# Blackjacks
### Jen Yu, Brooke Jin, Federico Tondolo
### Period 5 APCS2, Mr. Brown Mykolyk
**UPDATED WITH DOCUMENTATION OF IMPROVEMENTS IN IMPLEMENTATION OF DEQUE INTERFACE**

**Interface Methods**
1. void addFirst(Koenig item)
2. void addLast(Koenig item)
3. Koenig removeFirst()
4. Koenig removeLast()
5. Koenig peekFirst()
6. Koenig peekLast()

**Rationale for Method Selections** 

A deque is a double-ended queue. This means that you need to be able to add and remove elements from both ends of the queue. This definition makes it imperative that we include the methods listed above. 

*Queue, with versatility from both ends*
```
_front -> a -> b -> c -> _end
```
If you wanted to execute the basic functions of a queue, (adding elements to the end, and removing elements from the front), the function ```addLast()``` does the job of ```enqueue()``` and the function ```removeFirst()``` does the job of ```dequeue```. 

If you wanted to do the same thing from the other end of the deque, you could remove the last element with the function ```removeLast()``` and add something to the front using the function ```addFirst()```. 

**Why a DLLNode based architecture?**  

We utilized a DLLNode based architecture for several reasons. 
1. When implementing a regular queue, we found that it was much simpler to use a LinkedList queue, since enqueueing and dequeueing would only involve relocating the pointers \_front and \_end to different nodes. 
  - For a doubly-ended queue, the same rationale follows that in order to remove/add first/last, you would simply need to relocate pointers. 
2. Relocation of pointers is rather efficient, as it only utlizes an O(1) runtime. 
  - In an ArrayList or Array based structure, you would need to shift all the elements either to the front or to the end, based on what implementation you decided to use, processes that all require O(n) runtime. 
3. Although the doubly-linked nodes take up more memory space with three pointers (one to cargo, one to previous node, one to next node) than the pointer within each index of an Array or ArrayList, the previous node pointer of a DLLNode becomes very helpful in a Deque. 
  - In a double-ended queue, this means that in the case where you were adding or removing from the end, you could just relocate the pointer of the previous node. 
  - In other structures, one would have to discover/maintain a specific index in order to access things from the other end (depending on which end is the "front"). 

**rOBustIFIEd**
- Added ```isEmpty()``` method to functions that remove elements within the Deque. This was done so that in the case where the user would try to remove from an empty Deque, then the function would not display an error, but return null. (Suggested by JDK)
- Made the last paragraph more readable with bullet points. (Suggested by Only Duo)
- Added the runtime for all functions. (Suggested by AllCamerasOnDeque)
