package string;

public class ParseString1 {
    public static void main(String[] args) {
        String quote = "Never lend books-nobody ever returns them!";
        String[] words = quote.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
