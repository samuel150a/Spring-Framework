package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.ProductEntity;

import javax.persistence.*;

public class ProductUpdate {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");
            entityManager = entityManagerFactory.createEntityManager();// dml(ins,up,del),DQL(select)
            entityTransaction = entityManager.getTransaction();//(tcl)rollback,autocommit,commit,savepoint
            entityTransaction.begin();


           ProductEntity entity= entityManager.find(ProductEntity.class,1);
            if (entity != null) {
                entity.setName(" Icecream");
                entity.setPrice(30);
            }
            ProductEntity entity2= entityManager.find(ProductEntity.class,2);
            if (entity2 != null) {
                entity2.setName(" biscuit");
                entity2.setPrice(70);
            }

            ProductEntity entity3= entityManager.find(ProductEntity.class,3);
            if (entity3 != null) {
                entity3.setName(" juice");
                entity3.setPrice(60);
            }

            ProductEntity entity5= entityManager.find(ProductEntity.class,5);
            if (entity5 != null) {
                entity5.setName(" chips");
                entity5.setPrice(60);
                System.out.println(entity5);
            }

            ProductEntity entity6= entityManager.find(ProductEntity.class,6);
            if (entity6 != null) {
                entity6.setName(" cake");
                entity6.setPrice(60);
                System.out.println(entity6);
            }

            ProductEntity entity7= entityManager.find(ProductEntity.class,7);
            if (entity7 != null) {
                entity7.setName(" munch");
                entity7.setPrice(60);
                System.out.println(entity7);
            }




            entityTransaction.commit();
        }
            catch (PersistenceException e) {
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
