
package model;

public class Content {
    private String data;
    private int letterCount;

    public Content() {
        this.data = "";
        this.letterCount = 0;
    }

    public Content(String data) {
        this.data = data;
        this.letterCount = 0;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }
    
}
