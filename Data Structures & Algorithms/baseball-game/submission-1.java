class Solution {
    public int calPoints(String[] operations) {
        int i = 0; 
        Stack<Integer> record = new Stack<>();
        int res = 0;
        while(i < operations.length){
            String op = operations[i];
            if(op.equals("+")){
                int a = record.pop();
                int b = record.pop();
                record.push(b);
                record.push(a);
                record.push(a+b);
                res = (a+b)*2;
            } else if(op.equals("C")){
                int x = record.pop();
                res-=x;
            } else if(op.equals("D")){
                int x = record.peek();
                record.push(x*2);
                res+=x*2;
            } else {
                record.push(Integer.parseInt(op));
                res+=Integer.parseInt(op);
            }
            i++;
        }
        return res;
    }
}