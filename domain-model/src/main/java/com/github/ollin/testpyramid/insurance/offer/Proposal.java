package com.github.ollin.testpyramid.insurance.offer;

import com.github.ollin.testpyramid.insurance.Identifiable;

/**
 * A proposal is a suggestion to a customer
 */
public interface Proposal extends Identifiable{

    boolean isComplete();
}
