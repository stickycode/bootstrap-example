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


# Build all to start with

To build all the projects use the reactor.xml which defines all the modules

   mvn -f reactor.xml clean package

# Project which has a main i.e. bootstrap-application

## Execute with no parameters

By default if there is one main it will be invoked

    java -jar boostrap-application/target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar

  > Booted!

## Parameters are passed in as you would expect

For this example the words or numbers are printed back with a delay

    java -jar bootstrap-application/target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar Go

  > Running booting sequence 0: G o OK
  Booted!

    java -jar bootstrap-application/target/sticky-boostrap-application-0.1-SNAPSHOT-bootstrap.jar Go Go

  > Running booting sequence 0: G o OK
  Running booting sequence 1: G o OK
  Booted!

# Project to combine commands together

In this case you are assembling and application from a number of jars with mains

## No command specified will let you know whats available

    java -jar bootstrap-applications/target/sticky-boostrap-applications-0.1-SNAPSHOT-bootstrap.jar 

  > No command was specified
  >
  > Usage: java -jar /home/michael/working/bootstrap-example/bootstrap-applications/target/sticky-boostrap-applications-0.1-SNAPSHOT-bootstrap.jar Command arg1 arg2 arg3
  >
  > Booted - Example class which prints a boot sequence based on arguments
  > HelloWorld - N/A

## Specifying the Booted command

  This one just prints out the string you pass in one letter at a time or counts up to the number given with a pause between

    java -jar bootstrap-applications/target/sticky-boostrap-applications-0.1-SNAPSHOT-bootstrap.jar Booted

  > Running booting sequence 0: B o o t e d OK
  > Booted!

## Running the HelloWorld command with an argument

  This one prints out the vector of position and count up to the number given with a pause between

    java -jar bootstrap-applications/target/sticky-boostrap-applications-0.1-SNAPSHOT-bootstrap.jar HelloWorld 2 

  > This is not a number HelloWorld
  > Hello world (1,0)!
  > Hello world (1,1)!


