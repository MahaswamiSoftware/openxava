

// File generated by OpenXava: Wed Dec 01 12:46:43 CET 2021
// Archivo generado por OpenXava: Wed Dec 01 12:46:43 CET 2021

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: School		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ISchool  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_name = "name"; 
	String getName() throws RemoteException;
	void setName(String name) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException; 
	void addToTeachers(org.openxava.test.model.ITeacher newElement) throws RemoteException;
	void removeFromTeachers(org.openxava.test.model.ITeacher toRemove) throws RemoteException;	

	java.util.Collection getTeachers() throws RemoteException;		

	// References/Referencias

	// Methods 


}