package com.temple.external;

import com.temple.internal.NGO;
public class TempleRunner {
    public static void main(String[] args) {
        Temple temple=new Temple();
        Trust trust=new Trust();
        NGO ngo=new NGO(temple);

    }
}
