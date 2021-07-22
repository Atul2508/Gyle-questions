package datastructures;

public class Unique {


		boolean IsUnique(String st) //method
		{
			if (st.length()>26)
				return false;
			boolean []arr=new boolean[26];
			for (int i=0; i<st.length(); i++);
			int check= st.charAt(i);
			if(arr[check])
				return false;
			return true;
			
		}
}
		
		

	



