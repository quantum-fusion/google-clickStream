import java.util.List;
import java.util.ArrayList;

// Interview 10/29/2021

//        The problem might be underspecified. Please feel free to ask questions.

//        In the programming language of your choice,
//        implement an API that takes the filename of a
//        comma-separated value (CSV) file and provides
//        convenient access to its values.
//        Here’s an example of a CSV file, is ASCII text.
// load a file that is myfile.txt from file system

// location,employee,favorite fruit // Assumption is: dynamic keys , dynamic length
// Austin,Alice,Apple // values1 -> A choice: whether or not that we convert into an array that deletes ,
// Boston,Bob,Bosc Pear // values2

// Initial requirements discussed:
// Assumption is that we have a website that generates tuples like Google Double click, not an input file stream like above.
// Design considerations were to consider an infinite length tuple stream like from Google Click Stream
// See specification here: https://mixedanalytics.com/blog/quickstart-google-analytics-clickstream-data/

// Design consideration options:
// Persistent storage and query interface design considerations for later:
// This could be stored downstream into Google Big Table , after loading into a HashSet for quickly accessing records.
// This could be stored downstream into an S3 bucket using AWS glue with Presto or Athena for fast query
// This could be stored downstream into a Cassandra table and queried with 2ndary indexes
// This could be loaded into memory using Redis and then persisted to MongoDB/Atlas.
// This could be loaded into Snowflake for fast query
// This could be loaded into a Databrick and queried with Spark dataframes.

//Design choices:
// Path selected was (dynamic key size and dynamic length), however testcase assumed a length, this can be changed.
// Path selected is storage in Google Big Table and Google Big Query -> cheap and fast

public class TestLogic {

    public static void testReader()
    {
      List<String> fileStream = new ArrayList<String>();

      fileStream.add("Austin,Alice,Apple");
      fileStream.add("Boston,Bob,Bosc");
      fileStream.add("RedSox");
      fileStream.add("1,2");

      ClickStreamReader c = new ClickStreamReader();
      c.reader(fileStream,fileStream.size());
      c.printRecords();

      c.findRecords("RedSox");

    }

    public static void main(String[] args) {
      testReader();



    }

}
