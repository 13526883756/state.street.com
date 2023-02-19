package org.example;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class PdfToWord {
    public static void main(String[] args) {
        //创建一个 PdfDocument 对象
        System.out.println("请耐心等待，初学者比较慢。后续会更新");
        PdfDocument doc = new PdfDocument();
        //加载 PDF 文件
        doc.loadFromFile("C:\\Users\\Administrator.DESKTOP-EPAI329\\Desktop\\wq-临时文件\\直聘简历-王晴.pdf");
        System.out.println("读取成功");
        //将 PDF 转换为流动形态的Word
        doc.getConvertOptions().setConvertToWordUsingFlow(true);
        System.out.println("----->将 PDF 转换为流动形态的Word successful");
        //将PDF转换为Doc格式文件并保存
        doc.saveToFile("D://ideaProjects//state.street.com//output//ToDoc.doc", FileFormat.DOC);
        System.out.println("---->将PDF转换为Doc格式文件并保存 successful");
        //将PDF转换为Docx格式文件并保存
        doc.saveToFile("D://ideaProjects//state.street.com//output//ToDocx.docx", FileFormat.DOCX);
        System.out.println("转换成功");
        doc.close();


    }
}
