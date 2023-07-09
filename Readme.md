
# Ecommerce API

This project implements an Ecommerce API using Spring Boot. It provides endpoints to manage users, products, addresses, and orders.

## Technologies Used

- Java: The programming language used to develop the application.
- Spring Boot: The framework used for creating the API endpoints and managing the application's configuration.
- MySQL: The relational database used to store user, product, address, and order data.
- Maven: The build tool used for dependency management and project building.

## Getting Started

To get started with the Ecommerce API, follow these steps:

1. **Prerequisites**: Ensure you have Java, MySQL, and Maven installed on your system.

2. **Clone the Repository**: Clone this repository to your local machine.

## git clone <repository-url>


3. **Configure the Database**: Update the `application.properties` file with your MySQL database connection details.

- spring.datasource.url=jdbc:mysql://- - - 
- localhost:3306/<database-name>
- spring.datasource.username=<userName>
- spring.datasource.password=<password>


4. **Build and Run**:
- Build and run the Spring Boot application using Maven.

- cd ecommerce-api
- mvn spring-boot:run


![Logo](https://png.pngtree.com/png-vector/20221228/ourmid/pngtree-online-shopping-logo-desing-png-image_6540923.png)


## Language Used

- Java: The programming language used to develop the application.


## Running Tests

To run tests, run the following command

```bash
  http://localhost:8080/swagger-ui.html
```


## API Endpoints

- **User API**:
- GET `/users`: Get all users.
- GET `/users/{userId}`: Get user by ID.
- POST `/users`: Create a new user.
- DELETE `/users/{userId}`: Delete a user by ID.

- **Product API**:
- GET `/products`: Get all products.
- GET `/products?category={category}`: Get products by category.
- GET `/products/{productId}`: Get product by ID.
- POST `/products`: Create a new product.
- DELETE `/products/{productId}`: Delete a product by ID.

- **Address API**:
- GET `/addresses`: Get all addresses.
- GET `/addresses/{addressId}`: Get address by ID.
- POST `/addresses`: Create a new address.
- DELETE `/addresses/{addressId}`: Delete an address by ID.

- **Order API**:
- POST `/orders?userId={userId}&productId={productId}&addressId={addressId}&productQuantity={productQuantity}`: Create a new order.
- GET `/orders/{orderId}`: Get order by ID.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please create an issue or submit a pull request.



## Authors

- [@Sachin Shukla](https://github.com/Sach42/Ecommerce_API/commits?author=Sach42)


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

