package string;

public class ParseString {
    public static void main(String[] args) {
        String str = "c:\\work\\program\\parse";
        String [] dirList = str.split("\\\\");
        for (String word : dirList) {
            System.out.println(word);
        }
    }
}
