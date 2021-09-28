### Running the CRM application
```
cd ~/Training/devops-sep-2021
git pull
cd Day2/CRM
mvn install
```

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
