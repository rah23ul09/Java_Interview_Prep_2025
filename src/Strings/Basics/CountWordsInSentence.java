package Strings.Basics;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String str = "Hey Rahul, How are you buddy?";
        int count = 0;
        boolean isWord = false;

        for (int i = 0; i <= str.length()-1; i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            }
            else isWord = false;
        }
        System.out.println("Word count is : "+count);
    }
}
