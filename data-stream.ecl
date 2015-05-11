IMPORT java;

rowrec := record
  string value;
end;

DATASET(rowrec) stream() := IMPORT(java, 'DataStream.stream:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Iterator;');

output(stream());
