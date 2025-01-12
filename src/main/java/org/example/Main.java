package org.example;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.pdfa.PdfADocument;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String pdfParth = "C:\\Users\\Kaan\\Desktop\\deneme.pdf";

        try {
            PdfWriter writer = new PdfWriter(pdfParth);
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);

            document.add(new Paragraph("Deneme "));

            document.close();

            System.out.println("Başarılı "+ pdfParth);

        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
