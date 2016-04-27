package com.github.booknara.cryptographic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class CryptographicHashFunction {

    public static void main(String[] args) {
        String input = new String("input_string");

        MessageDigest digest;
        try {
            // MD5
            digest = MessageDigest.getInstance("MD5");
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            // SHA-1
            digest = MessageDigest.getInstance("SHA-1");
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            // SHA-256
            digest = MessageDigest.getInstance("SHA-256");
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            // SHA-384
            digest = MessageDigest.getInstance("SHA-384");
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            // SHA-512
            digest = MessageDigest.getInstance("SHA-512");
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));
            System.out.printf(digest.getAlgorithm() + " (%s) = %s \n", input, bytesTooHex(getHashValue(digest, input.getBytes())));


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    public static byte[] getHashValue(MessageDigest digest, byte[] bytes) {
        digest.update(bytes, 0, bytes.length);
        return digest.digest();
    }

    public static String bytesTooHex(byte[] hashValue) {
        System.out.println("Length of byte : " +hashValue.length);
        Formatter formatter = new Formatter();
        for (int i = 0; i < hashValue.length; i++) {
            formatter.format("%02x", hashValue[i]);
        }

        return formatter.toString();
    }
}
