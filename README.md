# serenity-demo-test
Serenity Demo Test Showcase

This maven project demonstrates various styles of writing jbehave scenarios within Serenity BDD framework

1. To execute ALL tests in chrome browser, run mvn verify serenity:aggregate

2. To execute a particular test by tag, run 
mvn verify serenity:aggregate -Dmetafilter="+tagname tagvalue"
ex: mvn verify serenity:aggregate -Dmetafilter="+parametrised external" - This test will run all scenarios marked with tag @parametrised external

