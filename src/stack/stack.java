package stack;

public class stack {
	private int size;
	private node top;

	public stack() {
		size = 1;
		top = new node();
	}

	public void push(Object value) {
		top = new node(value, top);
		size++;
	}

	public Object pop() throws Exception {
		if (size != 1) {
			Object out = top.value;
			top = top.link;
			size--;
			return out;
		} else {
			throw new Exception("No more node to pop!");
		}
	}
	
	public Object getTop() {
		return top.value;
	}
	public int getSize() {
		return size;
	}
}
