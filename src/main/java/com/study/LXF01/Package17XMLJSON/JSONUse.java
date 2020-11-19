package com.study.LXF01.Package17XMLJSON;

import java.io.InputStream;

/**
 * JSON是 Javascript Object Notation的缩写
 * 去除了所有 JavaScript执行代码，只保留 javascript的对象格式
 *
 * 优点：
 *  JSON只允许使用 UTF-8编码，不存在编码问题
 *  JSON只允许使用双引号作为 key，特殊字符用 \转义，格式简单
 *  浏览器内置 JSON支持，如果把数据用 JSON发送给浏览器，可以用 javascript直接处理
 *
 * 支持的数据格式：
 *  键值对：{"key": value}
 *  数组：[1, 2, 3]
 *  字符串："abc"
 *  数值（整数和浮点数）：12.34
 *  布尔值：true或 false
 *  空值：null
 */

public class JSONUse {
    public static void main(String[] args) {
        InputStream input = JSONUse.class.getResourceAsStream("/book.json");
        ObjectMapper mapper = new ObjectMapper();
        // 反序列化时忽略不存在的 JavaBean属性
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKOWN_PROPERRTIES, false);
//        Book book = mapper.readValue(input, Book.class);
    }
}

class ObjectMapper {
    void configure() {

    }
}

/**
 * 小结
 * JSON是轻量级的数据表示方式，常用于 web应用
 * jackson可以使用 JavaBean和 JSON之间的转换
 * 可以通过 Module拓展 Jackson能处理的数据类型
 * 可以自定义 JsonSerializer和 JsonDeserializer来定制序列化和反序列化
 */
