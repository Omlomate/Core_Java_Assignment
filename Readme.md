
# Country and State Sorter in Java

This Java program demonstrates how to model countries and their corresponding states using object-oriented programming (OOP). The data is sorted in ascending alphabetical order by country name and by state name within each country.

## 🧾 Features

- Uses classes `Country` and `State` to represent real-world entities.
- Implements `Comparable` interface to enable alphabetical sorting.
- Displays country details including capital and population.
- Displays each state's population and area in square kilometers.

## 🧱 Classes

### `State`
Represents a state/province with:
- `name` (String)
- `population` (long)
- `area` (double in sq.km)
Implements `Comparable<State>` to allow alphabetical sorting.

### `Country`
Represents a country with:
- `name` (String)
- `population` (long)
- `capital` (String)
- `states` (List of `State`)
Implements `Comparable<Country>` to allow alphabetical sorting of countries.

## 🚀 How It Works

1. States are created and grouped under their respective countries.
2. Countries and their states are sorted alphabetically.
3. The data is displayed in a formatted manner.

## ✅ Example Output

```
Country: Canada (Capital: Ottawa, Pop: 38008005)
  - British Columbia (Pop: 5110917, Area: 944735.0 sq.km)
  - Ontario (Pop: 14734014, Area: 1076395.0 sq.km)
  - Quebec (Pop: 8537674, Area: 1542056.0 sq.km)

Country: India (Capital: New Delhi, Pop: 1393409038)
  - Assam (Pop: 31205576, Area: 78438.0 sq.km)
  - Karnataka (Pop: 61095297, Area: 191791.0 sq.km)
  - Maharashtra (Pop: 112374333, Area: 307713.0 sq.km)

Country: USA (Capital: Washington, D.C., Pop: 331002651)
  - California (Pop: 39538223, Area: 423967.0 sq.km)
  - Florida (Pop: 21538187, Area: 170312.0 sq.km)
  - Texas (Pop: 29145505, Area: 695662.0 sq.km)
```
