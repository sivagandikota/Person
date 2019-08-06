package com;

import com.google.gson.annotations.SerializedName;

public class CustInq {
	@SerializedName("__metadata")
	private MetaData metadata = null;
	
	@SerializedName("Customer")
	private String customer = null;
	
	@SerializedName("SalesOrganization")
	private String salesOrganization = null;
	
	@SerializedName("DistributionChannel")
	private String distributionChannel = null;
	
	@SerializedName("Division")
	private String division = null;
	
	@SerializedName("CustomerPaymentTerms")
	private String customerPaymentTerms = null;
	
	@SerializedName("DeliveryIsBlockedForCustomer")
	private String deliveryIsBlockedForCustomer = null;
	
	@SerializedName("OrderIsBlockedForCustomer")
	private String orderIsBlockedForCustomer = null;
	
	@SerializedName("ShippingCondition")
	private String shippingCondition = null;
	
	@SerializedName("DeletionIndicator")
	private String deletionIndicator = null;

	public MetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getSalesOrganization() {
		return salesOrganization;
	}

	public void setSalesOrganization(String salesOrganization) {
		this.salesOrganization = salesOrganization;
	}

	public String getDistributionChannel() {
		return distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCustomerPaymentTerms() {
		return customerPaymentTerms;
	}

	public void setCustomerPaymentTerms(String customerPaymentTerms) {
		this.customerPaymentTerms = customerPaymentTerms;
	}

	public String getDeliveryIsBlockedForCustomer() {
		return deliveryIsBlockedForCustomer;
	}

	public void setDeliveryIsBlockedForCustomer(String deliveryIsBlockedForCustomer) {
		this.deliveryIsBlockedForCustomer = deliveryIsBlockedForCustomer;
	}

	public String getOrderIsBlockedForCustomer() {
		return orderIsBlockedForCustomer;
	}

	public void setOrderIsBlockedForCustomer(String orderIsBlockedForCustomer) {
		this.orderIsBlockedForCustomer = orderIsBlockedForCustomer;
	}

	public String getShippingCondition() {
		return shippingCondition;
	}

	public void setShippingCondition(String shippingCondition) {
		this.shippingCondition = shippingCondition;
	}
	
	public String getDeletionIndicator() {
		return deletionIndicator;
	}

	public void setDeletionIndicator(String deletionIndicator) {
		this.deletionIndicator = deletionIndicator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((customerPaymentTerms == null) ? 0 : customerPaymentTerms.hashCode());
		result = prime * result
				+ ((deliveryIsBlockedForCustomer == null) ? 0 : deliveryIsBlockedForCustomer.hashCode());
		result = prime * result + ((distributionChannel == null) ? 0 : distributionChannel.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((orderIsBlockedForCustomer == null) ? 0 : orderIsBlockedForCustomer.hashCode());
		result = prime * result + ((salesOrganization == null) ? 0 : salesOrganization.hashCode());
		result = prime * result + ((shippingCondition == null) ? 0 : shippingCondition.hashCode());
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
		CustInq other = (CustInq) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (customerPaymentTerms == null) {
			if (other.customerPaymentTerms != null)
				return false;
		} else if (!customerPaymentTerms.equals(other.customerPaymentTerms))
			return false;
		if (deliveryIsBlockedForCustomer == null) {
			if (other.deliveryIsBlockedForCustomer != null)
				return false;
		} else if (!deliveryIsBlockedForCustomer.equals(other.deliveryIsBlockedForCustomer))
			return false;
		if (distributionChannel == null) {
			if (other.distributionChannel != null)
				return false;
		} else if (!distributionChannel.equals(other.distributionChannel))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (orderIsBlockedForCustomer == null) {
			if (other.orderIsBlockedForCustomer != null)
				return false;
		} else if (!orderIsBlockedForCustomer.equals(other.orderIsBlockedForCustomer))
			return false;
		if (salesOrganization == null) {
			if (other.salesOrganization != null)
				return false;
		} else if (!salesOrganization.equals(other.salesOrganization))
			return false;
		if (shippingCondition == null) {
			if (other.shippingCondition != null)
				return false;
		} else if (!shippingCondition.equals(other.shippingCondition))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustInq [customer=" + customer + ", salesOrganization=" + salesOrganization + ", distributionChannel="
				+ distributionChannel + ", division=" + division + ", customerPaymentTerms=" + customerPaymentTerms
				+ ", deliveryIsBlockedForCustomer=" + deliveryIsBlockedForCustomer + ", orderIsBlockedForCustomer="
				+ orderIsBlockedForCustomer + ", shippingCondition=" + shippingCondition + ", deletionIndicator="
				+ deletionIndicator + "]";
	}

	

	
}
