package aviation.entity.po;

import java.util.Date;

public class AviationSalesman {
	private int salesmanId;
	private String salesmanName;
	private String salesmanSex;
	private Date salesmanAge;
	private String salesmanPwd;
	private int pointId;
	
	
	public AviationSalesman(int salesmanId, String salesmanName, String salesmanSex, Date salesmanAge,
			String salesmanPwd, int pointId) {
		super();
		this.salesmanId = salesmanId;
		this.salesmanName = salesmanName;
		this.salesmanSex = salesmanSex;
		this.salesmanAge = salesmanAge;
		this.salesmanPwd = salesmanPwd;
		this.pointId = pointId;
	}
	public AviationSalesman(String salesmanName, String salesmanSex, Date salesmanAge,
			String salesmanPwd, int pointId) {
		super();
		this.salesmanName = salesmanName;
		this.salesmanSex = salesmanSex;
		this.salesmanAge = salesmanAge;
		this.salesmanPwd = salesmanPwd;
		this.pointId = pointId;		
	}
	public AviationSalesman(int salesmanId) {
		super();
		this.salesmanId = salesmanId;		
	}
	
	public AviationSalesman() {
		super();
	}
	@Override
	public String toString() {
		return "AviationSalesman [salesmanId=" + salesmanId + ", salesmanName=" + salesmanName + ", salesmanSex="
				+ salesmanSex + ", salesmanAge=" + salesmanAge + ", salesmanPwd=" + salesmanPwd + ", pointId=" + pointId
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pointId;
		result = prime * result + ((salesmanAge == null) ? 0 : salesmanAge.hashCode());
		result = prime * result + salesmanId;
		result = prime * result + ((salesmanName == null) ? 0 : salesmanName.hashCode());
		result = prime * result + ((salesmanPwd == null) ? 0 : salesmanPwd.hashCode());
		result = prime * result + ((salesmanSex == null) ? 0 : salesmanSex.hashCode());
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
		AviationSalesman other = (AviationSalesman) obj;
		if (pointId != other.pointId)
			return false;
		if (salesmanAge == null) {
			if (other.salesmanAge != null)
				return false;
		} else if (!salesmanAge.equals(other.salesmanAge))
			return false;
		if (salesmanId != other.salesmanId)
			return false;
		if (salesmanName == null) {
			if (other.salesmanName != null)
				return false;
		} else if (!salesmanName.equals(other.salesmanName))
			return false;
		if (salesmanPwd == null) {
			if (other.salesmanPwd != null)
				return false;
		} else if (!salesmanPwd.equals(other.salesmanPwd))
			return false;
		if (salesmanSex == null) {
			if (other.salesmanSex != null)
				return false;
		} else if (!salesmanSex.equals(other.salesmanSex))
			return false;
		return true;
	}
	public int getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}
	public String getSalesmanName() {
		return salesmanName;
	}
	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}
	public String getSalesmanSex() {
		return salesmanSex;
	}
	public void setSalesmanSex(String salesmanSex) {
		this.salesmanSex = salesmanSex;
	}
	public Date getSalesmanAge() {
		return salesmanAge;
	}
	public void setSalesmanAge(Date salesmanAge) {
		this.salesmanAge = salesmanAge;
	}
	public String getSalesmanPwd() {
		return salesmanPwd;
	}
	public void setSalesmanPwd(String salesmanPwd) {
		this.salesmanPwd = salesmanPwd;
	}
	public int getPointId() {
		return pointId;
	}
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	
}
