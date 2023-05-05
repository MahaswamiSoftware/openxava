package org.openxava.util;

import java.util.logging.*;

/**
 * 
 * @author Javier Paniza
 */

public class DBServer {
	
	public static void start(String dbName) throws Exception {
		start(dbName, 1666); 
	}
	
	/** @since 7.1 */
	public static void start(String dbName, int port) throws Exception { 
		new Thread(() -> {
			org.hsqldb.Server hsqlServer = new org.hsqldb.Server();
	        hsqlServer.setSilent(true);
	        hsqlServer.setDatabaseName(0, "");
	        hsqlServer.setDatabasePath(0, "file:data/" + dbName);
	        hsqlServer.setPort(port);
	        hsqlServer.start();     
	        Logger.getLogger("").setLevel(Level.INFO);
		}).start();
	}
	
	public static void runManager() {
		String [] url = { "--url", "jdbc:hsqldb:hsql://localhost:1666" };
		org.hsqldb.util.DatabaseManagerSwing.main(url);
	}

}
