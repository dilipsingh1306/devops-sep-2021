### Port Forwarding

The picture below demonstrates, how a single container can be accessed via Port Forwarding feature in Docker.
![Docker Port Forwarding](PortForwarding.png)

The picture below demonstrates, how fours containers can be accessed via different ports using Port Forwarding feature in Docker.
![Docker Port Forwarding](PortForwarding2.png)

### Volume Mounting

Storing application data in container storage isn't considered as a best practice, the reason is when the container is removed by the Container Orchestrations Platforms the data will be lost.

Hence, we need to store the container application data in an external storage.  Volume mounting is the feature in Docker that allows you to store the application data in an external volume.

Creating a mysql container with volume mounting
```
mkdir -p /home/rps/mysql
docker run -d --name db1 --hostname db1 -v /home/rps/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root mysql:8
```
The expected output is
<pre>
[jegan@tektutor Day3]$ docker run -d --name db1 --hostname db1 -e MYSQL_ROOT_PASSWORD=root -v /home/rps/mysql:/var/lib/mysql mysql:8
0dd8bdf0d935940659d3efef7321c0855928c615044a8fd68effba8d653232fa
</pre>

You may now get inside the container and login via mysql client
```
docker exec -it db1 sh
mysql -u root -p
```
When prompted for mysql server password, type 'root' without quotes.
The expected output is
<pre>
[jegan@tektutor Day3]$ <b>docker exec -it db1 sh</b>
# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> 
</pre>

You may now create some database, tables and insert some records as shown below
```
CREATE DATABASE tektutor;
USE tektutor;
CREATE TABLE training (id int, name VARCHAR(25), duration VARCHAR(25));
INSERT INTO training VALUES ( 1, "DevOps", "5 days" );
INSERT INTO training VALUES ( 2, "Microservices", "5 days" );
INSERT INTO training VALUES ( 3, "OpenShift", "5 days" );
exit
exit
```
The expected output is
<pre>
[jegan@tektutor Day3]$ <b>docker exec -it db1 sh</b>
# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE tektutor;
Query OK, 1 row affected (0.00 sec)

mysql> USE tektutor;
Database changed
mysql> CREATE TABLE training (id int, name VARCHAR(25), duration VARCHAR(25));
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO training VALUES ( 1, "DevOps", "5 days" );
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO training VALUES ( 2, "Microservices", "5 days" );
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO training VALUES ( 3, "OpenShift", "5 days" );
Query OK, 1 row affected (0.01 sec)

mysql> exit
Bye
# exit
</pre>

Now delete the db1 container
```
docker rm -f db1
```
Now let's create a new db container
```
docker run -d --name db2 --hostname db2 -v /home/rps/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root mysql:8
```
The expected output is
<pre>
[jegan@tektutor Day3]$ <b>docker rm -f db1</b>
db1
[jegan@tektutor Day3]$ docker run -d --name db2 --hostname db2 -v /home/rps/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root mysql:8
77b942116928ac3ada7c3035b95dd1553b932c8c2549b060c5bddadcac953bc0
</pre>

Let's get inside the db2 container
```
docker exec -it db2 sh
mysql -u root -p
SHOW DATABASES;
USE tektutor;
SHOW TABLES;
SELECT * FROM training;
exit
exit
```
Type password as 'root'.

The expected output is
<pre>
[jegan@tektutor Day3]$ <b>docker run -d --name db2 --hostname db2 -v /home/rps/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root mysql:8</b>
77b942116928ac3ada7c3035b95dd1553b932c8c2549b060c5bddadcac953bc0
[jegan@tektutor Day3]$ <b>docker exec -it db2 sh</b>
# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.26 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> <b>SHOW DATABASES;</b>
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| tektutor           |
+--------------------+
5 rows in set (0.01 sec)

mysql> <b>USE tektutor;</b>
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> <b>SHOW TABLES;</b>
+--------------------+
| Tables_in_tektutor |
+--------------------+
| training           |
+--------------------+
1 row in set (0.00 sec)

mysql> <b>SELECT * FROM training;</b>
+------+--------+----------+
| id   | name   | duration |
+------+--------+----------+
|    1 | DevOpS | 3 days   |
+------+--------+----------+
1 row in set (0.00 sec)

mysql> exit
Bye
# exit
</pre>

As you noticed, the data is intact(safe). We are able to access the data via another container i.e db2.
