package aviation.entity.po;

import java.util.Date;

public class AviationFlight {
	private int flightId;
	private String flightFrom;
	private String flightTo;
	private Date flightFromTime;
	private Date flightToTime;
	private int flightHeadNum;
	private int flightBodyNum;
	private int modelId;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public Date getFlightFromTime() {
		return flightFromTime;
	}
	public void setFlightFromTime(Date flightFromTime) {
		this.flightFromTime = flightFromTime;
	}
	public Date getFlightToTime() {
		return flightToTime;
	}
	public void setFlightToTime(Date flightToTime) {
		this.flightToTime = flightToTime;
	}
	public int getFlightHeadNum() {
		return flightHeadNum;
	}
	public void setFlightHeadNum(int flightHeadNum) {
		this.flightHeadNum = flightHeadNum;
	}
	public int getFlightBodyNum() {
		return flightBodyNum;
	}
	public void setFlightBodyNum(int flightBodyNum) {
		this.flightBodyNum = flightBodyNum;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flightBodyNum;
		result = prime * result + ((flightFrom == null) ? 0 : flightFrom.hashCode());
		result = prime * result + ((flightFromTime == null) ? 0 : flightFromTime.hashCode());
		result = prime * result + flightHeadNum;
		result = prime * result + flightId;
		result = prime * result + ((flightTo == null) ? 0 : flightTo.hashCode());
		result = prime * result + ((flightToTime == null) ? 0 : flightToTime.hashCode());
		result = prime * result + modelId;
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
		AviationFlight other = (AviationFlight) obj;
		if (flightBodyNum != other.flightBodyNum)
			return false;
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
		if (flightHeadNum != other.flightHeadNum)
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
		if (modelId != other.modelId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AviationFlight [flightId=" + flightId + ", flightFrom=" + flightFrom + ", flightTo=" + flightTo
				+ ", flightFromTime=" + flightFromTime + ", flightToTime=" + flightToTime + ", flightHeadNum="
				+ flightHeadNum + ", flightBodyNum=" + flightBodyNum + ", modelId=" + modelId + "]";
	}
	public AviationFlight(int flightId, String flightFrom, String flightTo, Date flightFromTime, Date flightToTime,
			int flightHeadNum, int flightBodyNum, int modelId) {
		super();
		this.flightId = flightId;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.flightFromTime = flightFromTime;
		this.flightToTime = flightToTime;
		this.flightHeadNum = flightHeadNum;
		this.flightBodyNum = flightBodyNum;
		this.modelId = modelId;
	}
	public AviationFlight(String flightFrom, String flightTo, Date flightFromTime, Date flightToTime, int flightHeadNum,
			int flightBodyNum, int modelId) {
		super();
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.flightFromTime = flightFromTime;
		this.flightToTime = flightToTime;
		this.flightHeadNum = flightHeadNum;
		this.flightBodyNum = flightBodyNum;
		this.modelId = modelId;
	}
	public AviationFlight() {
		super();
	}
	
}
