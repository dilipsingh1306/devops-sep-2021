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
