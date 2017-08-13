package lt;

import java.util.ArrayList;
import java.util.List;

public class L412 {
	public List<String> fizzBuzz(int n) {
		List listFizzBuzz = new ArrayList();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				listFizzBuzz.add("FizzBuzz");
			} else if (i % 3 == 0) {
				listFizzBuzz.add("Fizz");
			} else if (i % 5 == 0) {
				listFizzBuzz.add("Buzz");
			} else {

				String str = String.valueOf(i);
				listFizzBuzz.add(str);
			}

		}

		return listFizzBuzz;

	}

}
