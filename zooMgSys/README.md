# 🦁🐘 Java Zoo Management System

This is a simple **object-oriented Java application** that simulates a zoo management system. It allows the user to add animals (Lions and Elephants) and then display their actions such as making sounds, eating, and sleeping.

---

## 📚 Features

- ✅ Add animals (Lion or Elephant) using user input
- ✅ Store animals in a polymorphic `ArrayList<Animal>`
- ✅ Use of object-oriented principles:
  - **Encapsulation**
  - **Inheritance**
  - **Polymorphism**
- ✅ Display all animals with their name, age, and actions
- ✅ Simple and interactive console menu using loops and `if-else`

---

## 🧠 Concepts Used

| Concept         | Used? | Description |
|----------------|-------|-------------|
| Classes & Objects | ✅ | Defined `Animal`, `Lion`, `Elephant`, and `Zoo` classes |
| Inheritance     | ✅ | `Lion` and `Elephant` extend `Animal` |
| Encapsulation   | ✅ | `name` and `age` fields are private with getters/setters |
| Polymorphism    | ✅ | Used `Animal` references to call overridden methods |
| Loops           | ✅ | `while` loop used for continuous user input |
| If-Else         | ✅ | Input validation for animal type |
| ArrayList       | ✅ | Used to store dynamic animal objects |
| Scanner Input   | ✅ | Handled user interaction from the console |

---

## 🧱 Class Structure

### `Animal` (Base Class)
- Fields: `name`, `age`
- Methods: `makeSound()`, `eat()`, `sleep()`

### `Lion` (Subclass)
- Overrides `makeSound()` ➝ `"Roar!"`

### `Elephant` (Subclass)
- Overrides `makeSound()` ➝ `"Trumpet!"`

### `Zoo`
- Stores a list of `Animal` objects
- Method: `showAllAnimals()` to display all animals and their behaviors
