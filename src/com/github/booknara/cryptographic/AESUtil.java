package com.github.booknara.cryptographic;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/9/16.
 */
public class AESUtil {
    private static final String ENCRYPT_ALGORITHM = "AES";

    public static byte[] encrypt(byte[] encryptionKey, byte[] plainBytes) throws Exception {
        Cipher cipher = getCipher(encryptionKey, Cipher.ENCRYPT_MODE);

        return cipher.doFinal(plainBytes);
    }

    public static byte[] decrypt(byte[] encryptionKey, byte[] encryptedBytes) throws Exception {
        Cipher cipher = getCipher(encryptionKey, Cipher.DECRYPT_MODE);

        return cipher.doFinal(encryptedBytes);
    }

    private static Cipher getCipher(byte[] encryptionKey, int cipherMode) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(encryptionKey, ENCRYPT_ALGORITHM);
        Cipher cipher = Cipher.getInstance(ENCRYPT_ALGORITHM);
        cipher.init(cipherMode, secretKeySpec);

        return cipher;
    }
}
