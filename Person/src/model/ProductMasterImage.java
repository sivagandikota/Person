package model;

import java.io.Serializable;
import java.lang.String;
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
 * Entity implementation class for Entity: ProductMasterImage
 *
 */
@Entity
@Table
@PersistenceUnit(name="PERSONS")
@XmlRootElement
@EdmEntityType(namespace = "odata2")
@EdmEntitySet(name = "ProductMasterImage")
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

public class ProductMasterImage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EdmKey
    @EdmProperty
	private long ID;
	private String accountId;
	private String bucketId;
	private String fileId;
	private String fileName;
	private String filePath;
	private String productId;
	private static final long serialVersionUID = 1L;

	public ProductMasterImage() {
		super();
	}   
	public long getID() {
		return this.ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}   
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}   
	public String getBucketId() {
		return this.bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}   
	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}   
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}   
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}   
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
   
}
