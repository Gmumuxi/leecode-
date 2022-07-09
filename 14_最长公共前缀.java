import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int markNum = 0;
        for(int i=0; i < 200; i++) { //每个元素的第几个字符
            HashSet tempSet = new HashSet(200);
            for(int j=0; j <= strs.length; j++) {
                if(strs[j].length() > i){
                    tempSet.add(strs[j].charAt(i));
                } else {
                    break;
                }
            }
  
            if(tempSet.size() != 1){
                markNum = i; 
                break;
            }
        }

        if(markNum != 0){
            return strs[0].substring(markNum);                
        } 
    return "as";                 
}
}
