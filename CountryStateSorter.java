import java.util.*;

public class CountryStateSorter {

    public static void main(String[] args) {

        // TreeMap for storing countries in ascending order
        Map<String, Set<String>> countryStatesMap = new TreeMap<>();

        // Adding India and its states
        countryStatesMap.put("India", new TreeSet<>(Arrays.asList(
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh",
            "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir",
            "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra",
            "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
            "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
            "Uttar Pradesh", "Uttarakhand", "West Bengal"
        )));

        // Adding USA and its states
        countryStatesMap.put("USA", new TreeSet<>(Arrays.asList(
            "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
            "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia",
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
            "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
            "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
            "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina",
            "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
            "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
            "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
            "Wisconsin", "Wyoming"
        )));

        // Adding Canada and its states
        countryStatesMap.put("Canada", new TreeSet<>(Arrays.asList(
            "Alberta", "British Columbia", "Manitoba", "New Brunswick",
            "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia",
            "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan",
            "Yukon"
        )));

        // Printing countries and their states
        for (Map.Entry<String, Set<String>> entry : countryStatesMap.entrySet()) {
            System.out.println("Country: " + entry.getKey());
            for (String state : entry.getValue()) {
                System.out.println("  - " + state);
            }
            System.out.println();
        }
    }
}
