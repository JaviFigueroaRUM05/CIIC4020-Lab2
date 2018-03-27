package classes;

public class SymmetricStringAnalyzer {
	private String s; 
	public SymmetricStringAnalyzer(String s) {
		this.s = s; 
	}
	
	/**
	 * Determines if the string s is symmetric
	 * @return true if it is; false, otherwise. 
	 */
	public boolean isValidContent() { 
		SLLStack<Character> stringStack = new SLLStack<>();
		for(int i = 0; i < s.length(); i++){
			if(!Character.isAlphabetic(s.charAt(i))) { return false; }
			if(Character.isUpperCase(s.charAt(i))) { stringStack.push(s.charAt(i)); }
			else{
				if(stringStack.isEmpty()) { return false; }
				if(stringStack.top() == Character.toUpperCase(s.charAt(i))) { stringStack.pop(); }
				else { stringStack.push(s.charAt(i)); }
			}
		}
		return stringStack.isEmpty();
	}
	
	public String toString() { 
		return s; 
	}

	public String parenthesizedExpression() 
	throws StringIsNotSymmetricException 
	{
		String finalString = "";
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isUpperCase(s.charAt(i))) { finalString += "<"+s.charAt(i)+" "; }
			else { finalString += s.charAt(i)+"> ";}
		}
		return finalString;
	}

}
