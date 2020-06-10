package warmUp.saturday6june;

public class CavityMap2 {


    static String[] cavityMap(String[] grid) {
        String[] answer = new String[grid.length];
        StringBuilder sb;
        for (int y = 0; y < grid.length; y++) {
            sb = new StringBuilder();
            for (int x = 0; x < grid[0].length(); x++) {
                char ch = isCavityAt(x, y, grid)
                        ? 'X' :
                            grid[y].charAt(x);
                sb.append(ch);
            }
            answer[y] = sb.toString();
        }
        return answer;
    }

    private static boolean isCavityAt(int x, int y, String[] grid) {
        return x > 0
                && y > 0
                && x < grid[0].length() - 1
                && y < grid.length - 1
                && at(x, y, grid) > at(x - 1, y, grid)
                && at(x, y, grid) > at(x + 1, y, grid)
                && at(x, y, grid) > at(x, y + 1, grid)
                && at(x, y, grid) > at(x, y - 1, grid);
    }

    private static int at(int x, int y, String[] grid) {
        return grid[y].charAt(x);
    }

}
