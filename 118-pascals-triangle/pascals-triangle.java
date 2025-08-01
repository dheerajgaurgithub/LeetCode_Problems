class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(List.of(1));
        for(int i=0;i<numRows-1;i++){
            List<Integer>dummy=new ArrayList<>();
            dummy.add(0);
            dummy.addAll(result.get(result.size()-1));
            dummy.add(0);
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<dummy.size()-1;j++){
                row.add(dummy.get(j)+dummy.get(j+1));
            }
            result.add(row);
        }
        return result;
    }
}