# University- App
A  Spring Boot  Rest API project that manages a collection of operations with the basic feature: fetch, save, update, delete (CRUD operations - Create, Read, Update and Delete).Demonstrating CRUD API with SpringBoot

* **URL**

    - /departments
    - /departments
    - /departments/{id}
    - /departments/{id}
    - /departments/{id}
    - /departments/{name}

* **Method:**

`GET`| `POST` | `DELETE` | `PUT`

* **URL Params**

    - **Required:**

        - `id=[integer]`


* **Data Params**
    - `POST`: /departments
      
          {
          "departmentId": 6,
          "name": "BIO",
          "address": "delhi",
          "code": "BIO-1"
          }
    
    - `PUT`    : /departments/{id}

          {
          "departmentId": 1,
          "name": "CS",
          "address": "banglore",
          "code": "CS-3"
          }  
            
      
  

### STATUS CODE :
* **Success Response:**
    * **Code:** 200 <br />
        * **Content:** `{ id : 12 }`

---
* **Error Response:**
    * **Code:** 500  Internal Server Error <br />
        * **Content:** `{ error : " Internal Server Error" }`
          


