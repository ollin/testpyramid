package com.github.ollin.testpyramid.insurance.offer;

import com.github.ollin.testpyramid.insurance.UC2TestWithDummies;
import org.junit.Test;

/**
 * unit test.
 */
public class OfferCreationUnitTest extends UC2TestWithDummies {

    @Override
    protected OfferCreation anOfferCreation() {
        return new OfferCreationDefault(aValidUntilProvider());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionIfCustomerRepresentativeIsNull() throws Exception {
        anOfferCreation().createOffer(null, aProposal());
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionIfProposalIsNull() throws Exception {
        anOfferCreation().createOffer(aCustomerRepresentative(), null);
    }
}