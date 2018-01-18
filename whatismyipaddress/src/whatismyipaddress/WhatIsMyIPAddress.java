package whatismyipaddress;


//Java program to find IP address of your computer
//java.net.InetAddress class provides method to get
//IP of any host name
import java.net.*;
import java.io.*;
import java.net.InetAddress;


public class WhatIsMyIPAddress {
	public static void main(String args[]) throws Exception {
		// Returns the instance of InetAddress containing
		// local host name and address
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println("System IP Address : " + (localhost.getHostAddress()).trim());

		// Find public IP address
		String systemipaddress = "";
		try {
			URL url_name = new URL("http://bot.whatismyipaddress.com");

			BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));

			// reads system IPAddress
			systemipaddress = sc.readLine().trim();
		} catch (Exception e) {
			systemipaddress = "Cannot Execute Properly";
		}
		System.out.println("Public IP Address: " + systemipaddress + "\n");
	}
}
