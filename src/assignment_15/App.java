package assignment_15;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		int max=1;
		int current=1;
		if (str.length()==0) return 0;
		else if(str.length()==1) return 1;
		else {
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					current++;
					if (current>max) max=current;
				}else current=1;
			}
			return max;
		}
	}

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

