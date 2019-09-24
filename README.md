<h1 align="center">Online-Ordering-Platform</h1>

<div align="center">

[![GitHub issues](https://img.shields.io/github/issues/CMINI777/online-ordering-platform)](https://github.com/CMINI777/online-ordering-platform/issues) [![GitHub forks](https://img.shields.io/github/forks/CMINI777/online-ordering-platform)](https://github.com/CMINI777/online-ordering-platform/network) [![GitHub stars](https://img.shields.io/github/stars/CMINI777/online-ordering-platform)](https://github.com/CMINI777/online-ordering-platform/stargazers) [![GitHub license](https://img.shields.io/github/license/CMINI777/online-ordering-platform)](https://github.com/CMINI777/online-ordering-platform/blob/master/LICENSE)

</div>

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

About login

| Username | Password | Role |
| :---: | :---: | :---: |
| admin1 | 123456 | Admin |
| zhangsan | 123456 | User |
