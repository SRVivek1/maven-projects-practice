/**
 * Which clas will get loaded if we have same class packed in two different 
 * jar's as well if we have the same class in current projects also.
 * 
 * 
 * Resolution: (Tested)
 * -----------------------
 * 		>> It will first check it in current working directory.
 * 		>> Again start searching class path in the order they are provided.
 * 
 * 	Example :
 * ------------
 * 		1. set CLASSPATH=myjar-1.jar;myjar-2.jar;
 * 			>> In this case it will instantiate class from myjar-1.jar
 * 	
 * 		2. set CLASSPATH=myjar-2.jar;myjar-1.jar;
 * 			>> In this case it will instantiate class from myjar-2.jar
 */

package com.rp.classpath.classs.loading;


public class WhichClassWillBeLodedIfTwoJarsHaveSameClass {

	public static void main(String[] args) {

		System.out.println("Data received : " + UtilClass.version);
		System.out.println("Hello");
	}

}
