package com.github.ollin.testpyramid.insurance;

import com.github.ollin.testpyramid.insurance.offer.Actor;
import com.github.ollin.testpyramid.insurance.offer.OfferCreation;
import com.github.ollin.testpyramid.insurance.offer.Proposal;
import com.github.ollin.testpyramid.insurance.offer.ValidUntilProvider;

import java.time.LocalDate;

/**
 *
 */
public abstract class UC2TestWithDummies extends UC2Test {

    @Override
    protected Actor aCustomerRepresentative() {
        return new Actor() {
        };
    }

    @Override
    protected OfferCreation anOfferCreation() {
        return new OfferCreation(aValidUntilProvider());
    }

    @Override
    protected ValidUntilProvider aValidUntilProvider() {
        return LocalDate::now;
    }

    @Override
    protected Proposal aProposal() {
        return new Proposal() {
            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public int getId() {
                return 1;
            }
        };
    }
}
