package datastructures;

public class IsUnique {
	static 	char Unique (String str) {
		if (str.length()>128) {
			return 0; // the word is not unique
		}
		boolean [] charCheck= new boolean[128]; // for saving the word
			for(int i=0; i<str.length(); i++) {
				int value= str.charAt(i);
				if(charCheck[value]) {
					System.out.println("Not unique");
					
					return 0;	
					
				}// for not unique		
				charCheck[value]=true; 		// for unique string
			}		System.out.println("Unique");
					
			
			return 0;
			}
	
			

		public static void main(String args[]) {
				System.out.println(Unique("Atul"));
				}
	
}
