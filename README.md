bootstrap-example
=================

Examples for using the StickyCode bootstrap-maven-plugin to create application assemblies

## Where to get it

The plugin is available on [maven central](http://repo1.maven.org/maven2/net/stickycode/plugins/).

  <plugin>
    <groupId>net.stickycode.plugins</groupId>
    <artifactId>bootstrap-maven-plugin</artifactId>
    <version>1.9</version>
    <executions>
      <execution>
        <goals>
          <goal>project</goal>
        </goals>
      </execution>
    </executions>
  </plugin>


# Single Project with main

  cd bootstrap-application
  mvn clean package

## Execute with no parameters

By default if there is one main it will be invoked

  java -jar /home/michael/working/bootstrap-example/bootstrap-application/target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar
  > Booted!

## Parameters are passed in as you would expect

  java -jar /home/michael/working/bootstrap-example/bootstrap-application/target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar Go
  > 

  java -jar /home/michael/working/bootstrap-example/bootstrap-application/target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar Go Go
  >

  java -jar target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar Go
  > Running booting sequence 0: G o OK
  Booted!

  java -jar target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar Go Go
  > Running booting sequence 0: G o OK
  Running booting sequence 1: G o OK
  Booted!


