// Last updated: 10/20/2025, 11:48:18 AM
class Solution {
    public String multiply(String a, String b) {
        String res = "";
		String mul = "";
		int last = 0;
		a = reverse(a);
		for (char c : a.toCharArray()) {
			mul = Multiply(b, c);
			
			res = add(res, mul, last);
			last++;
		}
		StringBuilder s = new StringBuilder();
		
		int i = 0;
		while (i < res.length() && res.charAt(i) == '0') i++;
		while (i < res.length()) s.append(res.charAt(i++));
		if (s.length() == 0) return "0";
		return new String(s);
    }
    
    private String reverse(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer rv = sb.reverse();
		
		String str = new String(rv);
		
		return str;
	}
    public String Multiply(String s, char x) {
		StringBuilder res = new StringBuilder();
		int carry = 0;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char y = s.charAt(i);
			int mul = (x - '0') * (y - '0') + carry;
			res.append(mul%10);
			carry = mul / 10;
		}
		
		res.append(carry);
		
		return reverse(new String(res));
	}
    public String add(String s1, String s2, int last) {
		StringBuilder res = new StringBuilder();
		int temp = last;
		
		while (temp-- > 0) s2 = s2 + "0";
		
		s1 = reverse(s1);
		s2 = reverse(s2);
		
		int carry = 0, l1 = s1.length(), l2 = s2.length();
		
		int i = 0, j = 0;
		
		while (i < l1 && j < l2) {
			int sum = s1.charAt(i) + s2.charAt(j) - '0' - '0' + carry;
			res.append(sum%10);
			carry = sum / 10;
			i++;
			j++;
		}
		
		while (i < l1) {
			int sum = s1.charAt(i) - '0' + carry;
			res.append(sum%10);
			carry = sum / 10;
			i++;
		}
		
		while (j < l2) {
			int sum = s2.charAt(j) - '0' + carry;
			res.append(sum%10);
			carry = sum / 10;
			j++;
		}
		res.append(carry);
		
		return reverse(new String(res));
	}
    
}