/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCA.Utility;

import SCA.POJO.Employees;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SlipGenerator {

    public static void generateSlip(Employees emp,String mon_yer)
    {
        // TODO code application logic here
        String filename = System.getProperty("user.dir")+"/src/SalarySlips/"+emp.getEmp_id()+"_"+emp.getName()+".pdf";
        Document d = new Document();

        try {

            // creating font style.
            Font normalFont = new Font();
            normalFont.setSize(9);

            Font headingFont = new Font();
            headingFont.setSize(10);
            headingFont.setStyle(Font.BOLD);

            Font colorHeadingFont = new Font();
            colorHeadingFont.setSize(15);
            colorHeadingFont.setStyle(Font.BOLD);
            colorHeadingFont.setColor(BaseColor.MAGENTA);

            PdfWriter.getInstance(d, new FileOutputStream(filename));

            d.open();

            // This IS THE MOST OUTER TABLE
            
            PdfPTable table = new PdfPTable(2);
            
            table.setWidthPercentage(100);

            float[] relsize = {0.1f, 0.9f};
            PdfPTable innerTable = new PdfPTable(relsize);
            innerTable.setWidthPercentage(100);
            // THIS IS FIRST ROW
            Image i = Image.getInstance(System.getProperty("user.dir")+"/src/resources/a2i.png");
            i.scalePercent(43, 35);

            // FRIST COLOUM
            PdfPCell cell = new PdfPCell(i);
            cell.setUseBorderPadding(false);
            cell.setPadding(5);

            cell.setBorder(0);
            innerTable.addCell(cell);

            // SECOND COLUMN
            Phrase headingPhrase = new Phrase();
            Chunk chunk;

            chunk = new Chunk("A2Infotech Pvt. Ltd. Bhopal\n", colorHeadingFont);
            headingPhrase.add(chunk);
            chunk = new Chunk("OFFICE : PB 5, C BLOCK, TOP FLOOR, MANSAROVAR \n", normalFont);
            headingPhrase.add(chunk);
            chunk = new Chunk("COMPLEX, SHIVAJI NAGAR, BHOPAL - 462016 \n\n", normalFont);
            headingPhrase.add(chunk);
            chunk = new Chunk("Payslip for the month of "+mon_yer, headingFont);
            headingPhrase.add(chunk);
            cell = new PdfPCell(headingPhrase);

            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            cell.setBorder(0);

            innerTable.addCell(cell);

            cell = new PdfPCell(innerTable);
            cell.setColspan(2);

            table.addCell(cell);

            // THIS IS THE SECOND ROW AND FIRST INNER TABLE WITH EMPLOYEE DETIAILS
            PdfPTable firstTable = new PdfPTable(2);

            // FIRST ROW AND FIRST COLOUM
            PdfPCell firstCell = new PdfPCell(new Phrase("Name", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // FIRST ROW AND SECOND COLOUM
            firstCell = new PdfPCell(new Phrase(emp.getName(), normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // SECOND ROW AND FIRST COLOUM
            firstCell = new PdfPCell(new Phrase("Joining Date", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // SECOND ROW AND SECOND COLOUM
            firstCell = new PdfPCell(new Phrase(emp.getJoining_date(), normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // THIRD ROW AND FIRST COLOUM
            firstCell = new PdfPCell(new Phrase("Employee No.", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // THIRD ROW AND SECOND COLOUM
            firstCell = new PdfPCell(new Phrase(emp.getEmp_id(), normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // FOURTH ROW AND FIRST COLOUM
            firstCell = new PdfPCell(new Phrase("Emp Effective Workdays", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // FOURTH ROW AND SECOND COLOUM
            firstCell = new PdfPCell(new Phrase("20", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // FIFTH ROW AND FIRST COLOUM
            firstCell = new PdfPCell(new Phrase("Location", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            // FIFTH ROW AND SECOND COLOUM
            firstCell = new PdfPCell(new Phrase("Bhopal", normalFont));
            firstCell.setBorder(0);
            firstTable.addCell(firstCell);

            table.addCell(firstTable);

            // THIS IS THE SECOND ROW AND SECOND INNER TABLE WITH BANKING DETIAILS
            PdfPTable secondTable = new PdfPTable(2);
            secondTable.setWidthPercentage(100);

            // FIRST ROW AND FIRST COLOUM
            PdfPCell secondCell = new PdfPCell(new Phrase("Bank:", normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND SECOND COLOUM
            secondCell = new PdfPCell(new Phrase(emp.getBank_name(), normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND FIRST COLOUM
            secondCell = new PdfPCell(new Phrase("Bank Account No:", normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND SECOND COLOUM
            secondCell = new PdfPCell(new Phrase(emp.getAccount_no(), normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND FIRST COLOUM
            secondCell = new PdfPCell(new Phrase("PAN Number", normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND SECOND COLOUM
            secondCell = new PdfPCell(new Phrase(emp.getPan_card(), normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND FIRST COLOUM
            secondCell = new PdfPCell(new Phrase("LOP", normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            // FIRST ROW AND SECOND COLOUM
            secondCell = new PdfPCell(new Phrase("10", normalFont));
            secondCell.setBorder(0);
            secondTable.addCell(secondCell);

            table.addCell(secondTable);

            // THIS IS THE THIRD ROW AND FIRST INNER TABLE WITH BANKING DETIAILS
            PdfPTable tt = new PdfPTable(new float[]{0.4f, 0.3f, 0.3f});

            PdfPCell tc = new PdfPCell(new Phrase("Earnings", headingFont));
            tc.setBorder(0);
            tt.addCell(tc);

            // SECOND COLUMN
            tc = new PdfPCell(new Phrase("Full", headingFont));
            tc.setBorder(0);
            tt.addCell(tc);

            // THIRD COLUMN
            tc = new PdfPCell(new Phrase("Actual", headingFont));
            tc.setBorder(0);
            tt.addCell(tc);

            table.addCell(tt);

            // THIS IS THE THIRD ROW AND FIRST INNER TABLE WITH BANKING DETIAILS
            PdfPTable ft = new PdfPTable(2);

            // FIRST COLUMN
            PdfPCell fc = new PdfPCell(new Phrase("Deductions", headingFont));
            fc.setBorder(0);
            ft.addCell(fc);

            // SECOND COLUMN
            fc = new PdfPCell(new Phrase("Actual", headingFont));
            fc.setBorder(0);
            ft.addCell(fc);

            table.addCell(ft);

            PdfPTable fourthTable = new PdfPTable(new float[]{0.4f, 0.3f, 0.3f});

            PdfPCell fourthCell = new PdfPCell(new Phrase("Basic", normalFont));
            fourthCell.setBorder(0);
            fourthTable.addCell(fourthCell);

            // SECOND COLUMN
            fourthCell = new PdfPCell(new Phrase(emp.getSalary()+"", normalFont));
            fourthCell.setBorder(0);
            fourthTable.addCell(fourthCell);

            // THIRD COLUMN
            fourthCell = new PdfPCell(new Phrase(emp.getSalary()+"", normalFont));
            fourthCell.setBorder(0);
            fourthTable.addCell(fourthCell);

            // SECOND COLUMN
            fourthCell = new PdfPCell(new Phrase("HRA", normalFont));
            fourthCell.setBorder(0);
            fourthTable.addCell(fourthCell);

            // THIRD COLUMN
            fourthCell = new PdfPCell(new Phrase("0.0", normalFont));
            fourthCell.setBorder(0);
            fourthTable.addCell(fourthCell);

            // SECOND COLUMN
            fourthCell = new PdfPCell(new Phrase("0.0", normalFont));
            fourthCell.setBorder(0);
            fourthTable.addCell(fourthCell);

            table.addCell(fourthTable);

            // THIS IS THE THIRD ROW AND FIRST INNER TABLE WITH BANKING DETIAILS
            PdfPTable fifthTable = new PdfPTable(2);

            // FIRST COLUMN
            PdfPCell fifthCell = new PdfPCell(new Phrase("PF", normalFont));
            fifthCell.setBorder(0);
            fifthTable.addCell(fifthCell);

            // SECOND COLUMN
            fifthCell = new PdfPCell(new Phrase("0.0", normalFont));
            fifthCell.setBorder(0);
            fifthTable.addCell(fifthCell);

            // FIRST COLUMN
            fifthCell = new PdfPCell(new Phrase("Medical Insurance", normalFont));
            fifthCell.setBorder(0);
            fifthTable.addCell(fifthCell);

            // SECOND COLUMN
            fifthCell = new PdfPCell(new Phrase("0.0", normalFont));
            fifthCell.setBorder(0);
            fifthTable.addCell(fifthCell);

            table.addCell(fifthTable);

            PdfPTable sixthTable = new PdfPTable(new float[]{0.4f, 0.3f, 0.3f});

            // FIRST COLUMN
            PdfPCell sixthCell = new PdfPCell(new Phrase("Total Earning: INR", normalFont));
            sixthCell.setBorder(0);
            sixthTable.addCell(sixthCell);

            // SECOND COLUMN
            sixthCell = new PdfPCell(new Phrase(emp.getSalary()+"", normalFont));
            sixthCell.setBorder(0);
            sixthTable.addCell(sixthCell);

            // FIRST COLUMN
            sixthCell = new PdfPCell(new Phrase(emp.getSalary()+"", normalFont));
            sixthCell.setBorder(0);
            sixthTable.addCell(sixthCell);

            table.addCell(sixthTable);

            PdfPTable seventhTable = new PdfPTable(new float[]{0.5f, 0.5f});

            // FIRST COLUMN
            PdfPCell seventhCell = new PdfPCell(new Phrase("Total Deduction: INR", normalFont));
            seventhCell.setBorder(0);
            seventhTable.addCell(seventhCell);

            // SECOND COLUMN
            seventhCell = new PdfPCell(new Phrase("0.0", normalFont));
            seventhCell.setBorder(0);
            seventhTable.addCell(seventhCell);

            table.addCell(seventhTable);

            PdfPCell myParagraph = new PdfPCell();
            Phrase salPhrase = new Phrase();
            chunk = new Chunk("Net Pay for the month ( Total Earning - Total Deduction ):     ", normalFont);
            salPhrase.add(chunk);
            chunk = new Chunk(" "+emp.getSalary()+"", headingFont);
            salPhrase.add(chunk);
            myParagraph.setPhrase(salPhrase);
            myParagraph.setColspan(2);
            myParagraph.setBorderWidthBottom(0);
            myParagraph.setPaddingTop(5);
            myParagraph.setPaddingBottom(10);
            table.addCell(myParagraph);

            myParagraph = new PdfPCell(new Phrase(NumberToWord.getName(emp.getSalary())+" Rupees only", normalFont));
            myParagraph.setColspan(2);
            myParagraph.setBorderWidthTop(0);
            myParagraph.setPaddingBottom(5);

            table.addCell(myParagraph);

            d.add(table);
            Font f = new Font();
            f.setSize(5);
            Paragraph space = new Paragraph(" ");
            space.setFont(f);
            d.add(space);
            Image signatureImage = Image.getInstance(System.getProperty("user.dir")+"/src/resources/signature.png");
            signatureImage.scalePercent(35, 30);
            d.add(signatureImage);

            d.add(space);
            Paragraph paragraph = new Paragraph("Sincerely,", normalFont);
            d.add(paragraph);

            d.add(space);
            paragraph = new Paragraph("Mr. SachinKapoor", headingFont);
            d.add(paragraph);

            d.add(space);
            paragraph = new Paragraph("Director", headingFont);
            d.add(paragraph);

            d.add(space);
            paragraph = new Paragraph("A2Infotech Pvt. Ltd.", normalFont);
            d.add(paragraph);

            d.close();

            System.out.println("program finished.");

        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(SlipGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SlipGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
