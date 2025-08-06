package com.exception;

/*public class IndexBountException {
  public static void main(String[] args) {
	  try{
		  int[] arr = {1,2,3};
		  System.out.println(arr[8]);
		 String str="Sumithra";
		  System.out.println(str.charAt(10));
		  
	  }catch(Exception ex ) {
		  
		  System.out.println("Array index bound exception");
		  //System.out.println("out of bound");
		  
		  
	  }
	  
  }

}
*/
public class IndexBountException {

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
//			System.err.println("String index out of Bound");
//		}
//		

	}

}
