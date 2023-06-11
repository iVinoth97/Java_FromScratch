package java_Beginner;


public class MethodBrowser {

		public void Browsercall() {
			System.out.println("Opening Browser");
		}
	
		public String URLcall() {
			
			return "Show the URL";
		}
		
		//With Arguments
		
		public void DeleteURL(String URL) {
			System.out.println("The URL " + URL + " is Deleted");
		}

		public void DeleteURL(int UrlID) {
			System.out.println("The URL " + UrlID + " is Deleted");
		}
		public static void main(String[] args) {
			MethodBrowser obj = new MethodBrowser();
			obj.DeleteURL("https://www.google.co.in");
			obj.DeleteURL(1997);
		}
}
