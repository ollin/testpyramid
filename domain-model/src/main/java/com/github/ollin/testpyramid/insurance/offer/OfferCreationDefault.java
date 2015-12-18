package com.github.ollin.testpyramid.insurance.offer;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * makes all steps to create a offer.
 */
public class OfferCreationDefault implements OfferCreation {

    private final ValidUntilProvider validUntilProvider;

    public OfferCreationDefault(ValidUntilProvider validUntilProvider) {
        this.validUntilProvider = checkNotNull(validUntilProvider, "validUntilProvider is mandatory!");
    }

    @Override
    public Offer createOffer(Actor aCustomerRepresentative, Proposal proposal){
        checkNotNull(aCustomerRepresentative, "aCustomerRepresentative is mandatory!");
        checkNotNull(proposal, "proposal is mandatory!");

        final Offer offer = new Offer();
        // this is the business logic
        offer.setValidUntil(validUntilProvider.getValidUntilDate());

        return offer;
    }

}
