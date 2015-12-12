package com.github.ollin.testpyramid.insurance.proposal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * unit test.
 */
public class ProposalForIndividualTest {

    private ProposalForIndividual proposal;

    @Before
    public void setUp() throws Exception {
        proposal = new ProposalForIndividual();
    }

    @Test
    public void notCompleteInitially() throws Exception {
        // when
        boolean complete = proposal.isComplete();
        // then
        assertThat(complete, is(false));
    }

    @Test
    public void completeIfCustomerNameIsSet() throws Exception {
        // given
        proposal.setCustomerName("Gonso");
        // when
        boolean complete = proposal.isComplete();
        // then
        assertThat(complete, is(true));
    }


    @Test
    public void notCompleteIfEmptyStringAsCustomerNameIsSet() throws Exception {
        // given
        proposal.setCustomerName("");
        // when
        boolean complete = proposal.isComplete();
        // then
        assertThat(complete, is(false));
    }
}