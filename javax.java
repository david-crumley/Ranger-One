
import javax.comm.*;
import java.util.*;

public class javax	{

	
	public static void main (String args[])	{

		
		String wantedPortName = "/dev/ttyS0";

		Enumeration<br> portIdentifiers = CommPortIdentifier.getPortIdentifiers();

		CommPortIdentifier portId = null;

		while (portIdentifiers.hasMoreElements())	{
			
			CommPortIdentifier pid = (CommPortIdentifier) portIdentifiers.nextElement();
			
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