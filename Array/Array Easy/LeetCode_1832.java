class LeetCode_1832 {
    public boolean checkIfPangram(String sentence) {
        // HashSet <Character> set = new HashSet<>();
        // for(int i =0;i<sentence.length();i++){
        //     set.add(sentence.charAt(i));
        // }
        // if(set.size()==26) return true;
        // return false;

        boolean ans = true;
        String full = "abcdefghijklmnopqrstuvwxyz";
        for(int i =0;i<26;i++){
            if(sentence.contains(full.substring(i,i+1)) == false){
                ans = false;
            }
        }
        return ans;
    }
}