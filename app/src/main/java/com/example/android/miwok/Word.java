package com.example.android.miwok;

/**
 * Created by ganselli on 19/09/17.
 *
 * Contains Native and Foreign strings of a word.
 * Native is the language you speak.
 * Foreign is the language you are learning.
 */

public class Word {

    private String mNativeWord;
    private String mForeignWord;

    public Word(String nativeWord, String foreignWord) {
        mNativeWord = nativeWord;
        mForeignWord = foreignWord;
    }

    public String getNativeWord() {
        return mNativeWord;
    }

    public String getForeignWord() {
        return mForeignWord;
    }

}
