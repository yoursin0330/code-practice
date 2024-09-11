import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String str1, String str2) {
        int count = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        cutString(str1, list1);
        cutString(str2, list2);

        int maxCount = list1.size() + list2.size();
        if (maxCount == 0 ) return 65536;
        for (String str : list1) {
            if (list2.contains(str)) {
                list2.remove(str);
                count++;
            }
        }
        return (int)(((float)count/(maxCount-count))*65536);
    }
    public void cutString(String str, List<String> list){
        int i=0;
        char c;
        while(i<str.length()-1){
            c = str.charAt(i);
            if(c<'a' || c>'z'){
                i++;
                continue;
            }
            c = str.charAt(i+1);
            if(c<'a' || c>'z'){
                i+=2;
                continue;
            }
            list.add(str.substring(i,i+2));
            i++;
        }
    }
}