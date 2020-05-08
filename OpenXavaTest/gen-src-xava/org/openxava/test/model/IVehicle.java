

// File generated by OpenXava: Fri May 08 14:45:58 CEST 2020
// Archivo generado por OpenXava: Fri May 08 14:45:58 CEST 2020

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Vehicle		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IVehicle  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_code = "code"; 
	String getCode() throws RemoteException;
	void setCode(String code) throws RemoteException; 	
	public static final String PROPERTY_stateId = "stateId"; 
	String getStateId() throws RemoteException;
	void setStateId(String stateId) throws RemoteException; 	
	public static final String PROPERTY_model = "model"; 
	String getModel() throws RemoteException;
	void setModel(String model) throws RemoteException; 	
	public static final String PROPERTY_oid = "oid"; 	
	String getOid() throws RemoteException; 	
	public static final String PROPERTY_make = "make"; 
	String getMake() throws RemoteException;
	void setMake(String make) throws RemoteException;		

	// References/Referencias 

	// City : Reference/Referencia
	
	org.openxava.test.model.ICity getCity() throws RemoteException;
	void setCity(org.openxava.test.model.ICity newCity) throws RemoteException; 

	// State : Reference/Referencia
	
	org.openxava.test.model.IState getState() throws RemoteException;
	void setState(org.openxava.test.model.IState newState) throws RemoteException;

	// Methods 


}