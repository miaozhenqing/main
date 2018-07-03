package com.example.chx.util.html2pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author: mzq
 * @date: 2018/4/26
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/htmltopdf")
public class HtmlToPdfController {
    String htmlPath="e:\\PDF\\area.html";
    String htmlPath2="e:\\PDF\\area2.html";
    String pdfPath="e:\\PDF\\newPdf.pdf";
    @RequestMapping("/pdf")
    public void topdf(){
        //第一步，创建一个 iTextSharp.text.Document对象的实例：
        Document document = new Document();
        //第二步，为该Document创建一个Writer实例：
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
            //第三步，打开当前Document
            document.open();
            //第四步，为当前Document添加内容；
//            document.add(new Paragraph("Hello World"));
            FileInputStream fileInputStream = new FileInputStream(htmlPath);
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream(htmlPath));
            //第五步，关闭Document
            document.close();
            System.out.println( "OK!" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
