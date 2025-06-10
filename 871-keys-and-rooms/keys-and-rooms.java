class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int start=0;
        boolean[]visited=new boolean[rooms.size()];
        visited[start]=true;
        visitRoom(rooms,visited,start);
        for(boolean manish:visited){
            if(!manish) return false;
        }
        return true;
    }
    public void visitRoom(List<List<Integer>>rooms, boolean[]visited , int i){
        for(int num:rooms.get(i)){
            if(!visited[num]){
                visited[num]=true;
                visitRoom(rooms,visited,num);
            }
        }
    }
}