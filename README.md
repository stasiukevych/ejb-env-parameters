# EJB Environment Naming Context

## Description

Project shows a simple example of injecting environment parameters
through [ejb-jar.xml](/src/main/webapp/WEB-INF/ejb-jar.xml). Using deployment descriptor file,
you can set some constants/connection strings/url parameters etc.

## Describe environment entry

For describing entry in [ejb-jar.xml](/src/main/webapp/WEB-INF/ejb-jar.xml), you should follow the
next structure:

```xml

<env-entry>
  <env-entry-name>connection</env-entry-name>
  <env-entry-type>java.lang.String</env-entry-type>
  <env-entry-value>jdbc:/mysql/ejb-env</env-entry-value>
</env-entry>
```

## Deployment

Pay attention on deployment, in our example we are using the `.war` and structure will be the
next `src/main/webapp/WEB-INF/ejb-jar.xml`, if you want to deploy as `.ear` you should
use `src/main/resources/META-INF/ejb-jar.xml`.
