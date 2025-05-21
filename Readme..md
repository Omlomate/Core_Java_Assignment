
# Country-State-City Hierarchy (Dynamic Insertion)

This Java console application allows you to dynamically add and manage a hierarchy of Countries, States, and Cities using object-oriented programming principles like inheritance, interfaces, and abstraction.

## 🛠 Features

- Add Countries, States, and Cities at runtime
- Organized structure using classes and interfaces
- Sorted output using `Comparable`
- Inheritance for shared attributes (`Location` abstract class)
- Interface for common display behavior (`Displayable`)

## 🧩 Class Structure

- `Location` (abstract): common fields like name, population, area
- `City`, `State`, `Country`: extends `Location`, implements `Displayable`
- `Displayable` (interface): defines `getDisplayInfo()` method

## 📝 Example

```
1. Add Country
2. Add State
3. Add City
4. Display All
5. Exit
Choose an option: 1
Country name: India
Population: 1400000000
Area: 3287263
Capital: New Delhi
Country added successfully.
```
