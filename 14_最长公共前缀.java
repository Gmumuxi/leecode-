//这是错误的
import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int markNum = 0;
        for(int i=0; i < 200; i++) { //每个元素的第几个字符
            HashSet tempSet = new HashSet();  //建议加泛型，要么警告。建议不要hashset，因一次封装，为有要封装解封
            for(int j=0; j < strs.length; j++) {
                if(strs[j].length() > i){
                    tempSet.add(strs[j].charAt(i));
                } else {
                    break;  //这里应该跳出多重循环。跳出标记
                }
            }
  
            if(tempSet.size() != 1){
                markNum = i; 
                break;
            }
        }
            return strs[0].substring(markNum);                                
}
}

//另一种思路。
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int markNum = 0;
        out:
        for(; ; markNum++) { //每个元素的第几个字符
            if (markNum >= strs[0].length()) break;
            char c = strs[0].charAt(markNum);

            for (int j = 1; j < strs.length; j++) {  //j <= strs.length
                if (strs[j].length() <= markNum || strs[j].charAt(markNum) != c) {
                    break out;
                }
            }
        }
        return strs[0].substring(0, markNum);  
    }
}
