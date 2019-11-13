package aviation.entity.vo;

public class VolumeInfo {
	
	private int  pointId;
	private String  pointCity;
	private double moneyBodyPrice;
	private double moneyHeadPrice;
	private int priceId;
	private String salesmanName;
	public int getPointId() {
		return pointId;
	}
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	public String getPointCity() {
		return pointCity;
	}
	public void setPointCity(String pointCity) {
		this.pointCity = pointCity;
	}
	public double getMoneyBodyPrice() {
		return moneyBodyPrice;
	}
	public void setMoneyBodyPrice(double moneyBodyPrice) {
		this.moneyBodyPrice = moneyBodyPrice;
	}
	public double getMoneyHeadPrice() {
		return moneyHeadPrice;
	}
	public void setMoneyHeadPrice(double moneyHeadPrice) {
		this.moneyHeadPrice = moneyHeadPrice;
	}
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public String getSalesmanName() {
		return salesmanName;
	}
	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(moneyBodyPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(moneyHeadPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((pointCity == null) ? 0 : pointCity.hashCode());
		result = prime * result + pointId;
		result = prime * result + priceId;
		result = prime * result + ((salesmanName == null) ? 0 : salesmanName.hashCode());
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
		VolumeInfo other = (VolumeInfo) obj;
		if (Double.doubleToLongBits(moneyBodyPrice) != Double.doubleToLongBits(other.moneyBodyPrice))
			return false;
		if (Double.doubleToLongBits(moneyHeadPrice) != Double.doubleToLongBits(other.moneyHeadPrice))
			return false;
		if (pointCity == null) {
			if (other.pointCity != null)
				return false;
		} else if (!pointCity.equals(other.pointCity))
			return false;
		if (pointId != other.pointId)
			return false;
		if (priceId != other.priceId)
			return false;
		if (salesmanName == null) {
			if (other.salesmanName != null)
				return false;
		} else if (!salesmanName.equals(other.salesmanName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VolumeInfo [pointId=" + pointId + ", pointCity=" + pointCity + ", moneyBodyPrice=" + moneyBodyPrice
				+ ", moneyHeadPrice=" + moneyHeadPrice + ", priceId=" + priceId + ", salesmanName=" + salesmanName
				+ "]";
	}
	public VolumeInfo(int pointId, String pointCity, double moneyBodyPrice, double moneyHeadPrice, int priceId,
			String salesmanName) {
		super();
		this.pointId = pointId;
		this.pointCity = pointCity;
		this.moneyBodyPrice = moneyBodyPrice;
		this.moneyHeadPrice = moneyHeadPrice;
		this.priceId = priceId;
		this.salesmanName = salesmanName;
	}
	public VolumeInfo() {
		super();
	}
	
	
	
	
	
	
}
