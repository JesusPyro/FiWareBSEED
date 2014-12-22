package util.pyro.es;

import jssc.SerialPortList;

public class Puertos {

	public Puertos(){
		 String[] portNames = SerialPortList.getPortNames();
	     for(int i = 0; i < portNames.length; i++){
	         System.out.println(portNames[i]);
	     }
	}
}
