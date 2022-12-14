# Taxi service app 🚖
___

## 📝 Description:
        This is a simple web-application which demonstrates functionality of taxi service.
        An app was written according to SOLID principles and REST rules. Also, Dependency
        Injection pattern was used. Application supports registration and authentication.
        For this purpose CRUD operations and web-filter were implemented.\

## 🎥 Views:
___
### Login page
![login_Page](img/login_Page.png)
### Home page
![home_Page](img/home_Page.png)
### Registration page
![registration_Page](img/registration_Page.png)

## 🧮 Features:
___
- Creating new driver, new car, new manufacturer
- Displaying all drivers, all cars, all manufacturers
- Displaying cars linked to certain driver
- Linking cars to drivers
- Deleting (soft-delete) drivers, cars, manufacturers

## 🔨 Architecture:
___
N-tire architecture - consists of 3-levels
#### Controllers layer ↔ Services layer ↔ DAO layer

## 💻 Technologies:
___
| **Technology** | **Version** |
|----------------|-------------|
| JDK            | 17          |
| Maven          | 4.0.0       |
| TomCat         | 9.0.50      |
| MySQL          | 8.0.22      |
| JDBC           | -           |
| Servlet        | 4.0.1       |
| JSTL           | 1.2         |
| JSP            | -           |
| HTML, CSS      | -           |

## ⏯ Running an application locally 
___
1. Clone this project from GitHub
2. Create schema and table using script from  [/resources/init_db.sql](https://github.com/luka-lozovyk/taxi_service/blob/4b1f21bba088f29fac7841c9e22a8ac1b69cd749/src/main/resources/init_db.sql#L1)
3. Edit URL, username, password, JDBC driver in [/util/ConnectionUtil.java](https://github.com/luka-lozovyk/taxi_service/blob/4b1f21bba088f29fac7841c9e22a8ac1b69cd749/src/main/java/taxi/util/ConnectionUtil.java#L9)
4. Create run configuration with TomCar server
5. Check out an application

## 📦 DataBase structure
![db_diagram](img/db_diagram.png)