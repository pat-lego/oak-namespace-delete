# Remove Namespace 

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