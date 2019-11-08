package aviation.entity.po;

public class AviationPoint {
	private int pointId;
	private String pointCity;
	private int managerId;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + managerId;
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
		AviationPoint other = (AviationPoint) obj;
		if (managerId != other.managerId)
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
		return "AviationPoint [pointId=" + pointId + ", pointCity=" + pointCity + ", managerId=" + managerId + "]";
	}
	public AviationPoint(int pointId, String pointCity, int managerId) {
		super();
		this.pointId = pointId;
		this.pointCity = pointCity;
		this.managerId = managerId;
	}
	public AviationPoint( String pointCity, int managerId) {
		super();
		
		this.pointCity = pointCity;
		this.managerId = managerId;
	}
	public AviationPoint(int pointId) {
		super();
		this.pointId = pointId;
		
	}
	public AviationPoint() {
		super();
	}
	
}
