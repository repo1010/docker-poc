FROM tomcat:9.0

MAINTAINER Vishal Kumar <vishal.dev194@gmail.com>

RUN rm -rf /usr/local/tomcat/webapps/*.war

COPY ./target/springwebapp.war  /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]