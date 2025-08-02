package com.xworkz.dmart.runner;


import javax.persistence.*;

public class ProductCreate {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {
             entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");//load,register,connection
             entityManager = entityManagerFactory.createEntityManager();// dml(ins,up,del),DQL(select)
             entityTransaction = entityManager.getTransaction();//rollback,autocommit
            entityTransaction.begin();


            entityTransaction.commit();


        } catch (PersistenceException e) {
           // System.out.println(e.getMessage());
            e.printStackTrace();
            entityTransaction.rollback();

        } finally {
            if(entityManagerFactory!=null)
            {
            entityManagerFactory.close();
            }
            if(entityManager!=null)
            {
                entityManager.close();
            }



    }
}
}