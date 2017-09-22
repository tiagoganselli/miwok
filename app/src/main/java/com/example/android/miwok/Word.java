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
    private int mDrawableId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String nativeWord, String foreignWord) {
        mNativeWord = nativeWord;
        mForeignWord = foreignWord;
        mDrawableId = NO_IMAGE_PROVIDED;
    }

    public Word(String nativeWord, String foreignWord, int imageResourceId) {
        mNativeWord = nativeWord;
        mForeignWord = foreignWord;
        mDrawableId = imageResourceId;
    }

    public String getNativeWord() {
        return mNativeWord;
    }

    public String getForeignWord() {
        return mForeignWord;
    }

    public int getImageResourceId() {
        return mDrawableId;
    }

    public boolean hasImage() { return mDrawableId == NO_IMAGE_PROVIDED?false:true; }
}
