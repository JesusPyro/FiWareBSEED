package launch.pyro.es;

import util.pyro.es.EscribirPuertoSerie;
import util.pyro.es.LeerPuertoSerie;
import util.pyro.es.Puertos;

import com.bseed.cbconnection.RESTConnection;
import com.bseed.model.Sensor;

import json.pyro.es.CreateJSONObject;

public class BseedInyection {
	static boolean isFirsTime;
	static boolean isSecondTime;

	/*Jcatala 1 7 [0x1A, 0x20, 0x2A, 0x30, 0x38, 0x40, 0x54, 0x5C, 0x5A, 0x34]
	 *  2 True True True [1, 1, 1, 0, 1, 0, 0] 30 250 [0.1, 0.1, 0.989]
	 *   Vertical [0,899898982, 39,050494985, 25,30] 30º 80 
	 *   [35.8, 49.6, 45.3, 35.8, 49.6, 38.7, 39.2] 35.6
	 * */
	
	
	public static void main(String[] args) {
		CreateJSONObject createJSON = new CreateJSONObject();
		
		//LeerPuertoSerie leer = new LeerPuertoSerie();
		//leer.LeePuerto(args[0]);
		//leer.LeePuerto("COM7");
		//EscribirPuertoSerie escribePuerto = new EscribirPuertoSerie("COM7");

		Sensor sensor = new Sensor(args[1]);
		RESTConnection restConnection = new RESTConnection();

		// Es la primera vez que se llama a este programa
		if (args[0].equals("1")){
			try {
				restConnection.getVersionCB();
				
				String creation = createJSON.entityCreation(sensor);
				restConnection.createEntity(creation);
				
				//String suscription = createJSON.contextSubscription(sensor);
				//restConnection.subscribeContext(suscription);
			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		else if(args[0].equals("2")){
//		String query = createJSON.queryContext(sensor);
			String update = createJSON.updateContext(sensor);
			try {
				restConnection.updateContext(update);
//				String suscription = createJSON.contextSubscriptionDemo();
//				restConnection.subscribeContext(suscription);
			} catch (RuntimeException e) {

				e.printStackTrace();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

}
