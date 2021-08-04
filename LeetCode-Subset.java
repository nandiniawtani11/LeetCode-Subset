class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();  
        list.add(new ArrayList<Integer>());
        for(int i:nums)
        {
            int n=list.size();
            for(int j=0;j<n;j++)
            {
                ArrayList<Integer>l=new ArrayList(list.get(j));
                l.add(i);
                list.add(l);
            }
        }
        return list;
    }
}
