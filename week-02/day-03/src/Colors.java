/**
 * Created by Levente on 2017. 03. 22..
 */
public class Colors {
    public static void main(String[] args) {
        String[][] colors = {{"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"},
        };
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
