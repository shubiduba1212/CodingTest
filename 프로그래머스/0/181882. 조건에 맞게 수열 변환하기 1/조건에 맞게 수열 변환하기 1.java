class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50){
                answer[i] = arr[i] % 2 == 0 ? arr[i] / 2 : arr[i];
            }else if(arr[i] < 50){
                answer[i] = arr[i] % 2 == 0 ? arr[i] : arr[i] * 2;
            }
        }
        return answer;
    }
}