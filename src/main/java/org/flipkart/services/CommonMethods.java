package org.flipkart.services;

import java.util.Random;
import java.util.Set;

public class CommonMethods {

    Random random = new Random();

    public int generateId(Set<Integer> ids){

        Integer generated = 1;

        while(ids.contains(generated)){
            generated = random.nextInt();
        }

        return generated;
    }
}
