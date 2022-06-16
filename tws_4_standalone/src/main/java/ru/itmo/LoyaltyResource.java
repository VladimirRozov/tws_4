/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.itmo;

import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/loyalty")
@Produces({MediaType.APPLICATION_JSON})

public class LoyaltyResource {
    @GET
    public ArrayList<Loyalty> getAll() {
        return (ArrayList<Loyalty>) new PostgreSQLDAO().getAll();
    }
}