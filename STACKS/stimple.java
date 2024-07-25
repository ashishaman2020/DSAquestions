package STACKS;

public class stimple {
    private static class stimp{
        private int top;
        private Integer[] arr;
        private int size;
        public stimp() {
            this.arr = new Integer[1000];
            this.top = -1;
        }
        void push(int val) {
            top++;
            arr[top] = val;
        }
        int pop(){
            int res = arr[top];
            arr[top] = null;
            top--;
            return res;
        }
        int size() {return top+1;}
        int top() {return arr[top];}
    }

    public static void main(String[] args) {
        stimp st1 = new stimp();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println(st1.size());
        System.out.println(st1.top());
        System.out.println(st1.pop());
        System.out.println(st1.top());
    }
}
