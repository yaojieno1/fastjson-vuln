import com.alibaba.fastjson.JSON;

public class ExactlyVersion
{
	//异常回显 fastjson 精确版本号
	private static String poc = "" +
		"{\n" +
		"  \"@type\": \"java.lang.AutoCloseable\"";

	public static void main( String[] args ) {
		JSON.parseObject(poc);
	}
}
