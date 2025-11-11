package visitors;

import documents.HtmlDocument;
import documents.PdfDocument;
import documents.WordDocument;

public interface DocumentVisitor {
    void visit(WordDocument document);
    void visit(PdfDocument document);
    void visit(HtmlDocument document);
}