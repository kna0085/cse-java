Adyen CSE Java lib
==================

Java code for doing Adyen client-side encryption (CSE).

Adapted from the Android version: https://github.com/Adyen/client-side-encryption


# Fixing errors

If you get a `java.security.InvalidKeyException: Illegal key size` exception, you have to install
Java Cryptography Extension (JCE) Unlimited Strength.

More info:
* http://stackoverflow.com/questions/6481627/java-security-illegal-key-size-or-default-parameters/6481658#6481658
* http://stackoverflow.com/questions/24907530/java-security-invalidkeyexception-illegal-key-size-or-default-parameters-in-and


# Releasing

The Gradle file supports releasing to an Artifactory repository.
Just create a ~/.gradle/gradle.properties file with following properties:
```
snapshotUrl=
snapshotUserName=
snapshotPassword=
releaseUrl=
releaseUserName=
releasePassword=
```

Use './gradlew release' to build and upload a new version.
