class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);

        long x = mass;

        for(int i = 0; i < asteroids.length; i++) {

            if(x >= asteroids[i]) x += asteroids[i];
            else return false;

        }

        return true;
        
    }
}