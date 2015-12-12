package com.github.ollin.testpyramid.insurance.proposal;

import static com.google.common.base.Strings.nullToEmpty;

import com.github.ollin.testpyramid.insurance.offer.Proposal;
import lombok.Getter;

/**
 *
 */
public class ProposalForIndividual implements Proposal {

    @Getter private boolean complete;
    @Getter private String customerName;

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
