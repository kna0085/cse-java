# Adyen CSE Java lib

[![Build Status](https://secure.travis-ci.org/transferwise/adyen-cse-java.svg?branch=master)](http://travis-ci.org/transferwise/adyen-cse-java)

Java code for doing Adyen client-side encryption (CSE).

Adapted from the [Android cliend side encryption](https://github.com/Adyen/client-side-encryption) project. 


## Issues

If you get a `InvalidKeyException:` exception, you might have to install
Java Cryptography Extension (JCE) Unlimited Strength. More info about this issue [here](http://stackoverflow.com/questions/6481627/java-security-illegal-key-size-or-default-parameters/6481658#6481658) and [here](http://stackoverflow.com/questions/24907530/java-security-invalidkeyexception-illegal-key-size-or-default-parameters-in-and).


## Releasing

The Gradle file supports releasing to an Artifactory repository.
Just create a `~/.gradle/gradle.properties` file with following properties:

```
snapshotUrl=
snapshotUserName=
snapshotPassword=
releaseUrl=
releaseUserName=
releasePassword=
```

Use `./gradlew release` to build and upload a new version.
