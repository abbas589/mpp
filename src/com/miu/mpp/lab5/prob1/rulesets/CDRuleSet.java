package com.miu.mpp.lab5.prob1.rulesets;


import com.miu.mpp.lab5.prob1.gui.BookWindow;
import com.miu.mpp.lab5.prob1.gui.CDWindow;

import java.awt.Component;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Objects;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		CDWindow cdWindow = (CDWindow) ob;


		applyNonEmptyRule(cdWindow);
		numberRule(cdWindow);

	}

	private void applyNonEmptyRule(CDWindow cdWindow) throws RuleException {
		if (Objects.isNull(cdWindow.getArtistValue()) || cdWindow.getArtistValue().equals("")
				|| Objects.isNull(cdWindow.getTitleValue()) || cdWindow.getTitleValue().equals("")
				|| Objects.isNull(cdWindow.getPriceValue()) || cdWindow.getPriceValue().equals("")
		) {
			throw new RuleException("All fields must be nonempty");

		}
	}



		private void numberRule(CDWindow cdWindow) throws RuleException {
			DecimalFormat decimalFormat = new DecimalFormat("0.00");
			try {
				float price = decimalFormat.parse(cdWindow.getPriceValue()).floatValue();
				if (price <= 0.49) {
					throw new RuleException();
				}
			} catch (ParseException e) {
				throw new RuleException("Price must be a floating point number with two decimal places");
			} catch (RuleException r) {
				throw new RuleException("Price must be greater than 0.49");
			}
		}


	}
