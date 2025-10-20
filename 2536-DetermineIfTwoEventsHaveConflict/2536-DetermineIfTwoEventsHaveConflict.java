// Last updated: 10/20/2025, 11:35:08 AM
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int eventOneStart = Integer.parseInt(event1[0].substring(0, 2)) * 60 + Integer.parseInt(event1[0].substring(3));
        int eventOneEnd = Integer.parseInt(event1[1].substring(0, 2)) * 60 + Integer.parseInt(event1[1].substring(3));
        
        int eventTwoStart = Integer.parseInt(event2[0].substring(0, 2)) * 60 + Integer.parseInt(event2[0].substring(3));
        int eventTwoEnd = Integer.parseInt(event2[1].substring(0, 2)) * 60 + Integer.parseInt(event2[1].substring(3));
        
        if (eventOneStart <= eventTwoStart && eventTwoStart <= eventOneEnd ||
            eventOneStart <= eventTwoEnd && eventTwoEnd <= eventOneEnd ||
            eventTwoStart <= eventOneStart && eventOneStart <= eventTwoEnd ||
            eventTwoStart <= eventOneEnd && eventOneEnd <= eventTwoEnd) return true;
        else return false;
    }
}