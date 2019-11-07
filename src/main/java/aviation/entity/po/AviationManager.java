package aviation.entity.po;

public class AviationManager {
	private int managerId;
	private String managerName;
	private String managerSex;
	private String managerTel;
	private String managerPwd;
	public AviationManager(int managerId, String managerName, String managerSex, String managerTel, String managerPwd) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSex = managerSex;
		this.managerTel = managerTel;
		this.managerPwd = managerPwd;
	}
	public AviationManager() {
		super();
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerSex() {
		return managerSex;
	}
	public void setManagerSex(String managerSex) {
		this.managerSex = managerSex;
	}
	public String getManagerTel() {
		return managerTel;
	}
	public void setManagerTel(String managerTel) {
		this.managerTel = managerTel;
	}
	public String getManagerPwd() {
		return managerPwd;
	}
	public void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}
	@Override
	public String toString() {
		return "AviationManager [managerId=" + managerId + ", managerName=" + managerName + ", managerSex=" + managerSex
				+ ", managerTel=" + managerTel + ", managerPwd=" + managerPwd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + managerId;
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
		result = prime * result + ((managerPwd == null) ? 0 : managerPwd.hashCode());
		result = prime * result + ((managerSex == null) ? 0 : managerSex.hashCode());
		result = prime * result + ((managerTel == null) ? 0 : managerTel.hashCode());
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
		AviationManager other = (AviationManager) obj;
		if (managerId != other.managerId)
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (managerPwd == null) {
			if (other.managerPwd != null)
				return false;
		} else if (!managerPwd.equals(other.managerPwd))
			return false;
		if (managerSex == null) {
			if (other.managerSex != null)
				return false;
		} else if (!managerSex.equals(other.managerSex))
			return false;
		if (managerTel == null) {
			if (other.managerTel != null)
				return false;
		} else if (!managerTel.equals(other.managerTel))
			return false;
		return true;
	}
	
	
	
}
