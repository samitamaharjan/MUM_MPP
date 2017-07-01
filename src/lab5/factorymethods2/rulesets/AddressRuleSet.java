package lab5.factorymethods2.rulesets;

import java.awt.Component;

import lab5.factorymethods2.RuleSet;
import lab5.factorymethods2.windows.AddressWindow;

final public class AddressRuleSet implements RuleSet {
	//package level access
	AddressRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddressWindow addr = (AddressWindow)ob;
		
		numericRule(addr);
		//comment 
		throw new RuleException("An address rule has been violated!");
		
	}
	
	private void numericRule(AddressWindow addr) throws RuleException {
//		String zip = addr.getZipValue();
//		try {
//			Integer.parseInt(zip);
//		} catch(NumberFormatException e) {
//			throw new RuleException("Zip must be numeric");
//		}
	}

}
