package com.study.LXF01.Package09IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serialize {
    public void useSerializable() throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {
            // 写入 int
            output.writeInt(12345);
            // 写入 String
            output.writeUTF("Hello");
            // 写入 Object
            output.writeObject(Double.valueOf(123.456));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }

    public void useDeserialize() throws IOException {
        try (ObjectOutputStream input = new ObjectOutputStream(null)) {
            // int n = input.readInt();
            // String s = input.readUTF();
            // Double d = (Double) input.readObject();
        }
    }
}

/**
 * 小结
 * 可序列化的 Java对象必须实现 java.io.Serializable接口，类似 Serializable这样的空接口被称为"标记接口"（Marker Interface）
 * 反序列化时不调用构造方法，可设置 serialVersionUID作为版本号（非必需）
 * Java的序列化机制仅适用于 Java，如果需要与其他语言交换数据，必须使用通用的序列化方法，例如JSON
 */
