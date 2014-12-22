package util.pyro.es;

import jssc.SerialPort;
import jssc.SerialPortException;

public class LeerPuertoSerie {
	public LeerPuertoSerie(){
		
	}
	
	public String LeePuerto(String namePuerto){
		 SerialPort serialPort = new SerialPort(namePuerto);
	        try {
	        	System.out.println("Leyendo....");
	            serialPort.openPort();//Open serial port
	            serialPort.setParams(9600, 8, 1, 0);//Set params.
	            byte[] buffer = serialPort.readBytes(50);//Read 10 bytes from serial port
	            serialPort.closePort();//Close serial port
	            System.out.println("Leyendo...."+buffer[0]);
	            return("Hola"+buffer.toString());//buffer.toString());
	        }
	        catch (SerialPortException ex) {
	            System.out.println(ex);
	            return(null);
	        }
	}
}
