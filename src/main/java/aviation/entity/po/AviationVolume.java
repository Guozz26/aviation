package aviation.entity.po;

public class AviationVolume {
	private int volumeId;
	private int salesmanId;
	private int pointId;
	private int orderId;
	public AviationVolume(int volumeId, int salesmanId, int pointId, int orderId) {
		super();
		this.volumeId = volumeId;
		this.salesmanId = salesmanId;
		this.pointId = pointId;
		this.orderId = orderId;
	}
	public AviationVolume() {
		super();
	}
	@Override
	public String toString() {
		return "AviationVolume [volumeId=" + volumeId + ", salesmanId=" + salesmanId + ", pointId=" + pointId
				+ ", orderId=" + orderId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + pointId;
		result = prime * result + salesmanId;
		result = prime * result + volumeId;
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
		AviationVolume other = (AviationVolume) obj;
		if (orderId != other.orderId)
			return false;
		if (pointId != other.pointId)
			return false;
		if (salesmanId != other.salesmanId)
			return false;
		if (volumeId != other.volumeId)
			return false;
		return true;
	}
	public int getVolumeId() {
		return volumeId;
	}
	public void setVolumeId(int volumeId) {
		this.volumeId = volumeId;
	}
	public int getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}
	public int getPointId() {
		return pointId;
	}
	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
