package fr.lirmm.centileparsaisie;

import java.net.MalformedURLException;
import java.net.URL;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
			CentileWSService servicio = new CentileWSService(new URL("http://constantine.lirmm.fr:8080/CentileParSaisieWS_GFV2/CentileWSService?wsdl"));
			CentileWS centileWS = servicio.getCentileWSPort();
			String centile = centileWS.getCentile("123333", "12");
			System.out.println("Acaba:" + centile);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
