import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.io.IOException;

/**
 * Created by dheeraj.khatri on 20/07/17.
 */
public class Run extends UDF {
    private static HTable hTable;

    public static void main(String[] args) throws IOException {
        Run hit = new Run();
        String result = hit.evaluate(args[0]);
        System.out.println(result);
    }

    public Run() throws IOException {
        System.setProperty("hadoop.home.dir", "/");

        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        conf.set("hbase.zookeeper.quorum", "10.33.14.133,10.33.18.132,10.33.5.184");
        conf.set("zookeeper.znode.parent", "/hbase-unsecure");
        hTable = new HTable(conf,"concat_ht_dk");
    }

    public String evaluate(String fsn) throws IOException {
        if (fsn.length() == 0 || fsn == null)
            return null;

        String sc = "";
        try {
            Get g = new Get(Bytes.toBytes(fsn));
            Result result = hTable.get(g);
            byte[] value = result.getValue(Bytes.toBytes("d"),Bytes.toBytes("sc"));
            return Bytes.toString(value);
        } catch (Exception e) {
            return null;
        }
    }
}
