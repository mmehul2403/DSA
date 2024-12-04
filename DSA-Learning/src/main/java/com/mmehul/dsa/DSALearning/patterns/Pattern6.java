package com.mmehul.dsa.DSALearning.patterns;

public class Pattern6 {
	
	public void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			
			//print first numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//print space 
			for(int k=1;k<= (2*n)-(2*i);k++) {
				System.out.print(" ");
			}
			//print last numbers
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern6 pattern = new Pattern6();
		pattern .printPattern(5);
	}
}
