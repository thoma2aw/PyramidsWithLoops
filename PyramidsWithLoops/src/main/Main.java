/*
 * Bill Nicholson
 * edited by Andrew Thomas
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;								//decides how many lines pyramid is
		for (int i = 1; i < lines+1; i++) {			//outer loop to determine which line we are on and which number will be output
			for(int k=0;k<lines-i;k++) {			
				System.out.print(" ");				//inner loop to output spaces for proper spacing
			}
			for (int j=1;j<=i*2-1;j++) {			//inner loop to spit out a certain number of the character
				System.out.print(""+i);	
			}
			System.out.println("");					//in outer loop to start a new line for output
		}
	}
}
