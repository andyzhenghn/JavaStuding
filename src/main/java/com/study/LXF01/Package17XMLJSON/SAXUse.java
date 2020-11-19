package com.study.LXF01.Package17XMLJSON;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * DOM解析 XML的优点是省事，缺点是内存占用太大
 * SAX是一种基于流的解析方式，边读取 XML边解析，并以事件回调的方式让调用者获取数据
 * SAX解析会触发一系列事件
 *  startDocument: 开始读取 XML文档
 *  startElement:  读取到了一个元素，例如 <book>
 *  characters:    读取到了字符
 *  endElement:    读取到了一个结束的元素，例如 </book>
 *  endDocument:   读取 XML文档结束
 */

public class SAXUse {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        InputStream input = SAXUse.class.getResourceAsStream("/book.xml");
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(input, new MyHandler());
    }
}

class MyHandler extends DefaultHandler {
    public void startDocument() throws SAXException {
        print("start document");
    }

    public void endDocument()  throws SAXException {
        print("end document");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        print("start element:", localName, qName);
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        print("end element:", localName, qName);
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        print("characters:", new String(ch, start, length));
    }

    public void error(SAXException e) throws SAXException {
        print ("error: ", e);
    }

    void print(Object... objs) {
        for(Object obj : objs) {
            System.out.println(obj);
            System.out.println(" ");
        }
    }
}


/**
 * 小结
 * SAX是一种流式解析 XML的 API
 * SAX通过事件触发，读取速度快，消耗内存小
 * 调用方必须通过回调方法获得解析过程中的数据
 */