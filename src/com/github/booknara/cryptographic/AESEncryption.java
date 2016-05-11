package com.github.booknara.cryptographic;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/9/16.
 */
public class AESEncryption {
    public static void main(String[] args) throws Exception {
        // AES(block-based encryption) key should be 128 bits (16 * 8)
        byte[] key = "1234567890123456".getBytes("UTF-8");

        System.out.println(key);
        String text = "Hello World";
        System.out.println(text);

        String cipherText = AESUtil.encrypt(key, text.getBytes("UTF-8"));
        System.out.println(cipherText);

        String decryptedText = AESUtil.decrypt(key, cipherText.getBytes());
        System.out.println(decryptedText);
    }
}
