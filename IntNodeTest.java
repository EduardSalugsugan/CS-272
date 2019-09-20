public class IntNodeTest extends IntNode{

	public static void main(String[] args) {
		
		//set and get data test
		IntNode i1 = new IntNode(); 
		i1.setData(13);
		System.out.println("setData and getData test: " + i1.getData());
		
		//set and get link test
		IntNode i2 = new IntNode(5,null);
		i1.setLink(i2);
		System.out.println("setLink and getLink test when IntNode i1 is getting link to IntNode i2: " + i1.getLink());
		
		//addNodeAfterThis test
		i1.addNodeAfterThis(14);
		i1.addNodeAfterThis(15);
		i1.addNodeAfterThis(16);
		i1.addNodeAfterThis(17);
		System.out.println("to String and addNodeAfterThis test: " + i1.toString());
		
		//removeNodeAfterThis test
		i1.removeNodeAfterThis();
		System.out.println("removeNodeAfterThis test: " + i1.toString());
		
		//listLength test
		System.out.println("listLength test: " + listLength(i1));
		
		//search test
		System.out.println("search test is 16 in the IntNode: " + search(i1,16));
		System.out.println("search test is 20 in the IntNode: " + search(i1,20));
		
	}

}
