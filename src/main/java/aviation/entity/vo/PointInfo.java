package aviation.entity.vo;

public class PointInfo {
	private int pointId;
	private String pointCity;
	private int managerId;
	private String managerName;
	private String managerSex;
	private String managerTel;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + managerId;
		result = prime * result + ((managerName == null) ? 0 : managerName.hashCode());
		result = prime * result + ((managerSex == null) ? 0 : managerSex.hashCode());
		result = prime * result + ((managerTel == null) ? 0 : managerTel.hashCode());
		result = prime * result + ((pointCity == null) ? 0 : pointCity.hashCode());
		result = prime * result + pointId;
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
		PointInfo other = (PointInfo) obj;
		if (managerId != other.managerId)
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
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
		if (pointCity == null) {
			if (other.pointCity != null)
				return false;
		} else if (!pointCity.equals(other.pointCity))
			return false;
		if (pointId != other.pointId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PointInfo [pointId=" + pointId + ", pointCity=" + pointCity + ", managerId=" + managerId
				+ ", managerName=" + managerName + ", managerSex=" + managerSex + ", managerTel=" + managerTel + "]";
	}
	public PointInfo(int pointId, String pointCity, int managerId, String managerName, String managerSex,
			String managerTel) {
		super();
		this.pointId = pointId;
		this.pointCity = pointCity;
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSex = managerSex;
		this.managerTel = managerTel;
	}
	public PointInfo(String pointCity, int managerId, String managerName, String managerSex, String managerTel) {
		super();
		this.pointCity = pointCity;
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSex = managerSex;
		this.managerTel = managerTel;
	}
	public PointInfo() {
		super();
	}
	
	
	
}
