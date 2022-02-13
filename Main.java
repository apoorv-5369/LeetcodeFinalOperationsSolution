class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for(int i=0; i<operations.length; i++){
            val += (operations[i].indexOf('+') != -1) ? 1 : -1;
        }
        return val;
    }
}
