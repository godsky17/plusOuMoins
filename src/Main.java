import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String lessMsg = "Less please.";
    private static String moreMsg = "More please.";
    private static String success = "Congratulaion, you win";
    private static String gameOver = "Game Over !";
    private static byte repeat = 3;

    public static int generateTarget()
    {
        Random random = new Random();
        return random.nextInt(100) +1;
    }

    public static int getUserEnter()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a whole beetwen 1 and 100");
        return myObj.nextInt();
    }

    public static String verify(int target, int userEnter)
    {
        String msg = "";
        int verify = target - userEnter;

        if (verify > 0)
        {
            msg = moreMsg;
        }else if (verify < 0){
            msg = lessMsg;
        }else {
            msg = success;
        }

        return msg;

    }

    public static void main(String[] args) {
        int target = generateTarget();
        int i = 0;
        do {
            int userEnter = getUserEnter();
            if (i == 2){
                System.out.println(verify(target, userEnter) + "\n" + gameOver);
            }else {
                System.out.println(verify(target, userEnter));
            }
            i++;
        }while (i < repeat);
    }
}