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

public class PricingElement  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EdmKey
	@Column
	private Long id;
	@Column private static final long serialVersionUID = 1L;
	
	@OneToOne
	@XmlInverseReference(mappedBy="pricingElement")
	@EdmNavigationProperty(name = "SalesOrders", toType = model.SalesOrder.class, toMultiplicity = Multiplicity.ONE)
	private SalesOrder salesOrder;
	
	@OneToOne
	@XmlInverseReference(mappedBy="pricingElement")
	private SalesOrderItem salesOrderItem;
	
	
	//@Column private String SalesOrder;//": "string",
	@Column private String SalesOrderItem;//": "string",
	@Column private String PricingProcedureStep;//": "string",
	@Column private String PricingProcedureCounter;//": "string",
	@Column private String ConditionType;//": "string",
	@Column private String PricingDateTime;//": "string",
	@Column private String ConditionCalculationType;//": "string",
	@Column private String ConditionBaseValue;//": "Unknown Type: string,null",
	@Column private String ConditionRateValue;//": "Unknown Type: string,null",
	@Column private String ConditionCurrency;//": "string",
	@Column private Long ConditionQuantity;//": "99999",
	@Column private String ConditionQuantityUnit;//": "string",
	@Column private String ConditionCategory;//": "string",
	@Column private boolean ConditionIsForStatistics;//": "Unknown Type: boolean,null",
	@Column private String PricingScaleType;//": "string",
	@Column private boolean IsRelevantForAccrual;//": "Unknown Type: boolean,null",
	@Column private String CndnIsRelevantForInvoiceList;//": "string",
	@Column private String ConditionOrigin;//": "string",
	@Column private String IsGroupCondition;//": "string",
	@Column private String ConditionRecord;//": "string",
	@Column private String ConditionSequentialNumber;//": "string",
	@Column private String TaxCode;//": "string",
	@Column private String WithholdingTaxCode;//": "string",
	@Column private Double CndnRoundingOffDiffAmount;//": "999.999",
	@Column private String ConditionAmount;//": "Unknown Type: string,null",
	@Column private String TransactionCurrency;//": "string",
	@Column private String ConditionControl;//": "string",
	@Column private String ConditionInactiveReason;//": "string",
	@Column private String ConditionClass;//": "string",
	@Column private String PrcgProcedureCounterForHeader;//": "string",
	@Column private Double FactorForConditionBasisValue;//": 3.14,
	@Column private String StructureCondition;//": "string",
	@Column private Double PeriodFactorForCndnBasisValue;//": 3.14,
	@Column private String PricingScaleBasis;//": "string",
	@Column private String ConditionScaleBasisValue;//": "Unknown Type: string,null",
	@Column private String ConditionScaleBasisUnit;//": "string",
	@Column private String ConditionScaleBasisCurrency;//": "string",
	@Column private boolean CndnIsRelevantForIntcoBilling;//": "Unknown Type: boolean,null",
	@Column private boolean ConditionIsManuallyChanged;//": "Unknown Type: boolean,null",
	@Column private boolean ConditionIsForConfiguration;//": "Unknown Type: boolean,null",
	@Column private String VariantCondition;//": "string"
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	public SalesOrder getSalesOrder() {
		return salesOrder;
	}
	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}
	public String getSalesOrderItem() {
		return SalesOrderItem;
	}
	public void setSalesOrderItem(String salesOrderItem) {
		SalesOrderItem = salesOrderItem;
	}
	public String getPricingProcedureStep() {
		return PricingProcedureStep;
	}
	public void setPricingProcedureStep(String pricingProcedureStep) {
		PricingProcedureStep = pricingProcedureStep;
	}
	public String getPricingProcedureCounter() {
		return PricingProcedureCounter;
	}
	public void setPricingProcedureCounter(String pricingProcedureCounter) {
		PricingProcedureCounter = pricingProcedureCounter;
	}
	public String getConditionType() {
		return ConditionType;
	}
	public void setConditionType(String conditionType) {
		ConditionType = conditionType;
	}
	public String getPricingDateTime() {
		return PricingDateTime;
	}
	public void setPricingDateTime(String pricingDateTime) {
		PricingDateTime = pricingDateTime;
	}
	public String getConditionCalculationType() {
		return ConditionCalculationType;
	}
	public void setConditionCalculationType(String conditionCalculationType) {
		ConditionCalculationType = conditionCalculationType;
	}
	public String getConditionBaseValue() {
		return ConditionBaseValue;
	}
	public void setConditionBaseValue(String conditionBaseValue) {
		ConditionBaseValue = conditionBaseValue;
	}
	public String getConditionRateValue() {
		return ConditionRateValue;
	}
	public void setConditionRateValue(String conditionRateValue) {
		ConditionRateValue = conditionRateValue;
	}
	public String getConditionCurrency() {
		return ConditionCurrency;
	}
	public void setConditionCurrency(String conditionCurrency) {
		ConditionCurrency = conditionCurrency;
	}
	public Long getConditionQuantity() {
		return ConditionQuantity;
	}
	public void setConditionQuantity(Long conditionQuantity) {
		ConditionQuantity = conditionQuantity;
	}
	public String getConditionQuantityUnit() {
		return ConditionQuantityUnit;
	}
	public void setConditionQuantityUnit(String conditionQuantityUnit) {
		ConditionQuantityUnit = conditionQuantityUnit;
	}
	public String getConditionCategory() {
		return ConditionCategory;
	}
	public void setConditionCategory(String conditionCategory) {
		ConditionCategory = conditionCategory;
	}
	public boolean isConditionIsForStatistics() {
		return ConditionIsForStatistics;
	}
	public void setConditionIsForStatistics(boolean conditionIsForStatistics) {
		ConditionIsForStatistics = conditionIsForStatistics;
	}
	public String getPricingScaleType() {
		return PricingScaleType;
	}
	public void setPricingScaleType(String pricingScaleType) {
		PricingScaleType = pricingScaleType;
	}
	public boolean isIsRelevantForAccrual() {
		return IsRelevantForAccrual;
	}
	public void setIsRelevantForAccrual(boolean isRelevantForAccrual) {
		IsRelevantForAccrual = isRelevantForAccrual;
	}
	public String getCndnIsRelevantForInvoiceList() {
		return CndnIsRelevantForInvoiceList;
	}
	public void setCndnIsRelevantForInvoiceList(String cndnIsRelevantForInvoiceList) {
		CndnIsRelevantForInvoiceList = cndnIsRelevantForInvoiceList;
	}
	public String getConditionOrigin() {
		return ConditionOrigin;
	}
	public void setConditionOrigin(String conditionOrigin) {
		ConditionOrigin = conditionOrigin;
	}
	public String getIsGroupCondition() {
		return IsGroupCondition;
	}
	public void setIsGroupCondition(String isGroupCondition) {
		IsGroupCondition = isGroupCondition;
	}
	public String getConditionRecord() {
		return ConditionRecord;
	}
	public void setConditionRecord(String conditionRecord) {
		ConditionRecord = conditionRecord;
	}
	public String getConditionSequentialNumber() {
		return ConditionSequentialNumber;
	}
	public void setConditionSequentialNumber(String conditionSequentialNumber) {
		ConditionSequentialNumber = conditionSequentialNumber;
	}
	public String getTaxCode() {
		return TaxCode;
	}
	public void setTaxCode(String taxCode) {
		TaxCode = taxCode;
	}
	public String getWithholdingTaxCode() {
		return WithholdingTaxCode;
	}
	public void setWithholdingTaxCode(String withholdingTaxCode) {
		WithholdingTaxCode = withholdingTaxCode;
	}
	public Double getCndnRoundingOffDiffAmount() {
		return CndnRoundingOffDiffAmount;
	}
	public void setCndnRoundingOffDiffAmount(Double cndnRoundingOffDiffAmount) {
		CndnRoundingOffDiffAmount = cndnRoundingOffDiffAmount;
	}
	public String getConditionAmount() {
		return ConditionAmount;
	}
	public void setConditionAmount(String conditionAmount) {
		ConditionAmount = conditionAmount;
	}
	public String getTransactionCurrency() {
		return TransactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		TransactionCurrency = transactionCurrency;
	}
	public String getConditionControl() {
		return ConditionControl;
	}
	public void setConditionControl(String conditionControl) {
		ConditionControl = conditionControl;
	}
	public String getConditionInactiveReason() {
		return ConditionInactiveReason;
	}
	public void setConditionInactiveReason(String conditionInactiveReason) {
		ConditionInactiveReason = conditionInactiveReason;
	}
	public String getConditionClass() {
		return ConditionClass;
	}
	public void setConditionClass(String conditionClass) {
		ConditionClass = conditionClass;
	}
	public String getPrcgProcedureCounterForHeader() {
		return PrcgProcedureCounterForHeader;
	}
	public void setPrcgProcedureCounterForHeader(String prcgProcedureCounterForHeader) {
		PrcgProcedureCounterForHeader = prcgProcedureCounterForHeader;
	}
	public Double getFactorForConditionBasisValue() {
		return FactorForConditionBasisValue;
	}
	public void setFactorForConditionBasisValue(Double factorForConditionBasisValue) {
		FactorForConditionBasisValue = factorForConditionBasisValue;
	}
	public String getStructureCondition() {
		return StructureCondition;
	}
	public void setStructureCondition(String structureCondition) {
		StructureCondition = structureCondition;
	}
	public Double getPeriodFactorForCndnBasisValue() {
		return PeriodFactorForCndnBasisValue;
	}
	public void setPeriodFactorForCndnBasisValue(Double periodFactorForCndnBasisValue) {
		PeriodFactorForCndnBasisValue = periodFactorForCndnBasisValue;
	}
	public String getPricingScaleBasis() {
		return PricingScaleBasis;
	}
	public void setPricingScaleBasis(String pricingScaleBasis) {
		PricingScaleBasis = pricingScaleBasis;
	}
	public String getConditionScaleBasisValue() {
		return ConditionScaleBasisValue;
	}
	public void setConditionScaleBasisValue(String conditionScaleBasisValue) {
		ConditionScaleBasisValue = conditionScaleBasisValue;
	}
	public String getConditionScaleBasisUnit() {
		return ConditionScaleBasisUnit;
	}
	public void setConditionScaleBasisUnit(String conditionScaleBasisUnit) {
		ConditionScaleBasisUnit = conditionScaleBasisUnit;
	}
	public String getConditionScaleBasisCurrency() {
		return ConditionScaleBasisCurrency;
	}
	public void setConditionScaleBasisCurrency(String conditionScaleBasisCurrency) {
		ConditionScaleBasisCurrency = conditionScaleBasisCurrency;
	}
	public boolean isCndnIsRelevantForIntcoBilling() {
		return CndnIsRelevantForIntcoBilling;
	}
	public void setCndnIsRelevantForIntcoBilling(boolean cndnIsRelevantForIntcoBilling) {
		CndnIsRelevantForIntcoBilling = cndnIsRelevantForIntcoBilling;
	}
	public boolean isConditionIsManuallyChanged() {
		return ConditionIsManuallyChanged;
	}
	public void setConditionIsManuallyChanged(boolean conditionIsManuallyChanged) {
		ConditionIsManuallyChanged = conditionIsManuallyChanged;
	}
	public boolean isConditionIsForConfiguration() {
		return ConditionIsForConfiguration;
	}
	public void setConditionIsForConfiguration(boolean conditionIsForConfiguration) {
		ConditionIsForConfiguration = conditionIsForConfiguration;
	}
	public String getVariantCondition() {
		return VariantCondition;
	}
	public void setVariantCondition(String variantCondition) {
		VariantCondition = variantCondition;
	}
	
	@Override
	public String toString() {
		return "PricingElement [id=" + id + ", salesOrder Id=" + salesOrder.getId() + ", SalesOrder user="
				+ salesOrder.getCreatedByUser() + ", SalesOrderItem=" + SalesOrderItem + ", PricingProcedureStep=" + PricingProcedureStep
				+ ", PricingProcedureCounter=" + PricingProcedureCounter + ", ConditionType=" + ConditionType
				+ ", PricingDateTime=" + PricingDateTime + ", ConditionCalculationType=" + ConditionCalculationType
				+ ", ConditionBaseValue=" + ConditionBaseValue + ", ConditionRateValue=" + ConditionRateValue
				+ ", ConditionCurrency=" + ConditionCurrency + ", ConditionQuantity=" + ConditionQuantity
				+ ", ConditionQuantityUnit=" + ConditionQuantityUnit + ", ConditionCategory=" + ConditionCategory
				+ ", ConditionIsForStatistics=" + ConditionIsForStatistics + ", PricingScaleType=" + PricingScaleType
				+ ", IsRelevantForAccrual=" + IsRelevantForAccrual + ", CndnIsRelevantForInvoiceList="
				+ CndnIsRelevantForInvoiceList + ", ConditionOrigin=" + ConditionOrigin + ", IsGroupCondition="
				+ IsGroupCondition + ", ConditionRecord=" + ConditionRecord + ", ConditionSequentialNumber="
				+ ConditionSequentialNumber + ", TaxCode=" + TaxCode + ", WithholdingTaxCode=" + WithholdingTaxCode
				+ ", CndnRoundingOffDiffAmount=" + CndnRoundingOffDiffAmount + ", ConditionAmount=" + ConditionAmount
				+ ", TransactionCurrency=" + TransactionCurrency + ", ConditionControl=" + ConditionControl
				+ ", ConditionInactiveReason=" + ConditionInactiveReason + ", ConditionClass=" + ConditionClass
				+ ", PrcgProcedureCounterForHeader=" + PrcgProcedureCounterForHeader + ", FactorForConditionBasisValue="
				+ FactorForConditionBasisValue + ", StructureCondition=" + StructureCondition
				+ ", PeriodFactorForCndnBasisValue=" + PeriodFactorForCndnBasisValue + ", PricingScaleBasis="
				+ PricingScaleBasis + ", ConditionScaleBasisValue=" + ConditionScaleBasisValue
				+ ", ConditionScaleBasisUnit=" + ConditionScaleBasisUnit + ", ConditionScaleBasisCurrency="
				+ ConditionScaleBasisCurrency + ", CndnIsRelevantForIntcoBilling=" + CndnIsRelevantForIntcoBilling
				+ ", ConditionIsManuallyChanged=" + ConditionIsManuallyChanged + ", ConditionIsForConfiguration="
				+ ConditionIsForConfiguration + ", VariantCondition=" + VariantCondition + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (CndnIsRelevantForIntcoBilling ? 1231 : 1237);
		result = prime * result
				+ ((CndnIsRelevantForInvoiceList == null) ? 0 : CndnIsRelevantForInvoiceList.hashCode());
		result = prime * result + ((CndnRoundingOffDiffAmount == null) ? 0 : CndnRoundingOffDiffAmount.hashCode());
		result = prime * result + ((ConditionAmount == null) ? 0 : ConditionAmount.hashCode());
		result = prime * result + ((ConditionBaseValue == null) ? 0 : ConditionBaseValue.hashCode());
		result = prime * result + ((ConditionCalculationType == null) ? 0 : ConditionCalculationType.hashCode());
		result = prime * result + ((ConditionCategory == null) ? 0 : ConditionCategory.hashCode());
		result = prime * result + ((ConditionClass == null) ? 0 : ConditionClass.hashCode());
		result = prime * result + ((ConditionControl == null) ? 0 : ConditionControl.hashCode());
		result = prime * result + ((ConditionCurrency == null) ? 0 : ConditionCurrency.hashCode());
		result = prime * result + ((ConditionInactiveReason == null) ? 0 : ConditionInactiveReason.hashCode());
		result = prime * result + (ConditionIsForConfiguration ? 1231 : 1237);
		result = prime * result + (ConditionIsForStatistics ? 1231 : 1237);
		result = prime * result + (ConditionIsManuallyChanged ? 1231 : 1237);
		result = prime * result + ((ConditionOrigin == null) ? 0 : ConditionOrigin.hashCode());
		result = prime * result + ((ConditionQuantity == null) ? 0 : ConditionQuantity.hashCode());
		result = prime * result + ((ConditionQuantityUnit == null) ? 0 : ConditionQuantityUnit.hashCode());
		result = prime * result + ((ConditionRateValue == null) ? 0 : ConditionRateValue.hashCode());
		result = prime * result + ((ConditionRecord == null) ? 0 : ConditionRecord.hashCode());
		result = prime * result + ((ConditionScaleBasisCurrency == null) ? 0 : ConditionScaleBasisCurrency.hashCode());
		result = prime * result + ((ConditionScaleBasisUnit == null) ? 0 : ConditionScaleBasisUnit.hashCode());
		result = prime * result + ((ConditionScaleBasisValue == null) ? 0 : ConditionScaleBasisValue.hashCode());
		result = prime * result + ((ConditionSequentialNumber == null) ? 0 : ConditionSequentialNumber.hashCode());
		result = prime * result + ((ConditionType == null) ? 0 : ConditionType.hashCode());
		result = prime * result
				+ ((FactorForConditionBasisValue == null) ? 0 : FactorForConditionBasisValue.hashCode());
		result = prime * result + ((IsGroupCondition == null) ? 0 : IsGroupCondition.hashCode());
		result = prime * result + (IsRelevantForAccrual ? 1231 : 1237);
		result = prime * result
				+ ((PeriodFactorForCndnBasisValue == null) ? 0 : PeriodFactorForCndnBasisValue.hashCode());
		result = prime * result
				+ ((PrcgProcedureCounterForHeader == null) ? 0 : PrcgProcedureCounterForHeader.hashCode());
		result = prime * result + ((PricingDateTime == null) ? 0 : PricingDateTime.hashCode());
		result = prime * result + ((PricingProcedureCounter == null) ? 0 : PricingProcedureCounter.hashCode());
		result = prime * result + ((PricingProcedureStep == null) ? 0 : PricingProcedureStep.hashCode());
		result = prime * result + ((PricingScaleBasis == null) ? 0 : PricingScaleBasis.hashCode());
		result = prime * result + ((PricingScaleType == null) ? 0 : PricingScaleType.hashCode());
		
		result = prime * result + ((SalesOrderItem == null) ? 0 : SalesOrderItem.hashCode());
		result = prime * result + ((StructureCondition == null) ? 0 : StructureCondition.hashCode());
		result = prime * result + ((TaxCode == null) ? 0 : TaxCode.hashCode());
		result = prime * result + ((TransactionCurrency == null) ? 0 : TransactionCurrency.hashCode());
		result = prime * result + ((VariantCondition == null) ? 0 : VariantCondition.hashCode());
		result = prime * result + ((WithholdingTaxCode == null) ? 0 : WithholdingTaxCode.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salesOrder == null) ? 0 : salesOrder.hashCode());
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
		PricingElement other = (PricingElement) obj;
		if (CndnIsRelevantForIntcoBilling != other.CndnIsRelevantForIntcoBilling)
			return false;
		if (CndnIsRelevantForInvoiceList == null) {
			if (other.CndnIsRelevantForInvoiceList != null)
				return false;
		} else if (!CndnIsRelevantForInvoiceList.equals(other.CndnIsRelevantForInvoiceList))
			return false;
		if (CndnRoundingOffDiffAmount == null) {
			if (other.CndnRoundingOffDiffAmount != null)
				return false;
		} else if (!CndnRoundingOffDiffAmount.equals(other.CndnRoundingOffDiffAmount))
			return false;
		if (ConditionAmount == null) {
			if (other.ConditionAmount != null)
				return false;
		} else if (!ConditionAmount.equals(other.ConditionAmount))
			return false;
		if (ConditionBaseValue == null) {
			if (other.ConditionBaseValue != null)
				return false;
		} else if (!ConditionBaseValue.equals(other.ConditionBaseValue))
			return false;
		if (ConditionCalculationType == null) {
			if (other.ConditionCalculationType != null)
				return false;
		} else if (!ConditionCalculationType.equals(other.ConditionCalculationType))
			return false;
		if (ConditionCategory == null) {
			if (other.ConditionCategory != null)
				return false;
		} else if (!ConditionCategory.equals(other.ConditionCategory))
			return false;
		if (ConditionClass == null) {
			if (other.ConditionClass != null)
				return false;
		} else if (!ConditionClass.equals(other.ConditionClass))
			return false;
		if (ConditionControl == null) {
			if (other.ConditionControl != null)
				return false;
		} else if (!ConditionControl.equals(other.ConditionControl))
			return false;
		if (ConditionCurrency == null) {
			if (other.ConditionCurrency != null)
				return false;
		} else if (!ConditionCurrency.equals(other.ConditionCurrency))
			return false;
		if (ConditionInactiveReason == null) {
			if (other.ConditionInactiveReason != null)
				return false;
		} else if (!ConditionInactiveReason.equals(other.ConditionInactiveReason))
			return false;
		if (ConditionIsForConfiguration != other.ConditionIsForConfiguration)
			return false;
		if (ConditionIsForStatistics != other.ConditionIsForStatistics)
			return false;
		if (ConditionIsManuallyChanged != other.ConditionIsManuallyChanged)
			return false;
		if (ConditionOrigin == null) {
			if (other.ConditionOrigin != null)
				return false;
		} else if (!ConditionOrigin.equals(other.ConditionOrigin))
			return false;
		if (ConditionQuantity == null) {
			if (other.ConditionQuantity != null)
				return false;
		} else if (!ConditionQuantity.equals(other.ConditionQuantity))
			return false;
		if (ConditionQuantityUnit == null) {
			if (other.ConditionQuantityUnit != null)
				return false;
		} else if (!ConditionQuantityUnit.equals(other.ConditionQuantityUnit))
			return false;
		if (ConditionRateValue == null) {
			if (other.ConditionRateValue != null)
				return false;
		} else if (!ConditionRateValue.equals(other.ConditionRateValue))
			return false;
		if (ConditionRecord == null) {
			if (other.ConditionRecord != null)
				return false;
		} else if (!ConditionRecord.equals(other.ConditionRecord))
			return false;
		if (ConditionScaleBasisCurrency == null) {
			if (other.ConditionScaleBasisCurrency != null)
				return false;
		} else if (!ConditionScaleBasisCurrency.equals(other.ConditionScaleBasisCurrency))
			return false;
		if (ConditionScaleBasisUnit == null) {
			if (other.ConditionScaleBasisUnit != null)
				return false;
		} else if (!ConditionScaleBasisUnit.equals(other.ConditionScaleBasisUnit))
			return false;
		if (ConditionScaleBasisValue == null) {
			if (other.ConditionScaleBasisValue != null)
				return false;
		} else if (!ConditionScaleBasisValue.equals(other.ConditionScaleBasisValue))
			return false;
		if (ConditionSequentialNumber == null) {
			if (other.ConditionSequentialNumber != null)
				return false;
		} else if (!ConditionSequentialNumber.equals(other.ConditionSequentialNumber))
			return false;
		if (ConditionType == null) {
			if (other.ConditionType != null)
				return false;
		} else if (!ConditionType.equals(other.ConditionType))
			return false;
		if (FactorForConditionBasisValue == null) {
			if (other.FactorForConditionBasisValue != null)
				return false;
		} else if (!FactorForConditionBasisValue.equals(other.FactorForConditionBasisValue))
			return false;
		if (IsGroupCondition == null) {
			if (other.IsGroupCondition != null)
				return false;
		} else if (!IsGroupCondition.equals(other.IsGroupCondition))
			return false;
		if (IsRelevantForAccrual != other.IsRelevantForAccrual)
			return false;
		if (PeriodFactorForCndnBasisValue == null) {
			if (other.PeriodFactorForCndnBasisValue != null)
				return false;
		} else if (!PeriodFactorForCndnBasisValue.equals(other.PeriodFactorForCndnBasisValue))
			return false;
		if (PrcgProcedureCounterForHeader == null) {
			if (other.PrcgProcedureCounterForHeader != null)
				return false;
		} else if (!PrcgProcedureCounterForHeader.equals(other.PrcgProcedureCounterForHeader))
			return false;
		if (PricingDateTime == null) {
			if (other.PricingDateTime != null)
				return false;
		} else if (!PricingDateTime.equals(other.PricingDateTime))
			return false;
		if (PricingProcedureCounter == null) {
			if (other.PricingProcedureCounter != null)
				return false;
		} else if (!PricingProcedureCounter.equals(other.PricingProcedureCounter))
			return false;
		if (PricingProcedureStep == null) {
			if (other.PricingProcedureStep != null)
				return false;
		} else if (!PricingProcedureStep.equals(other.PricingProcedureStep))
			return false;
		if (PricingScaleBasis == null) {
			if (other.PricingScaleBasis != null)
				return false;
		} else if (!PricingScaleBasis.equals(other.PricingScaleBasis))
			return false;
		if (PricingScaleType == null) {
			if (other.PricingScaleType != null)
				return false;
		} else if (!PricingScaleType.equals(other.PricingScaleType))
			return false;
		
		if (SalesOrderItem == null) {
			if (other.SalesOrderItem != null)
				return false;
		} else if (!SalesOrderItem.equals(other.SalesOrderItem))
			return false;
		if (StructureCondition == null) {
			if (other.StructureCondition != null)
				return false;
		} else if (!StructureCondition.equals(other.StructureCondition))
			return false;
		if (TaxCode == null) {
			if (other.TaxCode != null)
				return false;
		} else if (!TaxCode.equals(other.TaxCode))
			return false;
		if (TransactionCurrency == null) {
			if (other.TransactionCurrency != null)
				return false;
		} else if (!TransactionCurrency.equals(other.TransactionCurrency))
			return false;
		if (VariantCondition == null) {
			if (other.VariantCondition != null)
				return false;
		} else if (!VariantCondition.equals(other.VariantCondition))
			return false;
		if (WithholdingTaxCode == null) {
			if (other.WithholdingTaxCode != null)
				return false;
		} else if (!WithholdingTaxCode.equals(other.WithholdingTaxCode))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salesOrder == null) {
			if (other.salesOrder != null)
				return false;
		} else if (!salesOrder.equals(other.salesOrder))
			return false;
		return true;
	}
	
	
	
}
