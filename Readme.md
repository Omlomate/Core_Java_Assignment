# 🌍 Country-State-City Hierarchy in Java

This Java project models a geographical hierarchy of **Countries**, **States**, and **Cities** using object-oriented principles like **inheritance**, **abstraction**, **interfaces**, and **polymorphism**.

## 🚀 Features

- Abstract `Location` class for reusable attributes (name, population, area)
- `City`, `State`, and `Country` classes with their respective details
- Interface `Displayable` for consistent display across all entities
- `Comparable` implementation for sorting countries, states, and cities alphabetically
- Console output of structured and sorted hierarchical data


## 🧱 Class Hierarchy
Location (abstract)
├── City
├── State
└── Country



- **Location**: Abstract class containing common attributes:
  - `name`, `population`, `area`
- **City**: Represents a city. Inherits from `Location`.
- **State**: Contains a list of `City` objects. Inherits from `Location`.
- **Country**: Contains a list of `State` objects and a `capital`. Inherits from `Location`.

---

## 🔧 Interfaces

- **Displayable**: Interface with method `getDisplayInfo()` used by `Country`, `State`, and `City` to present formatted information.


## Sample output
---
Country: Canada (Capital: Ottawa, Pop: 38008005)
  State: Ontario (Pop: 14734014, Area: 1076395.0 sq.km)
    -> City: Ottawa (Pop: 934243, Area: 2790.3 sq.km)
    -> City: Toronto (Pop: 2731571, Area: 630.2 sq.km)

Country: India (Capital: New Delhi, Pop: 1393409038)
  State: Karnataka (Pop: 61095297, Area: 191791.0 sq.km)
    -> City: Bengaluru (Pop: 8443675, Area: 741.0 sq.km)
    -> City: Mysuru (Pop: 920550, Area: 128.4 sq.km)
  State: Maharashtra (Pop: 112374333, Area: 307713.0 sq.km)
    -> City: Mumbai (Pop: 20411000, Area: 603.4 sq.km)
    -> City: Pune (Pop: 7214000, Area: 331.26 sq.km)

Country: USA (Capital: Washington, D.C., Pop: 331002651)
  State: California (Pop: 39538223, Area: 423967.0 sq.km)
    -> City: Los Angeles (Pop: 3979576, Area: 1214.9 sq.km)
    -> City: San Francisco (Pop: 815201, Area: 121.0 sq.km)

