# Data Structure  
## ArrayList  

### 📌 Definition
An **ArrayList** in Java is a resizable array implementation of the `List` interface. Unlike traditional arrays, it can dynamically grow or shrink in size, making it more flexible for managing collections of objects.

---

### ✅ Advantages
- Dynamic resizing (no need to define fixed size).
- Provides built-in methods for insertion, deletion, and traversal.
- Maintains insertion order.
- Allows random access using index.
- Easy integration with Java Collections Framework.

---

### ❌ Disadvantages
- Slower insertion/deletion in the middle (due to shifting elements).
- Consumes more memory compared to arrays (because of dynamic resizing).
- Not synchronized (requires manual synchronization for multithreading).
- Performance overhead when resizing occurs.

---

### ⚡ Important Methods & Time Complexity

| Method                        | Description                                | Time Complexity |
|-------------------------------|--------------------------------------------|-----------------|
| `add(E e)`                    | Adds element at the end                    | O(1) amortized  |
| `add(int index, E e)`         | Inserts element at specific index          | O(n)            |
| `get(int index)`              | Retrieves element at index                 | O(1)            |
| `set(int index, E e)`         | Updates element at index                   | O(1)            |
| `remove(int index)`           | Removes element at index                   | O(n)            |
| `contains(Object o)`          | Checks if element exists                   | O(n)            |
| `size()`                      | Returns number of elements                 | O(1)            |
| `isEmpty()`                   | Checks if list is empty                    | O(1)            |

---

## 🎭 Project Overview: Seat Booking System

This project demonstrates the use of **ArrayList** in a real-world scenario: managing seat bookings. It includes operations such as **adding, canceling, updating, and displaying bookings**.

---

### 📂 Project Structure
```
src/
├── model/
│   └── Seat.java
├── controller/
│   └── SeatBooking.java
└── Main.java
```

---

### 🧩 Class Breakdown

#### 1. `Seat.java` (Model Layer)
Represents a seat with attributes:
- `seatNumber` → Unique identifier for the seat.
- `isBooked` → Boolean flag for booking status.
- `bookingDate` → Date of booking.
- `isCanceled` → Boolean flag for cancellation status.

Includes **getters/setters** and a `toString()` method for clean output.

---

#### 2. `SeatBooking.java` (Controller Layer)
Handles booking operations using an **ArrayList of Seat objects**:
- `addNewBooking(String seatNumber)` → Adds a new booking if seat is not already booked.
- `cancelBooking(String seatNumber)` → Cancels an existing booking.
- `updateBooking(String oldSeatNumber, String newSeatNumber)` → Updates seat number.
- `displayBookings()` → Displays all active bookings.

---

#### 3. `Main.java` (Execution Layer)
Provides a **menu-driven console application**:
- Add Booking  
- Cancel Booking  
- Update Booking  
- Display Bookings  
- Exit  

Uses `Scanner` for user input and interacts with `SeatBooking` methods.

---

### ▶️ Sample Run
1. Add Booking
2. Cancel Booking
3. Update Booking
4. Display Bookings
5. Exit 
Choose an option:

---

### 🎯 Key Learning Outcomes
- Practical use of **ArrayList** for dynamic data management.
- Implementation of CRUD operations in Java.
- Separation of concerns using **Model–Controller–Main** structure.
- Handling user input and exceptions gracefully.

---

### 🚀 Future Enhancements
- Add persistence (store bookings in a database or file).
- Implement synchronization for multi-threaded environments.
- Enhance UI with JavaFX or a web interface.
