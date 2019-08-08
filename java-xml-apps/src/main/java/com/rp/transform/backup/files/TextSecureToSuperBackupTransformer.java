package com.rp.transform.backup.files;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TextSecureToSuperBackupTransformer {

	
	/**
	 * Transform from TextSecure back to SuperBackup
	 */
	public void transform(String xmlDataFile){
		
		JAXBContext jaxbContext = null;

		try {
			jaxbContext = JAXBContext.newInstance(Smses.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		Unmarshaller unmarshaller = null;
		try {
			unmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		Smses smses = null;
		File xmlFile = new File("bin/"+xmlDataFile);
		try {
			smses = (Smses) unmarshaller.unmarshal(xmlFile);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		System.out.println(xmlFile.toPath().toString());
		
		System.out.println(smses.toString());
	}

}
