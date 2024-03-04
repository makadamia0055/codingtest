class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        final int  maxHealth = health;
        
        for(int i = 0; i<attacks.length; i++){
            health = attacked(bandage, maxHealth, health, attacks, i);
            if(health<=0){
                return -1;
            }
        }
        
        int answer = health;
        return answer;
    }
    public int attacked(int[] bandage,int maxHealth, int startHealth, int[][] attacks, int indexOfAtks){
        int prevAtkSec = 0;
        if(indexOfAtks > 0){
            prevAtkSec = attacks[indexOfAtks -1][0];
        }
        int[] currentAtk = attacks[indexOfAtks];
        int totalSec =  currentAtk[0] - prevAtkSec -1; // 6
        startHealth += (totalSec/bandage[0]) * bandage[2] + totalSec * bandage[1];
        startHealth = maxHealth <startHealth? maxHealth: startHealth;
        
        startHealth -= currentAtk[1];
        return startHealth;
    }
    
}