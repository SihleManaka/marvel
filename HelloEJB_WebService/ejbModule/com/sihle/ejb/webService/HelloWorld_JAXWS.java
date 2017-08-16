package com.sihle.ejb.webService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Session Bean implementation class HelloWorld_JAXWS
 */
@WebService
@Stateless
@LocalBean
public class HelloWorld_JAXWS {

    /**
     * Default constructor. 
     */
    public HelloWorld_JAXWS() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

}
