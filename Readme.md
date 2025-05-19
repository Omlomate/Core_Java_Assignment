# Country-State Sorter in Java

## Overview

This Java program organizes countries and their respective states in **alphabetical order** using Java Collections. The goal is to store and display the countries along with their states in **ascending** (sorted) order.

## Features

- Uses `TreeMap` to store countries, which automatically sorts them alphabetically.
- Uses `TreeSet` to store the states of each country, which also sorts them alphabetically.
- Clean and efficient design using core Java only (no external libraries).

## Data

### Countries included:

- **India** with 29 states
- **USA** with 50 states
- **Canada** with 13 provinces and territories

## Data Structures Used

- `TreeMap<String, Set<String>>` for storing countries and their states.
- `TreeSet<String>` to store each country's states in sorted order.

## How It Works

1. A `TreeMap` is used to ensure countries are sorted.
2. For each country, a `TreeSet` is created and populated with its states.
3. The entries in the `TreeMap` are printed, with each country's states listed below it.

## Sample Output

```
Country: Canada
  - Alberta
  - British Columbia
  ...

Country: India
  - Andhra Pradesh
  - Arunachal Pradesh
  ...

Country: USA
  - Alabama
  - Alaska
  ...
```
 