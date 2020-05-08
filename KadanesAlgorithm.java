class KadanesAlgorithm{
  public static int kadanesAlgorithm(int[] array) {
   // Write your code here.
   int maxSum =  array[0];
   int previousMax = array[0];
   for ( int i = 1 ; i < array.length ; i++ ){
     previousMax = array[i] > (array[i]+previousMax) ? array[i]: (array[i]+previousMax);
     maxSum = previousMax > maxSum ? previousMax : maxSum;
   }
   return maxSum;
 }
}
