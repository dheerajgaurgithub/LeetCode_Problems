class MyCalendarTwo {
    private List<int[]> bookings;
    private List<int[]> overlaps;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] o : overlaps) {
            if (Math.max(o[0], start) < Math.min(o[1], end)) {
                return false;
            }
        }

        for (int[] b : bookings) {
            int os = Math.max(b[0], start);
            int oe = Math.min(b[1], end);
            if (os < oe) {
                overlaps.add(new int[]{os, oe});
            }
        }

        bookings.add(new int[]{start, end});
        return true;
    }
}
