/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.*/

class Solution {
    private HashMap<Character, Character> mappings;
    public Solution(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(this.mappings.containsKey(c)){
                char top= stack.empty()?'#':stack.pop();
                if(top!=this.mappings.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
