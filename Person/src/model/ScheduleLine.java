package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceUnit;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty.Multiplicity;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * Entity implementation class for Entity: ScheduleLine
 *	@author Siva.Gandikota@microcomsolution.com
 */
@Entity
@Table
@PersistenceUnit(name="PERSONS")
/*@Resources ({
	@Resource(name="jdbc/DefaultDB")
    })
*/
@XmlRootElement
@EdmEntityType
@EdmEntitySet
@XmlType

public class ScheduleLine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EdmKey
	@Column
	private Long id;
	@Column private static final long serialVersionUID = 1L;
	
	@OneToOne
	//@JoinColumn(name="SALESORDERID")
	@XmlInverseReference(mappedBy="scheduleLine")
	@EdmNavigationProperty(name = "SalesOrders", toType = model.SalesOrder.class, toMultiplicity = Multiplicity.ONE)
	private SalesOrder salesOrder;
	
	@OneToOne
	//@JoinColumn(name="SALES_ORDER_ITEM_ID")
	@XmlInverseReference(mappedBy="scheduleLine")
	@EdmNavigationProperty(name = "SalesOrderItems", toType = model.SalesOrderItem.class, toMultiplicity = Multiplicity.ONE)
	private SalesOrderItem salesOrderItem;
	
	
	@Column private String scheduleLine;
	@Column private String orderQuantityUnit;
	@Column private Long confdOrderQtyByMatlAvailCheck;
	@Column private Long deliveredQtyInOrderQtyUnit;  //": "9999999999.999",
	@Column private Long openConfdDelivQtyInOrdQtyUnit;//": "9999999999.999",
	@Column private String delivBlockReasonForSchedLine;//": "string"
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getScheduleLine() {
		return scheduleLine;
	}
	public void setScheduleLine(String scheduleLine) {
		this.scheduleLine = scheduleLine;
	}
	public String getOrderQuantityUnit() {
		return orderQuantityUnit;
	}
	public void setOrderQuantityUnit(String orderQuantityUnit) {
		this.orderQuantityUnit = orderQuantityUnit;
	}
	public Long getConfdOrderQtyByMatlAvailCheck() {
		return confdOrderQtyByMatlAvailCheck;
	}
	public void setConfdOrderQtyByMatlAvailCheck(Long confdOrderQtyByMatlAvailCheck) {
		this.confdOrderQtyByMatlAvailCheck = confdOrderQtyByMatlAvailCheck;
	}
	public Long getDeliveredQtyInOrderQtyUnit() {
		return deliveredQtyInOrderQtyUnit;
	}
	public void setDeliveredQtyInOrderQtyUnit(Long deliveredQtyInOrderQtyUnit) {
		this.deliveredQtyInOrderQtyUnit = deliveredQtyInOrderQtyUnit;
	}
	public Long getOpenConfdDelivQtyInOrdQtyUnit() {
		return openConfdDelivQtyInOrdQtyUnit;
	}
	public void setOpenConfdDelivQtyInOrdQtyUnit(Long openConfdDelivQtyInOrdQtyUnit) {
		this.openConfdDelivQtyInOrdQtyUnit = openConfdDelivQtyInOrdQtyUnit;
	}
	public String getDelivBlockReasonForSchedLine() {
		return delivBlockReasonForSchedLine;
	}
	public void setDelivBlockReasonForSchedLine(String delivBlockReasonForSchedLine) {
		this.delivBlockReasonForSchedLine = delivBlockReasonForSchedLine;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((confdOrderQtyByMatlAvailCheck == null) ? 0 : confdOrderQtyByMatlAvailCheck.hashCode());
		result = prime * result
				+ ((delivBlockReasonForSchedLine == null) ? 0 : delivBlockReasonForSchedLine.hashCode());
		result = prime * result + ((deliveredQtyInOrderQtyUnit == null) ? 0 : deliveredQtyInOrderQtyUnit.hashCode());
		result = prime * result
				+ ((openConfdDelivQtyInOrdQtyUnit == null) ? 0 : openConfdDelivQtyInOrdQtyUnit.hashCode());
		result = prime * result + ((orderQuantityUnit == null) ? 0 : orderQuantityUnit.hashCode());
		result = prime * result + ((salesOrder == null) ? 0 : salesOrder.hashCode());
		result = prime * result + ((salesOrderItem == null) ? 0 : salesOrderItem.hashCode());
		result = prime * result + ((scheduleLine == null) ? 0 : scheduleLine.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ScheduleLine other = (ScheduleLine) obj;
		if (confdOrderQtyByMatlAvailCheck == null) {
			if (other.confdOrderQtyByMatlAvailCheck != null)
				return false;
		} else if (!confdOrderQtyByMatlAvailCheck.equals(other.confdOrderQtyByMatlAvailCheck))
			return false;
		if (delivBlockReasonForSchedLine == null) {
			if (other.delivBlockReasonForSchedLine != null)
				return false;
		} else if (!delivBlockReasonForSchedLine.equals(other.delivBlockReasonForSchedLine))
			return false;
		if (deliveredQtyInOrderQtyUnit == null) {
			if (other.deliveredQtyInOrderQtyUnit != null)
				return false;
		} else if (!deliveredQtyInOrderQtyUnit.equals(other.deliveredQtyInOrderQtyUnit))
			return false;
		if (openConfdDelivQtyInOrdQtyUnit == null) {
			if (other.openConfdDelivQtyInOrdQtyUnit != null)
				return false;
		} else if (!openConfdDelivQtyInOrdQtyUnit.equals(other.openConfdDelivQtyInOrdQtyUnit))
			return false;
		if (orderQuantityUnit == null) {
			if (other.orderQuantityUnit != null)
				return false;
		} else if (!orderQuantityUnit.equals(other.orderQuantityUnit))
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
		if (scheduleLine == null) {
			if (other.scheduleLine != null)
				return false;
		} else if (!scheduleLine.equals(other.scheduleLine))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ScheduleLine [scheduleLineId=" + id + ", salesOrder=" + salesOrder + ", salesOrderItem="
				+ salesOrderItem + ", scheduleLine=" + scheduleLine + ", orderQuantityUnit=" + orderQuantityUnit
				+ ", confdOrderQtyByMatlAvailCheck=" + confdOrderQtyByMatlAvailCheck + ", deliveredQtyInOrderQtyUnit="
				+ deliveredQtyInOrderQtyUnit + ", openConfdDelivQtyInOrdQtyUnit=" + openConfdDelivQtyInOrdQtyUnit
				+ ", delivBlockReasonForSchedLine=" + delivBlockReasonForSchedLine + "]";
	}
	
	
	
}
