package com.github.ollin.testpyramid.insurance;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import com.github.ollin.testpyramid.insurance.offer.Actor;
import com.github.ollin.testpyramid.insurance.offer.Offer;
import com.github.ollin.testpyramid.insurance.offer.OfferCreation;
import com.github.ollin.testpyramid.insurance.offer.Proposal;
import com.github.ollin.testpyramid.insurance.offer.ValidUntilProvider;
import org.junit.Test;

/**
 * Test for UC2.
 */
public abstract class UC2Test {

    @Test
    public void createOffer() throws Exception {
        // given
        Proposal aProposal = aProposal();
        Actor aCustomerRepresentative = aCustomerRepresentative();

        OfferCreation offerCreation = anOfferCreation();

        // when
        Offer offer = offerCreation.createOffer(aCustomerRepresentative, aProposal);

        // then
        assertThat(offer, notNullValue());
    }

    protected abstract Actor aCustomerRepresentative();

    protected abstract OfferCreation anOfferCreation();

    protected abstract ValidUntilProvider aValidUntilProvider();

    protected abstract Proposal aProposal();
}
