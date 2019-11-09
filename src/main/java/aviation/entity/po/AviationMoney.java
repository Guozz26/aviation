package aviation.entity.po;

public class AviationMoney {
	private int moneyId;
	private double moneyHeadPrice;
	private double moneyBodyPrice;
	private int flightId;
	public int getMoneyId() {
		return moneyId;
	}
	public void setMoneyId(int moneyId) {
		this.moneyId = moneyId;
	}
	public double getMoneyHeadPrice() {
		return moneyHeadPrice;
	}
	public void setMoneyHeadPrice(double moneyHeadPrice) {
		this.moneyHeadPrice = moneyHeadPrice;
	}
	public double getMoneyBodyPrice() {
		return moneyBodyPrice;
	}
	public void setMoneyBodyPrice(double moneyBodyPrice) {
		this.moneyBodyPrice = moneyBodyPrice;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public AviationMoney(int moneyId, double moneyHeadPrice, double moneyBodyPrice, int flightId) {
		super();
		this.moneyId = moneyId;
		this.moneyHeadPrice = moneyHeadPrice;
		this.moneyBodyPrice = moneyBodyPrice;
		this.flightId = flightId;
	}
	public AviationMoney( double moneyHeadPrice, double moneyBodyPrice, int flightId) {
		super();

		this.moneyHeadPrice = moneyHeadPrice;
		this.moneyBodyPrice = moneyBodyPrice;
		this.flightId = flightId;
	}
	public AviationMoney(int moneyId) {
		super();
		this.moneyId = moneyId;
	}
	
	
	public AviationMoney() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flightId;
		long temp;
		temp = Double.doubleToLongBits(moneyBodyPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(moneyHeadPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + moneyId;
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
		AviationMoney other = (AviationMoney) obj;
		if (flightId != other.flightId)
			return false;
		if (Double.doubleToLongBits(moneyBodyPrice) != Double.doubleToLongBits(other.moneyBodyPrice))
			return false;
		if (Double.doubleToLongBits(moneyHeadPrice) != Double.doubleToLongBits(other.moneyHeadPrice))
			return false;
		if (moneyId != other.moneyId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AviationMoney [moneyId=" + moneyId + ", moneyHeadPrice=" + moneyHeadPrice + ", moneyBodyPrice="
				+ moneyBodyPrice + ", flightId=" + flightId + "]";
	}
	
}
