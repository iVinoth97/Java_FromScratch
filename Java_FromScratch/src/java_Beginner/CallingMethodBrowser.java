package java_Beginner;

public class CallingMethodBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MethodBrowser  openBrowser = new MethodBrowser();
	openBrowser.Browsercall();
	
	MethodBrowser Url = new MethodBrowser();
	String display = Url.URLcall();
	System.out.println(display);
	

	}

}
