package util.pyro.es;

import jssc.SerialPort;
import jssc.SerialPortException;

public class EscribirPuertoSerie {

	public EscribirPuertoSerie (String namePort){
		 SerialPort serialPort = new SerialPort(namePort);
	        try {
	        	System.out.println("Escribiendo.....");
	            serialPort.openPort();//Open serial port
	            serialPort.setParams(SerialPort.BAUDRATE_9600, 
	                                 SerialPort.DATABITS_8,
	                                 SerialPort.STOPBITS_1,
	                                 SerialPort.PARITY_NONE);//Set params. Also you can set params by this string: serialPort.setParams(9600, 8, 1, 0);
	            serialPort.writeBytes("This is a test string".getBytes());//Write data to port
	            serialPort.closePort();//Close serial port
	        }
	        catch (SerialPortException ex) {
	            System.out.println(ex);
	        }
	}
}
