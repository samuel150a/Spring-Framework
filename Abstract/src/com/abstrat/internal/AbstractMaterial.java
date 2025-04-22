package com.abstrat.internal;

  abstract class Material {

    String cloth;
    public Material(String cloth){
        this.cloth=cloth;
    }
    public abstract void shirt();
}