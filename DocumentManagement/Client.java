package DocumentManagement;

public class Client {
    public static void main(String[] args) {
        Document normalDocument = new NormalDoc().SetExtention(".txt").BuildDoc();
        Document confidentailDocument = new ConfidentialDoc().SetExtention(".zip").SetEncryption("AES").BuildDoc();

        System.out.println("Normal document: " + normalDocument);
        System.out.println("Confidentail Document: " + confidentailDocument);
    }
}
