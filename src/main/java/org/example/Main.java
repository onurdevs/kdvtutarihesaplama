package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvoran, kdvtutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tutar = scanner.nextDouble();

        if(tutar <= 1000){
            kdvoran = 0.18;
        }else{
            kdvoran = 0.08;
        }

        kdvtutar = tutar * kdvoran;
        double kdvlifiyat = kdvtutar + tutar;

        System.out.println("KDV Oranı: "+ kdvoran);
        System.out.println("KDV Tutarı: "+ kdvtutar);
        System.out.println("KDV li Tutar: "+ kdvlifiyat);
        System.out.println("KDV siz Tutar: "+tutar);


    }
}