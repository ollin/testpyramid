package com.github.ollin.testpyramid.insurance.offer;

import com.github.ollin.testpyramid.insurance.UC2TestWithDummies;
import com.github.ollin.testpyramid.insurance.times.ValidUntilCalculator;

/**
 * component test.
 */
public class OfferCreationWithValidUntilCalculatorTest extends UC2TestWithDummies {

    @Override
    protected ValidUntilProvider aValidUntilProvider() {
        return new ValidUntilCalculator();
    }
}