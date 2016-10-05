import java.util.HashMap;
import java.util.Map;

public class Spreadsheet {

	Map<String,Integer> sheet = new HashMap<String,Integer>();
	
	public Integer get(String cell) {
		return sheet.get(cell);
	}
	
	public void set(String cell, int value) {
		sheet.put(cell, value);
	}
	
	public String evaluate(String cell) {
		// to be implemented
		return null;
	}
	
}
