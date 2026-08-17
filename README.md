# Case-Study-E-Commerce-Shopping-Cart-System
Case Study: E-Commerce Shopping Cart System

An e-commerce website processes product browsing, cart management, and checkout.

Questions:

Design classes for Product, Cart, and User.
Demonstrate constructor overloading.
Implement inheritance for different product types.
Use wrapper classes for price handling.
Apply control structures for discount calculation.
Implement searching algorithm to find products.

<img width="400" height="350" alt="image" src="https://github.com/user-attachments/assets/f3c10b69-efab-47c1-927c-aeeaeb1915d0" />
# Case Study: E-Commerce Shopping Cart System

## 1. Introduction

An E-Commerce Shopping Cart System is a software application used to manage online shopping activities. It allows users to browse products, add products to a shopping cart, calculate the total price, apply discounts, search for products, and perform checkout-related operations.

This case study demonstrates the implementation of an E-Commerce Shopping Cart System using **Java and Object-Oriented Programming (OOP)** concepts. The system uses classes, objects, constructors, constructor overloading, inheritance, wrapper classes, control structures, and searching algorithms.

The main purpose of this case study is to understand how real-world e-commerce functionality can be represented using Java programming concepts.

---

## 2. Objectives

The main objectives of the system are:

1. To create classes for products, users, and shopping carts.
2. To demonstrate the use of constructors and constructor overloading.
3. To implement inheritance for different types of products.
4. To use wrapper classes for handling product prices.
5. To calculate discounts using control structures.
6. To implement a searching algorithm for finding products.
7. To calculate the total and final price of products in the shopping cart.
8. To understand the practical application of Object-Oriented Programming in Java.

---

## 3. System Description

The system contains three main components:

### Product

The `Product` class represents a product available on the e-commerce website.

It contains:

* Product ID
* Product name
* Product price

For example:

* Laptop
* Mobile
* Mouse
* Keyboard
* T-Shirt

The product class also contains constructors for initializing product information.

---

### Cart

The `Cart` class represents the shopping cart of a user.

The cart allows the user to:

* Add products
* Store multiple products
* Display selected products
* Calculate total price
* Calculate discount
* Calculate final payable price

An `ArrayList` is used to store multiple product objects.

---

### User

The `User` class represents a customer using the e-commerce system.

It contains:

* User ID
* User name
* Shopping cart

Each user can have a separate shopping cart.

---

# 4. Question 1 – Design Classes for Product, Cart, and User

The first requirement is to design three basic classes:

```text
User
  |
  └── Cart
        |
        ├── Product
        ├── Product
        └── Product
```

The `Product` class stores product information.

The `Cart` class stores the products selected by the user.

The `User` class stores user information and contains a shopping cart.

### Example

If a user named Yash purchases a laptop and mouse, the system stores the information as:

```text
User
ID: 101
Name: Maahi

Cart
    Laptop     ₹50000
    Mouse      ₹1000

Total         ₹51000
```

This demonstrates the relationship between the `User`, `Cart`, and `Product` classes.

---

# 5. Question 2 – Constructor Overloading

Constructor overloading is an important feature of Java.

It means creating more than one constructor in the same class with different parameters.

For example, the `Product` class can have:

```text
Product()
Product(int id, String name)
Product(int id, String name, double price)
```

Different constructors allow products to be created with different amounts of information.

For example:

```text
Product()
```

creates a product with default values.

```text
Product(101, "Laptop")
```

creates a product with an ID and name.

```text
Product(101, "Laptop", 50000)
```

creates a product with ID, name, and price.

### Advantage

Constructor overloading provides flexibility while creating objects.

---

# 6. Question 3 – Inheritance for Different Product Types

An e-commerce website can contain different types of products.

For example:

* Electronics
* Clothing
* Books

Instead of creating completely separate classes, a common parent class called `Product` can be created.

The other classes can inherit from it.

```text
                 Product
                /   |    \
               /    |     \
      Electronics Clothing Book
```

For example:

```java
class Electronics extends Product
```

means that `Electronics` inherits properties from `Product`.

Similarly:

```java
class Clothing extends Product
```

inherits the common product properties.

### Electronics

Additional information:

* Brand
* Warranty

### Clothing

Additional information:

* Size
* Color

### Book

Additional information:

* Author
* Publisher

This reduces code duplication and demonstrates **inheritance** in Java.

---

# 7. Question 4 – Wrapper Classes for Price Handling

Java provides wrapper classes for primitive data types.

For price handling, the primitive:

```text
double
```

can be represented using the wrapper class:

```text
Double
```

For example:

```java
Double price = 50000.0;
```

The `Double` wrapper class allows a price value to be treated as an object.

Some common Java wrapper classes are:

| Primitive | Wrapper Class |
| --------- | ------------- |
| int       | Integer       |
| double    | Double        |
| float     | Float         |
| long      | Long          |
| boolean   | Boolean       |
| char      | Character     |

