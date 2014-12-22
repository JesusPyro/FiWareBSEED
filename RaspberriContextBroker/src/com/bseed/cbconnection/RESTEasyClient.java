/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bseed.cbconnection;


import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import json.pyro.es.CreateJSONObject;


import org.codehaus.jackson.map.ObjectMapper;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;




public class RESTEasyClient {

	private String mediaType;
	private String resourceURI;
	ObjectMapper mapper = new ObjectMapper();


	
	/****   CONSTRUCTOR   *******************************************************************************/
	public RESTEasyClient(String URI, String mediaType) throws ClassNotFoundException, JAXBException {
		this.setResourceURI(URI);
		if(mediaType != null)
			this.mediaType = mediaType;
	}
	private void setResourceURI(String uRI) {
		this.resourceURI =uRI;
		
	}
	/****************************************************************************************************/
	
	
	public String updateContext(String sensorJSON){

		try {
			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client
					.target(this.getURL()+"updateContext");

			Response response = target.request().post(
					Entity.entity(sensorJSON, "application/json"));

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Server response : \n");
			String respuesta = response.readEntity(String.class);
			System.out.println(respuesta);
			
			response.close();
			return (respuesta);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

		
	}
	
	public String queryContext(String sensorJSON){

		try {
			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client
					.target(this.getURL()+"queryContext");

			Response response = target.request().post(
					Entity.entity(sensorJSON, "application/json"));

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Server response : \n");
			String respuesta = response.readEntity(String.class);
			System.out.println(respuesta);
			
			response.close();
			return (respuesta);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

	public String subscribeContext(String sensorJSON){

		try {
			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client
					.target(this.getURL()+"subscribeContext");

			Response response = target.request().post(
					Entity.entity(sensorJSON, "application/json"));

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Server response : \n");
			String respuesta = response.readEntity(String.class);
			System.out.println(respuesta);
			
			response.close();
			return (respuesta);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;	
	}
	
	
	/* Metodo GET*/
	public String contextEntity(String sensorName){

		try {
			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client
					.target(this.getURL()+"contextEntities/"+sensorName);

			Response response = target.request().get();

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Server response : \n");
			String respuesta = response.readEntity(String.class);
			System.out.println(respuesta);
			
			response.close();
			return (respuesta);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}
	
	public String getVersion(){

		try {
			ResteasyClient client = new ResteasyClientBuilder().build();

			ResteasyWebTarget target = client
					.target(this.getURLVersion());

			Response response = target.request().get();

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			//System.out.println("Server response : \n");
			String version = response.readEntity(String.class);
			//System.out.println(version);
			
			response.close();
			return (version);

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
		

	}
	
	
	
	
	private String getURL(){
		return ("http://130.206.127.23:1026/ngsi10/");
	
	}
	
	private String getURLVersion(){
		return ("http://130.206.127.23:1026/version");
	}
		
	
	
}