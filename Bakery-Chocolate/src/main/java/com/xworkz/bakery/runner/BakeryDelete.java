package com.xworkz.bakery.runner;

import com.xworkz.bakery.entity.BakeryEntity;

import javax.persistence.*;

public class BakeryDelete {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
           /*entityTransaction.begin();
           BakeryEntity del= entityManager.find(BakeryEntity.class,1);
            entityManager.remove(del);
            entityTransaction.commit();*/


           entityTransaction.begin();

            BakeryEntity entity = entityManager.find(BakeryEntity.class, 2);
            if (entity != null) {
                entityManager.remove(entity);
                entityTransaction.commit();
            }
        }
        catch(PersistenceException e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
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
