package com.rp.transform.backup.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class TrasformXmlFilesApp {

	private final String applicationConfig = "com/rp/transform/backup/files/application-config.properties";

	private ClassLoader appClassLoader = null;

	String commandClass = null;

	String xmlDataFile = null;

	Properties config = null;

	Scanner scanner = null;

	/**
	 * Default constructor
	 */
	public TrasformXmlFilesApp() {
		this.appClassLoader = TextSecureToSuperBackupTransformer.class
				.getClassLoader();
		this.config = new Properties();
		this.scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {

		TrasformXmlFilesApp application = new TrasformXmlFilesApp();
		application.intializeApplication();
		application.displayMenu();
		application.execute();
	}

	/*
	 * Loading Application configuration from properties file
	 */
	private void intializeApplication() {
		InputStream inStream = this.appClassLoader
				.getResourceAsStream(this.applicationConfig);
		if (inStream == null) {
			new FileNotFoundException("Unable to find the file : "
					+ this.applicationConfig).printStackTrace();
		}

		try {
			this.config.load(inStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			inStream.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	/*
	 * Provide user the options of conversion available
	 */
	private void displayMenu() {
		String[] supportedApps = this.config.getProperty(
				AppConstants.SUPPORTED_APPLICATION).split(AppConstants.COMMA);
		System.out.println(":: Select Source Application ::");
		int index = 0;
		for (String app : supportedApps) {
			System.out.println(index + ". " + app);
			index++;
		}
		int choice = scanner.nextInt();
		this.commandClass = this.config.getProperty(supportedApps[choice]);
		this.xmlDataFile = this.config.getProperty(supportedApps[choice]
				.toLowerCase());
	}

	/**
	 * Perform conversion
	 */
	private void execute() {

		if (null == this.commandClass && null == this.xmlDataFile) {
			try {
				throw new NullPointerException(
						"CommandClass or Command config not available. ["
								+ "CommandClass:" + this.commandClass
								+ ", Command Config:" + this.xmlDataFile
								+ "]");
			} catch (NullPointerException ne) {
				ne.printStackTrace();
			}
		}

		Class<?> type = null;
		try {
			type = Class.forName(commandClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (type == TextSecureToSuperBackupTransformer.class) {
			TextSecureToSuperBackupTransformer app = null;
			try {
					app = (TextSecureToSuperBackupTransformer) type.newInstance();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
			app.transform(this.xmlDataFile);
		}
	}

}
