package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
        String tox="Hayastan";
        String tox1="";
        for (int i=tox.length()-1; i >=0 ; i--) {
            tox1+=tox.charAt(i);
        }
        System.out.println(tox1);
        System.out.println(tox.equals(tox1));
    }
}
