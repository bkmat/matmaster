
public class TestJava {

	public static void main(String[] args) {
		final String whiteSpace = " "; 
		String aa = "12ssAA";
		System.out.println("to upper" + aa.toUpperCase());
		
		String zz = "hello";
		if(zz.contains(whiteSpace)){
			System.out.println("zz >> "+zz);
			System.out.println("whitespace >> "+whiteSpace);
		}
		
		String arr [] = {"ll", "o"};
		String a  = "hello man";
		String b = "llo";
		String c = "ma";
		
		for(String ar : arr){
		
			if(a.contains(ar)){
				System.out.println("ar >> "+ar);
				
			}
		}
		if(a.contains(b)){
			System.out.println("ll >> "+b);
			
		}
		
		if(a.contains(" ")){
			
		}
	}
}
