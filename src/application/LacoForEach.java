package application;



public class LacoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"}; // m�todo de declarar valores � um array.
		
		for (int i=0; i<vect.length; i++) {  // for normal
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------------");
		
		for (String obj : vect) {  // for each
			System.out.println(obj); 
		}
	}

}
