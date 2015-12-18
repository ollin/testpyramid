package com.github.ollin.testpyramid.insurance.offer;

/**
 * Process to create an offer.
 */
public interface OfferCreation {

    Offer createOffer(Actor aCustomerRepresentative, Proposal proposal);
}
