class Solution {
    public int firstUniqChar(String s) {
        s=s.toLowerCase();
        int flag=-1;
        int arr[]=new int[26];
        int k=0,check;
        for(int i=0;i<s.length();i++){
            check=(int)s.charAt(i)-97;
            arr[check]++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[(int)s.charAt(i)-97]==1){
                flag=i;
                break;
            }
        }
        return flag;
        
    }
}