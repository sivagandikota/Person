package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity
@Table
@PersistenceUnit(name="PERSONS")
@XmlRootElement
@EdmEntityType(namespace = "odata2")
@EdmEntitySet(name = "Product")
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)


public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EdmKey
    @EdmProperty
	private long ID;
	private static final long serialVersionUID = 1L;
	
    private String product;				//"Product": "string",
    private String productType;			//"ProductType": "string",
    private String CrossPlantStatus;	//"CrossPlantStatus": "string",
    private Date CrossPlantStatusValidityDate;	//"CrossPlantStatusValidityDate": "/Date(1492041600000)/",
    private Date CreationDate;					//"CreationDate": "/Date(1492041600000)/",
    private String CreatedByUser;		//"CreatedByUser": "string",
    private Date LastChangeDate;		//"LastChangeDate": "/Date(1492041600000)/",
    private String LastChangedByUser;	//"LastChangedByUser": "string",
    private Date LastChangeDateTime;	//"LastChangeDateTime": "/Date(1492098664000)/",
    private boolean IsMarkedForDeletion;	//"IsMarkedForDeletion": "Unknown Type: boolean,null",
    private String ProductOldID;		//"ProductOldID": "string",
    private double GrossWeight;			//"GrossWeight": "9999999999.999",
    private String PurchaseOrderQuantityUnit;	//"PurchaseOrderQuantityUnit": "string",
    private String SourceOfSupply;		//"SourceOfSupply": "string",
    private String WeightUnit;			//"WeightUnit": "string",
    private double NetWeight;			//"NetWeight": "9999999999.999",
    private String CountryOfOrigin;		//"CountryOfOrigin": "string",
    private String CompetitorID;		//"CompetitorID": "string",
    private String ProductGroup;		//"ProductGroup": "string",
    private String BaseUnit;			//"BaseUnit": "string",
    private String ItemCategoryGroup;	//"ItemCategoryGroup": "string",
    private String ProductHierarchy;	//"ProductHierarchy": "string",
    private String Division;			//"Division": "string",
    private String VarblPurOrdUnitIsActive;	//"VarblPurOrdUnitIsActive": "string",
    private String VolumeUnit;			//"VolumeUnit": "string",
    private double MaterialVolume;		//"MaterialVolume": "9999999999.999",
    private String ANPCode;				//"ANPCode": "string",
    private String Brand;				//"Brand": "string",
    private String ProcurementRule;		//"ProcurementRule": "string",
    private Date ValidityStartDate;		//"ValidityStartDate": "/Date(1492041600000)/",
    private String LowLevelCode;		//"LowLevelCode": "string",
    private String ProdNoInGenProdInPrepackProd;	//"ProdNoInGenProdInPrepackProd": "string",
    private String SerialIdentifierAssgmtProfile;	//"SerialIdentifierAssgmtProfile": "string",
    private String SizeOrDimensionText;				//"SizeOrDimensionText": "string",
    private String IndustryStandardName;			//"IndustryStandardName": "string",
    private String ProductStandardID;				//"ProductStandardID": "string",
    private String InternationalArticleNumberCat;	//"InternationalArticleNumberCat": "string",
    private boolean ProductIsConfigurable;			//"ProductIsConfigurable": "Unknown Type: boolean,null",
    private boolean IsBatchManagementRequired;		//"IsBatchManagementRequired": "Unknown Type: boolean,null",
    private String ExternalProductGroup;			//"ExternalProductGroup": "string",
    private String CrossPlantConfigurableProduct;	//"CrossPlantConfigurableProduct": "string",
    private String SerialNoExplicitnessLevel;		//"SerialNoExplicitnessLevel": "string",
    private String ProductManufacturerNumber;		//"ProductManufacturerNumber": "string",
    private String ManufacturerNumber;				//"ManufacturerNumber": "string",
    private String ManufacturerPartProfile;			//"ManufacturerPartProfile": "string",
    private String ChangeNumber;					//"ChangeNumber": "string",
    private String MaterialRevisionLevel;			//"MaterialRevisionLevel": "string",
    private String HandlingIndicator;				//"HandlingIndicator": "string",
    private String WarehouseProductGroup;			//"WarehouseProductGroup": "string",
    private String WarehouseStorageCondition;		//"WarehouseStorageCondition": "string",
    private String StandardHandlingUnitType;		//"StandardHandlingUnitType": "string",
    private String SerialNumberProfile;				//"SerialNumberProfile": "string",
    private String AdjustmentProfile;				//"AdjustmentProfile": "string",
    private String PreferredUnitOfMeasure;			//"PreferredUnitOfMeasure": "string",
    private boolean IsPilferable;					//"IsPilferable": "Unknown Type: boolean,null",
    private boolean IsRelevantForHzdsSubstances;	//"IsRelevantForHzdsSubstances": "Unknown Type: boolean,null",
    private int QuarantinePeriod;					//"QuarantinePeriod": "999",
    private String TimeUnitForQuarantinePeriod;		//"TimeUnitForQuarantinePeriod": "string",
    private String QualityInspectionGroup;			//"QualityInspectionGroup": "string",
    private String AuthorizationGroup;				//"AuthorizationGroup": "string",
    private String HandlingUnitType;				//"HandlingUnitType": "string",
    private boolean HasVariableTareWeight;			//"HasVariableTareWeight": "Unknown Type: boolean,null",
    private double MaximumPackagingLength;			//"MaximumPackagingLength": "999999999999.999",
    private double MaximumPackagingWidth;			//"MaximumPackagingWidth": "999999999999.999",
    private double MaximumPackagingHeight;			//"MaximumPackagingHeight": "999999999999.999",

	public Product() {
		super();
	}   
	public long getId() {
		return this.ID;
	}

	public void setId(long id) {
		this.ID = id;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCrossPlantStatus() {
		return CrossPlantStatus;
	}
	public void setCrossPlantStatus(String crossPlantStatus) {
		CrossPlantStatus = crossPlantStatus;
	}
	public Date getCrossPlantStatusValidityDate() {
		return CrossPlantStatusValidityDate;
	}
	public void setCrossPlantStatusValidityDate(Date crossPlantStatusValidityDate) {
		CrossPlantStatusValidityDate = crossPlantStatusValidityDate;
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
	public String getLastChangedByUser() {
		return LastChangedByUser;
	}
	public void setLastChangedByUser(String lastChangedByUser) {
		LastChangedByUser = lastChangedByUser;
	}
	public Date getLastChangeDateTime() {
		return LastChangeDateTime;
	}
	public void setLastChangeDateTime(Date lastChangeDateTime) {
		LastChangeDateTime = lastChangeDateTime;
	}
	public boolean isIsMarkedForDeletion() {
		return IsMarkedForDeletion;
	}
	public void setIsMarkedForDeletion(boolean isMarkedForDeletion) {
		IsMarkedForDeletion = isMarkedForDeletion;
	}
	public String getProductOldID() {
		return ProductOldID;
	}
	public void setProductOldID(String productOldID) {
		ProductOldID = productOldID;
	}
	public double getGrossWeight() {
		return GrossWeight;
	}
	public void setGrossWeight(double grossWeight) {
		GrossWeight = grossWeight;
	}
	public String getPurchaseOrderQuantityUnit() {
		return PurchaseOrderQuantityUnit;
	}
	public void setPurchaseOrderQuantityUnit(String purchaseOrderQuantityUnit) {
		PurchaseOrderQuantityUnit = purchaseOrderQuantityUnit;
	}
	public String getSourceOfSupply() {
		return SourceOfSupply;
	}
	public void setSourceOfSupply(String sourceOfSupply) {
		SourceOfSupply = sourceOfSupply;
	}
	public String getWeightUnit() {
		return WeightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		WeightUnit = weightUnit;
	}
	public double getNetWeight() {
		return NetWeight;
	}
	public void setNetWeight(double netWeight) {
		NetWeight = netWeight;
	}
	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}
	public String getCompetitorID() {
		return CompetitorID;
	}
	public void setCompetitorID(String competitorID) {
		CompetitorID = competitorID;
	}
	public String getProductGroup() {
		return ProductGroup;
	}
	public void setProductGroup(String productGroup) {
		ProductGroup = productGroup;
	}
	public String getBaseUnit() {
		return BaseUnit;
	}
	public void setBaseUnit(String baseUnit) {
		BaseUnit = baseUnit;
	}
	public String getItemCategoryGroup() {
		return ItemCategoryGroup;
	}
	public void setItemCategoryGroup(String itemCategoryGroup) {
		ItemCategoryGroup = itemCategoryGroup;
	}
	public String getProductHierarchy() {
		return ProductHierarchy;
	}
	public void setProductHierarchy(String productHierarchy) {
		ProductHierarchy = productHierarchy;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public String getVarblPurOrdUnitIsActive() {
		return VarblPurOrdUnitIsActive;
	}
	public void setVarblPurOrdUnitIsActive(String varblPurOrdUnitIsActive) {
		VarblPurOrdUnitIsActive = varblPurOrdUnitIsActive;
	}
	public String getVolumeUnit() {
		return VolumeUnit;
	}
	public void setVolumeUnit(String volumeUnit) {
		VolumeUnit = volumeUnit;
	}
	public double getMaterialVolume() {
		return MaterialVolume;
	}
	public void setMaterialVolume(double materialVolume) {
		MaterialVolume = materialVolume;
	}
	public String getANPCode() {
		return ANPCode;
	}
	public void setANPCode(String aNPCode) {
		ANPCode = aNPCode;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getProcurementRule() {
		return ProcurementRule;
	}
	public void setProcurementRule(String procurementRule) {
		ProcurementRule = procurementRule;
	}
	public Date getValidityStartDate() {
		return ValidityStartDate;
	}
	public void setValidityStartDate(Date validityStartDate) {
		ValidityStartDate = validityStartDate;
	}
	public String getLowLevelCode() {
		return LowLevelCode;
	}
	public void setLowLevelCode(String lowLevelCode) {
		LowLevelCode = lowLevelCode;
	}
	public String getProdNoInGenProdInPrepackProd() {
		return ProdNoInGenProdInPrepackProd;
	}
	public void setProdNoInGenProdInPrepackProd(String prodNoInGenProdInPrepackProd) {
		ProdNoInGenProdInPrepackProd = prodNoInGenProdInPrepackProd;
	}
	public String getSerialIdentifierAssgmtProfile() {
		return SerialIdentifierAssgmtProfile;
	}
	public void setSerialIdentifierAssgmtProfile(String serialIdentifierAssgmtProfile) {
		SerialIdentifierAssgmtProfile = serialIdentifierAssgmtProfile;
	}
	public String getSizeOrDimensionText() {
		return SizeOrDimensionText;
	}
	public void setSizeOrDimensionText(String sizeOrDimensionText) {
		SizeOrDimensionText = sizeOrDimensionText;
	}
	public String getIndustryStandardName() {
		return IndustryStandardName;
	}
	public void setIndustryStandardName(String industryStandardName) {
		IndustryStandardName = industryStandardName;
	}
	public String getProductStandardID() {
		return ProductStandardID;
	}
	public void setProductStandardID(String productStandardID) {
		ProductStandardID = productStandardID;
	}
	public String getInternationalArticleNumberCat() {
		return InternationalArticleNumberCat;
	}
	public void setInternationalArticleNumberCat(String internationalArticleNumberCat) {
		InternationalArticleNumberCat = internationalArticleNumberCat;
	}
	public boolean isProductIsConfigurable() {
		return ProductIsConfigurable;
	}
	public void setProductIsConfigurable(boolean productIsConfigurable) {
		ProductIsConfigurable = productIsConfigurable;
	}
	public boolean isIsBatchManagementRequired() {
		return IsBatchManagementRequired;
	}
	public void setIsBatchManagementRequired(boolean isBatchManagementRequired) {
		IsBatchManagementRequired = isBatchManagementRequired;
	}
	public String getExternalProductGroup() {
		return ExternalProductGroup;
	}
	public void setExternalProductGroup(String externalProductGroup) {
		ExternalProductGroup = externalProductGroup;
	}
	public String getCrossPlantConfigurableProduct() {
		return CrossPlantConfigurableProduct;
	}
	public void setCrossPlantConfigurableProduct(String crossPlantConfigurableProduct) {
		CrossPlantConfigurableProduct = crossPlantConfigurableProduct;
	}
	public String getSerialNoExplicitnessLevel() {
		return SerialNoExplicitnessLevel;
	}
	public void setSerialNoExplicitnessLevel(String serialNoExplicitnessLevel) {
		SerialNoExplicitnessLevel = serialNoExplicitnessLevel;
	}
	public String getProductManufacturerNumber() {
		return ProductManufacturerNumber;
	}
	public void setProductManufacturerNumber(String productManufacturerNumber) {
		ProductManufacturerNumber = productManufacturerNumber;
	}
	public String getManufacturerNumber() {
		return ManufacturerNumber;
	}
	public void setManufacturerNumber(String manufacturerNumber) {
		ManufacturerNumber = manufacturerNumber;
	}
	public String getManufacturerPartProfile() {
		return ManufacturerPartProfile;
	}
	public void setManufacturerPartProfile(String manufacturerPartProfile) {
		ManufacturerPartProfile = manufacturerPartProfile;
	}
	public String getChangeNumber() {
		return ChangeNumber;
	}
	public void setChangeNumber(String changeNumber) {
		ChangeNumber = changeNumber;
	}
	public String getMaterialRevisionLevel() {
		return MaterialRevisionLevel;
	}
	public void setMaterialRevisionLevel(String materialRevisionLevel) {
		MaterialRevisionLevel = materialRevisionLevel;
	}
	public String getHandlingIndicator() {
		return HandlingIndicator;
	}
	public void setHandlingIndicator(String handlingIndicator) {
		HandlingIndicator = handlingIndicator;
	}
	public String getWarehouseProductGroup() {
		return WarehouseProductGroup;
	}
	public void setWarehouseProductGroup(String warehouseProductGroup) {
		WarehouseProductGroup = warehouseProductGroup;
	}
	public String getWarehouseStorageCondition() {
		return WarehouseStorageCondition;
	}
	public void setWarehouseStorageCondition(String warehouseStorageCondition) {
		WarehouseStorageCondition = warehouseStorageCondition;
	}
	public String getStandardHandlingUnitType() {
		return StandardHandlingUnitType;
	}
	public void setStandardHandlingUnitType(String standardHandlingUnitType) {
		StandardHandlingUnitType = standardHandlingUnitType;
	}
	public String getSerialNumberProfile() {
		return SerialNumberProfile;
	}
	public void setSerialNumberProfile(String serialNumberProfile) {
		SerialNumberProfile = serialNumberProfile;
	}
	public String getAdjustmentProfile() {
		return AdjustmentProfile;
	}
	public void setAdjustmentProfile(String adjustmentProfile) {
		AdjustmentProfile = adjustmentProfile;
	}
	public String getPreferredUnitOfMeasure() {
		return PreferredUnitOfMeasure;
	}
	public void setPreferredUnitOfMeasure(String preferredUnitOfMeasure) {
		PreferredUnitOfMeasure = preferredUnitOfMeasure;
	}
	public boolean isIsPilferable() {
		return IsPilferable;
	}
	public void setIsPilferable(boolean isPilferable) {
		IsPilferable = isPilferable;
	}
	public boolean isIsRelevantForHzdsSubstances() {
		return IsRelevantForHzdsSubstances;
	}
	public void setIsRelevantForHzdsSubstances(boolean isRelevantForHzdsSubstances) {
		IsRelevantForHzdsSubstances = isRelevantForHzdsSubstances;
	}
	public int getQuarantinePeriod() {
		return QuarantinePeriod;
	}
	public void setQuarantinePeriod(int quarantinePeriod) {
		QuarantinePeriod = quarantinePeriod;
	}
	public String getTimeUnitForQuarantinePeriod() {
		return TimeUnitForQuarantinePeriod;
	}
	public void setTimeUnitForQuarantinePeriod(String timeUnitForQuarantinePeriod) {
		TimeUnitForQuarantinePeriod = timeUnitForQuarantinePeriod;
	}
	public String getQualityInspectionGroup() {
		return QualityInspectionGroup;
	}
	public void setQualityInspectionGroup(String qualityInspectionGroup) {
		QualityInspectionGroup = qualityInspectionGroup;
	}
	public String getAuthorizationGroup() {
		return AuthorizationGroup;
	}
	public void setAuthorizationGroup(String authorizationGroup) {
		AuthorizationGroup = authorizationGroup;
	}
	public String getHandlingUnitType() {
		return HandlingUnitType;
	}
	public void setHandlingUnitType(String handlingUnitType) {
		HandlingUnitType = handlingUnitType;
	}
	public boolean isHasVariableTareWeight() {
		return HasVariableTareWeight;
	}
	public void setHasVariableTareWeight(boolean hasVariableTareWeight) {
		HasVariableTareWeight = hasVariableTareWeight;
	}
	public double getMaximumPackagingLength() {
		return MaximumPackagingLength;
	}
	public void setMaximumPackagingLength(double maximumPackagingLength) {
		MaximumPackagingLength = maximumPackagingLength;
	}
	public double getMaximumPackagingWidth() {
		return MaximumPackagingWidth;
	}
	public void setMaximumPackagingWidth(double maximumPackagingWidth) {
		MaximumPackagingWidth = maximumPackagingWidth;
	}
	public double getMaximumPackagingHeight() {
		return MaximumPackagingHeight;
	}
	public void setMaximumPackagingHeight(double maximumPackagingHeight) {
		MaximumPackagingHeight = maximumPackagingHeight;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ANPCode == null) ? 0 : ANPCode.hashCode());
		result = prime * result + ((AdjustmentProfile == null) ? 0 : AdjustmentProfile.hashCode());
		result = prime * result + ((AuthorizationGroup == null) ? 0 : AuthorizationGroup.hashCode());
		result = prime * result + ((BaseUnit == null) ? 0 : BaseUnit.hashCode());
		result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
		result = prime * result + ((ChangeNumber == null) ? 0 : ChangeNumber.hashCode());
		result = prime * result + ((CompetitorID == null) ? 0 : CompetitorID.hashCode());
		result = prime * result + ((CountryOfOrigin == null) ? 0 : CountryOfOrigin.hashCode());
		result = prime * result + ((CreatedByUser == null) ? 0 : CreatedByUser.hashCode());
		result = prime * result + ((CreationDate == null) ? 0 : CreationDate.hashCode());
		result = prime * result
				+ ((CrossPlantConfigurableProduct == null) ? 0 : CrossPlantConfigurableProduct.hashCode());
		result = prime * result + ((CrossPlantStatus == null) ? 0 : CrossPlantStatus.hashCode());
		result = prime * result
				+ ((CrossPlantStatusValidityDate == null) ? 0 : CrossPlantStatusValidityDate.hashCode());
		result = prime * result + ((Division == null) ? 0 : Division.hashCode());
		result = prime * result + ((ExternalProductGroup == null) ? 0 : ExternalProductGroup.hashCode());
		long temp;
		temp = Double.doubleToLongBits(GrossWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((HandlingIndicator == null) ? 0 : HandlingIndicator.hashCode());
		result = prime * result + ((HandlingUnitType == null) ? 0 : HandlingUnitType.hashCode());
		result = prime * result + (HasVariableTareWeight ? 1231 : 1237);
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((IndustryStandardName == null) ? 0 : IndustryStandardName.hashCode());
		result = prime * result
				+ ((InternationalArticleNumberCat == null) ? 0 : InternationalArticleNumberCat.hashCode());
		result = prime * result + (IsBatchManagementRequired ? 1231 : 1237);
		result = prime * result + (IsMarkedForDeletion ? 1231 : 1237);
		result = prime * result + (IsPilferable ? 1231 : 1237);
		result = prime * result + (IsRelevantForHzdsSubstances ? 1231 : 1237);
		result = prime * result + ((ItemCategoryGroup == null) ? 0 : ItemCategoryGroup.hashCode());
		result = prime * result + ((LastChangeDate == null) ? 0 : LastChangeDate.hashCode());
		result = prime * result + ((LastChangeDateTime == null) ? 0 : LastChangeDateTime.hashCode());
		result = prime * result + ((LastChangedByUser == null) ? 0 : LastChangedByUser.hashCode());
		result = prime * result + ((LowLevelCode == null) ? 0 : LowLevelCode.hashCode());
		result = prime * result + ((ManufacturerNumber == null) ? 0 : ManufacturerNumber.hashCode());
		result = prime * result + ((ManufacturerPartProfile == null) ? 0 : ManufacturerPartProfile.hashCode());
		result = prime * result + ((MaterialRevisionLevel == null) ? 0 : MaterialRevisionLevel.hashCode());
		temp = Double.doubleToLongBits(MaterialVolume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(MaximumPackagingHeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(MaximumPackagingLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(MaximumPackagingWidth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(NetWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((PreferredUnitOfMeasure == null) ? 0 : PreferredUnitOfMeasure.hashCode());
		result = prime * result + ((ProcurementRule == null) ? 0 : ProcurementRule.hashCode());
		result = prime * result
				+ ((ProdNoInGenProdInPrepackProd == null) ? 0 : ProdNoInGenProdInPrepackProd.hashCode());
		result = prime * result + ((ProductGroup == null) ? 0 : ProductGroup.hashCode());
		result = prime * result + ((ProductHierarchy == null) ? 0 : ProductHierarchy.hashCode());
		result = prime * result + (ProductIsConfigurable ? 1231 : 1237);
		result = prime * result + ((ProductManufacturerNumber == null) ? 0 : ProductManufacturerNumber.hashCode());
		result = prime * result + ((ProductOldID == null) ? 0 : ProductOldID.hashCode());
		result = prime * result + ((ProductStandardID == null) ? 0 : ProductStandardID.hashCode());
		result = prime * result + ((PurchaseOrderQuantityUnit == null) ? 0 : PurchaseOrderQuantityUnit.hashCode());
		result = prime * result + ((QualityInspectionGroup == null) ? 0 : QualityInspectionGroup.hashCode());
		result = prime * result + QuarantinePeriod;
		result = prime * result
				+ ((SerialIdentifierAssgmtProfile == null) ? 0 : SerialIdentifierAssgmtProfile.hashCode());
		result = prime * result + ((SerialNoExplicitnessLevel == null) ? 0 : SerialNoExplicitnessLevel.hashCode());
		result = prime * result + ((SerialNumberProfile == null) ? 0 : SerialNumberProfile.hashCode());
		result = prime * result + ((SizeOrDimensionText == null) ? 0 : SizeOrDimensionText.hashCode());
		result = prime * result + ((SourceOfSupply == null) ? 0 : SourceOfSupply.hashCode());
		result = prime * result + ((StandardHandlingUnitType == null) ? 0 : StandardHandlingUnitType.hashCode());
		result = prime * result + ((TimeUnitForQuarantinePeriod == null) ? 0 : TimeUnitForQuarantinePeriod.hashCode());
		result = prime * result + ((ValidityStartDate == null) ? 0 : ValidityStartDate.hashCode());
		result = prime * result + ((VarblPurOrdUnitIsActive == null) ? 0 : VarblPurOrdUnitIsActive.hashCode());
		result = prime * result + ((VolumeUnit == null) ? 0 : VolumeUnit.hashCode());
		result = prime * result + ((WarehouseProductGroup == null) ? 0 : WarehouseProductGroup.hashCode());
		result = prime * result + ((WarehouseStorageCondition == null) ? 0 : WarehouseStorageCondition.hashCode());
		result = prime * result + ((WeightUnit == null) ? 0 : WeightUnit.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
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
		Product other = (Product) obj;
		if (ANPCode == null) {
			if (other.ANPCode != null)
				return false;
		} else if (!ANPCode.equals(other.ANPCode))
			return false;
		if (AdjustmentProfile == null) {
			if (other.AdjustmentProfile != null)
				return false;
		} else if (!AdjustmentProfile.equals(other.AdjustmentProfile))
			return false;
		if (AuthorizationGroup == null) {
			if (other.AuthorizationGroup != null)
				return false;
		} else if (!AuthorizationGroup.equals(other.AuthorizationGroup))
			return false;
		if (BaseUnit == null) {
			if (other.BaseUnit != null)
				return false;
		} else if (!BaseUnit.equals(other.BaseUnit))
			return false;
		if (Brand == null) {
			if (other.Brand != null)
				return false;
		} else if (!Brand.equals(other.Brand))
			return false;
		if (ChangeNumber == null) {
			if (other.ChangeNumber != null)
				return false;
		} else if (!ChangeNumber.equals(other.ChangeNumber))
			return false;
		if (CompetitorID == null) {
			if (other.CompetitorID != null)
				return false;
		} else if (!CompetitorID.equals(other.CompetitorID))
			return false;
		if (CountryOfOrigin == null) {
			if (other.CountryOfOrigin != null)
				return false;
		} else if (!CountryOfOrigin.equals(other.CountryOfOrigin))
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
		if (CrossPlantConfigurableProduct == null) {
			if (other.CrossPlantConfigurableProduct != null)
				return false;
		} else if (!CrossPlantConfigurableProduct.equals(other.CrossPlantConfigurableProduct))
			return false;
		if (CrossPlantStatus == null) {
			if (other.CrossPlantStatus != null)
				return false;
		} else if (!CrossPlantStatus.equals(other.CrossPlantStatus))
			return false;
		if (CrossPlantStatusValidityDate == null) {
			if (other.CrossPlantStatusValidityDate != null)
				return false;
		} else if (!CrossPlantStatusValidityDate.equals(other.CrossPlantStatusValidityDate))
			return false;
		if (Division == null) {
			if (other.Division != null)
				return false;
		} else if (!Division.equals(other.Division))
			return false;
		if (ExternalProductGroup == null) {
			if (other.ExternalProductGroup != null)
				return false;
		} else if (!ExternalProductGroup.equals(other.ExternalProductGroup))
			return false;
		if (Double.doubleToLongBits(GrossWeight) != Double.doubleToLongBits(other.GrossWeight))
			return false;
		if (HandlingIndicator == null) {
			if (other.HandlingIndicator != null)
				return false;
		} else if (!HandlingIndicator.equals(other.HandlingIndicator))
			return false;
		if (HandlingUnitType == null) {
			if (other.HandlingUnitType != null)
				return false;
		} else if (!HandlingUnitType.equals(other.HandlingUnitType))
			return false;
		if (HasVariableTareWeight != other.HasVariableTareWeight)
			return false;
		if (ID != other.ID)
			return false;
		if (IndustryStandardName == null) {
			if (other.IndustryStandardName != null)
				return false;
		} else if (!IndustryStandardName.equals(other.IndustryStandardName))
			return false;
		if (InternationalArticleNumberCat == null) {
			if (other.InternationalArticleNumberCat != null)
				return false;
		} else if (!InternationalArticleNumberCat.equals(other.InternationalArticleNumberCat))
			return false;
		if (IsBatchManagementRequired != other.IsBatchManagementRequired)
			return false;
		if (IsMarkedForDeletion != other.IsMarkedForDeletion)
			return false;
		if (IsPilferable != other.IsPilferable)
			return false;
		if (IsRelevantForHzdsSubstances != other.IsRelevantForHzdsSubstances)
			return false;
		if (ItemCategoryGroup == null) {
			if (other.ItemCategoryGroup != null)
				return false;
		} else if (!ItemCategoryGroup.equals(other.ItemCategoryGroup))
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
		if (LastChangedByUser == null) {
			if (other.LastChangedByUser != null)
				return false;
		} else if (!LastChangedByUser.equals(other.LastChangedByUser))
			return false;
		if (LowLevelCode == null) {
			if (other.LowLevelCode != null)
				return false;
		} else if (!LowLevelCode.equals(other.LowLevelCode))
			return false;
		if (ManufacturerNumber == null) {
			if (other.ManufacturerNumber != null)
				return false;
		} else if (!ManufacturerNumber.equals(other.ManufacturerNumber))
			return false;
		if (ManufacturerPartProfile == null) {
			if (other.ManufacturerPartProfile != null)
				return false;
		} else if (!ManufacturerPartProfile.equals(other.ManufacturerPartProfile))
			return false;
		if (MaterialRevisionLevel == null) {
			if (other.MaterialRevisionLevel != null)
				return false;
		} else if (!MaterialRevisionLevel.equals(other.MaterialRevisionLevel))
			return false;
		if (Double.doubleToLongBits(MaterialVolume) != Double.doubleToLongBits(other.MaterialVolume))
			return false;
		if (Double.doubleToLongBits(MaximumPackagingHeight) != Double.doubleToLongBits(other.MaximumPackagingHeight))
			return false;
		if (Double.doubleToLongBits(MaximumPackagingLength) != Double.doubleToLongBits(other.MaximumPackagingLength))
			return false;
		if (Double.doubleToLongBits(MaximumPackagingWidth) != Double.doubleToLongBits(other.MaximumPackagingWidth))
			return false;
		if (Double.doubleToLongBits(NetWeight) != Double.doubleToLongBits(other.NetWeight))
			return false;
		if (PreferredUnitOfMeasure == null) {
			if (other.PreferredUnitOfMeasure != null)
				return false;
		} else if (!PreferredUnitOfMeasure.equals(other.PreferredUnitOfMeasure))
			return false;
		if (ProcurementRule == null) {
			if (other.ProcurementRule != null)
				return false;
		} else if (!ProcurementRule.equals(other.ProcurementRule))
			return false;
		if (ProdNoInGenProdInPrepackProd == null) {
			if (other.ProdNoInGenProdInPrepackProd != null)
				return false;
		} else if (!ProdNoInGenProdInPrepackProd.equals(other.ProdNoInGenProdInPrepackProd))
			return false;
		if (ProductGroup == null) {
			if (other.ProductGroup != null)
				return false;
		} else if (!ProductGroup.equals(other.ProductGroup))
			return false;
		if (ProductHierarchy == null) {
			if (other.ProductHierarchy != null)
				return false;
		} else if (!ProductHierarchy.equals(other.ProductHierarchy))
			return false;
		if (ProductIsConfigurable != other.ProductIsConfigurable)
			return false;
		if (ProductManufacturerNumber == null) {
			if (other.ProductManufacturerNumber != null)
				return false;
		} else if (!ProductManufacturerNumber.equals(other.ProductManufacturerNumber))
			return false;
		if (ProductOldID == null) {
			if (other.ProductOldID != null)
				return false;
		} else if (!ProductOldID.equals(other.ProductOldID))
			return false;
		if (ProductStandardID == null) {
			if (other.ProductStandardID != null)
				return false;
		} else if (!ProductStandardID.equals(other.ProductStandardID))
			return false;
		if (PurchaseOrderQuantityUnit == null) {
			if (other.PurchaseOrderQuantityUnit != null)
				return false;
		} else if (!PurchaseOrderQuantityUnit.equals(other.PurchaseOrderQuantityUnit))
			return false;
		if (QualityInspectionGroup == null) {
			if (other.QualityInspectionGroup != null)
				return false;
		} else if (!QualityInspectionGroup.equals(other.QualityInspectionGroup))
			return false;
		if (QuarantinePeriod != other.QuarantinePeriod)
			return false;
		if (SerialIdentifierAssgmtProfile == null) {
			if (other.SerialIdentifierAssgmtProfile != null)
				return false;
		} else if (!SerialIdentifierAssgmtProfile.equals(other.SerialIdentifierAssgmtProfile))
			return false;
		if (SerialNoExplicitnessLevel == null) {
			if (other.SerialNoExplicitnessLevel != null)
				return false;
		} else if (!SerialNoExplicitnessLevel.equals(other.SerialNoExplicitnessLevel))
			return false;
		if (SerialNumberProfile == null) {
			if (other.SerialNumberProfile != null)
				return false;
		} else if (!SerialNumberProfile.equals(other.SerialNumberProfile))
			return false;
		if (SizeOrDimensionText == null) {
			if (other.SizeOrDimensionText != null)
				return false;
		} else if (!SizeOrDimensionText.equals(other.SizeOrDimensionText))
			return false;
		if (SourceOfSupply == null) {
			if (other.SourceOfSupply != null)
				return false;
		} else if (!SourceOfSupply.equals(other.SourceOfSupply))
			return false;
		if (StandardHandlingUnitType == null) {
			if (other.StandardHandlingUnitType != null)
				return false;
		} else if (!StandardHandlingUnitType.equals(other.StandardHandlingUnitType))
			return false;
		if (TimeUnitForQuarantinePeriod == null) {
			if (other.TimeUnitForQuarantinePeriod != null)
				return false;
		} else if (!TimeUnitForQuarantinePeriod.equals(other.TimeUnitForQuarantinePeriod))
			return false;
		if (ValidityStartDate == null) {
			if (other.ValidityStartDate != null)
				return false;
		} else if (!ValidityStartDate.equals(other.ValidityStartDate))
			return false;
		if (VarblPurOrdUnitIsActive == null) {
			if (other.VarblPurOrdUnitIsActive != null)
				return false;
		} else if (!VarblPurOrdUnitIsActive.equals(other.VarblPurOrdUnitIsActive))
			return false;
		if (VolumeUnit == null) {
			if (other.VolumeUnit != null)
				return false;
		} else if (!VolumeUnit.equals(other.VolumeUnit))
			return false;
		if (WarehouseProductGroup == null) {
			if (other.WarehouseProductGroup != null)
				return false;
		} else if (!WarehouseProductGroup.equals(other.WarehouseProductGroup))
			return false;
		if (WarehouseStorageCondition == null) {
			if (other.WarehouseStorageCondition != null)
				return false;
		} else if (!WarehouseStorageCondition.equals(other.WarehouseStorageCondition))
			return false;
		if (WeightUnit == null) {
			if (other.WeightUnit != null)
				return false;
		} else if (!WeightUnit.equals(other.WeightUnit))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", product=" + product + ", productType=" + productType + ", CrossPlantStatus="
				+ CrossPlantStatus + ", CrossPlantStatusValidityDate=" + CrossPlantStatusValidityDate
				+ ", CreationDate=" + CreationDate + ", CreatedByUser=" + CreatedByUser + ", LastChangeDate="
				+ LastChangeDate + ", LastChangedByUser=" + LastChangedByUser + ", LastChangeDateTime="
				+ LastChangeDateTime + ", IsMarkedForDeletion=" + IsMarkedForDeletion + ", ProductOldID=" + ProductOldID
				+ ", GrossWeight=" + GrossWeight + ", PurchaseOrderQuantityUnit=" + PurchaseOrderQuantityUnit
				+ ", SourceOfSupply=" + SourceOfSupply + ", WeightUnit=" + WeightUnit + ", NetWeight=" + NetWeight
				+ ", CountryOfOrigin=" + CountryOfOrigin + ", CompetitorID=" + CompetitorID + ", ProductGroup="
				+ ProductGroup + ", BaseUnit=" + BaseUnit + ", ItemCategoryGroup=" + ItemCategoryGroup
				+ ", ProductHierarchy=" + ProductHierarchy + ", Division=" + Division + ", VarblPurOrdUnitIsActive="
				+ VarblPurOrdUnitIsActive + ", VolumeUnit=" + VolumeUnit + ", MaterialVolume=" + MaterialVolume
				+ ", ANPCode=" + ANPCode + ", Brand=" + Brand + ", ProcurementRule=" + ProcurementRule
				+ ", ValidityStartDate=" + ValidityStartDate + ", LowLevelCode=" + LowLevelCode
				+ ", ProdNoInGenProdInPrepackProd=" + ProdNoInGenProdInPrepackProd + ", SerialIdentifierAssgmtProfile="
				+ SerialIdentifierAssgmtProfile + ", SizeOrDimensionText=" + SizeOrDimensionText
				+ ", IndustryStandardName=" + IndustryStandardName + ", ProductStandardID=" + ProductStandardID
				+ ", InternationalArticleNumberCat=" + InternationalArticleNumberCat + ", ProductIsConfigurable="
				+ ProductIsConfigurable + ", IsBatchManagementRequired=" + IsBatchManagementRequired
				+ ", ExternalProductGroup=" + ExternalProductGroup + ", CrossPlantConfigurableProduct="
				+ CrossPlantConfigurableProduct + ", SerialNoExplicitnessLevel=" + SerialNoExplicitnessLevel
				+ ", ProductManufacturerNumber=" + ProductManufacturerNumber + ", ManufacturerNumber="
				+ ManufacturerNumber + ", ManufacturerPartProfile=" + ManufacturerPartProfile + ", ChangeNumber="
				+ ChangeNumber + ", MaterialRevisionLevel=" + MaterialRevisionLevel + ", HandlingIndicator="
				+ HandlingIndicator + ", WarehouseProductGroup=" + WarehouseProductGroup
				+ ", WarehouseStorageCondition=" + WarehouseStorageCondition + ", StandardHandlingUnitType="
				+ StandardHandlingUnitType + ", SerialNumberProfile=" + SerialNumberProfile + ", AdjustmentProfile="
				+ AdjustmentProfile + ", PreferredUnitOfMeasure=" + PreferredUnitOfMeasure + ", IsPilferable="
				+ IsPilferable + ", IsRelevantForHzdsSubstances=" + IsRelevantForHzdsSubstances + ", QuarantinePeriod="
				+ QuarantinePeriod + ", TimeUnitForQuarantinePeriod=" + TimeUnitForQuarantinePeriod
				+ ", QualityInspectionGroup=" + QualityInspectionGroup + ", AuthorizationGroup=" + AuthorizationGroup
				+ ", HandlingUnitType=" + HandlingUnitType + ", HasVariableTareWeight=" + HasVariableTareWeight
				+ ", MaximumPackagingLength=" + MaximumPackagingLength + ", MaximumPackagingWidth="
				+ MaximumPackagingWidth + ", MaximumPackagingHeight=" + MaximumPackagingHeight + "]";
	}
	
	
	
	
   
}
