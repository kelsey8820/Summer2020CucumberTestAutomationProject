package day26_Multi_DimensionsalArray;
import java.util.Arrays;
public class MultiDArray_Practice {
    public static void main(String[] args) {
        /*
        tester: {"Liliia", "Odina", "Cristina", "Elkem"}
        Developers: {"Ahmet", "Erfan", "Roza", "Sarah"}
        Scrum Master {"Nurmamet"}
        Product Owner {"Nadir"}
        Business Analyst {"Alex"}

        scrumTeam: testers, devleopor, SM, PO, BA
         */

        String []  testers = {"Liliia", "Odina", "Cristina", "Elkem"};
        String [] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String [] SM =  {"Nurmamet"};
        String [] PO = {"Nadir"};
        String [] BA = {"Alex"};

        String [][]scrumTeam = {testers, developers, SM, PO, BA};
        //                         0         1        2   3   4
        String [] testers2 = {"Irene", "Aslan", "Nazar"};

        //Replace Alex with Adam
        scrumTeam[4][0] = "Adam";

        // Replace Roza with Emine
        scrumTeam[1] [2] = "Emine";

        // Replace the entire testers team
        scrumTeam[0]=testers2;

        System.out.println(Arrays.deepToString(scrumTeam));




    }
}
