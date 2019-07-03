package ufrj.coppe.lcp.repa;

public class Main {

	public static void main(String[] args) {
		
		try {
		   
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("./repad -t");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
