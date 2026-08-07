class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        
        double c[][]=new double[n][2];

        for(int i=0;i<n;i++){
            c[i][0]=position[i];
            c[i][1]=(double)(target-position[i])/speed[i];
        }
            Arrays.sort(c,(a,b)->Double.compare(a[0],b[0]));
        
            int fleet=0;
            double maxTime=0;

            // Traversing from the car closer to the target
            for(int i=n-1;i>=0;i--){
                if(c[i][1]>maxTime){
                    maxTime=c[i][1];
                    fleet++;
                }
            }
        
        return fleet;
    }
}
