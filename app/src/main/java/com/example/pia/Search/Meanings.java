package com.example.pia.Search;

public class Meanings {
    private String pronunciation = null;
    private String attribute = null;
    private String listWordtrans = null;
    private String KeyWord = null;
    public  Meanings(){}
    public Meanings(String _pronunciation, String _attribute, String _listWordtrans, String _Key){
        this.pronunciation = _pronunciation;
        this.attribute = _attribute;
        this.listWordtrans = _listWordtrans;
        this.KeyWord = _Key;

    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getListWordtrans() {
        return listWordtrans;
    }

    public void setListWordtrans(String listWordtrans) {
        this.listWordtrans = listWordtrans;
    }

    public String getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(String keyWord) {
        KeyWord = keyWord;
    }
}
