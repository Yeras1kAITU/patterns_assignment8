package documents;

import visitors.DocumentVisitor;

public class WordDocument implements Document {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}