

// File generated by OpenXava: Fri May 08 14:45:58 CEST 2020
// Archivo generado por OpenXava: Fri May 08 14:45:58 CEST 2020

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Year		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IYear  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_year = "year"; 
	int getYear() throws RemoteException;
	void setYear(int year) throws RemoteException;	

	java.util.Collection getMonths() throws RemoteException;		

	// References/Referencias

	// Methods 


}