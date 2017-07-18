package MeiLiExam.prob4;


public class NewPair<K, V> {
	private K first;
    private V second;

    public NewPair(K key, V value) {
		this.first = key;
		this.second = value;
    }
 
    public String toString(){
    	return "[" + first + ", " + second + "]";
    }
}