package aviation.entity.vo;

import java.util.Date;

/**
 * @author LENOVO
 *
 */
public class OrderInfo {
	private String userName;
	private String userAge;
	private String orderName;
	private int orderId;
	private String orderIdcard;
	private  Date orderTime;
	private String flightFrom;
	private Date flightFromTime;
	private Date flightToTime;
	private String flightTo;
	private String modelName;
	private double moneyHeadPrice;
	private double moneyBodyPrice;
	private String zuo;
	
	public String getZuo() {
		return zuo;
	}
	public void setZuo(String zuo) {
		this.zuo = zuo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderIdcard() {
		return orderIdcard;
	}
	public void setOrderIdcard(String orderIdcard) {
		this.orderIdcard = orderIdcard;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
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
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
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
		result = prime * result + ((flightTo == null) ? 0 : flightTo.hashCode());
		result = prime * result + ((flightToTime == null) ? 0 : flightToTime.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(moneyBodyPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(moneyHeadPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + orderId;
		result = prime * result + ((orderIdcard == null) ? 0 : orderIdcard.hashCode());
		result = prime * result + ((orderName == null) ? 0 : orderName.hashCode());
		result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result + ((userAge == null) ? 0 : userAge.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		OrderInfo other = (OrderInfo) obj;
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
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (Double.doubleToLongBits(moneyBodyPrice) != Double.doubleToLongBits(other.moneyBodyPrice))
			return false;
		if (Double.doubleToLongBits(moneyHeadPrice) != Double.doubleToLongBits(other.moneyHeadPrice))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderIdcard == null) {
			if (other.orderIdcard != null)
				return false;
		} else if (!orderIdcard.equals(other.orderIdcard))
			return false;
		if (orderName == null) {
			if (other.orderName != null)
				return false;
		} else if (!orderName.equals(other.orderName))
			return false;
		if (orderTime == null) {
			if (other.orderTime != null)
				return false;
		} else if (!orderTime.equals(other.orderTime))
			return false;
		if (userAge == null) {
			if (other.userAge != null)
				return false;
		} else if (!userAge.equals(other.userAge))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderInfo [userName=" + userName + ", userAge=" + userAge + ", orderName=" + orderName + ", orderId="
				+ orderId + ", orderIdcard=" + orderIdcard + ", orderTime=" + orderTime + ", flightFrom=" + flightFrom
				+ ", flightFromTime=" + flightFromTime + ", flightToTime=" + flightToTime + ", flightTo=" + flightTo
				+ ", modelName=" + modelName + ", moneyHeadPrice=" + moneyHeadPrice + ", moneyBodyPrice="
				+ moneyBodyPrice + "]";
	}
	public OrderInfo(String userName, String userAge, String orderName, int orderId, String orderIdcard, Date orderTime,
			String flightFrom, Date flightFromTime, Date flightToTime, String flightTo, String modelName,
			double moneyHeadPrice, double moneyBodyPrice) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.orderName = orderName;
		this.orderId = orderId;
		this.orderIdcard = orderIdcard;
		this.orderTime = orderTime;
		this.flightFrom = flightFrom;
		this.flightFromTime = flightFromTime;
		this.flightToTime = flightToTime;
		this.flightTo = flightTo;
		this.modelName = modelName;
		this.moneyHeadPrice = moneyHeadPrice;
		this.moneyBodyPrice = moneyBodyPrice;
	}
	public OrderInfo(String userName, String userAge, String orderName, String orderIdcard, Date orderTime,
			String flightFrom, Date flightFromTime, Date flightToTime, String flightTo, String modelName,
			double moneyHeadPrice, double moneyBodyPrice) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.orderName = orderName;
		this.orderIdcard = orderIdcard;
		this.orderTime = orderTime;
		this.flightFrom = flightFrom;
		this.flightFromTime = flightFromTime;
		this.flightToTime = flightToTime;
		this.flightTo = flightTo;
		this.modelName = modelName;
		this.moneyHeadPrice = moneyHeadPrice;
		this.moneyBodyPrice = moneyBodyPrice;
	}
	public OrderInfo() {
		super();
	}
	
	
}
