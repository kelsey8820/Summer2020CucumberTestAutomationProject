package day20_While_Loops;

public class BranchingSatements {
    public static void main(String[] args) {

        char ch = 'A';
        while(ch<='E'){
            if(ch == 'C'){
                ch++;
                continue; // skips evertything even the iterator
            }
            System.out.println(ch);

            ch++;
        }

    }
}
