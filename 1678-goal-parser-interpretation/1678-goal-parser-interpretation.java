class Solution {
    public String interpret(String command) {
        StringBuilder out = new StringBuilder();

        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                out.append("G");
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                out.append("o");
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                out.append("al");
                i+=3;
            }
        }
        return out.toString();

    }
}