/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzaAutentiaPkg;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author jbermudezb
 */
public class PizzaResource {

    private String id;

    /**
     * Creates a new instance of PizzaResource
     */
    private PizzaResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the PizzaResource
     */
    public static PizzaResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of PizzaResource class.
        return new PizzaResource(id);
    }

    /**
     * Retrieves representation of an instance of com.pizzaAutentiaPkg.PizzaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of PizzaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }

    /**
     * DELETE method for resource PizzaResource
     */
    @DELETE
    public void delete() {
    }
}
