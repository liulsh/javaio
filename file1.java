import java.io.File;
/**
 * file���漰����δ�����ɾ�����������ȣ�ֻҪ�漰���ļ����ݵģ�file����Ϊ����������io�����
 * 
 */
public class file1 {
	public static void main(String[] args) {
		//����·��:�����̷����ڵ��������ļ�·��
		File f1=new File("F:\\io\\test.txt");//Ҫת��		��"F:/io/test.txt"
		System.out.println(f1.getAbsolutePath());		
		
		//���·�����ڵ�ǰĿ¼�µ��ļ���·������jre system libraryͬ��
		File f3=new File("hello.txt");
		System.out.println(f3.getAbsoluteFile());
	}
}
