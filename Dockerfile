FROM tomcat:9.0-jre8-alpine
 
COPY target/TomcatTestApp*.war $CATALINA_HOME/webapps/TomcatTestApp.war
COPY docker/TomcatTestApp.xml $CATALINA_HOME/conf/Catalina/localhost/TomcatTestApp.xml
COPY src/main/resources/application-prod.properties $CATALINA_HOME/conf/application-prod.properties
