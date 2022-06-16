/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package ru.itmo;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author rozov
 */
@Path("loyalty")
public class LoyaltyResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LoyaltyResource
     */
    public LoyaltyResource() {
    }

    
    @GET
    public ArrayList<Loyalty> getAll() {
        return (ArrayList<Loyalty>) new PostgreSQLDAO().getAll();
    }

}
