class Solution {
    // Didnt Pass all test cases
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        List<pose> poses = new ArrayList<>();
        for(char c : path.toCharArray()){
            if(c == 'N') y++;
            else if(c == 'S') y--;
            else if(c == 'E') x++;
            else if(c == 'W') x--;
            pose pos = new pose(x, y);
            if(poses.contains(pos)) return true;
            poses.add(pos);
        }

        return false;
    }
}