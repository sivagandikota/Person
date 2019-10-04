package model;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceUnit;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty.Multiplicity;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

@Entity
@Table
@PersistenceUnit(name="PERSONS")
/*@Resources ({
	@Resource(name="jdbc/DefaultDB")
    })*/

@XmlRootElement
@EdmEntityType
@EdmEntitySet
@XmlType

public class BusinessPartner  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EdmKey
	@Column
	private Long id;
	@Column private static final long serialVersionUID = 1L;
	
	@OneToOne(optional=true)
	@XmlInverseReference(mappedBy="businessPartner")
	//@JoinColumn(name="SALESORDERID")
	@EdmNavigationProperty(name = "SalesOrders", toType = model.SalesOrder.class, toMultiplicity = Multiplicity.ONE)
	private SalesOrder salesOrder;
	
	@OneToOne(optional=true)
	//@JoinColumn(name="SALES_ORDER_ITEM_ID")
	@XmlInverseReference(mappedBy="businessPartner")
	@EdmNavigationProperty(name = "SalesOrderItems", toType = model.SalesOrderItem.class, toMultiplicity = Multiplicity.ONE)
	private SalesOrderItem salesOrderItem;
	
	
	@Column private String partnerFunction;
	@Column private String customer;
	@Column private String supplier;
	@Column private String personnel;
	@Column private String contactPerson;
	public Long getId() {
		return id;
	}
	public void setId(Long businessPartnerId) {
		this.id = businessPartnerId;
	}
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}
	public SalesOrderItem getSalesOrderItem() {
		return salesOrderItem;
	}
	public void setSalesOrderItem(SalesOrderItem salesOrderItem) {
		this.salesOrderItem = salesOrderItem;
	}
	public String getPartnerFunction() {
		return partnerFunction;
	}
	public void setPartnerFunction(String partnerFunction) {
		this.partnerFunction = partnerFunction;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getPersonnel() {
		return personnel;
	}
	public void setPersonnel(String personnel) {
		this.personnel = personnel;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((contactPerson == null) ? 0 : contactPerson.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((partnerFunction == null) ? 0 : partnerFunction.hashCode());
		result = prime * result + ((personnel == null) ? 0 : personnel.hashCode());
		result = prime * result + ((salesOrder == null) ? 0 : salesOrder.hashCode());
		result = prime * result + ((salesOrderItem == null) ? 0 : salesOrderItem.hashCode());
		result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessPartner other = (BusinessPartner) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (contactPerson == null) {
			if (other.contactPerson != null)
				return false;
		} else if (!contactPerson.equals(other.contactPerson))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (partnerFunction == null) {
			if (other.partnerFunction != null)
				return false;
		} else if (!partnerFunction.equals(other.partnerFunction))
			return false;
		if (personnel == null) {
			if (other.personnel != null)
				return false;
		} else if (!personnel.equals(other.personnel))
			return false;
		if (salesOrder == null) {
			if (other.salesOrder != null)
				return false;
		} else if (!salesOrder.equals(other.salesOrder))
			return false;
		if (salesOrderItem == null) {
			if (other.salesOrderItem != null)
				return false;
		} else if (!salesOrderItem.equals(other.salesOrderItem))
			return false;
		if (supplier == null) {
			if (other.supplier != null)
				return false;
		} else if (!supplier.equals(other.supplier))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BusinessPartner [id=" + id + ", salesOrder=" + salesOrder
				+ ", salesOrderItem=" + salesOrderItem + ", partnerFunction=" + partnerFunction + ", customer="
				+ customer + ", supplier=" + supplier + ", personnel=" + personnel + ", contactPerson=" + contactPerson
				+ "]";
	}
	
	
	
	
	
	
	
	
}
