package aviation.entity.po;

public class AviationPrice {
   private int priceId;
   private String privaceName;
public int getPriceId() {
	return priceId;
}
public void setPriceId(int priceId) {
	this.priceId = priceId;
}
public String getPrivaceName() {
	return privaceName;
}
public void setPrivaceName(String privaceName) {
	this.privaceName = privaceName;
}
public AviationPrice(int priceId, String privaceName) {
	super();
	this.priceId = priceId;
	this.privaceName = privaceName;
}
public AviationPrice() {
	super();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + priceId;
	result = prime * result + ((privaceName == null) ? 0 : privaceName.hashCode());
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
	AviationPrice other = (AviationPrice) obj;
	if (priceId != other.priceId)
		return false;
	if (privaceName == null) {
		if (other.privaceName != null)
			return false;
	} else if (!privaceName.equals(other.privaceName))
		return false;
	return true;
}
@Override
public String toString() {
	return "AviationPrice [priceId=" + priceId + ", privaceName=" + privaceName + "]";
}
  
   
}
