class LC1011 {
    public int finalAfterOperations(String[] operations) {
        int n = operations.length;
        int X = 0;

        for (int i = 0; i < n; i++) {
           // if (operations[i].charAt(1) == '+')
           if(operations[i].equals("x++")||operations[i].equals("++x"))
                X++;
            else
                X--;
        }
        return X;
    }

    public static void main(String[] args) {
        String strs[] = {"--x", "x++", "++x", "x--"};
        LC1011 obj = new LC1011();
        System.out.println(obj.finalAfterOperations(strs));
    }
}
