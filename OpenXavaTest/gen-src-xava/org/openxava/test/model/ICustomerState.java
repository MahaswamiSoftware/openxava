

// File generated by OpenXava: Fri May 08 14:45:57 CEST 2020
// Archivo generado por OpenXava: Fri May 08 14:45:57 CEST 2020

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Customer		Java interface for aggregate/Interfaz java para Agregado: CustomerState

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface ICustomerState  extends org.openxava.model.IModel {	

	// Properties/Propiedades		

	// References/Referencias 

	// State : Reference/Referencia
	
	org.openxava.test.model.IState getState() throws RemoteException;
	void setState(org.openxava.test.model.IState newState) throws RemoteException; 

	// Customer : Reference/Referencia
	
	org.openxava.test.model.ICustomer getCustomer() throws RemoteException;
	void setCustomer(org.openxava.test.model.ICustomer newCustomer) throws RemoteException;

	// Methods 


}