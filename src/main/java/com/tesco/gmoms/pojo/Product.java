package com.tesco.gmoms.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "product")
@XmlRootElement
public class Product {
		
	@Id
	@SequenceGenerator( name = "prodIdSeq", sequenceName = "PRODUCT_ID_SEQ", allocationSize = 1, initialValue = 1 )
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "prodIdSeq" )
	private long productId;
	
	@Column(name = "pName", nullable = false)
	private String pName;

	@Column(name = "pDesc", nullable = false)
	private String pDesc;

	@Column(name = "pSkuId", nullable = false)
	private String pSkuId;
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public String getpSkuId() {
		return pSkuId;
	}
	public void setpSkuId(String pSkuId) {
		this.pSkuId = pSkuId;
	}
	
	
	

}
