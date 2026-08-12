class LeetCode_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int c =0;
        for(String str:patterns){
            //if(word.contains(str)) c++;
            if(word.indexOf(str)>=0) c++;
        }
        return c;
    }
}