import java.util.HashSet;
import java.util.List;

/* This is a JAVA class that reads in a file stream of tuples into a Hashset */

public class ClickStreamReader {
    private HashSet<String> records = new HashSet<String>();

    /* load records from input stream */
    public void reader(List<String> record, int length) {

        for (int i = 0; i < length; i++) {
            records.add(record.get(i));
        }
    }

    /* print all records */
    public void printRecords() {
        System.out.println(this.records);

    }

    /* search for a record */
    public void findRecords(String search) {

        System.out.println(records.contains(search));
    }

    /* delete a single record */
    public void deleteRecords(String record)
    {
        records.remove(record);

    }

    /* delete all records */
    public void emptyRecords()
    {
        records.clear();
    }

    public void main(String[] args) {


    }




}
