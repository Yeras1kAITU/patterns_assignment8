public interface DocumentVisitor {
    void visit(WordDocument document);
    void visit(PdfDocument document);
    void visit(HtmlDocument document);
}