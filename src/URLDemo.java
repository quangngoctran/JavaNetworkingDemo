import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.javatpoint.com/java-tutorial");
//            URL url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Default Port Number: " + url.getDefaultPort());
            System.out.println("Query String: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("toString: " + url.toString());
            System.out.println("toURI: " + url.toURI());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}    