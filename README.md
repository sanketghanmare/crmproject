<h1 align="center">Employee Management Tool</h1> 

### Steps to Build the application

1. Clone this repository or download the zip file of the entire application.

2. Open the editor of your choice preferably `IntelliJ`.

3. Open the project folder using the editor or directly paste the repository link and wait for it to finish loading the folder.

4. Wait for IDE to download all the dependencies present in pom.xml.

### Steps to Run the application

Navigate to the `plage-watch` folder using command prompt or terminal: 
```
src/main/java/com/love2code/springboot/thymeleafdemo/ThymeleafdemoApplication.java
```
Press right-click and run as java application.

#### Note:- It will take a few seconds to build and run.


### Steps to use the Employee Management Tool

1. Open Browser (Google Chrome, etc) and enter the URL `http://localhost:8080/` on the browser.
#### Note:- Sometimes it may take some time to open it for the first time on browser.

#### Following are the features in Employee Portal
![image](https://user-images.githubusercontent.com/24240931/103444051-f9ebfb80-4c32-11eb-88ae-cf4742c286d4.png)
#### Add a new Employee


![image](https://user-images.githubusercontent.com/24240931/103444093-594a0b80-4c33-11eb-924f-f5c1b304b967.png)
#### Update an existing Employee


![image](https://user-images.githubusercontent.com/24240931/103444122-8f878b00-4c33-11eb-8f03-1762b346f653.png)
#### Delete an existing Employee

#### Front end and Backend technologies

I used Springboot, Mysql, Thymeleaf, JPA, Maven.


#### Data Setup

1] Use Mysql workbench for best results.
2] Create a local Database in mysql workbench.
3] Open file employee.sql and import it in workbench and run it. It will create employee table and a new database.
4] Import data present inside employee.json inside newly created employee database.
5] Refresh entire database and run employee table for see the available employee data.


#### Additional notes:

1] application.properties have connection related info: username, password and datasource.
```src/main/resources/application.properties```

2] Resources directory has html and css files to show employee data. It has static and templates folder.
```src/main/resources```

3] All the buisness logic, service, DAO, controller and entity related java classes are present inside package:
```com/love2code/springboot/thymeleafdemo```

4] EmployeeController has all the mappings for different URLs present in Employee portal application. 

