package org.example;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        String pdfPath = "C:\\Users\\Kaan\\Desktop\\deneme.docx";

        try
                (XWPFDocument document = new XWPFDocument();
                 FileOutputStream fileOutputStream = new FileOutputStream(pdfPath)) {
            XWPFParagraph paragraph = document.createParagraph();

            XWPFRun run = paragraph.createRun();

            run.setText("Dosya oluştu.");
            run.setFontSize(14);
            run.setBold(true);
            run.setColor("0000FF");
/*Test Java klasörü*/

            /* Deneme*/



            document.write(fileOutputStream);

            // document.close();

            System.out.println("Belge oluştu" + pdfPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
