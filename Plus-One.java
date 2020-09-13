class Solution {
    public int[] plusOne(int[] digits) {
        List list = new ArrayList<>();
        int carry = 1;

        for(int i=digits.length-1;i>=0;i--)
        {
        int num = 0;
        num = digits[i] + carry;
        if(num>9){
        list.add(num%10);
        carry = num/10;
        }
        else{
        list.add(num);
        carry = 0;
        }
        }
        if(carry != 0){
        list.add(carry);
        }
        int arr[] = new int[list.size()];
        int j=0;
        for(int i=list.size()-1; i>=0;i--){
        arr[j] = (int)list.get(i);
        j++;
        }
        return arr;
        
        
    }
}
