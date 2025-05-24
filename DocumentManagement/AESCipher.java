package DocumentManagement;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.util.Base64;
import java.security.SecureRandom;

public class AESCipher {

    private static final String AES_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private SecretKey secretKey;
    private IvParameterSpec ivParameterSpec;

    public AESCipher() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        this.secretKey = keyGenerator.generateKey();
        byte[] iv = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(iv);
        this.ivParameterSpec = new IvParameterSpec(iv);
    }

     public String encrypt(String plainText) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }


    public String decrypt(String encryptedText) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
    
    public static void main(String[] args) {
        try {
            AESCipher aesCipher = new AESCipher();
            Document confitdentialDocument = new ConfidentialDoc().SetExtention(".zip").SetEncryption("ASEC").BuildDoc();

            String confidentialDocText = confitdentialDocument.toString();
            String encryptedText = aesCipher.encrypt(confidentialDocText);
            String decryptedText = aesCipher.decrypt(encryptedText);

            System.out.println("Plain Document: " + confidentialDocText);
            System.out.println("Encrypted Document: " + encryptedText);
            System.out.println("Decrypted Document: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}