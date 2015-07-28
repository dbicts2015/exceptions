package extra.oef03;

import java.util.HashMap;
import java.util.Map;

public class Woordenboek {

	private static final Map<String, String> dictionary = new HashMap<>();

	public void voegVerklaringToe(String key, String value) {
		if (dictionary.containsKey(key)) {
			throw new IllegalArgumentException("key[" + key + "] bestaat al");
		}
		dictionary.put(key, value);
	}

	public String vraagVerklaring(String key) {
		if (!dictionary.containsKey(key)) {
			throw new NullPointerException("geen verklaring voor " + key);
		}
		return dictionary.get(key);
	}

}
