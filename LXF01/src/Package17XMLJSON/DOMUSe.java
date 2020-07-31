package Package17XMLJSON;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * XML是一种树形结构的文档，它有两种标准的解析 API：
 *  DOM：一次性读取 XML，并在内存中表示为树形结构
 *  SAX：以流的形式读取 XML，使用事件回调
 *
 * DOM(Document Object Model)
 * DOM模型把 XML结构作为一个树形结构处理，从根节点开始，每个节点都可以包含任意个子节点
 */

public class DOMUSe {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // DOM解析一个 XML文档
        InputStream input = DOMUSe.class.getResourceAsStream("/book.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(input);
    }

    void printNode(Node n, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.println(' ');
        }
        switch (n.getNodeType()) {
            case Node.DOCUMENT_NODE:
                System.out.println("Document: " + n.getNodeName());
                break;
            case Node.ELEMENT_NODE:
                System.out.println("Element: " + n.getNodeName());
                break;
            case Node.TEXT_NODE:
                System.out.println("Text: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            case Node.ATTRIBUTE_NODE:
                System.out.println("Attr: " + n.getNodeName() + " = " + n.getNodeValue());
                break;
            default:
                System.out.println("NodeType: " + n.getNodeType() + ", NodeName: " + n.getNodeName());
        }
        for (Node child = n.getFirstChild(); child !=  null; child = child.getNextSibling()) {
            printNode(child, indent + 1);
        }
    }
}

/**
 * 小结：
 * java提供的 DOM API可以将 XML解析为 DOM结构，以 Document对象表示
 * DOM可在内存中完整表示 XML数据结构
 * DOM解析速度慢，内存占用大
 */