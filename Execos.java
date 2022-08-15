/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.execos;

import java.util.Scanner;

/**
 *
 * @author GCM_02
 */
public class Execos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        
        System.out.println(vect[position]);
        
    }
}
