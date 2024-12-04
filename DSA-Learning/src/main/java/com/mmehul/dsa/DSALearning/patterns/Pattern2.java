package com.mmehul.dsa.DSALearning.patterns;

/*
 * Pattern Printing - 2   
*********
 ******* 
  *****  
   ***   
    *    
 * */
public class Pattern2 {
 
	public void printPattern(int n) {
	
		for(int i = 4 ;i >= 0; i--) {
			//Print Space
			for(int j=0;j< n-i-1;j++) {
				System.out.print(" ");
			}
			
			//Print Star
			for(int k=0;k<(2*i)+1;k++) {
				System.out.print("*");
			}
			
			
			//Print Space
			for(int l=0;l< n-i-1;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	 
	public static void main(String[] args) {
		Pattern2 pattern = new Pattern2();
		pattern.printPattern(5);
	}
}
