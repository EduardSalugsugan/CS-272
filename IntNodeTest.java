public class IntNodeTest {

	public static void main(String[] args) {
		IntNode i1 = new IntNode(4,null);
		IntNode i2 = new IntNode(5,null);
		
		//test the addNodeAfterThis method
		i1.addNodeAfterThis(13);
		i1.addNodeAfterThis(14);
		i1.addNodeAfterThis(15);
		System.out.println("The data in the IntNode is: " + i1.toString());
		
		i2.addNodeAfterThis(16);
		i2.addNodeAfterThis(17);
		i2.addNodeAfterThis(18);
		
		//test setLink
		i1.setLink(i2);
		//prints the two nodes put together
		System.out.println("The data of the two IntNodes put together is: " + i1.toString());
		
		//prints how long the list is which should be 4
		System.out.println("The length of the IntNode is: " + i1.listLength(i1));
		
		//removes the first node on the list
		i1.removeNodeAfterThis();
		
		//prints the listLength and the data of i1 when removing the first node
		System.out.println("The data of the IntNode when the first data is removed: " + i1.toString());
		System.out.println("The length of the IntNode when removing the first data: " + i1.listLength(i1));
		
		//test search method with an int thats in the node
		System.out.println(i1.search(i1,4));
		
		//test search method with an int thats not in the node
		System.out.println(i1.search(i1,20));
	}
}
