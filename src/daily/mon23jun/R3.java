package daily.mon23jun;

import java.util.HashSet;
//aadhi skills team 
public class R3 {
    public static void main(String[] args) {
        char skills[][] = { { 'a', 'b' }, { 'c' ,'d'}, { 'b', 'c' }, { 'd' } };
        char needed[] = { 'a', 'b', 'c' ,'d'};
        char foundIndex = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < skills.length; i++) {
            for (int j = 0; j < skills[i].length; j++) {
                if (foundIndex > needed.length - 1)
                    break;
                if (needed[foundIndex] == skills[i][j]) {
                    System.out.print(skills[i][j] + " " + "indexed: \'" + i + "\'");
                    foundIndex += 1;
                    set.add(i);
                }
            }
            System.out.println();
        }
        System.out.println(set);
    }
}
