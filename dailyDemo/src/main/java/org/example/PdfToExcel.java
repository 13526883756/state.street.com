package org.example;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;

public class PdfToExcel {
    public static void main(String[] args) {
        //创建PdfDocument实例
        PdfDocument pdf = new PdfDocument();

        //加载PDF文档
        pdf.loadFromFile("C:\\Users\\Administrator.DESKTOP-EPAI329\\Desktop\\wq-临时文件\\直聘简历-王晴.pdf");

        //保存为Excel
        pdf.saveToFile("D://ideaProjects//state.street.com//output//PDFToXLS.xlsx", FileFormat.XLSX);
        System.out.println("转换成功，--->请到： D://ideaProjects//state.street.com//output//下查看");
    }
}

