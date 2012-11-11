# Vehicle Information Hub
This project is made to work as a vehicle information hub. 

## Features absent :
- Role management system.
- Admin panael for information management (CRUD).
- Web service so that others can integrate with that system.
- Hashing using SHA1 the password to the database before storing.
- Adding salt to password before hasing to prevent rainbow attack.


## Features Present:
- Verification of 4 different types of ID.
- Login fascility and session checking in all the pages.
- SQL injection prevention as preapared statement is being used.
- MYSQL connection pool is being used to decrease the overhead of connection every time.
- Fully MVC stractured.
- Basic layout is loaded separetely so that it can be changed anytime.
- Views are in WEB-INF folder to prevent unauthorized access without it's loader servlet.
- Models , Controllers , Utilities , Beans are all in different packages.
- Android interface as well as web interface.

##Android Interface
Android Interface can be accessed in this URL : https://github.com/mdsahib/vih/tree/testing/Android%20Interface
