package in.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PRODUCT_ID")
	private Integer productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_BRAND")
	private String productBrand;
	
	@Column(name="PRODUCT_QUANTITY")
	private Integer productQuantity;
	
	@Column(name="PRODUCT_DEALER")
	private String productDealer;
	
	@Column(name="PRODUCT_DEALERCONTINFO")
	private Double productDealerContInfo;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductDealer() {
		return productDealer;
	}

	public void setProductDealer(String productDealer) {
		this.productDealer = productDealer;
	}

	public Double getProductDealerContInfo() {
		return productDealerContInfo;
	}

	public void setProductDealerContInfo(Double productDealerContInfo) {
		this.productDealerContInfo = productDealerContInfo;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productBrand=" + productBrand
				+ ", productQuantity=" + productQuantity + ", productDealer=" + productDealer
				+ ", productDealerContInfo=" + productDealerContInfo + "]";
	}
	
	
	
}
