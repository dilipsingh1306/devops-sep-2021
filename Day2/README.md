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
