
# ***Employee Address***

- The aim of the project is to perform the basic CRUD operations with some validations and mappings.
- Spring initializer was used to create a spring boot application project.


## **Frameworks and Languages used :**

- Java
- Spring Boot

![image](https://user-images.githubusercontent.com/112794922/236753245-cf4f7259-3ce8-4b9d-b432-9d91d637ddc8.png)


## **Dependency used :**

- Spring web
- Spring Boot Dev Tool
- Lombok
- Validations
- MySQL Driver

![image](https://user-images.githubusercontent.com/112794922/236753280-eb96ec14-6789-4301-9495-85e5f2d52924.png)


## **Data Flow :**

## **Model :** 

- It consists of a  ___Employeeclass___ and ___AddressClass___ which consists of Entity's used to model our data application.
- By using Lombok dependency , ___@Data___ , ___@AllArgsConstructor___ , ___@NoArgsConstructor___ is used to create getters and setters as well as default and parameterized constructors.
- @OneToOne mapping is used like one employee consists of only one address.

![image](https://user-images.githubusercontent.com/112794922/236753315-ef73860f-38c8-4829-9a37-ce9052a9df2c.png)
![image](https://user-images.githubusercontent.com/112794922/236753333-6eec0358-31d4-4c35-9ac7-accfb8689196.png)


## **Controller :**

- It consists of ___AddressController___and ___EmployeeController___ class which basically control the flow of data.
- ___@RestController___ annotation is used to make the RestaurantController class as controller layer.
- ___@GetMapping , @PostMapping , @PutMapping , @DeleteMapping___ annotations are used to perform the CRUD operations.

![image](https://user-images.githubusercontent.com/112794922/236753361-5606f9b4-286e-4ad6-9f02-d3585f4d460f.png)
![image](https://user-images.githubusercontent.com/112794922/236753391-dfc9a1cb-49fd-4acd-b829-e70915ab3909.png)





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

![image](https://user-images.githubusercontent.com/112794922/236753454-17f01c95-5eb9-4109-ae7c-d3e3d138de23.png)
![image](https://user-images.githubusercontent.com/112794922/236753472-530c5197-2b87-4d91-88d9-f5e1c1a5460a.png)


## **Repository :**
- It consists of ___IEmployeeDao___ and ___IAddressDao___ which is used to manage or datas.
- ___@Repository___ annotation is used to make the class repository layer.

![image](https://user-images.githubusercontent.com/112794922/236753502-cdafcda6-c574-4df8-a8a1-d5efab3e2e3e.png)
![image](https://user-images.githubusercontent.com/112794922/236753509-fba11fbc-844f-4e01-b706-4a0cbc532900.png)






## **Summary :**

- In this project , I had created the RestApi's performing various ___CRUD operations___ such as fetch , save , delete and update users.
- The RestApi's are tested by using ___Postman___ which is a client used to test our Api's.
- The data's were stored in the ___MySQL database___ which is ___persistent database___.

