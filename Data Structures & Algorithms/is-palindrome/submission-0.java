class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        String r= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        sb.append(r);
        sb.reverse();
        return r.equals(sb.toString());

    }
}
