class Solution {
   public int computeAreaJoin(int A, int B, int C, int D, int E, int F, int G, int H) {
    int hTop = Math.min(D, H);
    int hBot = Math.max(B, F);
    int wTop = Math.min(C, G);
    int wBot = Math.max(A, E);
    if (hTop < hBot || wTop < wBot) {
        return 0;
    } else {
        return (hTop - hBot) * (wTop - wBot);
    }
}

public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    return (C-A)*(D-B) + (G-E)*(H-F) - computeAreaJoin(A,B,C,D,E,F,G,H);
}
}