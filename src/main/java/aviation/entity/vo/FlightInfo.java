package aviation.entity.vo;

import java.util.Date;

public class FlightInfo {
	private int flightId;
	private String flightFrom;
	private String flightTo;
	private Date flightFromTime;
	private Date flightToTime;
	private String modelName;
	private int modelHeadNum;
	private int modelBodyNum;
	private double moneyHeadPrice;
	private double moneyBodyPrice;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public Date getFlightFromTime() {
		return flightFromTime;
	}
	public void setFlightFromTime(Date flightFromTime) {
		this.flightFromTime = flightFromTime;
	}
	public Date getFlightToTime() {
		return flightToTime;
	}
	public void setFlightToTime(Date flightToTime) {
		this.flightToTime = flightToTime;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getModelHeadNum() {
		return modelHeadNum;
	}
	public void setModelHeadNum(int modelHeadNum) {
		this.modelHeadNum = modelHeadNum;
	}
	public int getModelBodyNum() {
		return modelBodyNum;
	}
	public void setModelBodyNum(int modelBodyNum) {
		this.modelBodyNum = modelBodyNum;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flightFrom == null) ? 0 : flightFrom.hashCode());
		result = prime * result + ((flightFromTime == null) ? 0 : flightFromTime.hashCode());
		result = prime * result + flightId;
		result = prime * result + ((flightTo == null) ? 0 : flightTo.hashCode());
		result = prime * result + ((flightToTime == null) ? 0 : flightToTime.hashCode());
		result = prime * result + modelBodyNum;
		result = prime * result + modelHeadNum;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(moneyBodyPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(moneyHeadPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		FlightInfo other = (FlightInfo) obj;
		if (flightFrom == null) {
			if (other.flightFrom != null)
				return false;
		} else if (!flightFrom.equals(other.flightFrom))
			return false;
		if (flightFromTime == null) {
			if (other.flightFromTime != null)
				return false;
		} else if (!flightFromTime.equals(other.flightFromTime))
			return false;
		if (flightId != other.flightId)
			return false;
		if (flightTo == null) {
			if (other.flightTo != null)
				return false;
		} else if (!flightTo.equals(other.flightTo))
			return false;
		if (flightToTime == null) {
			if (other.flightToTime != null)
				return false;
		} else if (!flightToTime.equals(other.flightToTime))
			return false;
		if (modelBodyNum != other.modelBodyNum)
			return false;
		if (modelHeadNum != other.modelHeadNum)
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (Double.doubleToLongBits(moneyBodyPrice) != Double.doubleToLongBits(other.moneyBodyPrice))
			return false;
		if (Double.doubleToLongBits(moneyHeadPrice) != Double.doubleToLongBits(other.moneyHeadPrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FlightInfo [flightId=" + flightId + ", flightFrom=" + flightFrom + ", flightTo=" + flightTo
				+ ", flightFromTime=" + flightFromTime + ", flightToTime=" + flightToTime + ", modelName=" + modelName
				+ ", modelHeadNum=" + modelHeadNum + ", modelBodyNum=" + modelBodyNum + ", moneyHeadPrice="
				+ moneyHeadPrice + ", moneyBodyPrice=" + moneyBodyPrice + "]";
	}
	public FlightInfo(int flightId, String flightFrom, String flightTo, Date flightFromTime, Date flightToTime,
			String modelName, int modelHeadNum, int modelBodyNum, double moneyHeadPrice, double moneyBodyPrice) {
		super();
		this.flightId = flightId;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.flightFromTime = flightFromTime;
		this.flightToTime = flightToTime;
		this.modelName = modelName;
		this.modelHeadNum = modelHeadNum;
		this.modelBodyNum = modelBodyNum;
		this.moneyHeadPrice = moneyHeadPrice;
		this.moneyBodyPrice = moneyBodyPrice;
	}
	public FlightInfo() {
		super();
	}
	
	
}
