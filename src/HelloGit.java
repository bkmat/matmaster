
public class HelloGit {
	
	private static int change = 10;
	
	public static int getChangeVal(){
		return change;
	}
	
	public static void getChangeVal1(){
		HelloGit.change = 20;
	}
	
	public static void getChangeVal2(){
		new HelloGit().change = 30;
	}
}
