package comm.example;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	private Map<String, String> map;

	public MapDemo() {
		super();
		// map=new HashMap<String,String>();
		map = new TreeMap<>();
	}

	public void createMap() {
		map.put("name", "Rahul");
		map.put("address", "India");
		map.put("phone number", "123456");
		map.put("name", "1234");
	}

	public Set<String> getMapKeys() {

		return map.keySet();
	}

	public Collection<String> getMapValues() {
		return map.values();
	}

}
