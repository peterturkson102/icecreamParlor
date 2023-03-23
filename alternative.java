class Result {

    /*
     * Complete the 'icecreamParlor' function below.
     * 
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
  // Write your code here
List<Integer> ans=new ArrayList<>();

for(int a =0;a<arr.size();a++){
   int diff = m - arr.get(a);
   //checks if diff is equal to any of the items by creating sublist from the next index of the current to the last index ie for(int b =a+1;a<arr.size();b++)
   if(arr.subList(a+1, arr.size()).contains(diff)){
       ans.add(a+1);
       
       //sets the index of second by creating another sublist of the values after the current and find the index of the value which is equal to the diff. This will return an inde from the sub array but we need an index from the original array so add the start of the sublist we created to the index we obtained from the sublist ie (a+1) this will give us the original index of our diff in the original array. now add another plus one since the index we have starts at zero and the question wants 1-based indexing
       ans.add(arr.subList(a + 1, arr.size()).indexOf(m - arr.get(a)) + a+1 + 1);
       break;
   } 
}
return ans;
    }

}
