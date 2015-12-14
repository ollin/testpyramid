package com.github.ollin.testpyramid.insurance.proposal;

import static com.google.common.base.Strings.nullToEmpty;

import com.github.ollin.testpyramid.insurance.Identifiable;
import com.github.ollin.testpyramid.insurance.offer.Proposal;
import lombok.Getter;

/**
 *
 */
public class ProposalForIndividual implements Proposal, Identifiable {

    @Getter private boolean complete;
    @Getter private String customerName;
    @Getter private final int id;

    public ProposalForIndividual(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
        checkForCompleteness();
    }

    private void checkForCompleteness() {
        complete = checkIfCustomerNameIsPresent();
    }

    private boolean checkIfCustomerNameIsPresent() {
        return !nullToEmpty(customerName).trim().isEmpty();
    }
}
