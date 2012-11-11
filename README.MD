This is a project is made to work as a vehicle information hub. 

Features absent :
1.Role management system.
2.Admin panael for information management (CRUD).
3. Web service so that others can integrate with that system.
4.Hasing using SHA1 the password to the database before storing.
5.Adding salt to password before hasing to prevent rainbow attack.


Features Present:
1. Verification of 4 different types of ID.
2. Login fascility and session checking in all the pages.
3. SQL injection prevention as preapared statement is being used.
4. MYSQL connection pool is being used to decrease the overhead of connection every time.
5.Fully MVC stractured.
6.Basic layout is loaded separetely so that it can be changed anytime.
7.Views are in WEB-INF folder to prevent unauthorized access without it's loader servlet.
8.Models , Controllers , Utilities , Beans are all in different packages.
9.Android interface as well as web interface.
