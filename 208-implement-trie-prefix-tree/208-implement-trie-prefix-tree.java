class Node{
    Node[] link = new Node[26];
    boolean flag = false;
    public Node(){}
    
    public boolean contains(char ch){ 
        return (link[ch-'a'] != null);}
    
    public void put(char ch, Node t){
        link[ch-'a'] = t;
    }
}

class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        for(int i = 0 ; i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.contains(ch)) temp.put(ch, new Node());
            temp = temp.link[ch-'a'];
        }
        temp.flag = true;
    }
    
    public boolean search(String word) {
        Node temp  = root;
        for(int i = 0; i <word.length();i++)
        {
            char ch = word.charAt(i);
            if(!temp.contains(ch)) return false;
            else temp = temp.link[ch-'a'];
        }
        return temp.flag;
    }
    
    public boolean startsWith(String word) {
        Node temp  = root;
        for(int i = 0; i <word.length();i++)
        {
            char ch = word.charAt(i);
            if(!temp.contains(ch)) return false;
            else temp = temp.link[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */