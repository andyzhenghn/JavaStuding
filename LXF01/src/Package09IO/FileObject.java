package Package09IO;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileObject {
    public static void main(String[] args) throws Exception {
        File f = new File(".");
        // 返回构造方法传入的路径
        System.out.println(f.getPath());
        // 返回绝对路径
        System.out.println(f.getAbsolutePath());
        // 返回的是规范路径
        System.out.println(f.getCanonicalPath());
        // 根据平台打印分隔符
        System.out.println(File.separator);

        // 判断文件是否为文件
        System.out.println(f.isFile());
        // 判断文件是否为目录
        System.out.println(f.isDirectory());
        // 判断是否可读
        System.out.println(f.canRead());
        // 判断是否可写
        System.out.println(f.canWrite());
        // 判断是否可执行
        System.out.println(f.canExecute());
        // 文件字节大小
        Long len = f.length();
        System.out.println(len);

        // 创建文件
        File f2 = new File(".");
        f2.createNewFile();
        // 删除文件
        f2.delete();

        // 创建临时文件
        File f3 = File.createTempFile("tmp-", ".txt");
        f3.deleteOnExit();
        System.out.println(f3.isFile());
        System.out.println(f3.getAbsolutePath());

        // 列出目录下的文件
        File f4 = new File(".");
        File[] fs1 = f.listFiles();
        File[] fs2 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
        // 创建当前 File对象表示的目录
        boolean mkdir = f4.mkdir();
        // 创建当前 File对象表示的目录，并在必要时将不存在的父目录也创建出来
        boolean mkdirs = f4.mkdirs();
        // 删除当前 File对象表示的目录，当前目录必须为空才能删除成功
        boolean delete = f4.delete();

        // java标准库还提供了一个 Path对象
        // 构造一个 Path对象
        Path path = Paths.get(".", "project", "study");
        // 转换为绝对路径
        path.toAbsolutePath();
        // 转换为规范路径
        path.normalize();
        // 转换为 File对象
        path.toFile();
        // 直接遍历 path
        for (Path p :  Paths.get("..").toAbsolutePath()) {
            System.out.println(" " + p);
        }
    }
}

/**
 * 小结：
 * java标准库的 java.io.File对象表示一个文件或目录
 * 创建 File对象本身不涉及 IO操作
 * 可以获取路径 / 绝对路径 / 规范路径：getPath() / getAbsolutePath() / getCanonicalPath()
 * 可以获取目录的文件和子目录：list() / listFiles()
 * 可以创建或删除文件和目录
 */