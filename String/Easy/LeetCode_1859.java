class LeetCode_1859 {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String w = arr[i];
            int p = w.charAt(w.length()-1)-'0';
            ans[p-1] = w.substring(0,w.length()-1);
        }
        return String.join(" ",ans);
    }
}