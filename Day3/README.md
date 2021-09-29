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
- Michael Deehan develped <b>Ansible Core</b> as an Opensource project
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

### Generating SSH Key pairs for rps user
When it prompts for options, hit enter ( 3 times )
```
ssh-keygen
```

### Preparing a custom Ansible node image using Ubuntu as the base image
```
cd ~/Training/devops-sep-2021
git pull
cd Day3/Ansible/AnsibleNodeCustomDockerImages/ubuntu-ansible
cp ~/.ssh/id_rsa.pub authorized_keys
docker build -t tektutor/ansible-ubuntu-node .
```

### Preparing a custom Ansible node image using CentOS as the base image
```
cd ~/Training/devops-sep-2021
git pull
cd Day3/Ansible/AnsibleNodeCustomDockerImages/centos-ansible
cp ~/.ssh/id_rsa.pub authorized_keys
docker build -t tektutor/ansible-centos-node .
```

The expected output is
<pre>
[jegan@tektutor centos-ansible]$ <b>docker build -t tektutor/ansible-centos-node .</b>
Sending build context to Docker daemon  10.24kB
Step 1/17 : FROM centos:8
 ---> 5d0da3dc9764
Step 2/17 : MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>
 ---> Running in c9b9a09b02d5
Removing intermediate container c9b9a09b02d5
 ---> 39c83551888c
Step 3/17 : RUN yum install -y openssh-server openssh-clients
 ---> Running in aad966af0422
CentOS Linux 8 - AppStream                      1.1 MB/s | 9.3 MB     00:08    
CentOS Linux 8 - BaseOS                         1.4 MB/s | 7.5 MB     00:05    
CentOS Linux 8 - Extras                          16 kB/s |  10 kB     00:00    
Dependencies resolved.
================================================================================
 Package              Arch        Version                     Repository   Size
================================================================================
Installing:
 openssh-clients      x86_64      8.0p1-6.el8_4.2             baseos      667 k
 openssh-server       x86_64      8.0p1-6.el8_4.2             baseos      484 k
Installing dependencies:
 libedit              x86_64      3.1-23.20170329cvs.el8      baseos      102 k
 openssh              x86_64      8.0p1-6.el8_4.2             baseos      521 k

Transaction Summary
================================================================================
Install  4 Packages

Total download size: 1.7 M
Installed size: 5.5 M
Downloading Packages:
(1/4): libedit-3.1-23.20170329cvs.el8.x86_64.rp 157 kB/s | 102 kB     00:00    
(2/4): openssh-8.0p1-6.el8_4.2.x86_64.rpm       419 kB/s | 521 kB     00:01    
(3/4): openssh-clients-8.0p1-6.el8_4.2.x86_64.r 463 kB/s | 667 kB     00:01    
(4/4): openssh-server-8.0p1-6.el8_4.2.x86_64.rp 482 kB/s | 484 kB     00:01    
--------------------------------------------------------------------------------
Total                                           852 kB/s | 1.7 MB     00:02     
warning: /var/cache/dnf/baseos-f6a80ba95cf937f2/packages/libedit-3.1-23.20170329cvs.el8.x86_64.rpm: Header V3 RSA/SHA256 Signature, key ID 8483c65d: NOKEY
CentOS Linux 8 - BaseOS                         1.4 MB/s | 1.6 kB     00:00    
Importing GPG key 0x8483C65D:
 Userid     : "CentOS (CentOS Official Signing Key) <security@centos.org>"
 Fingerprint: 99DB 70FA E1D7 CE22 7FB6 4882 05B5 55B3 8483 C65D
 From       : /etc/pki/rpm-gpg/RPM-GPG-KEY-centosofficial
