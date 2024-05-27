package come.renuka.dto;

public class Order {
	private int oId;
	private String oType;
	private double oPrice;
	private Address odAddress;
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoType() {
		return oType;
	}
	public void setoType(String oType) {
		this.oType = oType;
	}
	public double getoPrice() {
		return oPrice;
	}
	public void setoPrice(double oPrice) {
		this.oPrice = oPrice;
	}
	public Address getOdAddress() {
		return odAddress;
	}
	public void setOdAddress(Address odAddress) {
		this.odAddress = odAddress;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oType=" + oType + ", oPrice=" + oPrice + ", odAddress=" + odAddress + "]";
	}
	
}
