package prob1.rulesets;

import prob1.gui.BookWindow;

import java.awt.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow bookWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindow = (BookWindow) ob;
		nonemptyRule();
		isbnNumericRule();
		isbnNumberFormatRule();
		priceFloatingRule();
		priceRangeRule();
	}

	private void nonemptyRule() throws RuleException {
		if(bookWindow.getIsbnValue().trim().isEmpty() ||
				bookWindow.getTitleValue().trim().isEmpty() ||
				bookWindow.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void isbnNumericRule() throws RuleException {
		String val = bookWindow.getIsbnValue().trim();
		try {
			Long.parseLong(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}
	}

	private void isbnNumberFormatRule() throws RuleException {
		String val = bookWindow.getIsbnValue().trim();
		if(!(val.length() == 10 || val.length() == 13)) {
			throw new RuleException("ISBN must of either 10 or 13 characters");
		}
		if(val.length() == 10 && !(val.startsWith("0") || val.startsWith("1"))) {
			throw new RuleException("ISBN of 10 digits must start with 0 or 1");
		}
		if(val.length() == 13 && !(val.startsWith("978") || val.startsWith("979"))) {
			throw new RuleException("ISBN of 13 digits must start with 978 or 979");
		}
	}

	private void priceFloatingRule() throws RuleException {
		String val = bookWindow.getPriceValue().trim();
		try {
			Float.parseFloat(val);
			//val is numeric
			int i = val.lastIndexOf('.');
			if(i == -1 || val.substring(i + 1).length() != 2) {
				throw new NumberFormatException();
			}
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be floating point number with exactly two decimal places");
		}

	}

	private void priceRangeRule() throws RuleException {
		String val = bookWindow.getPriceValue().trim();
		float price = Float.parseFloat(val);
		if(price <= 0.49f) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}

}
