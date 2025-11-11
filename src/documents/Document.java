package documents;

import visitors.DocumentVisitor;

public interface Document {
    void accept(DocumentVisitor visitor);
}