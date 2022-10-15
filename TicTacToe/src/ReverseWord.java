public class ReverseWord {

    static void reverse(char[] str, int start, int end){
        end = end-1;
        while(start<end){
            char temp = "";
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }


    }
    static void reverseWords(char str[]){
        int start = 0;
        int end = 0;
        for(int i = 0; i < str.length(); i++){
            if(str[i]==" "){
                reverse(str, start,end);
                start = end+1; //end++
            }
            else{
                end++;
            }
        }
        reverse(str,start,end);
        reverse(str,0,str.length());

    }

    public static void main(String[] args) {
        String word = "hello my name is esha";
        char[] sentence = word.toCharArray();
        for(int i = 0; i < sentence.length; i++){
            System.out.println(sentence[i]);
        }
    }
}