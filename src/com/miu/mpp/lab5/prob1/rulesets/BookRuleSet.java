package com.miu.mpp.lab5.prob1.rulesets;

import com.miu.mpp.lab5.prob1.gui.BookWindow;

import java.awt.Component;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Objects;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {


    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub
        BookWindow bookWindow = (BookWindow) ob;

        applyNonEmptyRule(bookWindow);
        applyNumericRule(bookWindow);
        applyLengthRule(bookWindow);
        floatingPointNumber(bookWindow);
        minValRule(bookWindow);
    }


    private void applyNonEmptyRule(BookWindow bookWindow) throws RuleException {
        if (Objects.isNull(bookWindow.getIsbnValue()) || bookWindow.getIsbnValue().equals("")
                || Objects.isNull(bookWindow.getTitleValue()) || bookWindow.getTitleValue().equals("")
                || Objects.isNull(bookWindow.getPriceValue()) || bookWindow.getPriceValue().equals("")
        ) {
            throw new RuleException("All fields must be nonempty");
        }
    }


    private void applyNumericRule(BookWindow bookWindow) throws RuleException {
        if (bookWindow.getIsbnValue().length() != 11 || bookWindow.getIsbnValue().length() != 13) {
            throw new RuleException("Isbn must consist of either 10 or 13 characters");
        }
        try {
            Integer.parseInt(bookWindow.getIsbnValue());
        } catch (Exception e) {
            throw new RuleException("Isbn must be numeric ");
        }
    }

    private void applyLengthRule(BookWindow bookWindow) throws RuleException {
        if (bookWindow.getIsbnValue().length() == 11 && !(bookWindow.getIsbnValue().startsWith("0") || bookWindow.getIsbnValue().startsWith("1"))) {
            throw new RuleException("The first digit must be 0 or 1");
        }
        if (bookWindow.getIsbnValue().length() == 13 && !(bookWindow.getIsbnValue().startsWith("978") || bookWindow.getIsbnValue().startsWith("979"))) {
            throw new RuleException("The first 3 digits must be either 978 or 979");
        }
    }

    private void floatingPointNumber(BookWindow bookWindow) throws RuleException {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        try {
            decimalFormat.parse(bookWindow.getPriceValue());
        } catch (ParseException e) {
            throw new RuleException("Price must be a floating point number with two decimal places");
        }
    }

    private void minValRule(BookWindow bookWindow) throws RuleException {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        try {
            float price = decimalFormat.parse(bookWindow.getPriceValue()).floatValue();
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
