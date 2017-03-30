package course.Exception.array;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// try block
		// logic is placed in try block 
		try{
		int array[]=new int[5];
		ArrayException ae=new ArrayException(array, 5);
		for(ae.i=0;ae.i<5;ae.i++)
	    {
	    	array[ae.i]=ae.i;
	    }
	    for(ae.i=0;ae.i<5;ae.i++){
	    	System.out.println(array[ae.i]);
	    	}
	    // exception occurred
	    System.out.println(array[ae.i+1]);
}
	//	catches Exception and prints message
catch(Exception e){
	System.out.println("Cannot call  value at index  out of array size ");
}
	}

}
