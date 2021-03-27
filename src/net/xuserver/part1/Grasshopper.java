package net.xuserver.part1;

import java.util.*;

public class Grasshopper {
    private String name;
    public Grasshopper(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;
    }

    
}