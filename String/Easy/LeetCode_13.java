class LeetCode_13 {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i =0;i<s.length();i++){
            int cv = val(s.charAt(i));
            if(i<s.length()-1 && cv<val(s.charAt(i+1))){
                sum = sum - cv;
            }else{
                sum = sum+cv;
            }
        }
        return sum;

    }

    public int val(char c){
        if(c=='I') return 1;
        else if (c=='V') return 5;
        else if (c=='X') return 10;
        else if (c=='L') return 50;
        else if (c=='C') return 100;
        else if (c=='D') return 500;
        return 1000;
    }
}