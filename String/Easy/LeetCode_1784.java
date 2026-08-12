class LeetCode_1784 {
    public boolean checkOnesSegment(String s) {
        return !(s.contains("01") && s.contains("10"));
    }
}