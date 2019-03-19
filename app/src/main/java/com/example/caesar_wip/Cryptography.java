package com.example.caesar_wip;

public class Cryptography {

    private char[] rawText;

    private final int key = 1;

    public Cryptography(String text)
    {
        rawText = new char[text.length()];
        for (int i = 0; i < text.length(); ++i)
        {
            rawText[i] = text.charAt(i);
        }
    }


    public String decrypt()
    {
        char[] decryptedText = new char[rawText.length];

        for (int i = 0; i < rawText.length; ++i)
        {
            decryptedText[i] = (char) ((int) rawText[i] - key);
        }

        return decryptedText.toString();
    }


    public String encrypt()
    {
        char[] encryptedText = new char[rawText.length];

        for (int i = 0; i < rawText.length; ++i)
        {
            encryptedText[i] = (char) ((int) rawText[i] + key);
        }

        return encryptedText.toString();
    }

}
