package com.github.booknara.cryptographic;

import java.security.SecureRandom;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/9/16.
 */
public class AESEncryption {
    public static void main(String[] args) throws Exception {
        // AES(block-based encryption) key should be 128 bits (16 * 8)
        byte[] key = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(key);

        System.out.println(key);
        String text = "Hello World";

        byte[] cipherBytes = AESUtil.encrypt(key, text.getBytes("UTF-8"));
        byte[] decryptedBytes = AESUtil.decrypt(key, cipherBytes);

        System.out.println(text);
        System.out.println(cipherBytes);
        System.out.println(decryptedBytes);
        System.out.println(new String(decryptedBytes, "UTF-8"));

    }
}
