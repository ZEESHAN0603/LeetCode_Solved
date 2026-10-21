class Solution {
    public String defangIPaddr(String address) {
        String out = "";
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                out+="[.]";
            }
            else{
                out+=address.charAt(i);
            }
        }
        return out;
    }
}