### Installing g++ compiler and make tools
```
sudo yum install -y gcc-c++ make
```
When it prompts for password, type the root(admin) password i.e rps@12345


### Build and run the CRM application
```
cd ~/Training/devops-sep-2021
git pull
cd Day2/CRM
mvn install
```
The expected output is
<pre>
[jegan@tektutor CRM]$ <b>mvn install</b>
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] crm                                                                [pom]
[INFO] backend                                                            [jar]
[INFO] businesslayer                                                      [jar]
[INFO] frontend                                                           [jar]
[INFO] main                                                               [jar]
[INFO] hello-cpp                                                          [jar]
[INFO] 
[INFO] --------------------------< org.tektutor:crm >--------------------------
[INFO] Building crm 1.0.0                                                 [1/6]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ crm ---
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/pom.xml to /home/jegan/.m2/repository/org/tektutor/crm/1.0.0/crm-1.0.0.pom
[INFO] 
[INFO] ------------------------< org.tektutor:backend >------------------------
[INFO] Building backend 1.0.0                                             [2/6]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ backend ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ backend ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ backend ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ backend ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ backend ---
[INFO] Surefire report directory: /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.BackendTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ backend ---
[INFO] Building jar: /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/target/backend-1.0.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ backend ---
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/target/backend-1.0.0.jar to /home/jegan/.m2/repository/org/tektutor/backend/1.0.0/backend-1.0.0.jar
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/backend/pom.xml to /home/jegan/.m2/repository/org/tektutor/backend/1.0.0/backend-1.0.0.pom
[INFO] 
[INFO] ---------------------< org.tektutor:businesslayer >---------------------
[INFO] Building businesslayer 1.0.0                                       [3/6]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ businesslayer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ businesslayer ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ businesslayer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ businesslayer ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ businesslayer ---
[INFO] Surefire report directory: /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.BusinessLayerTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.045 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ businesslayer ---
[INFO] Building jar: /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/target/businesslayer-1.0.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ businesslayer ---
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/target/businesslayer-1.0.0.jar to /home/jegan/.m2/repository/org/tektutor/businesslayer/1.0.0/businesslayer-1.0.0.jar
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/businesslayer/pom.xml to /home/jegan/.m2/repository/org/tektutor/businesslayer/1.0.0/businesslayer-1.0.0.pom
[INFO] 
[INFO] -----------------------< org.tektutor:frontend >------------------------
[INFO] Building frontend 1.0.0                                            [4/6]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ frontend ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ frontend ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ frontend ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ frontend ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ frontend ---
[INFO] Surefire report directory: /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.FrontendTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ frontend ---
[INFO] Building jar: /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/target/frontend-1.0.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ frontend ---
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/target/frontend-1.0.0.jar to /home/jegan/.m2/repository/org/tektutor/frontend/1.0.0/frontend-1.0.0.jar
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/frontend/pom.xml to /home/jegan/.m2/repository/org/tektutor/frontend/1.0.0/frontend-1.0.0.pom
[INFO] 
[INFO] -------------------------< org.tektutor:main >--------------------------
[INFO] Building main 1.0.0                                                [5/6]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ main ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/main/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ main ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/main/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ main ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/main/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ main ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/Training/devops-sep-2021/Day2/CRM/main/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ main ---
[INFO] Surefire report directory: /home/jegan/Training/devops-sep-2021/Day2/CRM/main/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.MainTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ main ---
[INFO] Building jar: /home/jegan/Training/devops-sep-2021/Day2/CRM/main/target/main-1.0.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ main ---
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/main/target/main-1.0.0.jar to /home/jegan/.m2/repository/org/tektutor/main/1.0.0/main-1.0.0.jar
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/main/pom.xml to /home/jegan/.m2/repository/org/tektutor/main/1.0.0/main-1.0.0.pom
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:java (exec-java-app) @ main ---
<b>Inside Main Module ...
Inside Frontend Module ...
Inside BusinessLayer Module ...
Inside Backend Module ...
Accessing Data from DB ...</b>
[INFO] 
[INFO] -----------------------< org.tektutor:hello-cpp >-----------------------
[INFO] Building hello-cpp 1.0.0                                           [6/6]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:exec (custom-cpp-compile) @ hello-cpp ---
g++ -c src/hello.cpp -o bin/hello.o
g++ -c src/main.cpp -o bin/main.o
g++ bin/hello.o bin/main.o -o bin/main.exe
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ hello-cpp ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/Training/devops-sep-2021/Day2/CRM/cpp-hello/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ hello-cpp ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ hello-cpp ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ hello-cpp ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ hello-cpp ---
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/cpp-hello/target/hello-cpp-1.0.0.jar to /home/jegan/.m2/repository/org/tektutor/hello-cpp/1.0.0/hello-cpp-1.0.0.jar
[INFO] Installing /home/jegan/Training/devops-sep-2021/Day2/CRM/cpp-hello/pom.xml to /home/jegan/.m2/repository/org/tektutor/hello-cpp/1.0.0/hello-cpp-1.0.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for crm 1.0.0:
[INFO] 
[INFO] crm ................................................ SUCCESS [  0.185 s]
[INFO] backend ............................................ SUCCESS [  1.489 s]
[INFO] businesslayer ...................................... SUCCESS [  0.307 s]
[INFO] frontend ........................................... SUCCESS [  0.320 s]
[INFO] main ............................................... SUCCESS [  0.518 s]
[INFO] hello-cpp .......................................... SUCCESS [  0.550 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.461 s
[INFO] Finished at: 2021-09-28T00:08:42-07:00
[INFO] ------------------------------------------------------------------------
</pre>


### Running the cpp-hello application
```
cd ~/Training/devops-sep-2021
git pull
cd Day2/cpp-hello
mvn compile 
```
The expected output is
<pre>
[jegan@tektutor cpp-hello]$ mvn compile
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< org.tektutor:hello-cpp >-----------------------
[INFO] Building hello-cpp 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:exec (custom-list-dir) @ hello-cpp ---
.:
total 8
drwxrwxr-x. 2 jegan jegan    6 Sep 27 23:14 bin
-rw-rw-r--. 1 jegan jegan  238 Sep 27 22:51 Makefile
-rw-rw-r--. 1 jegan jegan 2217 Sep 27 23:11 pom.xml
drwxrwxr-x. 2 jegan jegan   54 Sep 27 22:23 src

./bin:
total 0

./src:
total 12
-rw-rw-r--. 1 jegan jegan 102 Sep 27 22:08 hello.cpp
-rw-rw-r--. 1 jegan jegan 150 Sep 27 22:06 hello.h
-rw-rw-r--. 1 jegan jegan  82 Sep 27 22:07 main.cpp
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:exec (custom-cpp-compile) @ hello-cpp ---
g++ -c src/hello.cpp -o bin/hello.o
g++ -c src/main.cpp -o bin/main.o
g++ bin/hello.o bin/main.o -o bin/main.exe
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.960 s
[INFO] Finished at: 2021-09-28T00:07:03-07:00
[INFO] ------------------------------------------------------------------------

</pre>

### Cleaning the cpp project binaries and performing a clean build(compile)
```
cd ~/Training/devops-sep-2021
git pull
cd Day2/cpp-hello
mvn compile 
```
The expected output is
<pre>
[jegan@tektutor cpp-hello]$ <b>mvn clean compile</b>
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< org.tektutor:hello-cpp >-----------------------
[INFO] Building hello-cpp 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:exec (custom-cpp-clean) @ hello-cpp ---
<b>rm -f bin/*.o
rm -f bin/*.exe</b>
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:exec (custom-list-dir) @ hello-cpp ---
.:
total 8
drwxrwxr-x. 2 jegan jegan    6 Sep 28 00:12 bin
-rw-rw-r--. 1 jegan jegan  238 Sep 27 22:51 Makefile
-rw-rw-r--. 1 jegan jegan 2217 Sep 27 23:11 pom.xml
drwxrwxr-x. 2 jegan jegan   54 Sep 27 22:23 src

./bin:
total 0

./src:
total 12
-rw-rw-r--. 1 jegan jegan 102 Sep 27 22:08 hello.cpp
-rw-rw-r--. 1 jegan jegan 150 Sep 27 22:06 hello.h
-rw-rw-r--. 1 jegan jegan  82 Sep 27 22:07 main.cpp
[INFO] 
[INFO] --- exec-maven-plugin:3.0.0:exec (custom-cpp-compile) @ hello-cpp ---
<b>g++ -c src/hello.cpp -o bin/hello.o
g++ -c src/main.cpp -o bin/main.o
g++ bin/hello.o bin/main.o -o bin/main.exe</b>
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.080 s
[INFO] Finished at: 2021-09-28T00:12:20-07:00
[INFO] ------------------------------------------------------------------------
</pre>


# Containers

- Linux Technology
- Linux Kernel
  - Namespace - helps in isolating one container from the other container
  - Control Groups(CGroups) - helps in applying hardware quota restrictions on containers
- Some popular container runtimes
  - LXC
  - Docker
  - CRI-O
  - Podman ( Used by RedHat Openshift )

- Docker
  - Developed in Go programming language by Docker Inc
  - follows Client/Server Architecture
  - Client (docker - commandline tool)
  - Server (dockerd - runs as Linux service[daemon])
  - Docker Registries
    - maintains a lot of Docker Images
    - Database Images (Mongo, Couchbase, Oracle, MySQL, Redis, etc.,)
    - Ubuntu, CentOS Docker images
    - Web Sever Images ( Tomcat, Nginx, etc.,)
  - supports 3 types of Registries
    - Local Docker Registry
    - Private Docker Registry
    - Docker Hub (Website maintained by Docker Inc)
  - comes in 2 flavours
     - Community Edition (CE - Opensource)
     - Enterprise Edition (EE - For Commercial use)

## Docker Commands

### Downloading docker image from Docker Hub to Local
```
docker pull hello-world:latest
```
The expected output is
<pre>
[jegan@tektutor ~]$ <b>docker pull hello-world:latest</b>
latest: Pulling from library/hello-world
2db29710123e: Pull complete 
Digest: sha256:393b81f0ea5a98a7335d7ad44be96fe76ca8eb2eaa76950eb8c989ebf2b78ec0
Status: Downloaded newer image for hello-world:latest
docker.io/library/hello-world:latest
</pre>

### Running Docker commands as non-root user(ie rps user)

##### Checking the user groups the rps user belongs to
```
id
```

When you install docker, docker creates a user group called docker.  Any user is who is part of docker group will gain read/write access to docker commands.
```
sudo usermod -aG docker rps
sudo su rps
id
docker images
```
Once the rps user is added to 'docker' user group, rps user should be able to successfully issue any docker commands.

### Listing Docker images from your local registry
```
docker images
```
The expected output is
<pre>
[jegan@tektutor ~]$ <b>docker images</b>
REPOSITORY                                TAG       IMAGE ID       CREATED       SIZE
hello-world                               latest    feb5d9fea6a5   4 days ago    13.3kB
docker.bintray.io/jfrog/artifactory-oss   latest    f96008c316f4   2 weeks ago   980MB
</pre>

### Creating an ubuntu container in background mode
```
docker run -dit --name c1 --hostname c1 ubuntu:20.04 /bin/bash
```

<pre>
[jegan@tektutor ~]$ <b>docker run -dit --name c1 --hostname c1 ubuntu:20.04 /bin/bash</b>
Unable to find image 'ubuntu:20.04' locally
20.04: Pulling from library/ubuntu
35807b77a593: Pull complete 
Digest: sha256:9d6a8699fb5c9c39cf08a0871bd6219f0400981c570894cd8cbea30d3424a31f
Status: Downloaded newer image for ubuntu:20.04
8cae4661bd1b9a0d255cdf0b0d11c1cbc58b71f0f2b2f6da5cf4fbb483676e32
</pre>

In the above command
<pre>
c1 - is the name of the container
c1 - is the hostname of the container
ubuntu:20.04 - is the name of the docker image
/bin/bash - is the shell(application) that is launched inside the container
</pre>


### Listing all the currently running containers
```
docker ps
```

The expected output is

<pre>
[jegan@tektutor ~]$ docker ps
CONTAINER ID   IMAGE                                            COMMAND                  CREATED         STATUS         PORTS                                                           NAMES
8cae4661bd1b   ubuntu:20.04                                     "/bin/bash"              6 seconds ago   Up 5 seconds                                                                   c1
3530a3c53efa   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   23 hours ago    Up 23 hours    0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>

### Creating a hello-world container
```
docker run --name hello hello-world:latest
```
<pre>
[jegan@tektutor ~]$ <b>docker run --name hello hello-world:latest</b>

Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

To try something more ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu bash

Share images, automate workflows, and more with a free Docker ID:
 https://hub.docker.com/

For more examples and ideas, visit:
 https://docs.docker.com/get-started/
</pre>

```
docker ps
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker ps
CONTAINER ID   IMAGE                                            COMMAND                  CREATED          STATUS          PORTS                                                           NAMES
8cae4661bd1b   ubuntu:20.04                                     "/bin/bash"              18 minutes ago   Up 18 minutes                                                                   c1
3530a3c53efa   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   24 hours ago     Up 24 hours     0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>

The container that we created above i.e hello container will exit as soon as it printed the above output.  So in order to list the containers in any state (running, created, exited, etc.,) You may try the below command

```
docker ps -a
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker ps -a
CONTAINER ID   IMAGE                                            COMMAND                  CREATED          STATUS                     PORTS                                                           NAMES
5af956dd81ec   hello-world:latest                               "/hello"                 3 minutes ago    Exited (0) 3 minutes ago                                                                   hello
8cae4661bd1b   ubuntu:20.04                                     "/bin/bash"              18 minutes ago   Up 18 minutes                                                                              c1
3530a3c53efa   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   24 hours ago     Up 24 hours                0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>

### Creating an ubuntu container in interactive mode
```
docker run -it --name c2 --hostname c2 ubuntu:20.04 /bin/bash
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker run -it --name c2 --hostname c2 ubuntu:20.04 /bin/bash
root@c2:/# ls
bin   dev  home  lib32  libx32  mnt  proc  run   srv  tmp  var
boot  etc  lib   lib64  media   opt  root  sbin  sys  usr
root@c2:/# hostname
c2
root@c2:/# hostname -i
172.17.0.4
root@c2:/# 
</pre>

In order to come out of the interactive container, you may type 'exit' but this will also exit the container.
Optionally, you may try Ctrl + p, followed by Ctrl + q to come out of the container's shell without terminating the container.

### Stopping a running container
```
docker stop c1
```

### Stopping multiple containers
```
docker stop c1 c2 c3
```

### Stopping multiple containers without using their names
```
docker stop $(docker ps -q)
```

### Starting a stopped container
```
docker start c1
```

### Starting mutiple stopped containers
```
docker start c1 c2 c3
```

### Starting multiple containers without their names
```
doccer start $(docker ps -aq)
```

### Deleting a running container graciously
```
docker stop c1
docker rm c1
```

### Deleting multiple running container graciously
```
docker stop c1 c2 c3
docker rm c1 c2 c3
```

### Deleting a running container forcibly
```
docker rm -f c1
```

### Deleting multiple running containers graciously
```
docker stop $(docker ps -q)
docker rm $(docker ps -aq)
```

### Deleting multiple running containers forcibly
```
docker rm -f $(docker ps -aq)
```

### Finding more details about a conainer
```
docker inspect c1
```
The expected output is
<pre>
[jegan@tektutor ~]$ <b>docker inspect c1</b>
[
    {
        "Id": "3662a32f7108590f596b5af16ec2476299a5d1cbd360b9a5a676a2bcab268c9a",
        "Created": "2021-09-28T11:02:57.47552727Z",
        "Path": "/bin/bash",
        "Args": [],
        "State": {
            "Status": "running",
            "Running": true,
            "Paused": false,
            "Restarting": false,
            "OOMKilled": false,
            "Dead": false,
            "Pid": 116220,
            "ExitCode": 0,
            "Error": "",
            "StartedAt": "2021-09-28T11:02:58.136856276Z",
            "FinishedAt": "0001-01-01T00:00:00Z"
        },
        "Image": "sha256:fb52e22af1b01869e23e75089c368a1130fa538946d0411d47f964f8b1076180",
        "ResolvConfPath": "/var/lib/docker/containers/3662a32f7108590f596b5af16ec2476299a5d1cbd360b9a5a676a2bcab268c9a/resolv.conf",
        "HostnamePath": "/var/lib/docker/containers/3662a32f7108590f596b5af16ec2476299a5d1cbd360b9a5a676a2bcab268c9a/hostname",
        "HostsPath": "/var/lib/docker/containers/3662a32f7108590f596b5af16ec2476299a5d1cbd360b9a5a676a2bcab268c9a/hosts",
        "LogPath": "/var/lib/docker/containers/3662a32f7108590f596b5af16ec2476299a5d1cbd360b9a5a676a2bcab268c9a/3662a32f7108590f596b5af16ec2476299a5d1cbd360b9a5a676a2bcab268c9a-json.log",
        "Name": "/c1",
        "RestartCount": 0,
        "Driver": "overlay2",
        "Platform": "linux",
        "MountLabel": "",
        "ProcessLabel": "",
        "AppArmorProfile": "",
        "ExecIDs": null,
        "HostConfig": {
            "Binds": null,
            "ContainerIDFile": "",
            "LogConfig": {
                "Type": "json-file",
                "Config": {}
            },
            "NetworkMode": "default",
            "PortBindings": {},
            "RestartPolicy": {
                "Name": "no",
                "MaximumRetryCount": 0
            },
            "AutoRemove": false,
            "VolumeDriver": "",
            "VolumesFrom": null,
            "CapAdd": null,
            "CapDrop": null,
            "CgroupnsMode": "host",
            "Dns": [],
            "DnsOptions": [],
            "DnsSearch": [],
            "ExtraHosts": null,
            "GroupAdd": null,
            "IpcMode": "private",
            "Cgroup": "",
            "Links": null,
            "OomScoreAdj": 0,
            "PidMode": "",
            "Privileged": false,
            "PublishAllPorts": false,
            "ReadonlyRootfs": false,
            "SecurityOpt": null,
            "UTSMode": "",
            "UsernsMode": "",
            "ShmSize": 67108864,
            "Runtime": "runc",
            "ConsoleSize": [
                0,
                0
            ],
            "Isolation": "",
            "CpuShares": 0,
            "Memory": 0,
            "NanoCpus": 0,
            "CgroupParent": "",
            "BlkioWeight": 0,
            "BlkioWeightDevice": [],
            "BlkioDeviceReadBps": null,
            "BlkioDeviceWriteBps": null,
            "BlkioDeviceReadIOps": null,
            "BlkioDeviceWriteIOps": null,
            "CpuPeriod": 0,
            "CpuQuota": 0,
            "CpuRealtimePeriod": 0,
            "CpuRealtimeRuntime": 0,
            "CpusetCpus": "",
            "CpusetMems": "",
            "Devices": [],
            "DeviceCgroupRules": null,
            "DeviceRequests": null,
            "KernelMemory": 0,
            "KernelMemoryTCP": 0,
            "MemoryReservation": 0,
            "MemorySwap": 0,
            "MemorySwappiness": null,
            "OomKillDisable": false,
            "PidsLimit": null,
            "Ulimits": null,
            "CpuCount": 0,
            "CpuPercent": 0,
            "IOMaximumIOps": 0,
            "IOMaximumBandwidth": 0,
            "MaskedPaths": [
                "/proc/asound",
                "/proc/acpi",
                "/proc/kcore",
                "/proc/keys",
                "/proc/latency_stats",
                "/proc/timer_list",
                "/proc/timer_stats",
                "/proc/sched_debug",
                "/proc/scsi",
                "/sys/firmware"
            ],
            "ReadonlyPaths": [
                "/proc/bus",
                "/proc/fs",
                "/proc/irq",
                "/proc/sys",
                "/proc/sysrq-trigger"
            ]
        },
        "GraphDriver": {
            "Data": {
                "LowerDir": "/var/lib/docker/overlay2/2191b67dc807d5b69719494b173d95e335cac31193069c43eb2a8ae5a7ac8924-init/diff:/var/lib/docker/overlay2/b620ba0e099349a3791d493d7e79d998fc6b322a2d7517608f6baff48ec41d10/diff",
                "MergedDir": "/var/lib/docker/overlay2/2191b67dc807d5b69719494b173d95e335cac31193069c43eb2a8ae5a7ac8924/merged",
                "UpperDir": "/var/lib/docker/overlay2/2191b67dc807d5b69719494b173d95e335cac31193069c43eb2a8ae5a7ac8924/diff",
                "WorkDir": "/var/lib/docker/overlay2/2191b67dc807d5b69719494b173d95e335cac31193069c43eb2a8ae5a7ac8924/work"
            },
            "Name": "overlay2"
        },
        "Mounts": [],
        "Config": {
            "Hostname": "c1",
            "Domainname": "",
            "User": "",
            "AttachStdin": false,
            "AttachStdout": false,
            "AttachStderr": false,
            "Tty": true,
            "OpenStdin": true,
            "StdinOnce": false,
            "Env": [
                "PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
            ],
            "Cmd": [
                "/bin/bash"
            ],
            "Image": "ubuntu:20.04",
            "Volumes": null,
            "WorkingDir": "",
            "Entrypoint": null,
            "OnBuild": null,
            "Labels": {}
        },
        "NetworkSettings": {
            "Bridge": "",
            "SandboxID": "01d6ad34001030b9012ba1e4a74d6c05a032a237fbf7b83011443f5964667e76",
            "HairpinMode": false,
            "LinkLocalIPv6Address": "",
            "LinkLocalIPv6PrefixLen": 0,
            "Ports": {},
            "SandboxKey": "/var/run/docker/netns/01d6ad340010",
            "SecondaryIPAddresses": null,
            "SecondaryIPv6Addresses": null,
            "EndpointID": "40b42affac4abab733eeefbad48df237a392ca52a8d6be85dac5f29017cb876f",
            "Gateway": "172.17.0.1",
            "GlobalIPv6Address": "",
            "GlobalIPv6PrefixLen": 0,
            "IPAddress": "172.17.0.2",
            "IPPrefixLen": 16,
            "IPv6Gateway": "",
            "MacAddress": "02:42:ac:11:00:02",
            "Networks": {
                "bridge": {
                    "IPAMConfig": null,
                    "Links": null,
                    "Aliases": null,
                    "NetworkID": "549332b5a7089c7b551c2f0c322abd0d7b3964756f04b99fd0f9fa5d6b4e7159",
                    "EndpointID": "40b42affac4abab733eeefbad48df237a392ca52a8d6be85dac5f29017cb876f",
                    "Gateway": "172.17.0.1",
                    "IPAddress": "172.17.0.2",
                    "IPPrefixLen": 16,
                    "IPv6Gateway": "",
                    "GlobalIPv6Address": "",
                    "GlobalIPv6PrefixLen": 0,
                    "MacAddress": "02:42:ac:11:00:02",
                    "DriverOpts": null
                }
            }
        }
    }
]
</pre>

### Finding the IP Address of a running container
```
docker inspect c1 | grep IPA
```

The exepcted output is
<pre>
[jegan@tektutor ~]$ <b>docker inspect c1 | grep IPA</b>
            "SecondaryIPAddresses": null,
            "IPAddress": "172.17.0.2",
                    "IPAMConfig": null,
                    "IPAddress": "172.17.0.2",

</pre>

### Docker's native style to extract IP Address without grep
```
docker inspect -f {{.NetworkSettings.IPAddress}} c1
```
The exepcted output is
<pre>
[jegan@tektutor ~]$ <b>docker inspect -f {{.NetworkSettings.IPAddress}} c1</b>
172.17.0.2
</pre>

### Remove all exiting containers
```
docker rm -f $(docker ps -aq)
```

### Creating 3 ubuntu containers
```
docker run -dit --name c1 --hostname c1 ubuntu:20.04 /bin/bash
docker run -dit --name c2 --hostname c2 ubuntu:20.04 /bin/bash
docker run -dit --name c3 --hostname c3 ubuntu:20.04 /bin/bash
```
Let us list the running containers
```
docker ps
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker ps
CONTAINER ID   IMAGE          COMMAND       CREATED          STATUS          PORTS     NAMES
470304e01594   ubuntu:20.04   "/bin/bash"   6 seconds ago    Up 5 seconds              c3
c64620fc2d2e   ubuntu:20.04   "/bin/bash"   18 seconds ago   Up 17 seconds             c2
97fbd090cf18   ubuntu:20.04   "/bin/bash"   23 seconds ago   Up 22 seconds             c1
</pre>

### Renaming the ubuntu containers
```
docker rename c1 ubuntu1
docker rename c2 ubuntu2
docker rename c3 ubuntu3
```
Listing the running containers
```
docker ps
```
The expected output is
<pre>
<b>Before renaming ...</b>
[jegan@tektutor ~]$ <b>docker ps</b>
CONTAINER ID   IMAGE          COMMAND       CREATED          STATUS          PORTS     NAMES
470304e01594   ubuntu:20.04   "/bin/bash"   6 seconds ago    Up 5 seconds              c3
c64620fc2d2e   ubuntu:20.04   "/bin/bash"   18 seconds ago   Up 17 seconds             c2
97fbd090cf18   ubuntu:20.04   "/bin/bash"   23 seconds ago   Up 22 seconds             c1

<b>Rename commands</b>
[jegan@tektutor ~]$ docker rename c1 ubuntu1
[jegan@tektutor ~]$ docker rename c2 ubuntu2
[jegan@tektutor ~]$ docker rename c3 ubuntu3

<b>After renaming</b>
[jegan@tektutor ~]$ docker ps
CONTAINER ID   IMAGE          COMMAND       CREATED         STATUS         PORTS     NAMES
470304e01594   ubuntu:20.04   "/bin/bash"   2 minutes ago   Up 2 minutes             ubuntu3
c64620fc2d2e   ubuntu:20.04   "/bin/bash"   2 minutes ago   Up 2 minutes             ubuntu2
97fbd090cf18   ubuntu:20.04   "/bin/bash"   2 minutes ago   Up 2 minutes             ubuntu1
</pre>



### Creating 3 centos containers
```
docker run -dit --name centos1 --hostname centos1 centos:8 /bin/bash
docker run -dit --name centos2 --hostname centos2 centos:8 /bin/bash
docker run -dit --name centos3 --hostname centos3 centos:8 /bin/bash
```
As we don't have centos:8 image in the Local Docker Registry, Docker Application Engine(Server) will download it from Docker Hub(Remote Registry).

You may now list the containers
```
docker ps
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker ps
CONTAINER ID   IMAGE          COMMAND       CREATED          STATUS          PORTS     NAMES
93aad5b4e536   centos:8       "/bin/bash"   3 seconds ago    Up 2 seconds              centos3
009a107fa0f5   centos:8       "/bin/bash"   12 seconds ago   Up 11 seconds             centos2
65595e7a0475   centos:8       "/bin/bash"   25 seconds ago   Up 24 seconds             centos1
470304e01594   ubuntu:20.04   "/bin/bash"   5 minutes ago    Up 5 minutes              ubuntu3
c64620fc2d2e   ubuntu:20.04   "/bin/bash"   5 minutes ago    Up 5 minutes              ubuntu2
97fbd090cf18   ubuntu:20.04   "/bin/bash"   5 minutes ago    Up 5 minutes              ubuntu1
</pre>

### Listing only ubuntu1 ubuntu2 and ubuntu3 containers
```
docker ps --filter "name=ubuntu*"
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker ps --filter "name=ubuntu*"
CONTAINER ID   IMAGE          COMMAND       CREATED         STATUS         PORTS     NAMES
470304e01594   ubuntu:20.04   "/bin/bash"   7 minutes ago   Up 7 minutes             ubuntu3
c64620fc2d2e   ubuntu:20.04   "/bin/bash"   7 minutes ago   Up 7 minutes             ubuntu2
97fbd090cf18   ubuntu:20.04   "/bin/bash"   7 minutes ago   Up 7 minutes             ubuntu1
</pre>

### Listing only centos1 centos2 and centos3 containers
```
docker ps --filter "name=centos*"
```
The expected output is
<pre>
[jegan@tektutor ~]$ docker ps --filter "name=centos*"
CONTAINER ID   IMAGE      COMMAND       CREATED         STATUS         PORTS     NAMES
93aad5b4e536   centos:8   "/bin/bash"   2 minutes ago   Up 2 minutes             centos3
009a107fa0f5   centos:8   "/bin/bash"   2 minutes ago   Up 2 minutes             centos2
65595e7a0475   centos:8   "/bin/bash"   3 minutes ago   Up 3 minutes             centos1
</pre>

### Getting inside a container that is running in background
```
docker exec -it centos2 bash
```

The expected output is
<pre>
[jegan@tektutor ~]$ <b>docker exec -it centos2 bash</b>
[root@centos2 /]# ls
bin  dev  etc  home  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
[root@centos2 /]# hostname -i
172.17.0.6
[root@centos2 /]# hostname
centos2
</pre>

### Deleting containers selectively using fiters
```
docker rm -f $(docker ps -q --filter "name=centos*")
```
The expected output is
<pre>
[jegan@tektutor Day2]$ docker rm -f $(docker ps -q --filter "name=centos*")
93aad5b4e536
009a107fa0f5
65595e7a0475
</pre>
