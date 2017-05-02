package prob5;

public class MyStack {
	private String array[];
	private int top = 0;
	
	public MyStack(int i) throws MyStackException {
		array = new String[i];
	}

	public int size() {
		return array.length;
	}
	
	public void push(String string) throws MyStackException {
		if(top < size()) {
			array[top] = string;
			top++;
		} else {
			stackDoubling();
			push(string);
		}
	}

	private void stackDoubling() {
		int doublingsize = size()*2;
		String temp[] = new String[doublingsize];
		System.arraycopy(array, 0, temp, 0, size());
		array = temp;
	}

	public String pop() throws MyStackException {
		if(!isEmpty()) {
			String result = array[top-1];
			array[top-1] = "";
			top--;
			return result;
		} else {
			throw new MyStackException("stack is empty");
		}
	}
	
	public String peek() throws MyStackException {
		if(!isEmpty()) {
			return array[top-1];
		} else {
			throw new MyStackException("stack is empty");
		}
	}
	
	public boolean isEmpty() throws MyStackException {
		if(top == 0) {
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
