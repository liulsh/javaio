import java.io.File;
/**
 * file仅涉及到如何创建、删除、重命名等，只要涉及到文件内容的，file无能为力，必须由io流完成
 * 
 */
public class file1 {
	public static void main(String[] args) {
		//绝对路径:包括盘符在内的完整的文件路径
		File f1=new File("F:\\io\\test.txt");//要转义		或"F:/io/test.txt"
		System.out.println(f1.getAbsolutePath());		
		
		//相对路径：在当前目录下的文件的路径，与jre system library同级
		File f3=new File("hello.txt");
		System.out.println(f3.getAbsoluteFile());
	}
}
