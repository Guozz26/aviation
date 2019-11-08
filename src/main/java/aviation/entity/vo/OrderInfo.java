package aviation.entity.vo;

import java.util.Date;

public class OrderInfo {
	private String userName;
	private int orderId;
	private String orderIdcard;
	private  Date orderTime;
	private int flightId;
	private Date flightFromTime;
	private String flightFrom;
	private Date flightToTime;
	private String flightTo;
	private String modelName;
	private  String priceName;
	private int totalPrice;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public Date getFlightFromTime() {
		return flightFromTime;
	}
	public void setFlightFromTime(Date flightFromTime) {
		this.flightFromTime = flightFromTime;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
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
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public OrderInfo(String userName, int orderId, String orderIdcard, Date orderTime, int flightId,
			Date flightFromTime, String flightFrom, Date flightToTime, String flightTo, String modelName,
			String priceName, int totalPrice) {
		super();
		this.userName = userName;
		this.orderId = orderId;
		this.orderIdcard = orderIdcard;
		this.orderTime = orderTime;
		this.flightId = flightId;
		this.flightFromTime = flightFromTime;
		this.flightFrom = flightFrom;
		this.flightToTime = flightToTime;
		this.flightTo = flightTo;
		this.modelName = modelName;
		this.priceName = priceName;
		this.totalPrice = totalPrice;
	}
	public OrderInfo() {
		super();
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
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + orderId;
		result = prime * result + ((orderIdcard == null) ? 0 : orderIdcard.hashCode());
		result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result + ((priceName == null) ? 0 : priceName.hashCode());
		result = prime * result + totalPrice;
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
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderIdcard == null) {
			if (other.orderIdcard != null)
				return false;
		} else if (!orderIdcard.equals(other.orderIdcard))
			return false;
		if (orderTime == null) {
			if (other.orderTime != null)
				return false;
		} else if (!orderTime.equals(other.orderTime))
			return false;
		if (priceName == null) {
			if (other.priceName != null)
				return false;
		} else if (!priceName.equals(other.priceName))
			return false;
		if (totalPrice != other.totalPrice)
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
		return "OrderInfo [userName=" + userName + ", orderId=" + orderId + ", orderIdcard=" + orderIdcard
				+ ", orderTime=" + orderTime + ", flightId=" + flightId + ", flightFromTime=" + flightFromTime
				+ ", flightFrom=" + flightFrom + ", flightToTime=" + flightToTime + ", flightTo=" + flightTo
				+ ", modelName=" + modelName + ", priceName=" + priceName + ", totalPrice=" + totalPrice + "]";
	}
	
}
