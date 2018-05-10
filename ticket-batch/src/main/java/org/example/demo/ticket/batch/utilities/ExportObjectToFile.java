package org.example.demo.ticket.batch.utilities;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.demo.ticket.batch.Main;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Class to deal with utilities such as export of Object to file
 * 
 * @author bob
 * @version 1.0
 */
public class ExportObjectToFile {

	/** Logger pour la classe */
	private static final Log LOGGER = LogFactory.getLog(Main.class);

	@Autowired
	private String path;

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Constructor
	 */
	public ExportObjectToFile() {

	}

	public void exportObject(Object myObj) {

		// ADD the new Object to a file :
		ObjectOutputStream oos;

		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(this.path))));

			oos.writeObject(myObj);

			LOGGER.debug("Exporting object to file - Check the path " + this.path);

			// Closing the stream
			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
