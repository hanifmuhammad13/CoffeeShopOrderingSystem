# Coffee Shop Ordering System

A Java-based Coffee Shop Ordering System utilizing Object-Oriented Programming (OOP) design patterns to create a flexible, scalable, and maintainable application.

## ☕ Overview
This project simulates a modular ordering system where users can dynamically instantiate base drinks and add multiple toppings. It leverages the **Factory Pattern** for drink creation and the **Decorator Pattern** for topping customizations, preventing class explosion and ensuring clean architecture.

## ✨ Features
- **Base Drinks:** Coffee, Matcha, and Milktea.
- **Toppings (Decorators):** Boba and Whipped Cream.
- **Dynamic Pricing:** Automatically calculates the total cost and description based on the chosen drink and stacked toppings.

## 🏗️ Design Patterns Highlight
- **Factory Pattern:** Centralizes and encapsulates the instantiation of base drink objects. The client can request a specific drink (e.g., Matcha) without needing to know the complex creation logic behind it.
- **Decorator Pattern:** Allows additional toppings (like Boba or Whipped Cream) to be wrapped around the base drinks dynamically at runtime. This provides a flexible alternative to subclassing, avoiding rigid structures like `CoffeeWithBobaAndWhippedCream`.

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

### Installation & Execution
1. Clone the repository:
   ```bash
   git clone [https://github.com/hanifmuhammad13/CoffeeShopOrderingSystem.git](https://github.com/hanifmuhammad13/CoffeeShopOrderingSystem.git)
