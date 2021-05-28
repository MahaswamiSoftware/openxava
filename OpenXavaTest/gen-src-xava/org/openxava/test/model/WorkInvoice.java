
// File generated by OpenXava: Fri May 28 10:21:54 CEST 2021
// Archivo generado por OpenXava: Fri May 28 10:21:54 CEST 2021

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: WorkInvoice		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class WorkInvoice implements java.io.Serializable, org.openxava.test.model.IWorkInvoice {	

	// Constructor
	public WorkInvoice() {
		initMembers();
	} 

	private void initMembers() { 
		setNumber(0); 
		setDescription(null); 
		setHours(0); 
		setTripCost(null); 
		setDiscount(null); 
		setVatPercentage(0); 
		setTotal(null); 	
	} 
	
	// Properties/Propiedades 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 
	private static org.openxava.converters.IConverter hoursConverter;
	private org.openxava.converters.IConverter getHoursConverter() {
		if (hoursConverter == null) {
			try {
				hoursConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("hours");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "hours"));
			}
			
		}	
		return hoursConverter;
	} 
	private java.lang.Integer hours;
	private java.lang.Integer get_Hours() {
		return hours;
	}
	private void set_Hours(java.lang.Integer newHours) {
		this.hours = newHours;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getHours() {
		try {
			return ((Integer) getHoursConverter().toJava(get_Hours())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Hours", "WorkInvoice", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setHours(int newHours) {
		try { 
			set_Hours((java.lang.Integer) getHoursConverter().toDB(new Integer(newHours)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Hours", "WorkInvoice", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter totalConverter;
	private org.openxava.converters.IConverter getTotalConverter() {
		if (totalConverter == null) {
			try {
				totalConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("total");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "total"));
			}
			
		}	
		return totalConverter;
	} 
	private java.math.BigDecimal total;
	private java.math.BigDecimal get_Total() {
		return total;
	}
	private void set_Total(java.math.BigDecimal newTotal) {
		this.total = newTotal;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getTotal() {
		try {
			return (java.math.BigDecimal) getTotalConverter().toJava(get_Total());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Total", "WorkInvoice", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setTotal(java.math.BigDecimal newTotal) {
		try { 
			set_Total((java.math.BigDecimal) getTotalConverter().toDB(newTotal));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Total", "WorkInvoice", "java.math.BigDecimal"));
		}		
	} 
	private static org.openxava.converters.IConverter vatPercentageConverter;
	private org.openxava.converters.IConverter getVatPercentageConverter() {
		if (vatPercentageConverter == null) {
			try {
				vatPercentageConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("vatPercentage");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "vatPercentage"));
			}
			
		}	
		return vatPercentageConverter;
	} 
	private java.lang.Integer vatPercentage;
	private java.lang.Integer get_VatPercentage() {
		return vatPercentage;
	}
	private void set_VatPercentage(java.lang.Integer newVatPercentage) {
		this.vatPercentage = newVatPercentage;
	} 	
	
	/**
	 * 
	 * 
	 */
	public int getVatPercentage() {
		try {
			return ((Integer) getVatPercentageConverter().toJava(get_VatPercentage())).intValue();
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "VatPercentage", "WorkInvoice", "int"));
		}
	}
	
	/**
	 * 
	 */
	public void setVatPercentage(int newVatPercentage) {
		try { 
			set_VatPercentage((java.lang.Integer) getVatPercentageConverter().toDB(new Integer(newVatPercentage)));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "VatPercentage", "WorkInvoice", "int"));
		}		
	} 
	private static org.openxava.converters.IConverter tripCostConverter;
	private org.openxava.converters.IConverter getTripCostConverter() {
		if (tripCostConverter == null) {
			try {
				tripCostConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("tripCost");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "tripCost"));
			}
			
		}	
		return tripCostConverter;
	} 
	private java.math.BigDecimal tripCost;
	private java.math.BigDecimal get_TripCost() {
		return tripCost;
	}
	private void set_TripCost(java.math.BigDecimal newTripCost) {
		this.tripCost = newTripCost;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getTripCost() {
		try {
			return (java.math.BigDecimal) getTripCostConverter().toJava(get_TripCost());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "TripCost", "WorkInvoice", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setTripCost(java.math.BigDecimal newTripCost) {
		try { 
			set_TripCost((java.math.BigDecimal) getTripCostConverter().toDB(newTripCost));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "TripCost", "WorkInvoice", "java.math.BigDecimal"));
		}		
	} 
	private static org.openxava.converters.IConverter descriptionConverter;
	private org.openxava.converters.IConverter getDescriptionConverter() {
		if (descriptionConverter == null) {
			try {
				descriptionConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("description");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "description"));
			}
			
		}	
		return descriptionConverter;
	} 
	private java.lang.String description;
	private java.lang.String get_Description() {
		return description;
	}
	private void set_Description(java.lang.String newDescription) {
		this.description = newDescription;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getDescription() {
		try {
			return (String) getDescriptionConverter().toJava(get_Description());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "WorkInvoice", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setDescription(String newDescription) {
		try { 
			set_Description((java.lang.String) getDescriptionConverter().toDB(newDescription));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Description", "WorkInvoice", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter discountConverter;
	private org.openxava.converters.IConverter getDiscountConverter() {
		if (discountConverter == null) {
			try {
				discountConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("discount");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "discount"));
			}
			
		}	
		return discountConverter;
	} 
	private java.math.BigDecimal discount;
	private java.math.BigDecimal get_Discount() {
		return discount;
	}
	private void set_Discount(java.math.BigDecimal newDiscount) {
		this.discount = newDiscount;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.math.BigDecimal getDiscount() {
		try {
			return (java.math.BigDecimal) getDiscountConverter().toJava(get_Discount());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Discount", "WorkInvoice", "java.math.BigDecimal"));
		}
	}
	
	/**
	 * 
	 */
	public void setDiscount(java.math.BigDecimal newDiscount) {
		try { 
			set_Discount((java.math.BigDecimal) getDiscountConverter().toDB(newDiscount));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Discount", "WorkInvoice", "java.math.BigDecimal"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.IWorker worker; 	
	public org.openxava.test.model.IWorker getWorker() {
		if (worker != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				worker.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return worker;
	}
	public void setWorker(org.openxava.test.model.IWorker newWorker) {
		if (newWorker != null && !(newWorker instanceof org.openxava.test.model.Worker)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.worker = newWorker; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static WorkInvoice findByNumber(int number) throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from WorkInvoice as o where o.number = :arg0"); 
		query.setParameter("arg0", new Integer(number)); 
		WorkInvoice r = (WorkInvoice) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "WorkInvoice"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("WorkInvoice").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "WorkInvoice"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}