## Asta4e sample

1. prepare

First, you have to download excel samples from my repository to your project root.

> wget https://github.com/axtstar/asta4e-sample.g8/raw/master/code.xls

> wget https://github.com/axtstar/asta4e-sample.g8/raw/master/read_template.xls

2. build

> sbt compile

3. run from sbt

> sbt run

4. build

> sbt assembly

5. from java

> java -jar target/scala-2.12/$name$-assembly-$version$.jar
