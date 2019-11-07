package aviation.entity.po;

import java.util.Date;

public class AviationOrder {
	private int orderId;
	private String orderName;
	private String orderIdcard;
	private Date orderTime;
	private int moneyId;
	private int flightId;
	private int userId;
	public AviationOrder(int orderId, String orderName, String orderIdcard, Date orderTime, int moneyId, int flightId,
			int userId) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderIdcard = orderIdcard;
		this.orderTime = orderTime;
		this.moneyId = moneyId;
		this.flightId = flightId;
		this.userId = userId;
	}
	public AviationOrder() {
		super();
	}
	@Override
	public String toString() {
		return "AviationOrder [orderId=" + orderId + ", orderName=" + orderName + ", orderIdcard=" + orderIdcard
				+ ", orderTime=" + orderTime + ", moneyId=" + moneyId + ", flightId=" + flightId + ", userId=" + userId
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flightId;
		result = prime * result + moneyId;
		result = prime * result + orderId;
		result = prime * result + ((orderIdcard == null) ? 0 : orderIdcard.hashCode());
		result = prime * result + ((orderName == null) ? 0 : orderName.hashCode());
		result = prime * result + ((orderTime == null) ? 0 : orderTime.hashCode());
		result = prime * result + userId;
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
		AviationOrder other = (AviationOrder) obj;
		if (flightId != other.flightId)
			return false;
		if (moneyId != other.moneyId)
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
		if (userId != other.userId)
			return false;
		return true;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
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
	public int getMoneyId() {
		return moneyId;
	}
	public void setMoneyId(int moneyId) {
		this.moneyId = moneyId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}
