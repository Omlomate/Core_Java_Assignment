import java.util.*;

// State class
class State implements Comparable<State> {
    String name;
    long population;
    double area;

    State(String name, long population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    @Override
    public int compareTo(State other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (Pop: " + population + ", Area: " + area + " sq.km)";
    }
}

// Country class
class Country implements Comparable<Country> {
    String name;
    long population;
    String capital;
    List<State> states;

    Country(String name, long population, String capital, List<State> states) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.states = new ArrayList<>(states);
        Collections.sort(this.states); // sort states by name
    }

    @Override
    public int compareTo(Country other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (Capital: " + capital + ", Pop: " + population + ")";
    }
}

// Main class
public class CountryStateSorter {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        // Example states for India
        List<State> indiaStates = Arrays.asList(
            new State("Maharashtra", 112374333, 307713),
            new State("Karnataka", 61095297, 191791),
            new State("Assam", 31205576, 78438)
        );
        countries.add(new Country("India", 1393409038, "New Delhi", indiaStates));

        // Example states for USA
        List<State> usaStates = Arrays.asList(
            new State("California", 39538223, 423967),
            new State("Texas", 29145505, 695662),
            new State("Florida", 21538187, 170312)
        );
        countries.add(new Country("USA", 331002651, "Washington, D.C.", usaStates));

        // Example states for Canada
        List<State> canadaStates = Arrays.asList(
            new State("Ontario", 14734014, 1076395),
            new State("Quebec", 8537674, 1542056),
            new State("British Columbia", 5110917, 944735)
        );
        countries.add(new Country("Canada", 38008005, "Ottawa", canadaStates));

        // Sort countries
        Collections.sort(countries);

        // Display
        for (Country country : countries) {
            System.out.println("Country: " + country);
            for (State state : country.states) {
                System.out.println("  - " + state);
            }
            System.out.println();
        }
    }
}
