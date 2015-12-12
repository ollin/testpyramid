package com.github.ollin.testpyramid.insurance.times;

import static java.time.LocalDate.of;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * unit test.
 */
public class ValidUntilCalculatorTest {

    @Test
    public void shouldBeValidFor30Days() throws Exception {
        // given
        LocalDate start = of(2015, 12, 1);
        // when
        ChronoLocalDate validUntilDate = new ValidUntilCalculator(start).getValidUntilDate();
        // then
        assertThat(validUntilDate, is(of(2015, 12, 31)));
    }

}