
# ***Employee Address***

- The aim of the project is to perform the basic CRUD operations with some validations and mappings.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations
- MySQL Driver

## **Data Flow :**

## **Model :** 

- It consists of a  ___Employeeclass___ and ___AddressClass___ which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.
- @OneToOne mapping is used like one employee consists of only one address.

## **Controller :**

- It consists of ___AddressController___and ___EmployeeController___ class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.




- ### **API Reference :**

### **Employee Controller :**

#### ***Get All Employees***

```http
  http://localhost:8080/getAllEmployees
```

#### ***Add Employee***

```http
  http://localhost:8080/addEmployees
```


#### ***Get Employee By Id***

```http
  http://localhost:8080/getEmployeeById/{id}
```


#### ***Update Employee By Last Name***

```http
  http://localhost:8080/updateEmployee/{id}/{lName}
```

#### ***Delete By Id***

```http
  http://localhost:8080/deleteById/{id}
```

### **Address Controller :**

#### ***Add Address***

```http
  http://localhost:8080/addAddress
```

#### ***Get All Address***

```http
  http://localhost:8080/getAllAddress
```

#### ***Update Address By City***

```http
  http://localhost:8080/updateAddress/{id}/{city}
```

#### ***Delete Address By Id***

```http
  http://localhost:8080/deleteAdd/{id}
```

## **Service :** 

- It consists of ___EmployeeService___  and ___AddressService___ class which helps us to write the business functionalities.
- ___@Service___ annotation is used to make the class as a service layer.

## **Repository :**
- It consists of ___IEmployeeDao___ and ___IAddressDao___ which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.





## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.
- The data's were stored in the ___MySQL database___ which is ___persistent database___.

