Author : Mohan Ramakrishna and Dhananjay Rathod
EmailId: mohanramakrishna7@gmail.com, dhananajayrathod2000@gmail.com

Shopping Cart Web Application built using Java and JSP/Servlet technologies.
MySQL DB is used at the back-end to store the inventory and User details.
HTML5, CSS3 for front-end design and JavaScript and Ajax used for Validation of forms. 

The repository contains source code folder "TakeHome" and DB s"hopping_cart.sql"

Inorder to execute application.

First create Database named shopping cart.
Import the database using command

mysqldump -u root -p[root_password] [database_name] > dumpfilename.sql

Then make changes in DB connection file-

/home/dhananjay/workspace/ShoppingCart/TakeHome/src/com/example/controller/DBConnection.java
Set url to your database path.
Set the user credentials.

