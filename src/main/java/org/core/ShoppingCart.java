package org.core;

import org.springframework.stereotype.Component;

@Component


public class ShoppingCart {



    public void checkout(String status){
        //logging
        //Authentication and Authorization
        //Sanitize the data

        System.out.println("Checkout Method from ShoppingCart Called");

    }

    public int quantity(){
        return 3;
    }
}
