package prob5_update;

public class MyStack<T> {
	private T[] array;
	private int top = -1;
	
	public MyStack(int i) throws MyStackException {
		array = (T[])new Object[i];
	}

	public int size() {
		return array.length;
	}
	
	public void push(T object) throws MyStackException {
		if(top < size()-1) {
			top++;
			array[top] = object;
		} else {
			System.out.println("doubling");
			stackDoubling();
			push(object);
		}
	}

	private void stackDoubling() {
		int doublingsize = size()*2;
		T temp[] = (T[])new Object[doublingsize];
		System.arraycopy(array, 0, temp, 0, size());
		array = temp;
	}

	public T pop() throws MyStackException {
		if(!isEmpty()) {
			T result = array[top];
			array[top] = null;
			top--;
			return result;
		} else {
			throw new MyStackException("stack is empty");
		}
	}
	
	public T peek() throws MyStackException {
		if(!isEmpty()) {
			return array[top];
		} else {
			throw new MyStackException("stack is empty");
		}
	}
	
	public boolean isEmpty() throws MyStackException {
		if(top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int search(String string) {
		for(int i = 0; i < size(); i++) {
			if(array[i] == string) {
				return i;
			}
		}
		return -1;
	}

}
