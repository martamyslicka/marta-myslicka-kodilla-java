package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final boolean bunSesameOrNot;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    public static class BigMacBuilder  {
        private boolean bunSesameOrNot;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMac.BigMacBuilder bun(boolean bunSesameOrNot) {
            this.bunSesameOrNot = bunSesameOrNot;
            return this;
        }

        public BigMac.BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMac.BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMac.BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bunSesameOrNot, burgers, sauce, ingredients);
        }
    }

    private BigMac(boolean bunSesameOrNot, int burgers, String sauce, List<String> ingredients) {
        this.bunSesameOrNot = bunSesameOrNot;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public boolean getBun() {
        return bunSesameOrNot;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac: " + "\n" +
                "bun (with sesame?) = '" + bunSesameOrNot + '\'' + "," + "\n" +
                "burgers = '" + burgers + '\'' + "," + "\n" +
                "sauce = '" + sauce + '\'' + "," + "\n" +
                "ingredients = " + ingredients + '\'';
    }
}