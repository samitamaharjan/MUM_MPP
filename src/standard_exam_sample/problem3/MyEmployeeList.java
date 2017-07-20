package standard_exam_sample.problem3;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;


public class MyEmployeeList extends AbstractList<Employee>{
	private Employee[] arr = new Employee[2];
	private int size = 0;
	
	@Override
	public Employee get(int index) {
		if(index < 0 || index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return arr[index];
	}
	
	@Override
	 public boolean contains(Object o) {
		if(o == null )
			return false;
		if(!(o instanceof Employee))
			return false;
		Employee e = (Employee) o;
		for(int i = 0; i < size; i++) {
			if (arr[i].compareTo(e)==0)
				return true;
		}
		return false;
	}

	@Override
	 public boolean add(Employee e) {
		if (isFull())
			resize();
		arr[size] = e;
		size++;
		return true;
		
	}
	@Override
	public int size() {

		return size;
	}
	
	private boolean isFull() {
		return arr[arr.length - 1] != null;
	}
	private void resize() {
		Employee[] temp = new Employee[2 * arr.length];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

}
