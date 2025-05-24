package DocumentManagement;

public class Document {
    private String extention;
    private String encryption;

    public Document(String extention, String encryption){
        this.extention = extention;
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Document: [extention : " + extention + ", encryption: "+ encryption +"]";
    }
}
