import java.util.HashMap;
import java.util.Map;

public class Spreadsheet {

	Map<String, String> sheet = new HashMap<String, String>();

	public String get(String cell) {
		return sheet.get(cell);
	}

	public void set(String cell, String value) {
		sheet.put(cell, value);
	}

	public String evaluate(String cell) throws SpreadSheetException {
		try {
			String result = "";
			if (cell.startsWith("'")) {

			} else
				result = "" + Integer.parseInt(sheet.get(cell));
			return result;
		} catch (Exception e) {
			throw new SpreadSheetException();
		}
	}

}
