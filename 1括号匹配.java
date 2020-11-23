//括号匹配
public boolean isValid(String s) {
	Stack<Character> stack = new Stack<>();
	for(int i=0;i<s.length();i++) {
		char tmp = s.charAt(i);
		if(tmp=='('||tmp=='{'||tmp=='[') {
			stack.push(tmp);
		}else {
			if(stack.empty()) {
				return false;
			}else {
				if((stack.peek()=='('&&tmp==')')||
					(stack.peek()=='{'&&tmp=='}')||
					(stack.peek()=='['&&tmp==']')) {
					 stack.pop();
				}else {
					return false;
				}
			}
		}
	}
	return stack.empty();
}