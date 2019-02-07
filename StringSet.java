/**
 * This class stores strings on a string array 
 * @author Eduard Salugsugan
 * @param Data
 * 	The array that need to be searched
 * @param Size
 * 	The amount of elements that aren't null in the array
 */
public class StringSet {
	
	private int Size;
	private String[] Data;
	
	/*	@postcondition
	*		This bag is	empty and has and initial capacity of 2.
	*	@exception	OutOfMemoryError	*/
	public StringSet() {
		final int InitialCapacity = 2;
		Size = 0;
		Data = new String[InitialCapacity];	
	}// end of StringSet
	
	/**	@precondition
	*			_capacity is non-negative.
	*	@postcondition
	*			This bag is	empty and has the given	initial	capacity.
	*	@exception	IllegalArgumentException
	*			Indicates that initialCapacity is negative.
	*	@exception OutOfMemoryError
	*/
	public StringSet(int _capacity) {
		if (_capacity < 0) 
			throw new IllegalArgumentException 
			("The Capacity is negative: " + _capacity);			
		Data = new String[_capacity];
		Size = 0;
	}// end of StringSet
	
	public StringSet(Object obj) {
		
		if (obj == null) {
			System.out.println("The obj is a StringSet");
		}// end of if
		else if(obj instanceof StringSet) {
			StringSet toCopy = (StringSet) obj;
			Size = toCopy.Size;
			Data = toCopy.Data;
		}// end of else if
		
	}// end of StringSet
	
	public int size() {
		return Size;
	}// end of Size
	
	public int capacity() {
		return Data.length;
	}// end of capacity
	
	/**@param a 
	 * 			: The String that is being added to the array.
	*  @postcondition
	*			A new copy of the element has been added to this bag.
	*/
	public void add(String a) {
		
		if (a == null) {
			System.out.println("String added cannot be null");
		}// end of if
		else if (Size == Data.length) {
			String[] biggerArray = new String[(Size + 1) * 2];
			System.arraycopy(Data, 0, biggerArray, 0, Size);
			Data = biggerArray;
		}// end of else if
		
		Data[Size] = a;
		Size++;
		
	}// end of add
	
	public boolean contains(String a) {
		
		for (int i = 0; i < Data.length; i++) {
			if (a == Data[i]) {
				return true;
			}// end of if
		}// end of for
		return false;
		
	}// end of contains
	
	/**	@param a
	 * 				: The string that is being tested on the method.
	 * 	@postcondition if a equals the element in the array it is remove 
	 * 				from the data array and returns true, but if its not in the data 
	 * 				array then the method will return false.
	*/
	public boolean remove(String a) {
		
		int index;
		
		for (index = 0; (index < Size) && (a != Data[index]); index++);
			if (index == Size) {
				return  false;
			}// end of if
			else {
				Size--;
				Data[index] = Data[Size];
			return true;
		}// end of else
		
	}// end of remove
	
	/**
	 * 
	 * @param minimumCapacity
	 * 				An integer that is locking down the amount of data in the array.
	 * @precondition 
	 * 				minimumCapacity cannot be less than 0 or equals to it.
	 */
	private void ensureCapacity(int minimumCapacity) {
		String[] biggerArray;
		
		//checks to see if the minimumCapacity is positive
		if (minimumCapacity > 0) {
			if(Data.length < minimumCapacity) {
				biggerArray = new String[minimumCapacity];
				System.arraycopy(Data,0,biggerArray,0,Size);
				Data = biggerArray;
			}// end of inner if
		}// end of if
		
	}// end of ensureCapacity
	
	/**
	 * 
	 * @param a
	 * 				The string that is being put on the array.	
	 * @precondition 
	 * 				a cannot be null.
	 */
	public void addOrdered(String a) {
		
		if (a != null ) {
			for (int i = 0; i < Size; i++) {
				Integer x = a.compareTo(Data[i]);			
					if (x == -1) {
						Data[i - 1] = a;
						Data[i + 1] = Data[i];
					}// end of inner if
			}// end of for
		}// end of outer if
		
	}// end of addOrdered
	
	
	
	public static void main(String[] args) {
		
		StringSet S1 = new StringSet();
		
		// adds all this elements to the array
		S1.add("Sister");
		S1.add("Bro");
		S1.add("Dude");
		S1.add("Bruh");
		S1.add("Bruv");
		S1.add("Bub");
		S1.add("Mate");
		
		// test what is the size of the array
		System.out.println(S1.size());
		
		// test to remove a string on the element and also test an element in the array thats not there
		System.out.println(S1.remove("Dude"));	
		System.out.println(S1.remove("Mates"));	
		
		// test if both true and false returns work
		System.out.println(S1.contains("Bro"));	
		System.out.println(S1.contains("Her"));	
		
		// test whats the size is when deleting a element in the array and also test whats the capacity of the array
		System.out.println(S1.size());
		System.out.println(S1.capacity());
		
		// test the addOrdered method and ensureCapacity
		S1.addOrdered("Mates");
		S1.ensureCapacity(10);
		
		
		
	}// end of main

}// end of StringSet