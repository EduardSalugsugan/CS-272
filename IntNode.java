/* @author Eduard Salugsugan
 * CS-272 M01
 * Lab 4 IntNode
 * 9/17/2019
 */
public class IntNode {
	
	// variables
	private int data;
	private IntNode link;
	
	// default constructor
	public IntNode() {
		data =0;
		link = null;
	}
	
	/* constructor for two parameters
	 * @precondition links to IntNode object and of type integer
	 * @postcondition creates a new node and is point to a new link 
	 * @param _data to be put on the new node 
	 * @param _node to link it to the new node	 
	 */
	public IntNode(int _data, IntNode _node) {
		data = _data;
		link = _node;
	}
	
	/* method to get the Data of object IntNode
	 * @precondition none
	 * @postcondition returns data
	 * @param none
	 */
	public int getData() {
		return data;
	}
	
	/* method to get the Link of object IntNode
	 * @precondition none
	 * @postcondition returns link
	 * @param non
	 */
	public IntNode getLink() {
		return link;
	}

	/* method to set data
	 * @precondition puts a integer to variable data of object IntNode
	 * @postcondition sets variable data
	 * @param _data to put in variable data;
	 */
	public void setData(int _data) {
		data = _data;
	}
	
	/* method to set the link of the IntNodes
	 * @precondition puts a node to variable link of object IntNode
	 * @postcondition sets variable link
	 * @param _node to put in variable link
	 */
	public void setLink(IntNode _node) {
		link = _node;
	}
	
	/* method to print out all the data in the object node
	 * @precondition none
	 * @postcondition returns a string of all the data in the node
	 * @param none
	 */
	public String toString() {	
		IntNode cursor = this;
		String answer = "";
		
		for (cursor = this; cursor != null; cursor = cursor.link) {
			IntNode tempcursor = cursor.link;
			int cdata = cursor.data;
			if (tempcursor != null) {
				answer = answer + cdata + "->";
			}// end of if
			else {
				answer = answer + cdata;
			}// end of else
		}// end of for loop
		return answer;
	}// end of toString 
	
	/* method to add data in the front the object IntNode
	 * @precondition links new data to the object IntNode
	 * @postcondition the new data is then in front of the IntNode 
	 * @param newdata to put in front of the IntNode
	 */
	public void addNodeAfterThis(int newdata) {
		link = new IntNode (newdata, link);
	}// end of addNodeAfterThis
	
	/* method to remove data in front of the object IntNode
	 * @precondition removes data in front of IntNode
	 * @postcondition data is removed from IntNode
	 * @param none
	 */
	public void removeNodeAfterThis() {
		link = link.link;
	}// end of removeNodeAfterThis
	
	/* method to find the length of the IntNode
	 * @precondition goes through the IntNode and counts how many data there are
	 * @postcondition stores the amount of data in the IntNode and then returns it
	 * @param head to count to amount of data in the IntNode
	 */
	public static int listLength(IntNode head) {
		int count = 0;
		IntNode cursor = new IntNode();
		for (cursor = head; cursor != null; cursor = cursor.link) {
			count++;
		}// end of for
		return count;
	}// end of listLength
	
	/* method to search a certain data
	 * @precondition goes to the IntNode one by one to check if its the data that the user is looking for
	 * @postcondition returns a boolean of true or false if the data was found on the IntNode
	 * @param head the IntNode to check the data
	 * @param data the variable to check if its in the IntNode
	 */
	public static boolean search(IntNode head, int data) {

		for (IntNode cursor = head; cursor != null; cursor = cursor.link) {
			if (cursor.data == data) {
				return true;
			}// end of if
		}// end of for
		return false;
	}// end of search

}// end of IntNode