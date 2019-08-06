package model;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.apache.olingo.odata2.api.annotation.edm.EdmComplexType;
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
@EdmEntityType(namespace = "odata2")
@EdmEntitySet(name="SalesOrderItemDetails")
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@EdmComplexType(name = "SalesOrderItem")
public class SalesOrderItem  implements Serializable{

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@EdmKey
	private Long id;
	@Column private static final long serialVersionUID = 1L;
	
	@XmlInverseReference(mappedBy="salesOrderItem")
	@ManyToOne(optional=true)
	 //@JoinColumn (name="SALESORDER_ID")
	 @EdmNavigationProperty(name = "SalesOrderDetails", toType = model.SalesOrder.class, toMultiplicity = Multiplicity.ONE)
	 private SalesOrder salesOrder;
	
	//private Long SALESORDERID;
	 
	 @EdmNavigationProperty(name = "PricingElements", toType = model.PricingElement.class, toMultiplicity = Multiplicity.ONE) @OneToOne(optional=true,cascade= CascadeType.ALL)  @XmlInverseReference(mappedBy="salesOrderItem") private PricingElement pricingElement;
	 @EdmNavigationProperty(name = "BusinessPartners", toType = model.BusinessPartner.class, toMultiplicity = Multiplicity.ONE) @OneToOne(optional=true,cascade= CascadeType.ALL)  @XmlInverseReference(mappedBy="salesOrderItem") private BusinessPartner businessPartner;
	 @EdmNavigationProperty(name = "ScheduleLines", toType = model.ScheduleLine.class, toMultiplicity = Multiplicity.ONE) @OneToOne(optional=true,cascade= CascadeType.ALL)  @XmlInverseReference(mappedBy="salesOrderItem") private ScheduleLine scheduleLine;
	 @EdmNavigationProperty(name = "Addresses", toType = model.Addresse.class, toMultiplicity = Multiplicity.ONE) @OneToOne(optional=true,cascade= CascadeType.ALL)  @XmlInverseReference(mappedBy="salesOrderItem") private Addresse addresse;
     @Column private String higherLevelItem;
     @Column private String salesOrderItemCategory;
     @Column private String salesOrderItemText;
     @Column private String purchaseOrderByCustomer;
     @Column private String material;
     @Column private String materialByCustomer;
     @Column private Date PricingDate;
     @Column private Double requestedQuantity;//: "999,999,999,999.999",
     @Column private String requestedQuantityUnit;//": "string",
     @Column private Double itemGrossWeight;//": "999999999999.999",
     @Column private Double itemNetWeight;//": "999999999999.999",
     @Column private String itemWeightUnit;//": "string",
     @Column private String itemVolume;//": "999999999999.999",
     @Column private String itemVolumeUnit;//": "string",
     @Column private String transactionCurrency;//": "string",
     @Column private String netAmount;//": "Unknown Type: string,null",
     @Column private String materialGroup;//": "string",
     @Column private String materialPricingGroup;//": "string",
     @Column private String batch;//": "string",
     @Column private String productionPlant;//": "string",
     @Column private String storageLocation;//": "string",
     @Column private String deliveryGroup;//": "string",
     @Column private String shippingPoint;//": "string",
     @Column private String shippingType;//": "string",
     @Column private String deliveryPriority;//": "string",
     @Column private String incotermsClassification;//": "string",
     @Column private String incotermsTransferLocation;//": "string",
     @Column private String incotermsLocation1;//": "string",
     @Column private String incotermsLocation2;//": "string",
     @Column private String customerPaymentTerms;//": "string",
     @Column private String salesDocumentRjcnReason;//": "string",
     @Column private String itemBillingBlockReason;//": "string",
     @Column private String w_BSElement;//": "string",
     @Column private String s_DProcessStatus;//": "string",
     @Column private String deliveryStatus;//": "string",
     @Column private String orderRelatedBillingStatus;//": "string",
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
	public PricingElement getPricingElement() {
		return pricingElement;
	}
	public void setPricingElement(PricingElement pricingElement) {
		this.pricingElement = pricingElement;
	}
	public BusinessPartner getBusinessPartner() {
		return businessPartner;
	}
	public void setBusinessPartner(BusinessPartner businessPartner) {
		this.businessPartner = businessPartner;
	}
	public String getHigherLevelItem() {
		return higherLevelItem;
	}
	public void setHigherLevelItem(String higherLevelItem) {
		this.higherLevelItem = higherLevelItem;
	}
	public String getSalesOrderItemCategory() {
		return salesOrderItemCategory;
	}
	public void setSalesOrderItemCategory(String salesOrderItemCategory) {
		this.salesOrderItemCategory = salesOrderItemCategory;
	}
	public String getSalesOrderItemText() {
		return salesOrderItemText;
	}
	public void setSalesOrderItemText(String salesOrderItemText) {
		this.salesOrderItemText = salesOrderItemText;
	}
	public String getPurchaseOrderByCustomer() {
		return purchaseOrderByCustomer;
	}
	public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
		this.purchaseOrderByCustomer = purchaseOrderByCustomer;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterialByCustomer() {
		return materialByCustomer;
	}
	public void setMaterialByCustomer(String materialByCustomer) {
		this.materialByCustomer = materialByCustomer;
	}
	public Date getPricingDate() {
		return PricingDate;
	}
	public void setPricingDate(Date pricingDate) {
		PricingDate = pricingDate;
	}
	public Double getRequestedQuantity() {
		return requestedQuantity;
	}
	public void setRequestedQuantity(Double requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}
	public String getRequestedQuantityUnit() {
		return requestedQuantityUnit;
	}
	public void setRequestedQuantityUnit(String requestedQuantityUnit) {
		this.requestedQuantityUnit = requestedQuantityUnit;
	}
	public Double getItemGrossWeight() {
		return itemGrossWeight;
	}
	public void setItemGrossWeight(Double itemGrossWeight) {
		this.itemGrossWeight = itemGrossWeight;
	}
	public Double getItemNetWeight() {
		return itemNetWeight;
	}
	public void setItemNetWeight(Double itemNetWeight) {
		this.itemNetWeight = itemNetWeight;
	}
	public String getItemWeightUnit() {
		return itemWeightUnit;
	}
	public void setItemWeightUnit(String itemWeightUnit) {
		this.itemWeightUnit = itemWeightUnit;
	}
	public String getItemVolume() {
		return itemVolume;
	}
	public void setItemVolume(String itemVolume) {
		this.itemVolume = itemVolume;
	}
	public String getItemVolumeUnit() {
		return itemVolumeUnit;
	}
	public void setItemVolumeUnit(String itemVolumeUnit) {
		this.itemVolumeUnit = itemVolumeUnit;
	}
	public String getTransactionCurrency() {
		return transactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}
	public String getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}
	public String getMaterialGroup() {
		return materialGroup;
	}
	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
	}
	public String getMaterialPricingGroup() {
		return materialPricingGroup;
	}
	public void setMaterialPricingGroup(String materialPricingGroup) {
		this.materialPricingGroup = materialPricingGroup;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getProductionPlant() {
		return productionPlant;
	}
	public void setProductionPlant(String productionPlant) {
		this.productionPlant = productionPlant;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public String getDeliveryGroup() {
		return deliveryGroup;
	}
	public void setDeliveryGroup(String deliveryGroup) {
		this.deliveryGroup = deliveryGroup;
	}
	public String getShippingPoint() {
		return shippingPoint;
	}
	public void setShippingPoint(String shippingPoint) {
		this.shippingPoint = shippingPoint;
	}
	public String getShippingType() {
		return shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}
	public String getDeliveryPriority() {
		return deliveryPriority;
	}
	public void setDeliveryPriority(String deliveryPriority) {
		this.deliveryPriority = deliveryPriority;
	}
	public String getIncotermsClassification() {
		return incotermsClassification;
	}
	public void setIncotermsClassification(String incotermsClassification) {
		this.incotermsClassification = incotermsClassification;
	}
	public String getIncotermsTransferLocation() {
		return incotermsTransferLocation;
	}
	public void setIncotermsTransferLocation(String incotermsTransferLocation) {
		this.incotermsTransferLocation = incotermsTransferLocation;
	}
	public String getIncotermsLocation1() {
		return incotermsLocation1;
	}
	public void setIncotermsLocation1(String incotermsLocation1) {
		this.incotermsLocation1 = incotermsLocation1;
	}
	public String getIncotermsLocation2() {
		return incotermsLocation2;
	}
	public void setIncotermsLocation2(String incotermsLocation2) {
		this.incotermsLocation2 = incotermsLocation2;
	}
	public String getCustomerPaymentTerms() {
		return customerPaymentTerms;
	}
	public void setCustomerPaymentTerms(String customerPaymentTerms) {
		this.customerPaymentTerms = customerPaymentTerms;
	}
	public String getSalesDocumentRjcnReason() {
		return salesDocumentRjcnReason;
	}
	public void setSalesDocumentRjcnReason(String salesDocumentRjcnReason) {
		this.salesDocumentRjcnReason = salesDocumentRjcnReason;
	}
	public String getItemBillingBlockReason() {
		return itemBillingBlockReason;
	}
	public void setItemBillingBlockReason(String itemBillingBlockReason) {
		this.itemBillingBlockReason = itemBillingBlockReason;
	}
	public String getW_BSElement() {
		return w_BSElement;
	}
	public void setW_BSElement(String w_BSElement) {
		this.w_BSElement = w_BSElement;
	}
	public String getS_DProcessStatus() {
		return s_DProcessStatus;
	}
	public void setS_DProcessStatus(String s_DProcessStatus) {
		this.s_DProcessStatus = s_DProcessStatus;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getOrderRelatedBillingStatus() {
		return orderRelatedBillingStatus;
	}
	public void setOrderRelatedBillingStatus(String orderRelatedBillingStatus) {
		this.orderRelatedBillingStatus = orderRelatedBillingStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public ScheduleLine getScheduleLine() {
		return scheduleLine;
	}
	public void setScheduleLine(ScheduleLine scheduleLine) {
		this.scheduleLine = scheduleLine;
	}
	
	public Addresse getAddresse() {
		return addresse;
	}
	public void setAddresse(Addresse addresse) {
		this.addresse = addresse;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PricingDate == null) ? 0 : PricingDate.hashCode());
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((batch == null) ? 0 : batch.hashCode());
		result = prime * result + ((businessPartner == null) ? 0 : businessPartner.hashCode());
		result = prime * result + ((customerPaymentTerms == null) ? 0 : customerPaymentTerms.hashCode());
		result = prime * result + ((deliveryGroup == null) ? 0 : deliveryGroup.hashCode());
		result = prime * result + ((deliveryPriority == null) ? 0 : deliveryPriority.hashCode());
		result = prime * result + ((deliveryStatus == null) ? 0 : deliveryStatus.hashCode());
		result = prime * result + ((higherLevelItem == null) ? 0 : higherLevelItem.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((incotermsClassification == null) ? 0 : incotermsClassification.hashCode());
		result = prime * result + ((incotermsLocation1 == null) ? 0 : incotermsLocation1.hashCode());
		result = prime * result + ((incotermsLocation2 == null) ? 0 : incotermsLocation2.hashCode());
		result = prime * result + ((incotermsTransferLocation == null) ? 0 : incotermsTransferLocation.hashCode());
		result = prime * result + ((itemBillingBlockReason == null) ? 0 : itemBillingBlockReason.hashCode());
		result = prime * result + ((itemGrossWeight == null) ? 0 : itemGrossWeight.hashCode());
		result = prime * result + ((itemNetWeight == null) ? 0 : itemNetWeight.hashCode());
		result = prime * result + ((itemVolume == null) ? 0 : itemVolume.hashCode());
		result = prime * result + ((itemVolumeUnit == null) ? 0 : itemVolumeUnit.hashCode());
		result = prime * result + ((itemWeightUnit == null) ? 0 : itemWeightUnit.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((materialByCustomer == null) ? 0 : materialByCustomer.hashCode());
		result = prime * result + ((materialGroup == null) ? 0 : materialGroup.hashCode());
		result = prime * result + ((materialPricingGroup == null) ? 0 : materialPricingGroup.hashCode());
		result = prime * result + ((netAmount == null) ? 0 : netAmount.hashCode());
		result = prime * result + ((orderRelatedBillingStatus == null) ? 0 : orderRelatedBillingStatus.hashCode());
		result = prime * result + ((pricingElement == null) ? 0 : pricingElement.hashCode());
		result = prime * result + ((productionPlant == null) ? 0 : productionPlant.hashCode());
		result = prime * result + ((purchaseOrderByCustomer == null) ? 0 : purchaseOrderByCustomer.hashCode());
		result = prime * result + ((requestedQuantity == null) ? 0 : requestedQuantity.hashCode());
		result = prime * result + ((requestedQuantityUnit == null) ? 0 : requestedQuantityUnit.hashCode());
		result = prime * result + ((s_DProcessStatus == null) ? 0 : s_DProcessStatus.hashCode());
		result = prime * result + ((salesDocumentRjcnReason == null) ? 0 : salesDocumentRjcnReason.hashCode());
		result = prime * result + ((salesOrderItemCategory == null) ? 0 : salesOrderItemCategory.hashCode());
		result = prime * result + ((salesOrderItemText == null) ? 0 : salesOrderItemText.hashCode());
		result = prime * result + ((scheduleLine == null) ? 0 : scheduleLine.hashCode());
		result = prime * result + ((shippingPoint == null) ? 0 : shippingPoint.hashCode());
		result = prime * result + ((shippingType == null) ? 0 : shippingType.hashCode());
		result = prime * result + ((storageLocation == null) ? 0 : storageLocation.hashCode());
		result = prime * result + ((transactionCurrency == null) ? 0 : transactionCurrency.hashCode());
		result = prime * result + ((w_BSElement == null) ? 0 : w_BSElement.hashCode());
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
		SalesOrderItem other = (SalesOrderItem) obj;
		if (PricingDate == null) {
			if (other.PricingDate != null)
				return false;
		} else if (!PricingDate.equals(other.PricingDate))
			return false;
		if (batch == null) {
			if (other.batch != null)
				return false;
		} else if (!batch.equals(other.batch))
			return false;
		if (customerPaymentTerms == null) {
			if (other.customerPaymentTerms != null)
				return false;
		} else if (!customerPaymentTerms.equals(other.customerPaymentTerms))
			return false;
		if (deliveryGroup == null) {
			if (other.deliveryGroup != null)
				return false;
		} else if (!deliveryGroup.equals(other.deliveryGroup))
			return false;
		if (deliveryPriority == null) {
			if (other.deliveryPriority != null)
				return false;
		} else if (!deliveryPriority.equals(other.deliveryPriority))
			return false;
		if (deliveryStatus == null) {
			if (other.deliveryStatus != null)
				return false;
		} else if (!deliveryStatus.equals(other.deliveryStatus))
			return false;
		if (higherLevelItem == null) {
			if (other.higherLevelItem != null)
				return false;
		} else if (!higherLevelItem.equals(other.higherLevelItem))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (incotermsClassification == null) {
			if (other.incotermsClassification != null)
				return false;
		} else if (!incotermsClassification.equals(other.incotermsClassification))
			return false;
		if (incotermsLocation1 == null) {
			if (other.incotermsLocation1 != null)
				return false;
		} else if (!incotermsLocation1.equals(other.incotermsLocation1))
			return false;
		if (incotermsLocation2 == null) {
			if (other.incotermsLocation2 != null)
				return false;
		} else if (!incotermsLocation2.equals(other.incotermsLocation2))
			return false;
		if (incotermsTransferLocation == null) {
			if (other.incotermsTransferLocation != null)
				return false;
		} else if (!incotermsTransferLocation.equals(other.incotermsTransferLocation))
			return false;
		if (itemBillingBlockReason == null) {
			if (other.itemBillingBlockReason != null)
				return false;
		} else if (!itemBillingBlockReason.equals(other.itemBillingBlockReason))
			return false;
		if (itemGrossWeight == null) {
			if (other.itemGrossWeight != null)
				return false;
		} else if (!itemGrossWeight.equals(other.itemGrossWeight))
			return false;
		if (itemNetWeight == null) {
			if (other.itemNetWeight != null)
				return false;
		} else if (!itemNetWeight.equals(other.itemNetWeight))
			return false;
		if (itemVolume == null) {
			if (other.itemVolume != null)
				return false;
		} else if (!itemVolume.equals(other.itemVolume))
			return false;
		if (itemVolumeUnit == null) {
			if (other.itemVolumeUnit != null)
				return false;
		} else if (!itemVolumeUnit.equals(other.itemVolumeUnit))
			return false;
		if (itemWeightUnit == null) {
			if (other.itemWeightUnit != null)
				return false;
		} else if (!itemWeightUnit.equals(other.itemWeightUnit))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (materialByCustomer == null) {
			if (other.materialByCustomer != null)
				return false;
		} else if (!materialByCustomer.equals(other.materialByCustomer))
			return false;
		if (materialGroup == null) {
			if (other.materialGroup != null)
				return false;
		} else if (!materialGroup.equals(other.materialGroup))
			return false;
		if (materialPricingGroup == null) {
			if (other.materialPricingGroup != null)
				return false;
		} else if (!materialPricingGroup.equals(other.materialPricingGroup))
			return false;
		if (netAmount == null) {
			if (other.netAmount != null)
				return false;
		} else if (!netAmount.equals(other.netAmount))
			return false;
		if (orderRelatedBillingStatus == null) {
			if (other.orderRelatedBillingStatus != null)
				return false;
		} else if (!orderRelatedBillingStatus.equals(other.orderRelatedBillingStatus))
			return false;
		if (productionPlant == null) {
			if (other.productionPlant != null)
				return false;
		} else if (!productionPlant.equals(other.productionPlant))
			return false;
		if (purchaseOrderByCustomer == null) {
			if (other.purchaseOrderByCustomer != null)
				return false;
		} else if (!purchaseOrderByCustomer.equals(other.purchaseOrderByCustomer))
			return false;
		if (requestedQuantity == null) {
			if (other.requestedQuantity != null)
				return false;
		} else if (!requestedQuantity.equals(other.requestedQuantity))
			return false;
		if (requestedQuantityUnit == null) {
			if (other.requestedQuantityUnit != null)
				return false;
		} else if (!requestedQuantityUnit.equals(other.requestedQuantityUnit))
			return false;
		if (s_DProcessStatus == null) {
			if (other.s_DProcessStatus != null)
				return false;
		} else if (!s_DProcessStatus.equals(other.s_DProcessStatus))
			return false;
		if (salesDocumentRjcnReason == null) {
			if (other.salesDocumentRjcnReason != null)
				return false;
		} else if (!salesDocumentRjcnReason.equals(other.salesDocumentRjcnReason))
			return false;
		if (salesOrderItemCategory == null) {
			if (other.salesOrderItemCategory != null)
				return false;
		} else if (!salesOrderItemCategory.equals(other.salesOrderItemCategory))
			return false;
		if (salesOrderItemText == null) {
			if (other.salesOrderItemText != null)
				return false;
		} else if (!salesOrderItemText.equals(other.salesOrderItemText))
			return false;
		if (scheduleLine == null) {
			if (other.scheduleLine != null)
				return false;
		} else if (!scheduleLine.equals(other.scheduleLine))
			return false;
		if (shippingPoint == null) {
			if (other.shippingPoint != null)
				return false;
		} else if (!shippingPoint.equals(other.shippingPoint))
			return false;
		if (shippingType == null) {
			if (other.shippingType != null)
				return false;
		} else if (!shippingType.equals(other.shippingType))
			return false;
		if (storageLocation == null) {
			if (other.storageLocation != null)
				return false;
		} else if (!storageLocation.equals(other.storageLocation))
			return false;
		if (transactionCurrency == null) {
			if (other.transactionCurrency != null)
				return false;
		} else if (!transactionCurrency.equals(other.transactionCurrency))
			return false;
		if (w_BSElement == null) {
			if (other.w_BSElement != null)
				return false;
		} else if (!w_BSElement.equals(other.w_BSElement))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SalesOrderItem [id=" + id + ",  higherLevelItem=" + higherLevelItem
				+ ", salesOrderItemCategory=" + salesOrderItemCategory + ", salesOrderItemText=" + salesOrderItemText
				+ ", purchaseOrderByCustomer=" + purchaseOrderByCustomer + ", material=" + material
				+ ", materialByCustomer=" + materialByCustomer + ", PricingDate=" + PricingDate + ", requestedQuantity="
				+ requestedQuantity + ", requestedQuantityUnit=" + requestedQuantityUnit + ", itemGrossWeight="
				+ itemGrossWeight + ", itemNetWeight=" + itemNetWeight + ", itemWeightUnit=" + itemWeightUnit
				+ ", itemVolume=" + itemVolume + ", itemVolumeUnit=" + itemVolumeUnit + ", transactionCurrency="
				+ transactionCurrency + ", netAmount=" + netAmount + ", materialGroup=" + materialGroup
				+ ", materialPricingGroup=" + materialPricingGroup + ", batch=" + batch + ", productionPlant="
				+ productionPlant + ", storageLocation=" + storageLocation + ", deliveryGroup=" + deliveryGroup
				+ ", shippingPoint=" + shippingPoint + ", shippingType=" + shippingType + ", deliveryPriority="
				+ deliveryPriority + ", incotermsClassification=" + incotermsClassification
				+ ", incotermsTransferLocation=" + incotermsTransferLocation + ", incotermsLocation1="
				+ incotermsLocation1 + ", incotermsLocation2=" + incotermsLocation2 + ", customerPaymentTerms="
				+ customerPaymentTerms + ", salesDocumentRjcnReason=" + salesDocumentRjcnReason
				+ ", itemBillingBlockReason=" + itemBillingBlockReason + ", w_BSElement=" + w_BSElement
				+ ", s_DProcessStatus=" + s_DProcessStatus + ", deliveryStatus=" + deliveryStatus
				+ ", orderRelatedBillingStatus=" + orderRelatedBillingStatus + "]";
	}
	
	
	

	
	
	
}
