#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
KijiMR Blank Project
version ${project.version}


  (c) Copyright 2013 WibiData, Inc.

  See the NOTICE file distributed with this work for additional
  information regarding copyright ownership.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

This is a skeleton project for KijiMR.
see:
  www.kiji.org
  https://github.com/kijiproject/kiji-mapreduce

It contains a folder src/main/layout which contains a .ddl file that creates a table.

Example bulkimporters, producers, gatherers, and reducers are included in src/main/java.

To compile your project into a jar:

    mvn package

To try out the examples, first create a table to run on in your bento box:

    kiji-schema-shell --file=src/main/layout/table_desc.ddl

Then add your jar to the KIJI_CLASSPATH environment variable:

    export KIJI_CLASSPATH=${PWD}/target/myproject-1.0-SNAPSHOT.jar

Since there's no data, none of the jobs will do anything.  But you can run them.  To run the
producer, for example:

    kiji produce --producer=com.mygroup.produce.ExampleProducer \
    --input="format=kiji table=kiji://localhost:2181/default/users" \
    --output="format=kiji table=kiji://localhost:2181/default/users nsplits=1"

See the tutorials
http://docs.kiji.org/tutorials/music-recommendation/1.0.0/music-overview
for more details.
