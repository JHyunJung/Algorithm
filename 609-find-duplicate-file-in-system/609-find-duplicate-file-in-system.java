class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> h = new HashMap<>();

        for(String path : paths){
            String[] splitedPath = path.split(" ");
            String root = splitedPath[0];
            for(int i=1; i< splitedPath.length; i++){

                int stIndex = splitedPath[i].indexOf("(");
                int endIndex = splitedPath[i].indexOf(")");
                String content = splitedPath[i].substring(stIndex+1, endIndex);
                String subPath = splitedPath[i].substring(0, stIndex);
                if(!h.containsKey(content)){
                    List<String> list = new ArrayList<>();
                    list.add(root + "/" + subPath);
                    h.put(content, list);
                }else{
                    List<String> list = h.get(content);
                    list.add(root + "/" + subPath);
                    h.put(content, list);
                }

            }
        }

        for(Map.Entry<String, List<String>> entry : h.entrySet()){
            if(entry.getValue().size() != 1) {
                result.add(entry.getValue());
            }
        }

        return result;
    }
}