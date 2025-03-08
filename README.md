- **Name :** `Vidish Ketankumar Mistry`

- **PRN :** `23070126146`  

- **Batch :** `B-3`  



## Overview
This Java program follows the Strategy Design Pattern to simulate different types of ducks. Each duck exhibits unique behaviors for flying, swimming, and quacking. The behavior of the ducks can be changed dynamically at runtime using the defined interfaces.

---
## Classes and Interfaces

### **Main.java**
- **`public static void main(String[] args)`**
  - Entry point of the program.
  - Creates instances of different types of ducks (`MallardDuck`, `RubberDuck`, `RedheadDuck`, `DecoyDuck`).
  - Calls their respective `display()`, `performQuack()`, `performSwim()`, and `performFly()` methods.

---

### **Duck.java** *(Abstract Class)*
- **`QuackBehaviour quackBehaviour`** *(Instance variable)* - Defines quacking behavior.
- **`SwimBehaviour swimBehaviour`** *(Instance variable)* - Defines swimming behavior.
- **`FlyBehaviour flyBehaviour`** *(Instance variable)* - Defines flying behavior.
- **`abstract public void display()`** *(Abstract Method)* - Must be implemented by subclasses to describe themselves.
- **`public void performSwim()`** - Calls the `swim()` method of the associated `SwimBehaviour`.
- **`public void performQuack()`** - Calls the `quack()` method of the associated `QuackBehaviour`.
- **`public void performFly()`** - Calls the `fly()` method of the associated `FlyBehaviour`.
- **`public void setQuackBehaviour(QuackBehaviour quackBehaviour)`** - Allows runtime change of quacking behavior.
- **`public void setSwimBehaviour(SwimBehaviour swimBehaviour)`** - Allows runtime change of swimming behavior.
- **`public void setFlyBehaviour(FlyBehaviour flyBehaviour)`** - Allows runtime change of flying behavior.

---

### **Duck Subclasses**

#### **MallardDuck.java**
- **Constructor:**
  - Sets `QuackBehaviour` to `Quack`.
  - Sets `SwimBehaviour` to `SwimWithLegs`.
  - Sets `FlyBehaviour` to `Fly`.
- **`public void display()`** - Prints `"I am Mallard Duck !"`.

#### **RedheadDuck.java**
- **Constructor:**
  - Sets `QuackBehaviour` to `Quack`.
  - Sets `SwimBehaviour` to `SwimWithLegs`.
  - Sets `FlyBehaviour` to `Fly`.
- **`public void display()`** - Prints `"I am RedHead Duck !!"`.

#### **RubberDuck.java**
- **Constructor:**
  - Sets `QuackBehaviour` to `Squeak`.
  - Sets `SwimBehaviour` to `Floating`.
  - Sets `FlyBehaviour` to `NotFly`.
- **`public void display()`** - Prints `"I am Rubber Duck"`.

#### **DecoyDuck.java**
- **Constructor:**
  - Sets `QuackBehaviour` to `MuteQuack`.
  - Sets `SwimBehaviour` to `Drown`.
  - Sets `FlyBehaviour` to `NotFly`.
- **`public void display()`** - Prints `"I am Decoy Duck !"`.

---

### **Quack Behavior Implementations** *(Implements `QuackBehaviour` interface)*

#### **QuackBehaviour.java** *(Interface)*
- **`public void quack();`** *(Abstract Method)* - Must be implemented by classes defining quacking behavior.

#### **Quack.java**
- **`public void quack()`** - Prints `"Quack Quack !!"`.

#### **MuteQuack.java**
- **`public void quack()`** - Prints `"Cant Quack!"`.

#### **Squeak.java**
- **`public void quack()`** - Prints `"Squeak Squak !!!"`.

---

### **Swim Behavior Implementations** *(Implements `SwimBehaviour` interface)*

#### **SwimBehaviour.java** *(Interface)*
- **`public void swim();`** *(Abstract Method)* - Must be implemented by classes defining swimming behavior.

#### **SwimWithLegs.java**
- **`public void swim()`** - Prints `"I Believe I can Swim "`.

#### **Floating.java**
- **`public void swim()`** - Prints `"I am Floatingg!!"`.

#### **Drown.java**
- **`public void swim()`** - Prints `"I am Drowning "`.

---

### **Fly Behavior Implementations** *(Implements `FlyBehaviour` interface)*

#### **FlyBehaviour.java** *(Interface)*
- **`public void fly();`** *(Abstract Method)* - Must be implemented by classes defining flying behavior.

#### **Fly.java**
- **`public void fly()`** - Prints `"I can Fly"`.

#### **NotFly.java**
- **`public void fly()`** - Prints `"I cant Fly!!"`.

---

