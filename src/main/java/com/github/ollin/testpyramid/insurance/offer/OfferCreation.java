package com.github.ollin.testpyramid.insurance.offer;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * makes all steps to create a offer.
 */
public class OfferCreation {

    private final ValidUntilProvider validUntilProvider;

    public OfferCreation(ValidUntilProvider validUntilProvider) {
        this.validUntilProvider = checkNotNull(validUntilProvider, "validUntilProvider is mandatory!");
    }

    public Offer createOffer(Actor aCustomerRepresentative, Proposal proposal){

        final Offer offer = new Offer();
        // this is the business logic
        offer.setValidUntil(validUntilProvider.getValidUntilDate());

        return offer;
    }

}
