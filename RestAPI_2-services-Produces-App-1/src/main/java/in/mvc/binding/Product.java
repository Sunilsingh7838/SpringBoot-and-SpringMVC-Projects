package in.mvc.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private Integer pId;
	private String pName;
	private Double Price;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer pId, String pName, Double price) {
		super();
		this.pId = pId;
		this.pName = pName;
		Price = price;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", Price=" + Price + "]";
	}
	 
	

}
