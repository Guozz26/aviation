package aviation.entity.po;

public class AviationModel {
	private int modelId;
	private String modelName;
	private int modelHeadnum;
	private int modelBodynum;
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getModelHeadnum() {
		return modelHeadnum;
	}
	public void setModelHeadnum(int modelHeadnum) {
		this.modelHeadnum = modelHeadnum;
	}
	public int getModelBodynum() {
		return modelBodynum;
	}
	public void setModelBodynum(int modelBodynum) {
		this.modelBodynum = modelBodynum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + modelBodynum;
		result = prime * result + modelHeadnum;
		result = prime * result + modelId;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
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
		AviationModel other = (AviationModel) obj;
		if (modelBodynum != other.modelBodynum)
			return false;
		if (modelHeadnum != other.modelHeadnum)
			return false;
		if (modelId != other.modelId)
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AviationModel [modelId=" + modelId + ", modelName=" + modelName + ", modelHeadnum=" + modelHeadnum
				+ ", modelBodynum=" + modelBodynum + "]";
	}
	public AviationModel(int modelId, String modelName, int modelHeadnum, int modelBodynum) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.modelHeadnum = modelHeadnum;
		this.modelBodynum = modelBodynum;
	}
	public AviationModel(String modelName, int modelHeadnum, int modelBodynum) {
		super();
		this.modelName = modelName;
		this.modelHeadnum = modelHeadnum;
		this.modelBodynum = modelBodynum;
	}
	public AviationModel() {
		super();
	}
	
}
