

class HashMap<K,V> {
	
	
static  class Entry <K,V> {
		K key;
		V data;
		Entry<K,V> next;
		Entry(K key , V value, Entry<K,V> next){
			this.key=key;
			this.data=value;
			this.next=next;
			
	}
	
	}

	private Entry[] table;
	private int customizeSizeOfHashMap =4;
	
public	HashMap(){
	table = new Entry[4];
	}

public int getHashcode(K key) {
		return Math.abs(key.hashCode()%customizeSizeOfHashMap);
}

public void put(K key , V value) {
	
	int hashIndex= getHashcode(key);
	Entry<K,V> newEntry = new Entry<K,V>(key,value,null);
	
	if(table[hashIndex]==null) table[hashIndex] =newEntry;
	else {
		Entry<K,V> previous = null , current = table[hashIndex];
		
		while(current!=null) {
			
			if(current.key.equals(key)) {// if entry found
			if(previous==null) // First Node 
			{
				newEntry.next=current.next;
				table[hashIndex] =newEntry;
			}
			else { // Second or other node
				newEntry.next =previous.next;
				table[hashIndex]=newEntry;
				
			}
			
			}
			
			previous=current;
			current=current.next;
			
		}
		// when key not match for that index than insert at last
		newEntry.next=previous.next;
		previous.next=newEntry;
	}
	
	
	
}

public V getKey(K key) {
	int hashIdex= getHashcode(key);
	Entry<K,V> entry= table[hashIdex];
	while(entry!=null) {
		if(entry.key.equals(key)) {
			return entry.data;
		}
		entry=entry.next;
				
	}
	
	
	return null;
}
}

public class Test {

	public static void main(String[] args) {
		
		HashMap hashMap = new HashMap();
		System.out.println(hashMap);
		hashMap.put(5, 100);
		hashMap.put(9, 101);
		hashMap.put(13, 102);
		hashMap.put(17, 102);
		
		
	System.out.println(hashMap.getKey(5));
		System.out.println(hashMap.getKey(9));
		System.out.println(hashMap.getKey(13));
		System.out.println(hashMap.getKey(17));
		
		
	}

}
