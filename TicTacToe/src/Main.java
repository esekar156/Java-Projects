import java.util.Scanner;
public class Main {

    public static void DisplayBoard(String[] arr){

        System.out.println(arr[7] + " | " + arr[8] + " | " + arr[9]);
        System.out.println("----------");
        System.out.println(arr[4] + " | " + arr[5] + " | " + arr[6]);
        System.out.println("----------");
        System.out.println(arr[1] + " | " + arr[2] + " | " + arr[3]);

    }

    public static boolean CheckWin(String[] arr){
        if ((arr[7] == arr[8] && arr[8]==arr[9]) || (arr[4] == arr[5] && arr[4]== arr[6]) || (arr[1] == arr[2] && arr[1]== arr[3]) || (arr[7] == arr[4] && arr[7]== arr[1]) || (arr[8] == arr[5] && arr[8]== arr[2]) || (arr[9] == arr[6] && arr[9]== arr[3]) || (arr[7] ==arr[5]&& arr[7]==arr[3]) || (arr[9]==arr[5]&&arr[9]==arr[1])){

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{" "," "," "," "," "," "," "," "," "," "};
        DisplayBoard(arr);

        for(int i = 0; i<9; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter input");
            int input = scanner.nextInt();
            if(i % 2 == 0){
                arr[input] = "X";
            }
            else{
                arr[input] = "O";
            }
            DisplayBoard(arr);
            CheckWin(arr);
        }
    }
}
