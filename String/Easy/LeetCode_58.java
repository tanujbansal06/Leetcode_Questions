class LeetCode_58 {
    public int lengthOfLastWord(String s) {
        int c =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(c>0) return c;
            }else{
                c++;
            }
        }
        return c;

    }
}