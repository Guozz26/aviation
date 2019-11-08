package aviation.entity.po;

public class AviationTotal {
private int totalId;
private int flightId;
private int modelId;
private int priceId;
private String totalPrice;
public int getTotalId() {
	return totalId;
}
public void setTotalId(int totalId) {
	this.totalId = totalId;
}
public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
	this.flightId = flightId;
}
public int getModelId() {
	return modelId;
}
public void setModelId(int modelId) {
	this.modelId = modelId;
}
public int getPriceId() {
	return priceId;
}
public void setPriceId(int priceId) {
	this.priceId = priceId;
}
public String getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(String totalPrice) {
	this.totalPrice = totalPrice;
}
public AviationTotal(int totalId, int flightId, int modelId, int priceId, String totalPrice) {
	super();
	this.totalId = totalId;
	this.flightId = flightId;
	this.modelId = modelId;
	this.priceId = priceId;
	this.totalPrice = totalPrice;
}
public AviationTotal() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + flightId;
	result = prime * result + modelId;
	result = prime * result + priceId;
	result = prime * result + totalId;
	result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
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
	AviationTotal other = (AviationTotal) obj;
	if (flightId != other.flightId)
		return false;
	if (modelId != other.modelId)
		return false;
	if (priceId != other.priceId)
		return false;
	if (totalId != other.totalId)
		return false;
	if (totalPrice == null) {
		if (other.totalPrice != null)
			return false;
	} else if (!totalPrice.equals(other.totalPrice))
		return false;
	return true;
}
@Override
public String toString() {
	return "AviationTotal [totalId=" + totalId + ", flightId=" + flightId + ", modelId=" + modelId + ", priceId="
			+ priceId + ", totalPrice=" + totalPrice + "]";
}

}
