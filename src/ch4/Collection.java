package ch4;
 
// 定义接口
public interface Collection {
	void add(Object obj);
	void delete(Object obj);
	Object find(Object obj);
	int size();
}
