package aviation.entity.po;

public class AviationModel {
	private int modelId;
	private String modelName;
	private int modelHeadNum;
	private int modelBodyNum;
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
	public int getModelHeadNum() {
		return modelHeadNum;
	}
	public void setModelHeadNum(int modelHeadNum) {
		this.modelHeadNum = modelHeadNum;
	}
	public int getModelBodyNum() {
		return modelBodyNum;
	}
	public void setModelBodyNum(int modelBodyNum) {
		this.modelBodyNum = modelBodyNum;
	}
	public AviationModel(int modelId, String modelName, int modelHeadNum, int modelBodyNum) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.modelHeadNum = modelHeadNum;
		this.modelBodyNum = modelBodyNum;
	}
	
	public AviationModel( String modelName, int modelHeadNum, int modelBodyNum) {
		super();
		this.modelName = modelName;
		this.modelHeadNum = modelHeadNum;
		this.modelBodyNum = modelBodyNum;
	}
	public AviationModel(int modelId) {
		super();
		this.modelId = modelId;
	}
	
	
	public AviationModel() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + modelBodyNum;
		result = prime * result + modelHeadNum;
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
		if (modelBodyNum != other.modelBodyNum)
			return false;
		if (modelHeadNum != other.modelHeadNum)
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
		return "AviationModel [modelId=" + modelId + ", modelName=" + modelName + ", modelHeadNum=" + modelHeadNum
				+ ", modelBodyNum=" + modelBodyNum + "]";
	}

}
