package DocumentManagement;

public interface DocumentBuilder {
    DocumentBuilder SetExtention(String extention);
    DocumentBuilder SetEncryption(String encryption);

    Document BuildDoc();
}
