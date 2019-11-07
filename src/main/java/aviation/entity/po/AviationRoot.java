package aviation.entity.po;

public class AviationRoot {
	private int rootId;
	private String rootName;
	private String rootPwd;
	public AviationRoot(int rootId, String rootName, String rootPwd) {
		super();
		this.rootId = rootId;
		this.rootName = rootName;
		this.rootPwd = rootPwd;
	}
	public AviationRoot() {
		super();
	}
	@Override
	public String toString() {
		return "AviationRoot [rootId=" + rootId + ", rootName=" + rootName + ", rootPwd=" + rootPwd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rootId;
		result = prime * result + ((rootName == null) ? 0 : rootName.hashCode());
		result = prime * result + ((rootPwd == null) ? 0 : rootPwd.hashCode());
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
		AviationRoot other = (AviationRoot) obj;
		if (rootId != other.rootId)
			return false;
		if (rootName == null) {
			if (other.rootName != null)
				return false;
		} else if (!rootName.equals(other.rootName))
			return false;
		if (rootPwd == null) {
			if (other.rootPwd != null)
				return false;
		} else if (!rootPwd.equals(other.rootPwd))
			return false;
		return true;
	}
	public int getRootId() {
		return rootId;
	}
	public void setRootId(int rootId) {
		this.rootId = rootId;
	}
	public String getRootName() {
		return rootName;
	}
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}
	public String getRootPwd() {
		return rootPwd;
	}
	public void setRootPwd(String rootPwd) {
		this.rootPwd = rootPwd;
	}
	
	
}
