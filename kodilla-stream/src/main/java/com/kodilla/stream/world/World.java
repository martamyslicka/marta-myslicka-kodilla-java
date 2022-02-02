package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private Set<Continent> continentSet = new HashSet<>();

    public void addContinent(Continent continent) {
        continentSet.add(continent);
    }

    public Set<Continent> getContinentSet() {
        return new HashSet<>(continentSet);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantityAtEarth = getContinentSet().stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return peopleQuantityAtEarth;
    }
}