Key imported successfully
Running transaction check
Transaction check succeeded.
Running transaction test
Transaction test succeeded.
Running transaction
  Preparing        :                                                        1/1 
  Running scriptlet: openssh-8.0p1-6.el8_4.2.x86_64                         1/4 
  Installing       : openssh-8.0p1-6.el8_4.2.x86_64                         1/4 
  Installing       : libedit-3.1-23.20170329cvs.el8.x86_64                  2/4 
  Installing       : openssh-clients-8.0p1-6.el8_4.2.x86_64                 3/4 
  Running scriptlet: openssh-server-8.0p1-6.el8_4.2.x86_64                  4/4 
  Installing       : openssh-server-8.0p1-6.el8_4.2.x86_64                  4/4 
  Running scriptlet: openssh-server-8.0p1-6.el8_4.2.x86_64                  4/4 
  Verifying        : libedit-3.1-23.20170329cvs.el8.x86_64                  1/4 
  Verifying        : openssh-8.0p1-6.el8_4.2.x86_64                         2/4 
  Verifying        : openssh-clients-8.0p1-6.el8_4.2.x86_64                 3/4 
  Verifying        : openssh-server-8.0p1-6.el8_4.2.x86_64                  4/4 

Installed:
  libedit-3.1-23.20170329cvs.el8.x86_64   openssh-8.0p1-6.el8_4.2.x86_64        
  openssh-clients-8.0p1-6.el8_4.2.x86_64  openssh-server-8.0p1-6.el8_4.2.x86_64 

Complete!
Removing intermediate container aad966af0422
 ---> 46c8a7fe1138
Step 4/17 : RUN ln -s -f /usr/libexec/platform-python3.6 /usr/bin/python
 ---> Running in 6816c6850c2f
Removing intermediate container 6816c6850c2f
 ---> ea42dc05e80c
Step 5/17 : RUN echo 'root:root' | chpasswd
 ---> Running in a56f71f9bf9b
Removing intermediate container a56f71f9bf9b
 ---> d0051b2582b7
Step 6/17 : RUN usermod -aG wheel root
 ---> Running in db5e34c05572
Removing intermediate container db5e34c05572
 ---> fe9c543ba0df
Step 7/17 : RUN sed -ri 's/^session\s+required\s+pam_loginuid.so$/session optional pam_loginuid.so/' /etc/pam.d/sshd
 ---> Running in f7ac895400f4
Removing intermediate container f7ac895400f4
 ---> ce88d958dd38
Step 8/17 : COPY sshd_config /etc/ssh/sshd_config
 ---> b55ac2897e43
Step 9/17 : COPY sudoers /etc/sudoers
 ---> fc01794f064f
Step 10/17 : RUN mkdir -p /root/.ssh
 ---> Running in 5e08e05a09ae
Removing intermediate container 5e08e05a09ae
 ---> 219e10d57261
Step 11/17 : COPY authorized_keys /root/.ssh/authorized_keys
 ---> c3f894dd50d3
Step 12/17 : RUN chmod 700 -R /root/.ssh
 ---> Running in 136a1d334120
Removing intermediate container 136a1d334120
 ---> eb624741c512
Step 13/17 : RUN mkdir -m 700 /var/run/sshd
 ---> Running in a77cdcc9346b
Removing intermediate container a77cdcc9346b
 ---> fca7f9e453ff
Step 14/17 : RUN ssh-keygen -A && rm -f /run/nologin
 ---> Running in bbfb19561a4e
ssh-keygen: generating new host keys: RSA DSA ECDSA ED25519 
Removing intermediate container bbfb19561a4e
 ---> 6c66fb5c65c3
Step 15/17 : EXPOSE 22
 ---> Running in 4fc9f034cea8
Removing intermediate container 4fc9f034cea8
 ---> 5556348bbb09
Step 16/17 : EXPOSE 80
 ---> Running in 89de4eec60a6
Removing intermediate container 89de4eec60a6
 ---> 6b3c154fd98a
Step 17/17 : CMD ["/usr/sbin/sshd", "-D"]
 ---> Running in db2e1aaf8f35
Removing intermediate container db2e1aaf8f35
 ---> 3724c29f8afe
Successfully built 3724c29f8afe
Successfully tagged tektutor/ansible-centos-node:latest
</pre>
