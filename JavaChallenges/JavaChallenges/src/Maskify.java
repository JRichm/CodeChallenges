
public class Maskify {

	public static void main(String[] args) {
		System.out.println(maskify("65465486544136312645"));
	}
	
	public static String maskify(String str) {
		String maskedString = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 4) 
				maskedString += '#';
			else
				maskedString += str.charAt(i);
		}
		return maskedString;
	}
}



