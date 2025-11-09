public class VisitorDemo {
    public static void main(String[] args) {
        Document wordDoc = new WordDocument();
        Document pdfDoc = new PdfDocument();
        Document htmlDoc = new HtmlDocument();

        TextExtractor textExtractor = new TextExtractor();

        wordDoc.accept(textExtractor);
        pdfDoc.accept(textExtractor);
        htmlDoc.accept(textExtractor);

        System.out.println("Extracted Text from all documents:");
        System.out.println(textExtractor.getExtractedText());
    }
}