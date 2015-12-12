package com.github.ollin.testpyramid.insurance.offer;

import java.time.chrono.ChronoLocalDate;

public interface ValidUntilProvider {

    ChronoLocalDate getValidUntilDate();

}
