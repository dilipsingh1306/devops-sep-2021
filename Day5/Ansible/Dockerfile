FROM ubuntu:20.04
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

RUN apt update && apt install -y openjdk-11-jdk maven
RUN apt install -y git
RUN apt-get install -y build-essential

COPY settings.xml /usr/share/maven/conf/settings.xml
RUN mkdir -p /root/.m2

CMD ["/bin/bash"]
