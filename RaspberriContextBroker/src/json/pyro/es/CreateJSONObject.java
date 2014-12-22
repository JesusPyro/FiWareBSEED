package json.pyro.es;

import java.net.MalformedURLException;
import java.net.URL;

import com.bseed.model.Sensor;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONObject {
	
	public CreateJSONObject(){
		
	}
	/*Jcatala 1 7 [0x1A, 0x20, 0x2A, 0x30, 0x38, 0x40, 0x54, 0x5C, 0x5A, 0x34]
	 *  2 True True True [1, 1, 1, 0, 1, 0, 0] 30 250 [0.1, 0.1, 0.989]
	 *   Vertical [0,899898982, 39,050494985, 25,30] 30º 80 
	 *   [35.8, 49.6, 45.3, 35.8, 49.6, 38.7, 39.2] 35.6
	 * */
	
	public String entityCreation(Sensor sensor){
		
		  JSONObject cabecera = new JSONObject();
		  JSONArray elementos = new JSONArray();
		                
		  JSONObject obj = new JSONObject();
		  obj.put("type","Capsule");
		  obj.put("isPattern",new Boolean(false));
		  obj.put("id",""+new Double(sensor.getId_capsula()));
		  
		  JSONObject obj3 = new JSONObject();
		  JSONArray attributes = new JSONArray();
		  obj3.put("name", "propietario");
		  obj3.put("type", "String");
		  obj3.put("value", sensor.getPropietario());
		  attributes.add(obj3);
		  
		  JSONObject obj2 = new JSONObject();
		  obj2.put("name", "sensores_rad");
		  obj2.put("type", "int");
		  obj2.put("value", sensor.getSensores_rad());
		  attributes.add(obj2);
		 
		  JSONObject obj4 = new JSONObject();
		  obj4.put("name", "dir_fisica_sensor");
		  obj4.put("type", "String");
		  obj4.put("value", sensor.getDir_fisica_sensor());
		  attributes.add(obj4);
		 
		  JSONObject obj5 = new JSONObject();
		  obj5.put("name", "fase_uso");
		  obj5.put("type", "int");
		  obj5.put("value", sensor.getFase_uso());
		  attributes.add(obj5);
		 
		  JSONObject obj6 = new JSONObject();
		  obj6.put("name", "sensor_HR_activo");
		  obj6.put("type", "boolean");
		  obj6.put("value", sensor.isSensor_HR_activo());
		  attributes.add(obj6);
		 
		  JSONObject obj7 = new JSONObject();
		  obj7.put("name", "conexion_activa");
		  obj7.put("type", "boolean");
		  obj7.put("value", sensor.isConexion_activa());
		  attributes.add(obj7);
		 
		  JSONObject obj8 = new JSONObject();
		  obj8.put("name", "gps_activo");
		  obj8.put("type", "boolean");
		  obj8.put("value", sensor.isGps_activo());
		  attributes.add(obj8);
		 
		  JSONObject obj9 = new JSONObject();
		  obj9.put("name", "sensores_rad_activos");
		  obj9.put("type", "String");
		  obj9.put("value", sensor.getSensores_rad_activos());
		  attributes.add(obj9);
		 
		  JSONObject obj10 = new JSONObject();
		  obj10.put("name", "periodo_muestreo");
		  obj10.put("type", "int");
		  obj10.put("value", sensor.getPeriodo_muestreo());
		  attributes.add(obj10);
		  
		  JSONObject obj11 = new JSONObject();
		  obj11.put("name", "tiempo_desconexion");
		  obj11.put("type", "int");
		  obj11.put("value", sensor.getTiempo_desconexion());
		  attributes.add(obj11);
		  
		  JSONObject obj12 = new JSONObject();
		  obj12.put("name", "lectura_acelerometro");
		  obj12.put("type", "String");
		  obj12.put("value", sensor.getLectura_acelerometro());
		  attributes.add(obj12);
		  
		  JSONObject obj13 = new JSONObject();
		  obj13.put("name", "estado_capsula");
		  obj13.put("type", "String");
		  obj13.put("value", sensor.getEstado_capsula());
		  attributes.add(obj13);
		  
		  JSONObject obj14 = new JSONObject();
		  obj14.put("name", "posicion_UTM");
		  obj14.put("type", "String");
		  obj14.put("value", sensor.getPosicion_UTM());
		  attributes.add(obj14);
		  
		  JSONObject obj15 = new JSONObject();
		  obj15.put("name", "orientacion_capsula");
		  obj15.put("type", "int");
		  obj15.put("value", sensor.getOrientacion_capsula());
		  attributes.add(obj15);
		  
		  JSONObject obj16 = new JSONObject();
		  obj16.put("name", "lectura_sensor_HR");
		  obj16.put("type", "double");
		  obj16.put("value", sensor.getLectura_sensor_HR());
		  attributes.add(obj16);
		  
		  JSONObject obj17 = new JSONObject();
		  obj17.put("name", "lectura_sensores_rad");
		  obj17.put("type", "String");
		  obj17.put("value", sensor.getLectura_sensores_rad());
		  attributes.add(obj17);
		  
		  JSONObject obj18 = new JSONObject();
		  obj18.put("name", "temperatura_media_rad");
		  obj18.put("type", "double");
		  obj18.put("value", sensor.getTemperatura_media_rad());
		  attributes.add(obj18);
		 
		  elementos.add(obj);  
		  obj.put("attributes", attributes);
		  
		  cabecera.put("updateAction", "APPEND");
		  cabecera.put("contextElements", elementos);
		 

		  System.out.println(cabecera);
		
		return (cabecera.toJSONString());
		
	}
	
	public String queryContext(Sensor sensor){

		JSONObject cabecera = new JSONObject();
		JSONArray elementos = new JSONArray();

		JSONObject obj = new JSONObject();
		obj.put("type", "Capsule");
		obj.put("isPattern", new Boolean(false));
		obj.put("id", ""+new Double(sensor.getId_capsula()));
		
		elementos.add(obj);
		cabecera.put("entities", elementos);

		System.out.println(cabecera);

		return (cabecera.toJSONString());	
	}
	
	public String updateContext(Sensor sensor){ 
	
		
		JSONObject cabecera = new JSONObject();
		  JSONArray elementos = new JSONArray();
		                
		  JSONObject obj = new JSONObject();
		  obj.put("type","Capsule");
		  obj.put("isPattern",new Boolean(false));
		  obj.put("id",""+new Double(sensor.getId_capsula()));
		  
		  JSONObject obj3 = new JSONObject();
		  JSONArray attributes = new JSONArray();
		  obj3.put("name", "propietario");
		  obj3.put("type", "String");
		  obj3.put("value", sensor.getPropietario());
		  attributes.add(obj3);
		  
		  JSONObject obj2 = new JSONObject();
		  obj2.put("name", "sensores_rad");
		  obj2.put("type", "int");
		  obj2.put("value", sensor.getSensores_rad());
		  attributes.add(obj2);
		 
		  JSONObject obj4 = new JSONObject();
		  obj4.put("name", "dir_fisica_sensor");
		  obj4.put("type", "String");
		  obj4.put("value", sensor.getDir_fisica_sensor());
		  attributes.add(obj4);
		 
		  JSONObject obj5 = new JSONObject();
		  obj5.put("name", "fase_uso");
		  obj5.put("type", "int");
		  obj5.put("value", sensor.getFase_uso());
		  attributes.add(obj5);
		 
		  JSONObject obj6 = new JSONObject();
		  obj6.put("name", "sensor_HR_activo");
		  obj6.put("type", "boolean");
		  obj6.put("value", sensor.isSensor_HR_activo());
		  attributes.add(obj6);
		 
		  JSONObject obj7 = new JSONObject();
		  obj7.put("name", "conexion_activa");
		  obj7.put("type", "boolean");
		  obj7.put("value", sensor.isConexion_activa());
		  attributes.add(obj7);
		 
		  JSONObject obj8 = new JSONObject();
		  obj8.put("name", "gps_activo");
		  obj8.put("type", "boolean");
		  obj8.put("value", sensor.isGps_activo());
		  attributes.add(obj8);
		 
		  JSONObject obj9 = new JSONObject();
		  obj9.put("name", "sensores_rad_activos");
		  obj9.put("type", "String");
		  obj9.put("value", sensor.getSensores_rad_activos());
		  attributes.add(obj9);
		 
		  JSONObject obj10 = new JSONObject();
		  obj10.put("name", "periodo_muestreo");
		  obj10.put("type", "int");
		  obj10.put("value", sensor.getPeriodo_muestreo());
		  attributes.add(obj10);
		  
		  JSONObject obj11 = new JSONObject();
		  obj11.put("name", "tiempo_desconexion");
		  obj11.put("type", "int");
		  obj11.put("value", sensor.getTiempo_desconexion());
		  attributes.add(obj11);
		  
		  JSONObject obj12 = new JSONObject();
		  obj12.put("name", "lectura_acelerometro");
		  obj12.put("type", "String");
		  obj12.put("value", sensor.getLectura_acelerometro());
		  attributes.add(obj12);
		  
		  JSONObject obj13 = new JSONObject();
		  obj13.put("name", "estado_capsula");
		  obj13.put("type", "String");
		  obj13.put("value", sensor.getEstado_capsula());
		  attributes.add(obj13);
		  
		  JSONObject obj14 = new JSONObject();
		  obj14.put("name", "posicion_UTM");
		  obj14.put("type", "String");
		  obj14.put("value", sensor.getPosicion_UTM());
		  attributes.add(obj14);
		  
		  JSONObject obj15 = new JSONObject();
		  obj15.put("name", "orientacion_capsula");
		  obj15.put("type", "int");
		  obj15.put("value", sensor.getOrientacion_capsula());
		  attributes.add(obj15);
		  
		  JSONObject obj16 = new JSONObject();
		  obj16.put("name", "lectura_sensor_HR");
		  obj16.put("type", "double");
		  obj16.put("value", sensor.getLectura_sensor_HR());
		  attributes.add(obj16);
		  
		  JSONObject obj17 = new JSONObject();
		  obj17.put("name", "lectura_sensores_rad");
		  obj17.put("type", "String");
		  obj17.put("value", sensor.getLectura_sensores_rad());
		  attributes.add(obj17);
		  
		  JSONObject obj18 = new JSONObject();
		  obj18.put("name", "temperatura_media_rad");
		  obj18.put("type", "double");
		  obj18.put("value", sensor.getTemperatura_media_rad());
		  attributes.add(obj18);
		 
		  elementos.add(obj);  
		  obj.put("attributes", attributes);

		  cabecera.put("updateAction", "UPDATE");
		  cabecera.put("contextElements", elementos);
		 

		  System.out.println(cabecera);
		
		return (cabecera.toJSONString());
	}
	
	public String contextSubscription(Sensor sensor){
	
	/*
	 * Context subscriptions 
	 * {
    "entities": [
        {
            "type": "Room",
            "isPattern": "false",
            "id": "Room1"
        }
    ],
    "attributes": [
        "temperature"
    ],
    "reference": "http://localhost:1028/accumulate",http://130.206.127.23:1026/ngsi10/notifyContext
    "duration": "P1M",
    "notifyConditions": [
        {
            "type": "ONTIMEINTERVAL",
            "condValues": [
                "PT10S"
            ]
        }
    ]
}
	 * */
		
		JSONObject cabecera = new JSONObject();
		JSONArray elementos = new JSONArray();

		JSONObject obj = new JSONObject();
		obj.put("type", "Capsule");
		obj.put("isPattern", "false");
		obj.put("id", ""+new Double(sensor.getId_capsula()));
		
		elementos.add(obj);
		cabecera.put("entities", elementos);
		JSONArray notifyConditions = new JSONArray();
		JSONObject conditions = new JSONObject();
//		conditions.put("type", "ONTIMEINTERVAL");
		conditions.put("type", "ONCHANGE");
		JSONArray condValues = new JSONArray();
		condValues.add("PT10S");
		conditions.put("condValues",condValues); 
		notifyConditions.add(conditions);
		
		cabecera.put("duration", "P1M");
		cabecera.put("reference", "http://54.77.89.234:8080/OCB2DB/rest/eventsReceived");
		cabecera.put("notifyConditions", notifyConditions);
		JSONArray attributes = new JSONArray();
		attributes.add("id_capsula");
		attributes.add("sensores_rad"); 
		attributes.add("direcciones_fisicas_sensores"); 
		attributes.add("fase_uso");
		attributes.add("sensor_hr_activo");
		attributes.add("conexion_activa"); 
		attributes.add("gps_activo"); 
		attributes.add("sensores_rad_activos");
		attributes.add("periodo_muestre");
		attributes.add("tiempo_desconexion");
		attributes.add("lectura_acelerometro");
		attributes.add("estado_capsula"); 
		attributes.add("posicion_utm"); 
		attributes.add("orientacion_capsula"); 
		attributes.add("lectura_sensor_hr"); 
		attributes.add("lectura_sensores_rad"); 
		attributes.add("alerta_direccional"); 
		attributes.add("alerta_tendencia"); 
		attributes.add("alerta_caida"); 
		attributes.add("propietario"); 
	
		
		cabecera.put("attributes",attributes);
		//cabecera.put("throttling", "PT5S");

		System.out.println(cabecera);

		return (cabecera.toJSONString());	
		
	}
	
	
}
