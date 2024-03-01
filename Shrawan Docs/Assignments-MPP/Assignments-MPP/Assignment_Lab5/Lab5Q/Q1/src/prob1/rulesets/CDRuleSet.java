package prob1.rulesets;

import prob1.gui.CDWindow;

import java.awt.Component;



/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindow = (CDWindow) ob;
		nonemptyRule();
		priceFloatingRule();
		priceRangeRule();
	}

	private void nonemptyRule() throws RuleException {
		if(cdWindow.getArtistValue().trim().isEmpty() ||
				cdWindow.getTitleValue().trim().isEmpty() ||
				cdWindow.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void priceFloatingRule() throws RuleException {
		String val = cdWindow.getPriceValue().trim();
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
		String val = cdWindow.getPriceValue().trim();
		float price = Float.parseFloat(val);
		if(price <= 0.49f) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}
	
}
