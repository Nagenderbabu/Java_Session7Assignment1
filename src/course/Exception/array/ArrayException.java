package course.Exception.array;

public class ArrayException {

	// declaring array and i variable
	int array[];
	int i;
	
	// constructor with parameter
	public ArrayException(int[] array, int i) {
		super();
		this.array = array;
		this.i = i;
	}
	
	// setters and getters
	
	public int[] getArray() {
		return array;
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
}
