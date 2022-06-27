class Solution {
    public int minPartitions(String n) {
        char[] ch = n.toCharArray();
        Arrays.sort(ch);
        return ch[n.length()-1]-'0';
    }
}