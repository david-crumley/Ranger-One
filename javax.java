
public class javax	{

	import javax.comm.*;
	import java.util.*;
	
	public static void main (String args[])	{

		
		private String wantedPortName = "/dev/ttyS0";

		private Enumeration portIdentifiers = CommPortIdentifier.getPortIdentifiers(); <br>

		private CommPortIdentifier portId = null;

		while (portIdentifiers.hasMoreElements())	{
			
			private CommPortIdentifier pid = (CommPortIdentifier) portIdentifiers.nextElement();
			
			if (pid.getPortType() == CommPortIdentifier.PORT_SERIAL && pid.getName().equals(wantedPortName))	{
				
				portId = pid;
				break;
			}
		}

		if (portId == null)	{
			
			System.err.println ("Could not find serial port " + wantedPortName);
			System.exit.(1);
			
		}

		else {
			
			System.out.println("Found port " + wantedPortName);
		}
	}
}