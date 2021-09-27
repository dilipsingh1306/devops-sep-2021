# devops-sep-2021

### From your rps Lab Machine, launch a terminal and type this command to see if you have sudo permission
```
sudo yum install -y epel-release
```
When prompted for password, you need to type rps@12345

### In case you don't have JDK installed, you may install as shown below
```
sudo yum install -y java-11-openjdk-devel
```

### Check if you have java compiler (Try this as rps user)
```
javac -version
```

### Check if you have java runtime (try this as rps user)
```
java -version
```

### Setting up Maven build tool
```
cd ~/Downloads
wget https://dlcdn.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.tar.gz
tar xvfz apache-maven-3.8.2-bin.tar.gz
```

### Setting Java and Maven environment path
Make sure you append the below line into your ~/.bashrc file and save it.
```
# User specific aliases and functions
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.12.0.7-0.el8_4.x86_64
export M2_HOME=/home/jegan/Downloads/apache-maven-3.8.2
export PATH=$JAVA_HOME/bin:$M2_HOME/bin:$PATH
```

In order to apply the changes, let's run
```
source ~/.bashrc
```

### Check if you have maven build tool installed
```
mvn --version
```
The expected output is
<pre>
[jegan@tektutor ~]$ mvn --version
Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)
Maven home: /home/jegan/Downloads/apache-maven-3.8.2
Java version: 11.0.12, vendor: Red Hat, Inc., runtime: /usr/lib/jvm/java-11-openjdk-11.0.12.0.7-0.el8_4.x86_64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "4.18.0-240.el8.x86_64", arch: "amd64", family: "unix"
</pre>

### Ant Build tool
- Apache Foundation 
- opensource tool
- used by Java projects
- build instructions are written in an xml file (build.xml)
- has no built-in features to manage your project dependencies
- doesn't have any standard conventions for 
    - how you name your project
    - how you name your artifacts (jar, war, ear, etc.,)
    - how your project folder structure should look like
- things get complicated as the project complexity increases
- Apache Team who developed Ant build tool, when they used Ant as a build tool for one of their projects called Jakarta they
  realized it is too complex to use Ant for such a complex project/project. Hence they wanted to improve the build tool and that's 
  how Maven build tool was created.

### What is Maven?
- a build tool developed Apache Foundataion
- opensource tool
- used predominantly by Java projects but it is technology agnostic tool(can be used by C/C++, C#(.Net), etc.,)
- build naturally is a better tool than Ant
- suports dependency management 
- Convention over Configuration
  80 - 20 Principle
    - as per this principle, it seems 80% of time only 20% of features of any product is used
    - in other words, 80% of the people only use 20% of the features offered by any product
    - Big organizations takes User Experience very seriously, hence they identify the most common use cases and they make those
      features easy to access.  While the advanced use cases are still possible but may require some extra configurations.
- Maven co-ordinates
   - is a convention insisted by Maven on how to name your project or artifacts(binary package)
   - 3 Co-ordinates
     1. GroupId - generally reverse domain name of your organization is used 
        -  if microsoft.com is the domain, reverse doman name is com.microsoft
     3. ArtifactId
        - this is name of jar, war, ear, zip, etc.,
     5. Version
        - 1.2.3
            - 1 refers to major version
            - 2 refers to minor version
            - 3 refers to incremental version
     - maven co-ordinates has to choen carefully in a such a way that the combination of all 3 coordinates must be unique
  - Repositories
     - a collection of third-party opensource libraries
     - 3 type of Repositories
       1. Local repository 
          - maintained in your system local folder ( Under User home, maven creates a hidden .m2 folder )
       3. Private repository
          - can be optionally setup using
              1. In Docker Hub - Docker Image ( registry:2 )
              2. Sonatype Nexus 
              3. JFrog Artifactory
          - in case you are working in a closed-source project/product, then you need all the functionalities of Central Repository
            within in your organization.
       5. Central repositroy ( Maven Central Repo website - https://search.maven.org/
          - has all open source artifacts
          - you could also contribute but it would be a open source library
     - eg. 
         - JUnit Test Framework jar files
         - Mockito Mocking Framework jar files
         - Eazy Mock Framework jar files
         - Log4J - Logging utility jar files
         - spring boot framework jar files

### Create a training folder to clone the TekTutor GitHub Repository
```
cd ~
mkdir Training
cd Training
git clone https://github.com/tektutor/devops-sep-2021.git
cd devops-sep-2021
```
