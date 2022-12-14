package it.develhope.regex1;

public class Start {

    public static void main(String[] args) {

        String c = "I Like to code near the Lake with my friend Luke";

        String x = c.replaceAll("[Ll][^u]ke", "BLA");

        System.out.println(x);

    }
}
