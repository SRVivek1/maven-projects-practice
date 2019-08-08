/**
 * A java application to configure and read System properties values in eclipse IDE
 */
package com.rp.read.system.property.in.eclipse.ide;

public final class ReadSystemProperty {

	public static void main(String[] args) {
		String drvClass = System.getProperty("drvClass");
		String url = System.getProperty("url");
		String uname = System.getProperty("uname");
		String passwd = System.getProperty("passwd");
		
		System.out.println("Driver class : "+drvClass);
		System.out.println("URL          : "+url);
		System.out.println("Username     : "+uname);
		System.out.println("Password     : "+passwd);

	}

}
