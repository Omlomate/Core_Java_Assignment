import java.util.*;

// Abstract Location class
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

// Interface
interface Displayable {
    String getDisplayInfo();
}

// City class
class City extends Location implements Comparable<City>, Displayable {
    public City(String name, long population, double area) {
        super(name, population, area);
    }

    public int compareTo(City other) {
        return this.name.compareTo(other.name);
    }

    public String getDetails() {
        return "City: " + name + " (Pop: " + population + ", Area: " + area + " sq.km)";
    }

    public String getDisplayInfo() {
        return getDetails();
    }
}

// State class
class State extends Location implements Comparable<State>, Displayable {
    List<City> cities = new ArrayList<>();

    public State(String name, long population, double area) {
        super(name, population, area);
    }

    public void addCity(City city) {
        cities.add(city);
        Collections.sort(cities);
    }

    public int compareTo(State other) {
        return this.name.compareTo(other.name);
    }

    public String getDetails() {
        return "State: " + name + " (Pop: " + population + ", Area: " + area + " sq.km)";
    }

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
    List<State> states = new ArrayList<>();

    public Country(String name, long population, double area, String capital) {
        super(name, population, area);
        this.capital = capital;
    }

    public void addState(State state) {
        states.add(state);
        Collections.sort(states);
    }

    public int compareTo(Country other) {
        return this.name.compareTo(other.name);
    }

    public String getDetails() {
        return name + " (Capital: " + capital + ", Pop: " + population + ")";
    }

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
    static Map<String, Country> countryMap = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Country\n2. Add State\n3. Add City\n4. Display All\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addCountry();
                case 2 -> addState();
                case 3 -> addCity();
                case 4 -> displayAll();
                case 5 -> running = false;
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    static void addCountry() {
        System.out.print("Country name: ");
        String name = sc.nextLine();
        System.out.print("Population: ");
        long population = Long.parseLong(sc.nextLine());
        System.out.print("Area: ");
        double area = Double.parseDouble(sc.nextLine());
        System.out.print("Capital: ");
        String capital = sc.nextLine();

        Country country = new Country(name, population, area, capital);
        countryMap.put(name, country);
        System.out.println("Country added successfully.");
    }

    static void addState() {
        System.out.print("Country name: ");
        String countryName = sc.nextLine();
        Country country = countryMap.get(countryName);
        if (country == null) {
            System.out.println("Country not found.");
            return;
        }

        System.out.print("State name: ");
        String stateName = sc.nextLine();
        System.out.print("Population: ");
        long population = Long.parseLong(sc.nextLine());
        System.out.print("Area: ");
        double area = Double.parseDouble(sc.nextLine());

        State state = new State(stateName, population, area);
        country.addState(state);
        System.out.println("State added successfully.");
    }

    static void addCity() {
        System.out.print("Country name: ");
        String countryName = sc.nextLine();
        Country country = countryMap.get(countryName);
        if (country == null) {
            System.out.println("Country not found.");
            return;
        }

        System.out.print("State name: ");
        String stateName = sc.nextLine();
        State state = null;
        for (State s : country.states) {
            if (s.name.equalsIgnoreCase(stateName)) {
                state = s;
                break;
            }
        }
        if (state == null) {
            System.out.println("State not found.");
            return;
        }

        System.out.print("City name: ");
        String cityName = sc.nextLine();
        System.out.print("Population: ");
        long population = Long.parseLong(sc.nextLine());
        System.out.print("Area: ");
        double area = Double.parseDouble(sc.nextLine());

        City city = new City(cityName, population, area);
        state.addCity(city);
        System.out.println("City added successfully.");
    }

    static void displayAll() {
        if (countryMap.isEmpty()) {
            System.out.println("No data available.");
            return;
        }
        for (Country country : countryMap.values()) {
            System.out.println(country.getDisplayInfo());
        }
    }
}
