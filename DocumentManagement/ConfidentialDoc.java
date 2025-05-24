package DocumentManagement;

public class ConfidentialDoc implements DocumentBuilder {
    private String extention;
    private String encryption;

    @Override
    public DocumentBuilder SetEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    @Override
    public DocumentBuilder SetExtention(String extention) {
        if (extention == ".zip") {
            this.extention = extention;
        }else {
            this.extention = "Error";
        }

        return this;
    }

    @Override
    public Document BuildDoc() {
        return new Document(extention, encryption);
    }
}
