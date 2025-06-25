class MyCalendar {
    List<int[]> books;

    public MyCalendar() {
        books = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        for (int[] current : books) {
            int currentStart = current[0];
            int currentEnd = current[1];
            if (startTime < currentEnd && endTime > currentStart) {
                return false;
            }
        }
        // No overlap found, add booking
        books.add(new int[]{startTime, endTime});
        return true;
    }
}
