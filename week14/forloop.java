class forloop {
    
    public static void main(String args[]) {
        boolean flag = false;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}