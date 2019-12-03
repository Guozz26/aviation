package aviation.entity.vo;

import java.util.Date;

/**
 * @author LENOVO
 *
 */
public class OrderInfo {
	private String userName;
	private String OrderuserName;
	private int UserId;
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOrderuserName() {
		return OrderuserName;
	}
	public void setOrderuserName(String orderuserName) {
		OrderuserName = orderuserName;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OrderuserName == null) ? 0 : OrderuserName.hashCode());
		result = prime * result + UserId;
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
		if (OrderuserName == null) {
			if (other.OrderuserName != null)
				return false;
		} else if (!OrderuserName.equals(other.OrderuserName))
			return false;
		if (UserId != other.UserId)
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
		return "OrderInfo [userName=" + userName + ", OrderuserName=" + OrderuserName + ", UserId=" + UserId + "]";
	}
	public OrderInfo(String userName, String orderuserName, int userId) {
		super();
		this.userName = userName;
		OrderuserName = orderuserName;
		UserId = userId;
	}
	public OrderInfo() {
		super();
	}
	

	
	
	
	
	
}
