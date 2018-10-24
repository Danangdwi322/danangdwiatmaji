/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

import java.util.Scanner;

/**
 *
 * @author DnD
 */
public class Pbo2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
	int pil;
	Scanner s= new Scanner (System.in);
	
	do{
		System.out.println("1. Input data");
		System.out.println("2. Tampil data");
		System.out.println("3. Keluar");
		System.out.print("Pilih : ");pil=s.nextInt();
	}
	while(pil != 3);
	}

  
    
}
