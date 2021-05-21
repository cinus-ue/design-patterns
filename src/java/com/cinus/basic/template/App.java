package com.cinus.basic.template;

public class App {

    public static void main(String[] args) {
        TextMsgHandler textMsgHandler = new TextMsgHandler();
        String response = textMsgHandler.processer("From: Alice<Alice@TTP.com>\n" +
                "To: Bob<Bob@TMC.com>\n" +
                "Content: ...  \n");
        System.out.println(response);
    }

}
