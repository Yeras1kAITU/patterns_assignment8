public class TextExtractor implements DocumentVisitor {
    private String extractedText = "";
    private final String WordText = "[Word Content: Document text extracted from .docx format]\n";
    private final String PdfText = "[PDF Content: Text extracted from PDF file]\n";
    private final String HtmlText = "[HTML Content: Text content parsed from HTML tags]\n";

    @Override
    public void visit(WordDocument document) {
        extractedText += WordText;
    }

    @Override
    public void visit(PdfDocument document) {
        extractedText += PdfText;
    }

    @Override
    public void visit(HtmlDocument document) {
        extractedText += HtmlText;
    }

    public String getExtractedText() {
        return extractedText;
    }
}