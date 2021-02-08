/*import java.util.Scanner;

class MysteryStoryGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Riddle riddle = getRiddle(1);
        System.out.println(riddle.story);
        boolean hasCorrectAnswer = false;
        int tries = 0;

        while (!hasCorrectAnswer) {
            tries = tries + 1;
            System.out.println("Try question "+tries+":");
            String question = scanner.nextLine();
            question = question.toLowerCase();
            question = question.replace("is the story about a ", "");
            question = question.replace("?", "");

            String context = riddle.context.toLowerCase();      if (question.equals(context)) {
                System.out.println("Yes, you won the game!");
                hasCorrectAnswer = true;
            } else if (hasWord(context, question)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }

    private static boolean hasWord(String text, String word) {
        String[] words = text.split("\\s+");

        for (int i=0; i<words.length; i++) {
            if (words[i].equals(word)) {
                return true;
            }
        }    return false;
    }

    private static Riddle[] getRiddles() {
        Riddle[] riddles = {
                new Riddle(
                        "Someone switched the light switch and some minutes later, smoke came.",
                        "Birthday celebration"
                ),
                new Riddle(
                        "A thief came and later ran away.",
                        "Bank robbery"
                )
        };    return riddles;
    }
    private static Riddle getRiddle(int i) {
        Riddle[] riddles = getRiddles();
        Riddle riddle = riddles[i];
        return riddle;
    }}

class Riddle {  public String story;
    public String context;  public Riddle(String story, String context) {
        this.story = story;
        this.context = context;
    }}
*/