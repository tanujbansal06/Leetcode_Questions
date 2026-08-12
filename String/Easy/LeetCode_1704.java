class LeetCode_1704 {
    public boolean halvesAreAlike(String s) {
        // s = s.toLowerCase();
        // int ca =0;
        // int cb = 0;
        // int n =s.length();
        // for(int i=0;i<n/2;i++){
        //     if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
        //         ca++;;
        //     }
        // }
        // for(int i=n/2;i<n;i++){
        //     if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
        //         cb++;;
        //     }
        // }
        // return ca==cb;

        // String s1=s.substring(0,s.length()/2);
        // String s2=s.substring(s.length()/2,s.length());
        // if(vowels(s1)==vowels(s2)){
        //     return true;
        // }
        // return false;
        int count = 0;
        int n = s.length();

        for(int i = 0; i < n/2; i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i + n/2))) count--;
        }

        return count == 0;
    }

    // public int vowels(String s){
    //     int count=0;
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

}