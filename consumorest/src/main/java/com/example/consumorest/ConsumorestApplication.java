package com.example.consumorest;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.consumorest.model.Request;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ConsumorestApplication {

	static String url =
	         "http://localhost:8080/request";
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		SpringApplication.run(ConsumorestApplication.class, args);
		/*HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(url);
		method.setRequestHeader("Content-type",
                "text/xml; charset=ISO-8859-1");
		 try{
	            int statusCode = client.executeMethod(method);

	            System.out.println("Status Code = "+statusCode);
	            System.out.println("QueryString>>> "+method.getQueryString());
	            System.out.println("Status Text>>>"
	                  +HttpStatus.getStatusText(statusCode));

	            //Get data as a String
	            List<Request> requests = List<Request> method.getResponseBody();
	            System.out.println(method.getResponseBodyAsString());

	          
	            //release connection
	            method.releaseConnection();
	        }
	        catch(IOException e) {
	            e.printStackTrace();
	        }*/
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		HttpResponse response = client.execute(request);

	System.out.println("Response Code : " 
	                + response.getEntity());
	ObjectMapper mapper = new ObjectMapper();
	 
	
	 List<Request> requests = mapper.readValue( response.getEntity().getContent(), mapper.getTypeFactory().constructCollectionType(List.class, Request.class));

		System.out.println(requests.get(2));
	}
}
