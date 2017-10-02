/**
 * 
 */
package com.samya.ping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author SGhosh
 *
 */
public class PingIP {
	
	 public static void runSystemCommand(String command) {

			try {
				Process p = Runtime.getRuntime().exec(command);
				BufferedReader inputStream = new BufferedReader(
						new InputStreamReader(p.getInputStream()));

				String s = "";
				// reading output stream of the command
				while ((s = inputStream.readLine()) != null) {
					System.out.println(s);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {
			
			String ip = "127.0.0.1";
			runSystemCommand("ping " + ip);

		
		}
	
}
