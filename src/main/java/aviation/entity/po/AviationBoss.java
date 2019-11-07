package aviation.entity.po;

public class AviationBoss {
	private int bossId;
	private String bossPwd;
	
	
	public int getBossId() {
		return bossId;
	}
	public void setBossId(int bossId) {
		this.bossId = bossId;
	}
	public String getBossPwd() {
		return bossPwd;
	}
	public void setBossPwd(String bossPwd) {
		this.bossPwd = bossPwd;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bossId;
		result = prime * result + ((bossPwd == null) ? 0 : bossPwd.hashCode());
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
		AviationBoss other = (AviationBoss) obj;
		if (bossId != other.bossId)
			return false;
		if (bossPwd == null) {
			if (other.bossPwd != null)
				return false;
		} else if (!bossPwd.equals(other.bossPwd))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AviationBoss [bossId=" + bossId + ", bossPwd=" + bossPwd + "]";
	}
	public AviationBoss(int bossId, String bossPwd) {
		super();
		this.bossId = bossId;
		this.bossPwd = bossPwd;
	}
	public AviationBoss() {
		super();
	}
	
	
}
