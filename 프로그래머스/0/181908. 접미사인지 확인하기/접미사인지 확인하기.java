class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.substring(i).equals(is_suffix)){
                return answer = 1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}