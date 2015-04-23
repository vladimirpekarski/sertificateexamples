package string;

public class MatchRegionInString {
    public static void main(String[] args) {
        String chat = "Tarzan: Hi Jane, wanna ride an Elephant? \n Jane: No thanks! " +
                "I'm preparing to blala now!";
        String matchString = " Jane: No thanks!";
        int startIndex = chat.indexOf('\n');
        System.out.println("Jane's response starts at the index: " + startIndex);

        if (startIndex > -1) {
            boolean isMatch = chat.regionMatches(startIndex + 1, matchString, 0
                    , matchString.length());
            if (isMatch) {
                System.out.println("Jane's response matches with the string" +
                        matchString);
            }
        }
    }
}
