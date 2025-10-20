// Last updated: 10/20/2025, 11:47:16 AM
class Solution {
    public List<Integer> grayCode(int n) {
        long x = 1;
        for (int i = 0; i < n; i++) {
            x *= 2;
        }

        List<Integer> result = new ArrayList<>();

        for (long i = 0; i < x; i++) {
            result.add(Integer.parseInt(toGray(i, n), 2));
        }

        return result;
    }

    private String toGray(long x , long n) {
		StringBuilder binary = new StringBuilder(Long.toBinaryString(x));
		
		while (binary.length() < n) {
			binary.insert(0, '0');
		}
		
		StringBuilder gray = new StringBuilder("");
		
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				gray.append(binary.charAt(i));
			} else {
				gray.append((binary.charAt(i-1) - '0') ^ (binary.charAt(i) - '0'));
			}
		}
		
		return new String(gray);
	}
}