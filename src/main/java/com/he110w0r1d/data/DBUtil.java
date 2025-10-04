package com.he110w0r1d.data;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class DBUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("emailListPU");


    public static EntityManagerFactory getEmFactory(){
        return emf;
    }
}
