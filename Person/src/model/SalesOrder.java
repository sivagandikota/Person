package model;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;

import org.apache.olingo.odata2.api.annotation.edm.EdmComplexType;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty.Multiplicity;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;



/**
 * Entity implementation class for Entity: SalesOrder
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
@EdmEntityType(namespace = "odata2")
@EdmEntitySet(name = "SalesOrderDetails")
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
//@EdmComplexType(name = "SalesOrder")
public class SalesOrder implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="SALESORDERID")
    @EdmKey
    @EdmProperty
    private Long id;
	@Version @Column
	private Long version;
	@Column private static final long serialVersionUID = 1L;
	
	@EdmProperty @Column private String SalesOrderType;
	@EdmProperty @Column private String SalesOrganization;
	@EdmProperty @Column private String DistributionChannel;
	@EdmProperty @Column private String OrganizationDivision;
	@EdmProperty @Column private String SalesGroup;
	@EdmProperty @Column private String SalesOffice;
	@EdmProperty @Column private String SalesDistrict;
	@EdmProperty @Column private String SoldToParty;
	@EdmProperty @Column private Date CreationDate;
	@EdmProperty @Column private String CreatedByUser;
	@EdmProperty @Column private Date LastChangeDate;
	@EdmProperty @Column private Date LastChangeDateTime;
	@EdmProperty @Column private String PurchaseOrderByCustomer;
	@EdmProperty @Column private String CustomerPurchaseOrderType;
	@EdmProperty @Column private Date CustomerPurchaseOrderDate;
	@EdmProperty @Column private Date SalesOrderDate;
	@EdmProperty @Column private BigDecimal TotalNetAmount;
	@EdmProperty @Column private String TransactionCurrency;
	@EdmProperty @Column private String SDDocumentReason;
	@EdmProperty @Column private Date PricingDate;
	@EdmProperty @Column private Date RequestedDeliveryDate;
	@EdmProperty @Column private String ShippingCondition;
	@EdmProperty @Column private boolean  CompleteDeliveryIsDefined;
	@EdmProperty @Column private String  ShippingType;
	@EdmProperty @Column private String  HeaderBillingBlockReason;
	@EdmProperty @Column private String  DeliveryBlockReason;
	@EdmProperty @Column private String  IncotermsClassification;
	@EdmProperty @Column private String  IncotermsTransferLocation;
	@EdmProperty @Column private String  IncotermsLocation1;
	@EdmProperty @Column private String  IncotermsLocation2;
	@EdmProperty @Column private String  IncotermsVersion;
	@EdmProperty @Column private String  CustomerPaymentTerms;
	@EdmProperty @Column private String  PaymentMethod;
	@EdmProperty @Column private String  AssignmentReference;
	@EdmProperty @Column private String  OverallSDProcessStatus;
	@EdmProperty @Column private String  TotalCreditCheckStatus;
	@EdmProperty @Column private String  OverallTotalDeliveryStatus;
	@EdmProperty @Column private String  OverallSDDocumentRejectionSts;
	
	/*@OneToMany(cascade=CascadeType.ALL,targetEntity=model.SalesOrderItem.class) @XmlElementWrapper(name="SalesOrderItems")   @XmlInverseReference(mappedBy="salesOrder") 
	@JoinTable(name="SALESORDER_SALESORDERITEM", 
	          joinColumns=@JoinColumn(name="SALESORDER_ID"),
	          inverseJoinColumns=@JoinColumn(name="SALESORDERITEM_ID"))
	@EdmNavigationProperty(name = "SalesOrderItems", toType = model.SalesOrderItem.class, toMultiplicity = Multiplicity.MANY) 
	private Set <SalesOrderItem> salesOrderItem = new HashSet();*/
	@EdmNavigationProperty(name = "SalesOrderItemDetails", toType = model.SalesOrderItem.class, toMultiplicity = Multiplicity.MANY) @OneToMany(cascade=CascadeType.ALL,targetEntity=model.SalesOrderItem.class) @XmlElementWrapper(name="SalesOrderItems")   @XmlInverseReference(mappedBy="salesOrder")  private Set <SalesOrderItem> salesOrderItem = new HashSet();//@XmlElement(name="SalesOrderItem")     (mappedBy="salesOrder", cascade=CascadeType.ALL) @XmlInverseReference(mappedBy="salesOrder")
	@EdmNavigationProperty(name = "BusinessPartner", toType = model.BusinessPartner.class, toMultiplicity = Multiplicity.ONE) @OneToOne(cascade=CascadeType.ALL,targetEntity=model.BusinessPartner.class)  @XmlInverseReference(mappedBy="salesOrder")  private BusinessPartner businessPartner;//@XmlElement(name="BusinessPartner")
	@EdmNavigationProperty(name = "PricingElement", toType = model.PricingElement.class, toMultiplicity = Multiplicity.ONE) @OneToOne(cascade=CascadeType.ALL,targetEntity=model.PricingElement.class)  @XmlInverseReference(mappedBy="salesOrder")  private PricingElement pricingElement;//@XmlElement(name="PricingElement")
	@EdmNavigationProperty(name = "ScheduleLine", toType = model.ScheduleLine.class, toMultiplicity = Multiplicity.ONE) @OneToOne(cascade=CascadeType.ALL,targetEntity=model.ScheduleLine.class)  @XmlInverseReference(mappedBy="salesOrder")  private ScheduleLine scheduleLine;//@XmlElement(name="ScheduleLine")
	@EdmNavigationProperty(name = "Addresse", toType = model.Addresse.class, toMultiplicity = Multiplicity.ONE) @OneToOne(cascade=CascadeType.ALL,targetEntity=model.Addresse.class)  @XmlInverseReference(mappedBy="salesOrder")  private Addresse addresse;


	public SalesOrder() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getSalesOrderType() {
		return SalesOrderType;
	}
	public void setSalesOrderType(String salesOrderType) {
		SalesOrderType = salesOrderType;
	}
	public String getSalesOrganization() {
		return SalesOrganization;
	}
	public void setSalesOrganization(String salesOrganization) {
		SalesOrganization = salesOrganization;
	}
	public String getDistributionChannel() {
		return DistributionChannel;
	}
	public void setDistributionChannel(String distributionChannel) {
		DistributionChannel = distributionChannel;
	}
	public String getOrganizationDivision() {
		return OrganizationDivision;
	}
	public void setOrganizationDivision(String organizationDivision) {
		OrganizationDivision = organizationDivision;
	}
	public String getSalesGroup() {
		return SalesGroup;
	}
	public void setSalesGroup(String salesGroup) {
		SalesGroup = salesGroup;
	}
	public String getSalesOffice() {
		return SalesOffice;
	}
	public void setSalesOffice(String salesOffice) {
		SalesOffice = salesOffice;
	}
	public String getSalesDistrict() {
		return SalesDistrict;
	}
	public void setSalesDistrict(String salesDistrict) {
		SalesDistrict = salesDistrict;
	}
	public String getSoldToParty() {
		return SoldToParty;
	}
	public void setSoldToParty(String soldToParty) {
		SoldToParty = soldToParty;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	public String getCreatedByUser() {
		return CreatedByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		CreatedByUser = createdByUser;
	}
	public Date getLastChangeDate() {
		return LastChangeDate;
	}
	public void setLastChangeDate(Date lastChangeDate) {
		LastChangeDate = lastChangeDate;
	}
	public Date getLastChangeDateTime() {
		return LastChangeDateTime;
	}
	public void setLastChangeDateTime(Date lastChangeDateTime) {
		LastChangeDateTime = lastChangeDateTime;
	}
	public String getPurchaseOrderByCustomer() {
		return PurchaseOrderByCustomer;
	}
	public void setPurchaseOrderByCustomer(String purchaseOrderByCustomer) {
		PurchaseOrderByCustomer = purchaseOrderByCustomer;
	}
	public String getCustomerPurchaseOrderType() {
		return CustomerPurchaseOrderType;
	}
	public void setCustomerPurchaseOrderType(String customerPurchaseOrderType) {
		CustomerPurchaseOrderType = customerPurchaseOrderType;
	}
	public Date getCustomerPurchaseOrderDate() {
		return CustomerPurchaseOrderDate;
	}
	public void setCustomerPurchaseOrderDate(Date customerPurchaseOrderDate) {
		CustomerPurchaseOrderDate = customerPurchaseOrderDate;
	}
	public Date getSalesOrderDate() {
		return SalesOrderDate;
	}
	public void setSalesOrderDate(Date salesOrderDate) {
		SalesOrderDate = salesOrderDate;
	}
	public BigDecimal getTotalNetAmount() {
		return TotalNetAmount;
	}
	public void setTotalNetAmount(BigDecimal totalNetAmount) {
		TotalNetAmount = totalNetAmount;
	}
	public String getTransactionCurrency() {
		return TransactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		TransactionCurrency = transactionCurrency;
	}
	public String getSDDocumentReason() {
		return SDDocumentReason;
	}
	public void setSDDocumentReason(String sDDocumentReason) {
		SDDocumentReason = sDDocumentReason;
	}
	public Date getPricingDate() {
		return PricingDate;
	}
	public void setPricingDate(Date pricingDate) {
		PricingDate = pricingDate;
	}
	public Date getRequestedDeliveryDate() {
		return RequestedDeliveryDate;
	}
	public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
		RequestedDeliveryDate = requestedDeliveryDate;
	}
	public String getShippingCondition() {
		return ShippingCondition;
	}
	public void setShippingCondition(String shippingCondition) {
		ShippingCondition = shippingCondition;
	}
	public boolean isCompleteDeliveryIsDefined() {
		return CompleteDeliveryIsDefined;
	}
	public void setCompleteDeliveryIsDefined(boolean completeDeliveryIsDefined) {
		CompleteDeliveryIsDefined = completeDeliveryIsDefined;
	}
	public String getShippingType() {
		return ShippingType;
	}
	public void setShippingType(String shippingType) {
		ShippingType = shippingType;
	}
	public String getHeaderBillingBlockReason() {
		return HeaderBillingBlockReason;
	}
	public void setHeaderBillingBlockReason(String headerBillingBlockReason) {
		HeaderBillingBlockReason = headerBillingBlockReason;
	}
	public String getDeliveryBlockReason() {
		return DeliveryBlockReason;
	}
	public void setDeliveryBlockReason(String deliveryBlockReason) {
		DeliveryBlockReason = deliveryBlockReason;
	}
	public String getIncotermsClassification() {
		return IncotermsClassification;
	}
	public void setIncotermsClassification(String incotermsClassification) {
		IncotermsClassification = incotermsClassification;
	}
	public String getIncotermsTransferLocation() {
		return IncotermsTransferLocation;
	}
	public void setIncotermsTransferLocation(String incotermsTransferLocation) {
		IncotermsTransferLocation = incotermsTransferLocation;
	}
	public String getIncotermsLocation1() {
		return IncotermsLocation1;
	}
	public void setIncotermsLocation1(String incotermsLocation1) {
		IncotermsLocation1 = incotermsLocation1;
	}
	public String getIncotermsLocation2() {
		return IncotermsLocation2;
	}
	public void setIncotermsLocation2(String incotermsLocation2) {
		IncotermsLocation2 = incotermsLocation2;
	}
	public String getIncotermsVersion() {
		return IncotermsVersion;
	}
	public void setIncotermsVersion(String incotermsVersion) {
		IncotermsVersion = incotermsVersion;
	}
	public String getCustomerPaymentTerms() {
		return CustomerPaymentTerms;
	}
	public void setCustomerPaymentTerms(String customerPaymentTerms) {
		CustomerPaymentTerms = customerPaymentTerms;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	public String getAssignmentReference() {
		return AssignmentReference;
	}
	public void setAssignmentReference(String assignmentReference) {
		AssignmentReference = assignmentReference;
	}
	public String getOverallSDProcessStatus() {
		return OverallSDProcessStatus;
	}
	public void setOverallSDProcessStatus(String overallSDProcessStatus) {
		OverallSDProcessStatus = overallSDProcessStatus;
	}
	public String getTotalCreditCheckStatus() {
		return TotalCreditCheckStatus;
	}
	public void setTotalCreditCheckStatus(String totalCreditCheckStatus) {
		TotalCreditCheckStatus = totalCreditCheckStatus;
	}
	public String getOverallTotalDeliveryStatus() {
		return OverallTotalDeliveryStatus;
	}
	public void setOverallTotalDeliveryStatus(String overallTotalDeliveryStatus) {
		OverallTotalDeliveryStatus = overallTotalDeliveryStatus;
	}
	public String getOverallSDDocumentRejectionSts() {
		return OverallSDDocumentRejectionSts;
	}
	public void setOverallSDDocumentRejectionSts(String overallSDDocumentRejectionSts) {
		OverallSDDocumentRejectionSts = overallSDDocumentRejectionSts;
	}
	
	public BusinessPartner getBusinessPartner() {
		return businessPartner;
	}
	public void setBusinessPartner(BusinessPartner partner) {
		this.businessPartner = partner;
	}
	public PricingElement getPricingElement() {
		return pricingElement;
	}
	public void setPricingElement(PricingElement pricing) {
		this.pricingElement = pricing;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Set<SalesOrderItem> getSalesOrderItem() {
		return salesOrderItem;
	}
	public void setSalesOrderItem(Set<SalesOrderItem> salesOrderItems) {
		this.salesOrderItem = salesOrderItems;
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
	
	public Long getVersion() {return this.version;}
	public void setVersion(Long ver) {this.version=ver;}
	

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AssignmentReference == null) ? 0 : AssignmentReference.hashCode());
		result = prime * result + (CompleteDeliveryIsDefined ? 1231 : 1237);
		result = prime * result + ((CreatedByUser == null) ? 0 : CreatedByUser.hashCode());
		result = prime * result + ((CreationDate == null) ? 0 : CreationDate.hashCode());
		result = prime * result + ((CustomerPaymentTerms == null) ? 0 : CustomerPaymentTerms.hashCode());
		result = prime * result + ((CustomerPurchaseOrderDate == null) ? 0 : CustomerPurchaseOrderDate.hashCode());
		result = prime * result + ((CustomerPurchaseOrderType == null) ? 0 : CustomerPurchaseOrderType.hashCode());
		result = prime * result + ((DeliveryBlockReason == null) ? 0 : DeliveryBlockReason.hashCode());
		result = prime * result + ((DistributionChannel == null) ? 0 : DistributionChannel.hashCode());
		result = prime * result + ((HeaderBillingBlockReason == null) ? 0 : HeaderBillingBlockReason.hashCode());
		result = prime * result + ((IncotermsClassification == null) ? 0 : IncotermsClassification.hashCode());
		result = prime * result + ((IncotermsLocation1 == null) ? 0 : IncotermsLocation1.hashCode());
		result = prime * result + ((IncotermsLocation2 == null) ? 0 : IncotermsLocation2.hashCode());
		result = prime * result + ((IncotermsTransferLocation == null) ? 0 : IncotermsTransferLocation.hashCode());
		result = prime * result + ((IncotermsVersion == null) ? 0 : IncotermsVersion.hashCode());
		result = prime * result + ((LastChangeDate == null) ? 0 : LastChangeDate.hashCode());
		result = prime * result + ((LastChangeDateTime == null) ? 0 : LastChangeDateTime.hashCode());
		result = prime * result + ((OrganizationDivision == null) ? 0 : OrganizationDivision.hashCode());
		result = prime * result
				+ ((OverallSDDocumentRejectionSts == null) ? 0 : OverallSDDocumentRejectionSts.hashCode());
		result = prime * result + ((OverallSDProcessStatus == null) ? 0 : OverallSDProcessStatus.hashCode());
		result = prime * result + ((OverallTotalDeliveryStatus == null) ? 0 : OverallTotalDeliveryStatus.hashCode());
		result = prime * result + ((PaymentMethod == null) ? 0 : PaymentMethod.hashCode());
		result = prime * result + ((PricingDate == null) ? 0 : PricingDate.hashCode());
		result = prime * result + ((PurchaseOrderByCustomer == null) ? 0 : PurchaseOrderByCustomer.hashCode());
		result = prime * result + ((RequestedDeliveryDate == null) ? 0 : RequestedDeliveryDate.hashCode());
		result = prime * result + ((SDDocumentReason == null) ? 0 : SDDocumentReason.hashCode());
		result = prime * result + ((SalesDistrict == null) ? 0 : SalesDistrict.hashCode());
		result = prime * result + ((SalesGroup == null) ? 0 : SalesGroup.hashCode());
		result = prime * result + ((SalesOffice == null) ? 0 : SalesOffice.hashCode());
		result = prime * result + ((SalesOrderDate == null) ? 0 : SalesOrderDate.hashCode());
		result = prime * result + ((SalesOrderType == null) ? 0 : SalesOrderType.hashCode());
		result = prime * result + ((SalesOrganization == null) ? 0 : SalesOrganization.hashCode());
		result = prime * result + ((ShippingCondition == null) ? 0 : ShippingCondition.hashCode());
		result = prime * result + ((ShippingType == null) ? 0 : ShippingType.hashCode());
		result = prime * result + ((SoldToParty == null) ? 0 : SoldToParty.hashCode());
		result = prime * result + ((TotalCreditCheckStatus == null) ? 0 : TotalCreditCheckStatus.hashCode());
		result = prime * result + ((TotalNetAmount == null) ? 0 : TotalNetAmount.hashCode());
		result = prime * result + ((TransactionCurrency == null) ? 0 : TransactionCurrency.hashCode());
		result = prime * result + ((addresse == null) ? 0 : addresse.hashCode());
		result = prime * result + ((businessPartner == null) ? 0 : businessPartner.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pricingElement == null) ? 0 : pricingElement.hashCode());
		result = prime * result + ((salesOrderItem == null) ? 0 : salesOrderItem.hashCode());
		result = prime * result + ((scheduleLine == null) ? 0 : scheduleLine.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		SalesOrder other = (SalesOrder) obj;
		if (AssignmentReference == null) {
			if (other.AssignmentReference != null)
				return false;
		} else if (!AssignmentReference.equals(other.AssignmentReference))
			return false;
		if (CompleteDeliveryIsDefined != other.CompleteDeliveryIsDefined)
			return false;
		if (CreatedByUser == null) {
			if (other.CreatedByUser != null)
				return false;
		} else if (!CreatedByUser.equals(other.CreatedByUser))
			return false;
		if (CreationDate == null) {
			if (other.CreationDate != null)
				return false;
		} else if (!CreationDate.equals(other.CreationDate))
			return false;
		if (CustomerPaymentTerms == null) {
			if (other.CustomerPaymentTerms != null)
				return false;
		} else if (!CustomerPaymentTerms.equals(other.CustomerPaymentTerms))
			return false;
		if (CustomerPurchaseOrderDate == null) {
			if (other.CustomerPurchaseOrderDate != null)
				return false;
		} else if (!CustomerPurchaseOrderDate.equals(other.CustomerPurchaseOrderDate))
			return false;
		if (CustomerPurchaseOrderType == null) {
			if (other.CustomerPurchaseOrderType != null)
				return false;
		} else if (!CustomerPurchaseOrderType.equals(other.CustomerPurchaseOrderType))
			return false;
		if (DeliveryBlockReason == null) {
			if (other.DeliveryBlockReason != null)
				return false;
		} else if (!DeliveryBlockReason.equals(other.DeliveryBlockReason))
			return false;
		if (DistributionChannel == null) {
			if (other.DistributionChannel != null)
				return false;
		} else if (!DistributionChannel.equals(other.DistributionChannel))
			return false;
		if (HeaderBillingBlockReason == null) {
			if (other.HeaderBillingBlockReason != null)
				return false;
		} else if (!HeaderBillingBlockReason.equals(other.HeaderBillingBlockReason))
			return false;
		if (IncotermsClassification == null) {
			if (other.IncotermsClassification != null)
				return false;
		} else if (!IncotermsClassification.equals(other.IncotermsClassification))
			return false;
		if (IncotermsLocation1 == null) {
			if (other.IncotermsLocation1 != null)
				return false;
		} else if (!IncotermsLocation1.equals(other.IncotermsLocation1))
			return false;
		if (IncotermsLocation2 == null) {
			if (other.IncotermsLocation2 != null)
				return false;
		} else if (!IncotermsLocation2.equals(other.IncotermsLocation2))
			return false;
		if (IncotermsTransferLocation == null) {
			if (other.IncotermsTransferLocation != null)
				return false;
		} else if (!IncotermsTransferLocation.equals(other.IncotermsTransferLocation))
			return false;
		if (IncotermsVersion == null) {
			if (other.IncotermsVersion != null)
				return false;
		} else if (!IncotermsVersion.equals(other.IncotermsVersion))
			return false;
		if (LastChangeDate == null) {
			if (other.LastChangeDate != null)
				return false;
		} else if (!LastChangeDate.equals(other.LastChangeDate))
			return false;
		if (LastChangeDateTime == null) {
			if (other.LastChangeDateTime != null)
				return false;
		} else if (!LastChangeDateTime.equals(other.LastChangeDateTime))
			return false;
		if (OrganizationDivision == null) {
			if (other.OrganizationDivision != null)
				return false;
		} else if (!OrganizationDivision.equals(other.OrganizationDivision))
			return false;
		if (OverallSDDocumentRejectionSts == null) {
			if (other.OverallSDDocumentRejectionSts != null)
				return false;
		} else if (!OverallSDDocumentRejectionSts.equals(other.OverallSDDocumentRejectionSts))
			return false;
		if (OverallSDProcessStatus == null) {
			if (other.OverallSDProcessStatus != null)
				return false;
		} else if (!OverallSDProcessStatus.equals(other.OverallSDProcessStatus))
			return false;
		if (OverallTotalDeliveryStatus == null) {
			if (other.OverallTotalDeliveryStatus != null)
				return false;
		} else if (!OverallTotalDeliveryStatus.equals(other.OverallTotalDeliveryStatus))
			return false;
		if (PaymentMethod == null) {
			if (other.PaymentMethod != null)
				return false;
		} else if (!PaymentMethod.equals(other.PaymentMethod))
			return false;
		if (PricingDate == null) {
			if (other.PricingDate != null)
				return false;
		} else if (!PricingDate.equals(other.PricingDate))
			return false;
		if (PurchaseOrderByCustomer == null) {
			if (other.PurchaseOrderByCustomer != null)
				return false;
		} else if (!PurchaseOrderByCustomer.equals(other.PurchaseOrderByCustomer))
			return false;
		if (RequestedDeliveryDate == null) {
			if (other.RequestedDeliveryDate != null)
				return false;
		} else if (!RequestedDeliveryDate.equals(other.RequestedDeliveryDate))
			return false;
		if (SDDocumentReason == null) {
			if (other.SDDocumentReason != null)
				return false;
		} else if (!SDDocumentReason.equals(other.SDDocumentReason))
			return false;
		if (SalesDistrict == null) {
			if (other.SalesDistrict != null)
				return false;
		} else if (!SalesDistrict.equals(other.SalesDistrict))
			return false;
		if (SalesGroup == null) {
			if (other.SalesGroup != null)
				return false;
		} else if (!SalesGroup.equals(other.SalesGroup))
			return false;
		if (SalesOffice == null) {
			if (other.SalesOffice != null)
				return false;
		} else if (!SalesOffice.equals(other.SalesOffice))
			return false;
		if (SalesOrderDate == null) {
			if (other.SalesOrderDate != null)
				return false;
		} else if (!SalesOrderDate.equals(other.SalesOrderDate))
			return false;
		if (SalesOrderType == null) {
			if (other.SalesOrderType != null)
				return false;
		} else if (!SalesOrderType.equals(other.SalesOrderType))
			return false;
		if (SalesOrganization == null) {
			if (other.SalesOrganization != null)
				return false;
		} else if (!SalesOrganization.equals(other.SalesOrganization))
			return false;
		if (ShippingCondition == null) {
			if (other.ShippingCondition != null)
				return false;
		} else if (!ShippingCondition.equals(other.ShippingCondition))
			return false;
		if (ShippingType == null) {
			if (other.ShippingType != null)
				return false;
		} else if (!ShippingType.equals(other.ShippingType))
			return false;
		if (SoldToParty == null) {
			if (other.SoldToParty != null)
				return false;
		} else if (!SoldToParty.equals(other.SoldToParty))
			return false;
		if (TotalCreditCheckStatus == null) {
			if (other.TotalCreditCheckStatus != null)
				return false;
		} else if (!TotalCreditCheckStatus.equals(other.TotalCreditCheckStatus))
			return false;
		if (TotalNetAmount == null) {
			if (other.TotalNetAmount != null)
				return false;
		} else if (!TotalNetAmount.equals(other.TotalNetAmount))
			return false;
		if (TransactionCurrency == null) {
			if (other.TransactionCurrency != null)
				return false;
		} else if (!TransactionCurrency.equals(other.TransactionCurrency))
			return false;
		if (addresse == null) {
			if (other.addresse != null)
				return false;
		} else if (!addresse.equals(other.addresse))
			return false;
		if (businessPartner == null) {
			if (other.businessPartner != null)
				return false;
		} else if (!businessPartner.equals(other.businessPartner))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pricingElement == null) {
			if (other.pricingElement != null)
				return false;
		} else if (!pricingElement.equals(other.pricingElement))
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
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SalesOrder [salesOrderId=" + id + ", SalesOrderType=" + SalesOrderType
				+ ", SalesOrganization=" + SalesOrganization + ", DistributionChannel=" + DistributionChannel
				+ ", OrganizationDivision=" + OrganizationDivision + ", SalesGroup=" + SalesGroup + ", SalesOffice="
				+ SalesOffice + ", SalesDistrict=" + SalesDistrict + ", SoldToParty=" + SoldToParty + ", CreationDate="
				+ CreationDate + ", CreatedByUser=" + CreatedByUser + ", LastChangeDate=" + LastChangeDate
				+ ", LastChangeDateTime=" + LastChangeDateTime + ", PurchaseOrderByCustomer=" + PurchaseOrderByCustomer
				+ ", CustomerPurchaseOrderType=" + CustomerPurchaseOrderType + ", CustomerPurchaseOrderDate="
				+ CustomerPurchaseOrderDate + ", SalesOrderDate=" + SalesOrderDate + ", TotalNetAmount="
				+ TotalNetAmount + ", TransactionCurrency=" + TransactionCurrency + ", SDDocumentReason="
				+ SDDocumentReason + ", PricingDate=" + PricingDate + ", RequestedDeliveryDate=" + RequestedDeliveryDate
				+ ", ShippingCondition=" + ShippingCondition + ", CompleteDeliveryIsDefined="
				+ CompleteDeliveryIsDefined + ", ShippingType=" + ShippingType + ", HeaderBillingBlockReason="
				+ HeaderBillingBlockReason + ", DeliveryBlockReason=" + DeliveryBlockReason
				+ ", IncotermsClassification=" + IncotermsClassification + ", IncotermsTransferLocation="
				+ IncotermsTransferLocation + ", IncotermsLocation1=" + IncotermsLocation1 + ", IncotermsLocation2="
				+ IncotermsLocation2 + ", IncotermsVersion=" + IncotermsVersion + ", CustomerPaymentTerms="
				+ CustomerPaymentTerms + ", PaymentMethod=" + PaymentMethod + ", AssignmentReference="
				+ AssignmentReference + ", OverallSDProcessStatus=" + OverallSDProcessStatus
				+ ", TotalCreditCheckStatus=" + TotalCreditCheckStatus + ", OverallTotalDeliveryStatus="
				+ OverallTotalDeliveryStatus + ", OverallSDDocumentRejectionSts=" + OverallSDDocumentRejectionSts
				+ ", salesOrderItems=" + salesOrderItem + ", businessPartner=" + businessPartner + ", pricingElement="
				+ pricingElement + ", scheduleLine=" + scheduleLine + "]";
	}
	
	
	
	
	
	
	
	
   
}
