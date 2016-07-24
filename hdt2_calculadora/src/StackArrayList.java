import java.util.ArrayList;

/**
 *
 * @author arriaza96
 * @param <E> tipo de objeto
 */
public class StackArrayList<E>
 implements Stack<E>
{

    /**
     *
     */
    protected ArrayList<E> data;

    /**
     *
     */
    public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

    /**
     *
     * @param item
     */
    public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

    /**
     *
     * @return
     */
    public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

    /**
     *
     * @return
     */
    public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
    /**
     *
     * @return
     */
    public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
    /**
     *
     * @return
     */
    public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}