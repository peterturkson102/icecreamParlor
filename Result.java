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
    List<Integer> result = new ArrayList<>();
    for(int a=0;a<arr.size()-1;a++){
        for(int b=a+1;b<arr.size();b++){
            if(arr.get(a)+arr.get(b)==m){
                result.add(a+1);
                result.add(b+1);
            }
        }
    } 
    return result;
    }

}
