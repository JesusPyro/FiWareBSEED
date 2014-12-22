package com.bseed.cbconnection;


import java.net.URI;


import javax.ws.rs.core.UriBuilder;


public class RESTConnection {

	

	public String getVersionCB() throws RuntimeException, Exception{
		System.out.println("Entra en getVersionCB() en RESTConnection");
		String SERVICE_URI = this.getBaseURI()+"/version";
		RESTEasyClient serviceClient = new RESTEasyClient(SERVICE_URI,
				"application/json");
		String versionString = serviceClient.getVersion();
		System.out.println("Context Broker Version "+versionString);

		return versionString;
	}
	
	
	public String createEntity(String sensorJSON) throws RuntimeException, Exception{
		System.out.println("Entra en createEntity en RESTConnection");
		String SERVICE_URI = this.getBaseURI()+"";
		RESTEasyClient serviceClient = new RESTEasyClient(SERVICE_URI,
				"application/json");
		String createEntityString = serviceClient.updateContext(sensorJSON);
		System.out.println("CADENA DEVUELTA--->"+createEntityString);
//		team = mapper.readValue(teamString, FRTeamDTO.class);

		return createEntityString;
	}
	
	public String queryContext(String sensorJSON) throws RuntimeException, Exception{
		System.out.println("Entra en queryContext en RESTConnection");
		String SERVICE_URI = this.getBaseURI()+"";
		RESTEasyClient serviceClient = new RESTEasyClient(SERVICE_URI,
				"application/json");
		String queryContextString = serviceClient.queryContext(sensorJSON);
		System.out.println("CADENA DEVUELTA--->"+queryContextString);
//		team = mapper.readValue(teamString, FRTeamDTO.class);

		return queryContextString;
	}
	
	public String updateContext(String sensorJSON) throws RuntimeException, Exception{
		System.out.println("Entra en updateContext en RESTConnection");
		String SERVICE_URI = this.getBaseURI()+"";
		RESTEasyClient serviceClient = new RESTEasyClient(SERVICE_URI,
				"application/json");
		String queryContextString = serviceClient.updateContext(sensorJSON);
		System.out.println("CADENA DEVUELTA--->"+queryContextString);
//		team = mapper.readValue(teamString, FRTeamDTO.class);

		return queryContextString;
	}
	
	public String subscribeContext(String sensorJSON) throws RuntimeException, Exception{
		System.out.println("Entra en subscribeContext en RESTConnection");
		String SERVICE_URI = this.getBaseURI()+"";
		RESTEasyClient serviceClient = new RESTEasyClient(SERVICE_URI,
				"application/json");
		String subscribeContextString = serviceClient.subscribeContext(sensorJSON);
		System.out.println("CADENA DEVUELTA--->"+subscribeContextString);
//		team = mapper.readValue(teamString, FRTeamDTO.class);

		return subscribeContextString;
	}
	
	
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://130.206.127.23:1026/ngsi10/").build();
	}
	
	private URI getVersion(){
		return UriBuilder.fromUri("http://130.206.127.23:1026/version").build();
	}


	
}