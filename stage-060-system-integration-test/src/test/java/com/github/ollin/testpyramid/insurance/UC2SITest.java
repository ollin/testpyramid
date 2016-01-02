package com.github.ollin.testpyramid.insurance;

import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickButton;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;

import com.github.ollin.testpyramid.insurance.offer.Actor;
import com.github.ollin.testpyramid.insurance.offer.Offer;
import com.github.ollin.testpyramid.insurance.offer.OfferCreation;
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
public class UC2SITest extends UC2TestWithDummies {

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
    protected OfferCreation anOfferCreation() {
        clickLink("proposal-2");

        return (aCustomerRepresentative, proposal) -> {

            clickButton("create-offer");
            assertTitleEquals("Offer");

            return new Offer();
        };
    }
}
