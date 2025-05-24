package DocumentManagement;

public class NormalDoc implements DocumentBuilder{
    private String extention;
    private String encryption = "No Encryption";

    @Override
    public DocumentBuilder SetEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    @Override
    public DocumentBuilder SetExtention(String extention) {
        this.extention = extention;
        return this;
    }

    @Override
    public Document BuildDoc() {
        return new Document(extention, encryption);
    }
}
