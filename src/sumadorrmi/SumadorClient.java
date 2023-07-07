
package sumadorrmi;
import java.rmi.Naming;
import java.rmi.registry.*;
import java.rmi.server.*;

public class SumadorClient {

	public static void main(String args[] ) {
		int res = 0;
		try {
			System.out.println("Buscando Objeto ");
			Sumador misuma = (Sumador)Naming.lookup("rmi://" + args[0] +
					"/"+ "MiSumador");
			res = misuma.sumar(15, 2);
			System.out.println("15 + 2 = "+ res);
			
		}catch(Exception e) {
			System.err.println("System exception "+ e);
			System.exit(0);
		}

	}

}
