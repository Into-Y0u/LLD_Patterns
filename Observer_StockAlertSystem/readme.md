
What we have in Observer Pattern is
1. One Interface of Observer
2. One interface of Subject(topic)
3. Subject to objeser = one to many composition relations ship
4. Two concrete class will implement these two. one is the thing which will be updated, one is the monitor
5. drive class will integrate this



## 🧠 Problem Statement
You want to design a system where:

Investors can subscribe to stock updates.

When the price of a stock changes, all subscribed investors are notified.

### ✅ Design Summary
Key Components:
Component	Role
Stock	Subject - Represents a company stock, notifies investors
Investor	Observer - Subscribes to stock, gets alert when price changes
Main class	Client to simulate subscriptions and price changes