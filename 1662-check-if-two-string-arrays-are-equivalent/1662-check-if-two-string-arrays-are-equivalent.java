class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        
        for(var v : word1) w1.append(v);
        for(var v : word2) w2.append(v);
        //System.out.println(w1 + " " + w2);
        // return w1 == w2;
        return new String(w1).equals(new String(w2));
    }
}