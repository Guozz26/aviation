package aviation.util;

import java.util.ArrayList;
import java.util.List;

/*
 * 	封住分页的类
 * 	泛型编程
 */
public class Pager<T> extends ArrayList<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<T> data;			// - 数据本身
	private int total;				//- 总的页数
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
