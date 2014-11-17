package network_util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.Proxy.Type;

public class NetworkFunctions {
	
	public static String getText(String url) throws Exception {
        URL website = new URL(url);
        Proxy proxy=new Proxy(Type.HTTP, new InetSocketAddress(InetAddress.getByName("10.200.1.3"), 3128));
		URLConnection connection = website.openConnection(proxy);
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            response.append(inputLine);

        in.close();
        return response.toString();
    }

}
