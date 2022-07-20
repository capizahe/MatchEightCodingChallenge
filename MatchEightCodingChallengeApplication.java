import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class MatchEightCodingChallengeApplication {

	public static void main(String... args) throws Exception {

		validateInput(args);

		StringTokenizer st = new StringTokenizer(args[0], ",");

		int valueToSearch = Integer.valueOf(args[1]);

		HashSet<Integer> list = new HashSet<>(st.countTokens());
		Map<Integer, Integer> pairs = new HashMap<>();

		st.asIterator().forEachRemaining(e -> list.add(Integer.valueOf((String) e)));

		list.forEach((key) -> {

			if (key < valueToSearch) {

				int differenceNeeded = valueToSearch - key;

				if (list.contains(differenceNeeded)) {

					pairs.put(differenceNeeded, key);

					if (pairs.get(key) != null  && pairs.get(key) == differenceNeeded) {
						//Should not print the value
					}else {
						System.out.println(String.format("%d,%d", differenceNeeded, key));						
					}
				}
			}
		});
	}

	/**
	 * This method will validate the provided input and check if 
	 * there it is any value that can not be casted as Integer within the list.
	 * If  there it is any error when validating it will throw an exception.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void validateInput(String... args) throws Exception {

		//System.out.println("List: " + args[0]);
		//System.out.println("Value to search: " + args[1]);

		// Validate array length
		if (args.length != 2) {
			throw new Exception(
					"All the required parameters must be provided. Parameters 2 (List of Values, Value to Search)");
		}

		StringTokenizer st = new StringTokenizer(args[0], ",");

		st.asIterator().forEachRemaining(e -> {
			// Validate format values from List
			try {
				Integer.valueOf((String) e);

			} catch (NumberFormatException ex) {
				throw new NumberFormatException(String.format("The element %s from array cannot be parsed as Int.", e));
			}
		});

		// Validate format from value to Search and values from List
		try {
			Integer.valueOf(args[1]);
		} catch (NumberFormatException e) {
			throw new NumberFormatException(String.format("The parameter %s cannot be parsed as Int", args[1]));
		}
	}

}
