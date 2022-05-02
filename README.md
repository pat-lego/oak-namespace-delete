# Remove Namespace 

## How to build

`mvn clean install`

## How to install

`mvn clean install -PautoInstallSinglePackage`

## Notes

This project creates a namespace called `foo` and then deletes it using the loginAdministrative API. Note that this project will create the whitelist config for you in order to allow the deletion of the namespace.

Once this is done the code should be removed and the loginAdministrative config should be removed also.

## Archetype Command

mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate \
 -D archetypeGroupId=com.adobe.aem \
 -D archetypeArtifactId=aem-project-archetype \
 -D archetypeVersion=36 \
 -D appTitle="AEM Support Repo Service" \
 -D appId="reposervice" \
 -D groupId="com.adobe.aem.support" \
 -D artifactId="reposervice" \
 -D aemVersion="6.5.12"