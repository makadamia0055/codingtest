class Solution {
    public int solution(int a, int b, int c) {
        int cnt=0;
        if(a==b&&b==c){
            cnt = (int)(Math.pow(a, 6))*27;
        }else if(a!=b&&b!=c&&c!=a){
            cnt = a+b+c;
        }else{
            cnt = (a+b+c)*(a*a+b*b+c*c);
        }
        int answer = cnt;
        return answer;
    }
}