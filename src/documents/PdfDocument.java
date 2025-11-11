package documents;

import visitors.DocumentVisitor;

public class PdfDocument implements Document {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}