# Example of Java Streaming to HPCC

Assuming you have started HPCC server started (w/ thor) using:
```
   sudo service hpcc-init start
```

To run this example, simply copy the files in this repository into /opt/HPCCSystems/classes/.

Run the following:
```
   javac DataStream.java
   javac Row.java
```

Then you can kickoff the ECL with:
```
 ecl run data-stream.ecl --target hthor --server=localhost:8010
```

You should see the following output:
```
<Result>
<Dataset name='Result 1'>
 <Row><value>row</value></Row>
 <Row><value>row</value></Row>
 <Row><value>row</value></Row>
 <Row><value>row</value></Row>
</Dataset>
</Result>
```

For more information on why you might want this, see [this blog post.](:wq!).
   
