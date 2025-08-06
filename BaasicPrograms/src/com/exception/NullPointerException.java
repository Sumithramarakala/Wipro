package com.exception;

/*public class NullPointerException {
	public static void main(String[] args) {
		try {
		String s=null;
		System.out.println("String length is: "+s.length());
		}
		catch(Exception ex) {
			System.out.println("ex.getMessage()");
		}
		}
	}*/

/*public class IndexOutOfBoundExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int[] arr = {3,4,5};
		System.out.println(arr[2]);
		
		String s = "Niti";
		System.out.println(s.charAt(6));
		
		}
		
		//IndexOutOfBoundsException is further divided into two subclasses (arrayindexoutofbounds and stringindexoutofbounds)
		catch(IndexOutOfBoundsException e)
		{
			
			System.out.println("Either Array or String is out obf Bound");
		}
		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.err.println("Array index out of Bound");
//		}
//		
//		catch(StringIndexOutOfBoundsException ex)
//		{
//			*/
public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		String s = null;
		
		System.out.println("string length is " + s.length());
		}
		catch(Exception ex)
		{
			
			System.out.println(ex.getMessage());
		}

	}

}



