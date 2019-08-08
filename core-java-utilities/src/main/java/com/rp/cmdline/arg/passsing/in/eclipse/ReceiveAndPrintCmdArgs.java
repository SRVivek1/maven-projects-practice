/**
 * This program is developed to learn how to pass command line arguments to program while using IDE's like eclipse.
 * 
 * Solution : To pass command line arguments you need to go to "Run Configuration" then in "Arguments tab" 
 * 			  provide the arguments as part of "Program Arguments" box. and then run the program.
 * 
 */
package com.rp.cmdline.arg.passsing.in.eclipse;

public class ReceiveAndPrintCmdArgs {

	public static void main(String[] args) {
		
		int paramCount = args.length;
		if(null != args && paramCount > 0){
						
			System.out.println("Number of arguments received : " + paramCount);
			System.out.print("Arguments received : ");
			for(String param : args){
				System.out.print(param + ", ");
			}
			
		} else {
			System.out.println("Error : No Command Line Arguments Received.");
		}
	}

}
