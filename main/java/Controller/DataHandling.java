package Controller;

public class DataHandling {
	public static String XuLyChu (char[] mangChar) {
		String s = "";
		
		for (int i = 0; i < mangChar.length; i+=1) {
			if (mangChar[i] != ',') {
				s += mangChar[i];
			}
		}
		
		return s;
	}
	
	public static float XuLySo (char[] mangChar) {
		String s = "";
		
		for (int i = 0; i < mangChar.length; i+=1) {
			if (mangChar[i] != ',') {
				s += mangChar[i];
			}
		}
		
		float so = Float.parseFloat(s);
		Math.round(so*100);
		so /= 100;
		return so;
	}
	
	
	public static int XuLySoThayDoi (char[] mangChar) {
		String s = "";
		
		for (int i = 0; i < mangChar.length; i+=1) {
			if (mangChar[i] != ',') {
				s += mangChar[i];
			}
		}
		
		int so = Integer.parseInt(s);
		return so;
	}
	
	public static String XuLyChuDuDoan (char[] mangChar) {
		String s = "";
		
		for (int i = 0; i < mangChar.length; i+=1) {
			if (mangChar[i] != '[' && mangChar[i] != ']') {
				s += mangChar[i];
			}
		}
		
		return s;
	}
}
