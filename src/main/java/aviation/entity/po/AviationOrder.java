package aviation.entity.po;

import java.io.Serializable;
import java.util.Date;

public class AviationOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int OrderId;
	private String OrderName;
	private String OrderIdcard;
	private Date OrderTime;
	private double OrderMoney;
	private Date OrderFromTime;
	private Date OrderFromTo;
	private String OrderTimes;
	private String OrderTo;
	private String OrderUserName;
	private String OrderPrice;
	private int UserId;
	private int OrderStatic;
	public int getOrderStatic() {
		return orderStatic;
	}
	public void setOrderStatic(int orderStatic) {
		this.orderStatic = orderStatic;
	}

	private int orderStatic;
    
	
	public AviationOrder(String orderIdcard, double orderMoney, Date orderFromTime, Date orderFromTo, String orderTimes,
			String orderTo, String orderUserName, String orderPrice, int userId, int orderStatic) {
		super();
		OrderIdcard = orderIdcard;
		OrderMoney = orderMoney;
		OrderFromTime = orderFromTime;
		OrderFromTo = orderFromTo;
		OrderTimes = orderTimes;
		OrderTo = orderTo;
		OrderUserName = orderUserName;
		OrderPrice = orderPrice;
		UserId = userId;
		this.orderStatic = orderStatic;
	}

	
	
	public AviationOrder(int orderId, String orderName, String orderIdcard, Date orderTime, double orderMoney,
			Date orderFromTime, Date orderFromTo, String orderTimes, String orderTo, String orderUserName,
			String orderPrice,int userId) {
		super();
		OrderId = orderId;
		OrderName = orderName;
		OrderIdcard = orderIdcard;
		OrderTime = orderTime;
		OrderMoney = orderMoney;
		OrderFromTime = orderFromTime;
		OrderFromTo = orderFromTo;
		OrderTimes = orderTimes;
		OrderTo = orderTo;
		OrderUserName = orderUserName;
		OrderPrice = orderPrice;
		UserId = userId;
		OrderStatic = orderStatic;
	}
	
	public AviationOrder() {
		super();
	}

	public AviationOrder( String orderIdcard, double orderMoney, Date orderFromTime, Date orderFromTo,
			String orderTimes, String orderTo, String orderUserName, String orderPrice) {
		super();		
		OrderIdcard = orderIdcard;
		OrderMoney = orderMoney;
		OrderFromTime = orderFromTime;
		OrderFromTo = orderFromTo;
		OrderTimes = orderTimes;
		OrderTo = orderTo;
		OrderUserName = orderUserName;
		OrderPrice = orderPrice;
	}
	
	public AviationOrder(int orderId) {
		super();
		OrderId = orderId;
		
	}
	public AviationOrder(int orderId, String orderIdcard, double orderMoney,
			Date orderFromTime, Date orderFromTo, String orderTimes, String orderTo, String orderUserName,
			String orderPrice) {
		super();
		OrderId = orderId;	
		OrderIdcard = orderIdcard;		
		OrderMoney = orderMoney;
		OrderFromTime = orderFromTime;
		OrderFromTo = orderFromTo;
		OrderTimes = orderTimes;
		OrderTo = orderTo;
		OrderUserName = orderUserName;
		OrderPrice = orderPrice;
	}
	
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getOrderName() {
		return OrderName;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	public String getOrderIdcard() {
		return OrderIdcard;
	}

	public void setOrderIdcard(String orderIdcard) {
		OrderIdcard = orderIdcard;
	}

	public Date getOrderTime() {
		return OrderTime;
	}

	public void setOrderTime(Date orderTime) {
		OrderTime = orderTime;
	}

	public double getOrderMoney() {
		return OrderMoney;
	}

	public void setOrderMoney(double orderMoney) {
		OrderMoney = orderMoney;
	}

	public Date getOrderFromTime() {
		return OrderFromTime;
	}

	public void setOrderFromTime(Date orderFromTime) {
		OrderFromTime = orderFromTime;
	}

	public Date getOrderFromTo() {
		return OrderFromTo;
	}

	public void setOrderFromTo(Date orderFromTo) {
		OrderFromTo = orderFromTo;
	}

	public String getOrderTimes() {
		return OrderTimes;
	}

	public void setOrderTimes(String orderTimes) {
		OrderTimes = orderTimes;
	}

	public String getOrderTo() {
		return OrderTo;
	}

	public void setOrderTo(String orderTo) {
		OrderTo = orderTo;
	}

	public String getOrderUserName() {
		return OrderUserName;
	}

	public void setOrderUserName(String orderUserName) {
		OrderUserName = orderUserName;
	}

	public String getOrderPrice() {
		return OrderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		OrderPrice = orderPrice;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AviationOrder [OrderId=" + OrderId + ", OrderName=" + OrderName + ", OrderIdcard=" + OrderIdcard
				+ ", OrderTime=" + OrderTime + ", OrderMoney=" + OrderMoney + ", OrderFromTime=" + OrderFromTime
				+ ", OrderFromTo=" + OrderFromTo + ", OrderTimes=" + OrderTimes + ", OrderTo=" + OrderTo
				+ ", OrderUserName=" + OrderUserName + ", OrderPrice=" + OrderPrice + ", UserId=" + UserId
				+ ", OrderStatic=" + OrderStatic + ", orderStatic=" + orderStatic + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OrderFromTime == null) ? 0 : OrderFromTime.hashCode());
		result = prime * result + ((OrderFromTo == null) ? 0 : OrderFromTo.hashCode());
		result = prime * result + OrderId;
		result = prime * result + ((OrderIdcard == null) ? 0 : OrderIdcard.hashCode());
		long temp;
		temp = Double.doubleToLongBits(OrderMoney);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((OrderName == null) ? 0 : OrderName.hashCode());
		result = prime * result + ((OrderPrice == null) ? 0 : OrderPrice.hashCode());
		result = prime * result + OrderStatic;
		result = prime * result + ((OrderTime == null) ? 0 : OrderTime.hashCode());
		result = prime * result + ((OrderTimes == null) ? 0 : OrderTimes.hashCode());
		result = prime * result + ((OrderTo == null) ? 0 : OrderTo.hashCode());
		result = prime * result + ((OrderUserName == null) ? 0 : OrderUserName.hashCode());
		result = prime * result + UserId;
		result = prime * result + orderStatic;
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
		if (OrderFromTime == null) {
			if (other.OrderFromTime != null)
				return false;
		} else if (!OrderFromTime.equals(other.OrderFromTime))
			return false;
		if (OrderFromTo == null) {
			if (other.OrderFromTo != null)
				return false;
		} else if (!OrderFromTo.equals(other.OrderFromTo))
			return false;
		if (OrderId != other.OrderId)
			return false;
		if (OrderIdcard == null) {
			if (other.OrderIdcard != null)
				return false;
		} else if (!OrderIdcard.equals(other.OrderIdcard))
			return false;
		if (Double.doubleToLongBits(OrderMoney) != Double.doubleToLongBits(other.OrderMoney))
			return false;
		if (OrderName == null) {
			if (other.OrderName != null)
				return false;
		} else if (!OrderName.equals(other.OrderName))
			return false;
		if (OrderPrice == null) {
			if (other.OrderPrice != null)
				return false;
		} else if (!OrderPrice.equals(other.OrderPrice))
			return false;
		if (OrderStatic != other.OrderStatic)
			return false;
		if (OrderTime == null) {
			if (other.OrderTime != null)
				return false;
		} else if (!OrderTime.equals(other.OrderTime))
			return false;
		if (OrderTimes == null) {
			if (other.OrderTimes != null)
				return false;
		} else if (!OrderTimes.equals(other.OrderTimes))
			return false;
		if (OrderTo == null) {
			if (other.OrderTo != null)
				return false;
		} else if (!OrderTo.equals(other.OrderTo))
			return false;
		if (OrderUserName == null) {
			if (other.OrderUserName != null)
				return false;
		} else if (!OrderUserName.equals(other.OrderUserName))
			return false;
		if (UserId != other.UserId)
			return false;
		if (orderStatic != other.orderStatic)
			return false;
		return true;
	}

	
	
	
}