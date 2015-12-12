package com.github.ollin.testpyramid.insurance.offer;

import static com.github.ollin.testpyramid.insurance.proposal.ProposalForIndividualBuilder4Tests.aCompleteProposalForIndividuals;

import com.github.ollin.testpyramid.insurance.UC2TestWithDummies;

/**
 * component test.
 */
public class OfferCreationWithProposalForIndividualTest extends UC2TestWithDummies {

    @Override
    protected Proposal aProposal() {
        return aCompleteProposalForIndividuals();
    }
}