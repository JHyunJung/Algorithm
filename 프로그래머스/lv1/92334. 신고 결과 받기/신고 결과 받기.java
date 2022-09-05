import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        int index = 0;
        Map<String, List<String>> reportIdMap = new HashMap<>();
        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, Boolean> ban = new HashMap<>();
        
        for(String id : id_list){
            reportIdMap.put(id, new ArrayList<>());
            reportMap.put(id, 0);
            ban.put(id, false);
        }
        
        for(String r : report){
            String[] ids = r.split(" ");
            List<String> list = reportIdMap.get(ids[0]);
            
            if(!list.contains(ids[1])){
                list.add(ids[1]);
                reportIdMap.put(ids[0], list);
                reportMap.put(ids[1], reportMap.getOrDefault(ids[1], 0)+1);
            }
        }
        
        
        for(String id : id_list){
            
            List<String> list = reportIdMap.get(id);
            int banId = 0;
            for(String reportedId : list){
                
                if(reportMap.get(reportedId) >= k){
                    banId++;
                }
            }
            result[index++] = banId;
        }
        
        return result;
    }
}