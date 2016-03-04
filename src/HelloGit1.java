
public class HelloGit1 {

	public static void main(String[] args) {
		
		HelloGit helloGit = new HelloGit();
		int val = helloGit.getChangeVal();
		
		int val1 = helloGit.getChangeVal();
		
		helloGit.getChangeVal1();
		int val2  = helloGit.getChangeVal();
		
		helloGit.getChangeVal2();
		val2  = helloGit.getChangeVal();
		
		System.out.println("val  "+val);
		System.out.println("val 1 "+val1);
		System.out.println("val2 >"+val2);
		System.out.println("val2 >>"+val2);
		
	}
}
