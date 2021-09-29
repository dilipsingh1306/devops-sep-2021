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

mysql> <b>CREATE DATABASE tektutor;</b>
Query OK, 1 row affected (0.00 sec)

mysql> <b>USE tektutor;</b>
Database changed
mysql> <b>CREATE TABLE training (id int, name VARCHAR(25), duration VARCHAR(25));</b>
Query OK, 0 rows affected (0.03 sec)

mysql> <b>INSERT INTO training VALUES ( 1, "DevOps", "5 days" );</b>
Query OK, 1 row affected (0.02 sec)

mysql> <b>INSERT INTO training VALUES ( 2, "Microservices", "5 days" );</b>
Query OK, 1 row affected (0.00 sec)

mysql> <b>INSERT INTO training VALUES ( 3, "OpenShift", "5 days" );</b>
Query OK, 1 row affected (0.01 sec)

mysql> <b>exit</b>
Bye
# <b>exit</b>
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
[jegan@tektutor Day3]$ <b>docker run -d --name db2 --hostname db2 -v /home/rps/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root mysql:8</b>
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

mysql> <b>exit</b>
Bye
# <b>exit</b>
</pre>

As you noticed, the data is intact(safe). We are able to access the data via another container i.e db2.

# Ansible Overview
- is a Configuration Management Tool 
- is a Infrastructure as a Code (Iaac) tool
- helps in automating adminstrative activities
    - provisioning machines (containers, Virtual Machines, Cloud based Virtual machines in AWS/Azure/GCP etc.,)
    - installing softwares, uninstalling softwares, configuring softwares, managing users
- is developed in Python by Michael Deehan
- Michael Deehan was a former employee of RedHat, he quit RedHat and incorporated Ansible Inc organization
- Michael Deehan develped <b>Ansible Core<b> as an Opensource project
- Later RedHat acquired Ansible Inc, hence Ansible Core is now maintained by RedHat(IBM) along with the Opensource community
 
- Ansible Core
   - is a CLI tool
   - Domain Specific Language (DSL) - YAML (Yet Another Markup Language - a superset of JSON)
   - to automated administrative activity Python knowledge is not mandatory
   - can be installed in Mac/Linux but can't be installed in Windows
   - can manage Unix,Mac,Linux and Windows Servers
   - you won't get support from RedHat(IBM) as this is developed by Opensource Community
   - The machine where Ansible is installed is called as Ansible Controller Machine (ACM)
   - From ACM we can writing automation scripts called Ansible Playbooks
   - Ansible Playbook will invoke one or more Ansible Modules
   - Ansible Modules are Python scripts for Unix/Linux/Mac Nodes
   - Ansible Modules are Powershell scripts for Windows Nodes
   - The servers that are managed by Ansible/Ansible AWX/Ansible Tower are called as Ansible Nodes
   - agentless
      - on the Ansible Nodes no proprietary software needs to be installed
      - general requirements
        Unix/Linux/Mac Ansible Nodes
          - should have Python installed
          - should have SSH Server installed
        Windows Ansible Nodes
          - should have Powershell (.Net Framework )
          - shoud have WinRM configured
 
- Ansible AWX (Opensource)
  - develped on top of Ansible Core
  - supports WebInterface
  - you won't get support from RedHat(IBM) as this is developed by Opensource Community
  
- RedHat developed Ansible Tower for Enterprise Customers 
   - is developed on top Ansible AWX
   - supports Web Interface, 
   - support Role Based Access Control
   - you could integrate with Active Directory
   - you can run the Ansible Playbook from your web browser
   - you get support from RedHat(IBM) as this is developed by RedHat(IBM)

- some alternate tools
    - Puppet
    - Chef
    - Salt (SaltStack)
