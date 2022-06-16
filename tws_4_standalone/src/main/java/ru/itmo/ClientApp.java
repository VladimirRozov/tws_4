/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.itmo;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import java.util.*;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author rozov
 */
public class ClientApp {
 
    private static final String URL = "http://localhost:8080/REST/webresources/loyalty";
    public static void main(String[] args) {
        Client client = Client.create();

        for (Loyalty loyalty : findAll(client)) {
            System.out.println(loyalty);
        }
    }

    private static List<Loyalty> findAll(Client client) {
        WebResource webResource = client.resource(URL);

            webResource = webResource.queryParam(URL, URL);

        ClientResponse response = webResource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        GenericType<List<Loyalty>> type = new GenericType<List<Loyalty>>() {};
        return response.getEntity(type);
    }

}
