package com.xworkz.dmart.runner;

import com.xworkz.dmart.entity.ProductEntity;

import javax.persistence.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductRunner {
    public static void main(String[] args) {

        ProductEntity productEntity=new ProductEntity();
        productEntity.setName("Mithun A");
        productEntity.setMfd(LocalDate.parse("2025-02-10"));


        productEntity.setPrice(25);
        productEntity.setCompany("hp");
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("x-workz");
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(productEntity);
            entityTransaction.commit();
        } catch (PersistenceException e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}