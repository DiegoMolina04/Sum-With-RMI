
package sumadorrmi;
import java.rmi.*;
import java.rmi.server.*;

public class SumadorServer {

	public static void main(String args[] ) {
		
		try {
			SumadorImpl misuma = new
					SumadorImpl("MiSumador");
		}catch(Exception e) {
			System.out.println("System exception " +e);
		}

	}

}
