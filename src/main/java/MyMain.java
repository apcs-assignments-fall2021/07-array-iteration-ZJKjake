import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int length=arr.length;

        int[] arr2=new int[length];
        int x=0;
        for (int i=arr.length-1;i>=0;i--){
            arr2[x]=arr[i];
            if (x+1>arr.length){
                break;
            }
            x+=1;
        }
        return arr2;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j]=n;
                }
            }

        }
        return arr[arr.length-2];
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {

        String[] dictionary = {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this", "have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your", "can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up", "other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could", "people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "cat", "dog", "cats", "dogs"};
        for (String x : dictionary) {
            if (x == word) {
                return true;
            }
        }
        // REPLACE WITH YOUR CODE HERE
        return false;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(MyMain.reverse(new int[] {1,3,4,2,5})));
        System.out.println(MyMain.secondLargest(new int[] {122,123,124,125,126,1}));
        System.out.println(MyMain.spellCheck("Jake"));
        System.out.println(MyMain.spellCheck("I'm hungry"));
        System.out.println(MyMain.spellCheck("dogs"));
    }
}
