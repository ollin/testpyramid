package com.github.ollin.testpyramid.insurance;

import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;

import com.github.ollin.testpyramid.insurance.offer.Actor;
import com.github.ollin.testpyramid.insurance.offer.OfferCreationDefault;
import com.github.ollin.testpyramid.insurance.offer.Proposal;
import com.github.ollin.testpyramid.insurance.offer.ValidUntilProvider;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
public class UC2SITest extends UC2Test {

    @Before
    public void setUp() throws Exception {
    }


    @Override
    protected Actor aCustomerRepresentative() {

        setBaseUrl("http://localhost:8080");

        beginAt("/proposals");


       return new Actor() {
       };
    }

    @Override
    protected OfferCreationDefault anOfferCreation() {
        return null;
    }

    @Override
    protected ValidUntilProvider aValidUntilProvider() {
        return null;
    }

    @Override
    protected Proposal aProposal() {
        return null;
    }
}
