package com.study.LXF01.Package09IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * ZipInputStream是一种 FilterInputStream
 * JarInputStream是从 ZipInputStream派生，增加的主要功能是直接读取 jar文件里面的 MANIFEST.MF文件
 */

public class ZipInputStreamUse {
    public void readFile() throws IOException {
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream("src/sss"))) {
            ZipEntry entry = null;
            while ((entry = zip.getNextEntry()) != null) {
                String name = entry.getName();
                if (!entry.isDirectory()) {
                    int n;
                    while ((n = zip.read()) != -1) {
                        System.out.println(n);
                    }
                }
            }
        }
    }

    public void writeFile() throws IOException {
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("src/sss"))) {
            File[] files = new File[0];
            for (File file : files) {
                zip.putNextEntry(new ZipEntry(file.getName()));
                zip.write(getFileDataAsBytes(file));
                zip.closeEntry();
            }
        }
    }

    private int getFileDataAsBytes(File file) {
        return 0;
    }
}

/**
 * 小结
 * ZipInputStream可以读取 zip格式的流，ZipOutputStream可以把多份数据写入 zip包
 * 配合 FileInputStream和 FileOutputStream就可以读写 zip文件
 */