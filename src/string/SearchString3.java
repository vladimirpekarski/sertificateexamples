package string;

public class SearchString3 {
    public static void main(String[] args) {
        String str = "I am student, I am preparing for blabla";
        int fromIndex = 0;
        while (str.indexOf("am", fromIndex) > -1) {
            fromIndex = str.indexOf("am", fromIndex);
            System.out.println("Substrin \"am\" occurs at index:" + fromIndex);
            fromIndex++;
        }
    }
}
