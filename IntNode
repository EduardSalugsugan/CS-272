public class IntNode {
	
	// instance variables
	private int data;
	private IntNode link;

	public IntNode() {
		data = 0;
		link = null;
	}// end of IntNode

	public IntNode(int _data, IntNode _node) {
		data = _data;
		link = _node;
	}// end of IntNode
	
	public int getData() {
		return data;
	}// end of getData
	
	public IntNode getLink() {
		return link;
	}// end of getLink
	
	public void setData (int _data) {
		data = _data;
	}// end of setData
	
	// links two nodes together
	public void setLink(IntNode _link) {
		link = _link;
	}// end of setLink
	
	// a method to return how long the node list 
	public static int listLength(IntNode head) {
		int answer = 0;
		
		for (IntNode cursor = head; cursor != null; cursor = cursor.link) {
			answer++;
		}	
		return answer;
	}// end of listLength
	
	// a print method to print the data in the node
	public String toString() {
		String answer = "";
		
		for (IntNode cursor = this; cursor != null; cursor = cursor.link) {
			IntNode tempcursor;
			tempcursor = cursor.link;
			int d = cursor.getData();
				if(tempcursor != null) {
					answer = answer + d + "->";
				}// end of if
				else {
					answer = answer + d;
				}// end of else
		}// end of for		
		return answer;
	}// end of toString
	
	// adds a node right behind the head
	public void addNodeAfterThis(int newdata) {
		link = new IntNode (newdata, link);
	}// end of addNodeAfterThis
	
	// searches a target and returns true if found and false if not 
	public static boolean search(IntNode head, int _data) {
		
		for (IntNode cursor = head; cursor != null; cursor = cursor.link) {
			if(cursor.data == _data) {
				return true;
			}// end of if
		}// end of for		
		return false;
	}// end of addNodeAfterThis
	
	// removes the current first data
	public void removeNodeAfterThis() {
		link = link.link;
	}// end of removeNodeAfterThis
	
}// end of IntNode
