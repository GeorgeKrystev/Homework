import java.io.FileOutputStream;
import java.io.IOException;

 
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class _9PdfCardDeck {
	public static void main(String[] args) 
			throws DocumentException, IOException {
		 
        Document cardDeck = new Document();
        FileOutputStream fileName = new FileOutputStream("DeckOfCards.pdf");
        PdfWriter.getInstance(cardDeck, fileName);
 
        String cards[] = new String[] {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
        };
 
        String kinds[] = new String[] {
           "\u2663", "\u2666" , "\u2665", "\u2660"
            
            
        };
 
        BaseFont baseFont = BaseFont.createFont("DejaVuSansCondensed.ttf", BaseFont.IDENTITY_H, true);
        Font blackFont = new Font(baseFont, 23f, 0, BaseColor.BLACK);
        Font redFont = new Font(baseFont, 23f, 0, BaseColor.RED);
 
        cardDeck.open();
 
        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(111f);
 
        for (int i = 0; i < kind.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                PdfPCell cell = new PdfPCell();
                cell.setPadding(8f);
                cell.setPaddingLeft(1f);
                cell.setPaddingRight(1f);
                cell.setBorder(Rectangle.NO_BORDER);
 
                PdfPTable singleCellTable = new PdfPTable(1);
                PdfPCell singleCell;
                 
					
				
                if (i == 0 || i == 3) {
                	if (j == 7 || j == 10) {
                		singleCell = new PdfPCell(new Paragraph((  cards[j]+ " " + "\n" + kinds[i]), blackFont  ));
					} else {
						singleCell = new PdfPCell(new Paragraph((  cards[j]+ " " +kinds[i]), blackFont  ));
					}
 
                } else {
                	if (j == 7 || j == 10) {
                		singleCell = new PdfPCell(new Paragraph((  cards[j]+ " " + "\n" + kinds[i]), redFont  ));
					} else {
						singleCell = new PdfPCell(new Paragraph((  cards[j]+ " " +kinds[i]), redFont  ));
					}
                }
                singleCell.setFixedHeight(90f);
                singleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                singleCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                singleCellTable.addCell(singleCell);
                cell.addElement(singleCellTable);
 
                table.addCell(cell);
				}
            }
        
 
        for (int i = 0; i < 4; i++) {
            PdfPCell emptyCell = new PdfPCell();
            emptyCell.setBorder(Rectangle.NO_BORDER);
            table.addCell(emptyCell);
        }
 
        cardDeck.add(table);
        cardDeck.close();
        fileName.close();
	}

}

