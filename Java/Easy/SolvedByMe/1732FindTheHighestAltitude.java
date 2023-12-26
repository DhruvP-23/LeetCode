package SolvedByMe;

class Solution {
    public int largestAltitude(int[] gain) {
        int lastAlt = 0, highestAlt = 0, currAlt = 0;
        for(int i = 0; i < gain.length; i++){
            currAlt = lastAlt + gain[i];
            lastAlt = currAlt;
            highestAlt = Math.max(currAlt, highestAlt);
        }
        return highestAlt;
    }
}