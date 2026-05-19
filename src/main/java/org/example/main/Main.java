package org.example.main;

import org.example.view.ViewPrincipal;

public class Main {
    public static void main(String[] args) {

        ViewPrincipal principal = new ViewPrincipal();

        int x = 1000;
        do{
            x = principal.menuPrincipal();
        }while(x != 0);
    }
}