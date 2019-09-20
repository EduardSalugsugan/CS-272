import java.util.Arrays;

public class EmployeeSet {
	
	private int capacity;
	private Employee[] Set;
	private int size;
		
	public EmployeeSet() {
		this.capacity = 10;
		Set = new Employee[capacity];
	}
	
	public EmployeeSet(Object obj) {
		if (obj instanceof EmployeeSet && obj != null) {
			this.capacity = capacity;
			this.Set = Set;
		}
		else {
			throw new IllegalArgumentException("The obj is null or not an instance of EmployeeSet class");
		}
	}
	
	public int size() {
		for (int i = 0; i < Set.length; i++) {
			if (Set[i] != null) {
				size++;
			}
		}
		return size;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public void add(Employee a) {
		if (a == null) {
			System.out.println("Employee added cannot be null");
		}
		else if (size == Set.length) {
			ensureCapacity(size);
			Set[size] = a;
			size++;
		}
		else {
			Set[size] = a;
			size++;
		}
	}
	
	public void ensureCapacity(int cap) {
		Employee[] biggerArray;
		
		biggerArray = new Employee[cap * 2];
		System.arraycopy(Set, 0, biggerArray,0, size);
		
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName("Eduard Salugsugan");
		e1.setNum(800674235);	
		e1.setAge(21);
		e1.setState("NM");
		e1.setZip(88001);

		int[] a1 = new int[] {1 , 2, 3};
		e1.setAdvisors(a1);
		
		EmployeeSet es1 = new EmployeeSet();
		
		System.out.println(es1.capacity());
		System.out.println(es1.size());
		es1.add(e1);
		System.out.println(es1.size());
		
	}
}
