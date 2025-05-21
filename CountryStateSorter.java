import java.util.*;

// Abstract Location class for reusability
abstract class Location {
    String name;
    long population;
    double area;

    public Location(String name, long population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public abstract String getDetails();
}

// Displayable interface for consistent output
interface Displayable {
    String getDisplayInfo();
}

// City class extending Location
class City extends Location implements Comparable<City>, Displayable {
    public City(String name, long population, double area) {
        super(name, population, area);
    }

    @Override
    public int compareTo(City other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String getDetails() {
        return "City: " + name + " (Pop: " + population + ", Area: " + area + " sq.km)";
    }

    @Override
    public String getDisplayInfo() {
        return getDetails();
    }
}

// State class
class State extends Location implements Comparable<State>, Displayable {
    List<City> cities;

    public State(String name, long population, double area, List<City> cities) {
        super(name, population, area);
        this.cities = new ArrayList<>(cities);
        Collections.sort(this.cities);
    }

    @Override
    public int compareTo(State other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String getDetails() {
        return "State: " + name + " (Pop: " + population + ", Area: " + area + " sq.km)";
    }

    @Override
    public String getDisplayInfo() {
        StringBuilder sb = new StringBuilder(getDetails()).append("\n");
        for (City city : cities) {
            sb.append("    -> ").append(city.getDisplayInfo()).append("\n");
        }
        return sb.toString();
    }
}

// Country class
class Country extends Location implements Comparable<Country>, Displayable {
    String capital;
    List<State> states;

    public Country(String name, long population, double area, String capital, List<State> states) {
        super(name, population, area);
        this.capital = capital;
        this.states = new ArrayList<>(states);
        Collections.sort(this.states);
    }

    @Override
    public int compareTo(Country other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String getDetails() {
        return name + " (Capital: " + capital + ", Pop: " + population + ")";
    }

    @Override
    public String getDisplayInfo() {
        StringBuilder sb = new StringBuilder("Country: ").append(getDetails()).append("\n");
        for (State state : states) {
            sb.append("  ").append(state.getDisplayInfo());
        }
        return sb.toString();
    }
}

// Main class
public class CountryStateSorter {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        // India example with cities
        List<City> maharashtraCities = Arrays.asList(
                new City("Mumbai", 20411000, 603.4),
                new City("Pune", 7214000, 331.26)
        );
        State maharashtra = new State("Maharashtra", 112374333, 307713, maharashtraCities);

        List<City> karnatakaCities = Arrays.asList(
                new City("Bengaluru", 8443675, 741),
                new City("Mysuru", 920550, 128.4)
        );
        State karnataka = new State("Karnataka", 61095297, 191791, karnatakaCities);

        countries.add(new Country("India", 1393409038, 3287263, "New Delhi", Arrays.asList(maharashtra, karnataka)));

        // USA example with cities
        List<City> californiaCities = Arrays.asList(
                new City("Los Angeles", 3979576, 1214.9),
                new City("San Francisco", 815201, 121)
        );
        State california = new State("California", 39538223, 423967, californiaCities);

        countries.add(new Country("USA", 331002651, 9833520, "Washington, D.C.", Arrays.asList(california)));

        // Canada example
        List<City> ontarioCities = Arrays.asList(
                new City("Toronto", 2731571, 630.2),
                new City("Ottawa", 934243, 2790.3)
        );
        State ontario = new State("Ontario", 14734014, 1076395, ontarioCities);

        countries.add(new Country("Canada", 38008005, 9984670, "Ottawa", Arrays.asList(ontario)));

        Collections.sort(countries);

        // Display Output
        for (Country country : countries) {
            System.out.println(country.getDisplayInfo());
        }
    }
}
