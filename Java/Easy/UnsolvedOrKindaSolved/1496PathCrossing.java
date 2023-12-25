package UnsolvedOrKindaSolved;
import java.util.ArrayList;
import java.util.List;

class Solution {
    // Didnt Pass all test cases
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        List<int[]> poses = new ArrayList<>();
        for(char c : path.toCharArray()){
            if(c == 'N') y++;
            else if(c == 'S') y--;
            else if(c == 'E') x++;
            else if(c == 'W') x--;
            int[] pos = {x, y};
            if(poses.contains(pos)) return true;
            poses.add(pos);
        }

        return false;
    }
}