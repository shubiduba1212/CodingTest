class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.substring(0, i).equals(is_prefix)){
                return answer = 1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}