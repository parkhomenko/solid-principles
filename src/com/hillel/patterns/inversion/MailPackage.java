package com.hillel.patterns.inversion;

public class MailPackage {

    private String title;
    private String content;

    public MailPackage(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "MailPackage{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
