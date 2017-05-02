package prob5;

public class MyStack {
	private String array[];
	private int top = -1;
	
	public MyStack(int i) throws MyStackException {
		array = new String[i];
	}

	public int size() {
		return array.length;
	}
	
	public void push(String string) throws MyStackException {
		if(top < size()-1) {
			top++;
			array[top] = string;
		} else {
			System.out.println("doubling");
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
			String result = array[top];
			array[top] = "";
			top--;
			return result;
		} else {
			throw new MyStackException("stack is empty");
		}
	}
	
	public String peek() throws MyStackException {
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
