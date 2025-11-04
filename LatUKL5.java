/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl5;

/**
 *
 * @author Kenji
 */
import java.util.Scanner;
import java.util.ArrayList;
public class LatUKL5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah Siswa: ");
        int n = input.nextInt();
        ArrayList<Integer> nilai = new ArrayList<Integer>();
        
        for (int i = 1 ; i <= n; i++)
        {
            System.out.print("Nilai Siswa " + i + ": ");
            int ns = input.nextInt();
            nilai.add(ns);
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += nilai.get(i);
        }
        
        float avrg = sum / nilai.size();
        
        System.out.println("Nilai rata-rata seluruh siswa adalah: " + avrg);
    }
}
