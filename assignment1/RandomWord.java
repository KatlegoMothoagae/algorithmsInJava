import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdIn;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String currentWord = null;
        while (!StdIn.isEmpty()){
            boolean changeWord = StdRandom.bernoulli((1.0)/i);
            String potentialNewWord = StdIn.readString();
            if(changeWord){
                currentWord = potentialNewWord;
            }else {
                continue;
            }
            i++;
        }
        StdOut.println(currentWord);
    }

}
