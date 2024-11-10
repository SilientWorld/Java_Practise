import java.io.File;

public class FileCreate {
    public static void main(String[] args) {
        String str = "D:\\Test\\test.txt";
        File file = new File(str);//创建文件
        System.out.println(file);
        System.out.println(file.isFile());//判断是否是该文件
        System.out.println(file.exists());//判断该文件是否存在
        boolean b = file.delete();//删除文件
        System.out.println(b);
        boolean a = file.mkdirs();//创建多级文件夹
        System.out.println(a);
    }
}
