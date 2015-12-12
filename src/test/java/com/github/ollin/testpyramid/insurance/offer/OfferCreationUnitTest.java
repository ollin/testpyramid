package com.github.ollin.testpyramid.insurance.offer;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class OfferCreationUnitTest {

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

    private Actor aCustomerRepresentative() {
        return new Actor() {
        };
    }

    private OfferCreation anOfferCreation() {
        return new OfferCreation(aValidUntilProvider());
    }

    private ValidUntilProvider aValidUntilProvider() {
        return new ValidUntilProvider() {
            @Override
            public ChronoLocalDate getValidUntilDate() {
                return LocalDate.now();
            }
        };
    }

    private Proposal aProposal() {
        return new Proposal() {
        };
    }
}