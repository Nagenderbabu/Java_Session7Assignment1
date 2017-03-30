package course.Exception.array;

public class ArrayException {

	int array[];
	int i;
	public ArrayException(int[] array, int i) {
		super();
		this.array = array;
		this.i = i;
	}
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
