// Last updated: 10/20/2025, 11:40:10 AM
class Solution {
    public String reformatDate(String date) {
        String d = date.substring(0, 2);
        String m = date.substring(date.length() - 8, date.length() - 5);
        String y = date.substring(date.length() - 4, date.length());
        if (date.charAt(1) == 't'|| date.charAt(1) == 's' || date.charAt(1) == 'n' || date.charAt(1) == 'r') {
            d = "0" + date.charAt(0);
        }
        if (m.equals("Jan")) m = "01";
        else if (m.equals("Feb")) m = "02";
        else if (m.equals("Mar")) m = "03";
        else if (m.equals("Apr")) m = "04";
        else if (m.equals("May")) m = "05";
        else if (m.equals("Jun")) m = "06";
        else if (m.equals("Jul")) m = "07";
        else if (m.equals("Aug")) m = "08";
        else if (m.equals("Sep")) m = "09";
        else if (m.equals("Oct")) m = "10";
        else if (m.equals("Nov")) m = "11";
        else m = "12";
        return (y + "-" + m + "-" + d);
    }
}
