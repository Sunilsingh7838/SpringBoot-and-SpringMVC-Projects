package in.mvc.binding;

public class Product {
	
	private Integer productId;
	
	private String productName;
	
	private double productPrice;
	
	

//	public Product(Integer productId, String productName, double productPrice) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.productPrice = productPrice;
//	}

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

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
