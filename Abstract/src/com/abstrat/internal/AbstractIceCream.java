/* 3. Declare an abstract class with one abstract method and one concrete method and extend it by a subclass. Create copy of subclass */
package com.abstrat.internal;


public abstract class AbstractIceCream {
    public abstract void Price();
    public void Brand()
    {
        System.out.println("Running in concrete method which is Brand");

    }
}
