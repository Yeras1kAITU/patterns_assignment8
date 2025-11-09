public class TextExtractor implements DocumentVisitor {
    private String extractedText = "";

    @Override
    public void visit(WordDocument document) {
        extractedText += "[Word Content: Document text extracted from .docx format]\n";
    }

    @Override
    public void visit(PdfDocument document) {
        extractedText += "[PDF Content: Text extracted from PDF file]\n";
    }

    @Override
    public void visit(HtmlDocument document) {
        extractedText += "[HTML Content: Text content parsed from HTML tags]\n";
    }

    public String getExtractedText() {
        return extractedText;
    }
}