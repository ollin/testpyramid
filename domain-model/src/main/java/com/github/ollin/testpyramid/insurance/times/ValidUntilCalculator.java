package com.github.ollin.testpyramid.insurance.times;

import static com.google.common.base.Preconditions.checkNotNull;

import com.github.ollin.testpyramid.insurance.offer.ValidUntilProvider;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * Calculates the valid until date.
 */
public class ValidUntilCalculator implements ValidUntilProvider {

    private final LocalDate start;
    private final LocalDate validUntil;

    public ValidUntilCalculator() {
        this(LocalDate.now());
    }

    public ValidUntilCalculator(LocalDate beginDate) {
        this.start = checkNotNull(beginDate, "beginDate is mandatory!");
        this.validUntil = this.start.plusDays(30);
    }

    @Override
    public ChronoLocalDate getValidUntilDate() {
        return validUntil;
    }
}
