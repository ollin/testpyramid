package com.github.ollin.testpyramid.insurance.offer;

import com.github.ollin.testpyramid.insurance.UC2Test;

import java.time.LocalDate;

public class OfferCreationUnitTest extends UC2Test {

    @Override
    protected OfferCreation anOfferCreation() {
        return new OfferCreation(aValidUntilProvider());
    }


    @Override
    protected Actor aCustomerRepresentative() {
        return new Actor() {
        };
    }

    @Override
    protected ValidUntilProvider aValidUntilProvider() {
        return LocalDate::now;
    }

    @Override
    protected Proposal aProposal() {
        return new Proposal() {
        };
    }
}