In this case study, `Double` can be used for storing product prices.

---

# 8. Question 5 – Discount Calculation Using Control Structures

The system calculates a discount based on the total shopping amount.

An `if-else-if` control structure is used.

The discount rules can be defined as:

```text
Total >= ₹50,000     → 20% discount
Total >= ₹20,000     → 10% discount
Total < ₹20,000      → 5% discount
```

For example, if the cart total is:

```text
₹50,000
```

then:

```text
Discount = 20%
```

Discount amount:

```text
50000 × 20 / 100 = ₹10,000
```

Final price:

```text
50000 - 10000 = ₹40,000
```

Therefore, the customer has to pay:

```text
₹40,000
```

This demonstrates the use of **decision-making control structures** in Java.

---

# 9. Question 6 – Searching Algorithm

The system should allow users to find a particular product.

A **Linear Search** algorithm can be used for this purpose.

The system checks each product one by one until the required product ID is found.

For example, suppose the cart contains:

```text
101 → Laptop
102 → Mobile
103 → Mouse
104 → Keyboard
```

If the user searches for:

```text
Product ID = 103
```

the algorithm checks:

```text
101 → Not matched
102 → Not matched
103 → Matched
```

The system then displays:

```text
Product Found
ID: 103
Name: Mouse
Price: ₹1000
```

If no matching product is found, the system displays:

```text
Product Not Found
```

The basic time complexity of linear search is **O(n)**.

---

# 10. Overall System Workflow

The complete working of the system can be represented as:

```text
Start
  ↓
Create User
  ↓
Create Products
  ↓
Display Products
  ↓
Add Products to Cart
  ↓
Calculate Total Price
  ↓
Apply Discount
  ↓
Calculate Final Price
  ↓
Search Product
  ↓
Display Product Information
  ↓
Checkout
  ↓
End
```

---

# 11. Example Scenario

Suppose a customer named Yash logs into the e-commerce system.

The system creates:

```text
User ID: 101
Name: Yash
```

The available products are:

```text
Laptop       ₹50,000
T-Shirt      ₹1,000
Mouse        ₹1,000
```

The customer adds all three products to the cart.

The total price becomes:

```text
₹50,000 + ₹1,000 + ₹1,000
= ₹52,000
```

Since the total is greater than ₹50,000, the customer receives a 20% discount.

Discount:

```text
₹52,000 × 20 / 100
= ₹10,400
```

Final price:

```text
₹52,000 - ₹10,400
= ₹41,600
```

Therefore, the customer has to pay **₹41,600**.

---

# 12. OOP Concepts Used

This case study demonstrates several important Java OOP concepts.

### 1. Class

Classes are used to represent real-world entities such as:

```text
Product
Cart
User
```

### 2. Object

Objects are created from classes.

Example:

```java
Product laptop = new Product(...);
```

### 3. Encapsulation

Product information and related methods are grouped inside the `Product` class.

### 4. Constructor

Constructors initialize objects when they are created.

### 5. Constructor Overloading

Multiple constructors with different parameters are used.

### 6. Inheritance

Different product types inherit common properties from the `Product` class.

### 7. Polymorphism

Different product classes can provide their own implementation of methods such as `display()`.

### 8. Wrapper Classes

`Double` is used for representing price values as objects.

---

# 13. Advantages of the System

The E-Commerce Shopping Cart System provides several advantages:

1. Easy product management.
2. Multiple products can be stored in a cart.
3. Automatic total price calculation.
4. Automatic discount calculation.
5. Product searching functionality.
6. Reusable code through inheritance.
7. Flexible object creation using constructor overloading.
8. Demonstrates practical use of Java OOP concepts.
9. The system can easily be extended with additional product types.
10. Additional features such as payment and order management can be added later.

---

# 14. Possible Future Enhancements

The basic system can be expanded into a complete e-commerce application.

Future features can include:

* User login and registration
* Product categories
* Product sorting
* Product quantity management
* Remove product from cart
* Product reviews and ratings
* Online payment
* Order history
* Invoice generation
* Delivery tracking
* Database connectivity
* Admin panel
* Exception handling
* File handling
* GUI using JavaFX or Swing

---

# 15. Conclusion

The E-Commerce Shopping Cart System is a practical example of applying Java Object-Oriented Programming concepts to a real-world problem.

The system uses classes such as `Product`, `Cart`, and `User` to represent different entities. Constructor overloading provides flexibility in creating product objects, while inheritance allows different product types to share common properties. The `Double` wrapper class is used for price handling, and control structures are used to calculate discounts. A linear searching algorithm is implemented to find products efficiently within the available collection.

Overall, this case study provides a clear understanding of how Java concepts such as **classes, objects, constructors, inheritance, wrapper classes, control structures, and searching algorithms** can work together to build a basic E-Commerce Shopping Cart System.
