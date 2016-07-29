package ninja.tumit.katademo;

public class Rack {

	private String toLetterOnly(String value) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < value.length(); i++) {
			if(Character.isLetter(value.charAt(i))) {
				sb.append(value.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public String getSortString(String value) {
		return toLetterOnly(value.toLowerCase());
	}


}
