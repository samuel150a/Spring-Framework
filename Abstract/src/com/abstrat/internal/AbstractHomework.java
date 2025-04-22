/* 5. Declare a abstract class with two abstract methods, two concrete methods , extend it by a subclass , implement one abstract method , then extend the subclass by another class and implement the abstract method, create a copy of complete class
*/
package com.abstrat.internal;


public abstract class AbstractHomework {


    public abstract void Maths();
    public abstract void English();

    public void Social(){
       System.out.println("Running in the concrete method Social");
    }

    public void Physics()
    {
        System.out.println("Running in the concrete method Physics");

    }

}
