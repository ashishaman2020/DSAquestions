package STACKS;

public class QueueImple {

    private static class queueimpl{
        int arr[];
        int start;
        int end;
        int size;
        queueimpl() {
            arr = new int[100];
            start = end = 0;
            size = 0;
        }
        void push(int val) {
            arr[end] = val;
            size++;
            end++;
        }

        int pop(){
            int res = arr[start];
            start++;
            size--;
            return res;
        }

        int top(){
            return arr[start];
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queueimpl qu = new queueimpl();
        qu.push(10);
        qu.push(20);
        qu.push(30);
        System.out.println(qu.size());
        System.out.println(qu.top());
        System.out.println(qu.pop());
        System.out.println(qu.top());
        System.out.println(qu.size());
    }
}
