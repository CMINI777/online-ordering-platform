<h1 align="center">Online-Ordering-Platform</h1>

## Design it with the concept of micro-service. ##

---

1. System Function Structure

```
                                  |--User Login
                                  |--User Exit
                        |--Client--
                        |         |--Goods Order
                        |         |--My Order
Online Ordering Platform--
                        |
                        |                               |--Admin Login
                        |                               |--Admin Exit
                        |                               |--Add User
                        |                               |--Query User
                        |                               |--Delete User
                        |--Background Management System--
                                                        |--Add Goods
                                                        |--Query Goods
                                                        |--Modify The Goods
                                                        |--Delete Goods
                                                        |--Order Processing
```

2. Concept System of Structure <br>

![1](https://github.com/CMINI777/online-ordering-platform/blob/master/model.png)

-----
