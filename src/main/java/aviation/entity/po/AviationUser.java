package aviation.entity.po;

public class AviationUser {
	private int userId;
	private String userName;
	private String userPwd;
	private String userSex;
	private String userAge;
	public AviationUser(int userId, String userName, String userPwd, String userSex, String userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userSex = userSex;
		this.userAge = userAge;
	}
	public AviationUser() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userAge == null) ? 0 : userAge.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPwd == null) ? 0 : userPwd.hashCode());
		result = prime * result + ((userSex == null) ? 0 : userSex.hashCode());
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
		AviationUser other = (AviationUser) obj;
		if (userAge == null) {
			if (other.userAge != null)
				return false;
		} else if (!userAge.equals(other.userAge))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPwd == null) {
			if (other.userPwd != null)
				return false;
		} else if (!userPwd.equals(other.userPwd))
			return false;
		if (userSex == null) {
			if (other.userSex != null)
				return false;
		} else if (!userSex.equals(other.userSex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AviationUser [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userSex="
				+ userSex + ", userAge=" + userAge + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	
	
}
