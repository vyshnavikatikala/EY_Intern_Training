package day5;

public class Ex_6_ValidKeywordsOrReservedWords {
    public static void main(String[] args) {
		int x = 1;
		if(x == 1)               // Valid Keyword
		{
			System.out.println("Value of x is 1");
		}
		
		/*
		 * then // Not a valid keyword
		 */
		outer:    // label
	        for (int i = 0; i < 10; i++) { 
	            for (int j = 0; j < 10; j++) { 
	                if (j == 1) 
	                    break outer; 
	                System.out.println(" value of j = " + j); 
	            } 
	        } // end of outer loop 
		
		/*
		 *  Java does not have goto statement, but java supports label.
		 */
		
		int i = 0;
		while (i < 5) {      // valid keyword
		  System.out.println(i);
		  i++;
		}
		
		switch(x)
		{
		case 1: System.out.println("Value of x is 1");   // valid keyword
		}
	}
    
}
