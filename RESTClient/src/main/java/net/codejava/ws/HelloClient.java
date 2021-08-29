/**
 * 
 */
package net.codejava.ws;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;


public class HelloClient {

   public static void main(String[] args) {
//       String uri = "http://localhost:8080/HelloREST/rest/bonjour";
//       ClientConfig config = new ClientConfig();
//       Client client = ClientBuilder.newClient(config);
//       WebTarget target = client.target(uri);
//        
//       String response = target.request()
//                   .accept(MediaType.APPLICATION_JSON)
//                   //.accept(MediaType.TEXT_HTML)
//                   .get(String.class);
//        
//       System.out.println(response);
	   
	   Client client2 = ClientBuilder.newClient();
	   
	   String response2 = client2
			   .target("http://localhost:8080/HelloREST/rest/bonjour")
			   .request(MediaType.APPLICATION_JSON)
			   .get(String.class);
	   
	   System.out.println(response2);
	   

   }

}