package chapter_1_stackandqueue.TwoStacksImplentQuene;

import java.util.Stack;

public class TwoStacksImplementQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksImplementQueue(){
        stackPop = new Stack<Integer>();
        stackPush = new Stack<Integer>();
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public static void main(String[] args) {
        TwoStacksImplementQueue twoStacksImplementQueue = new TwoStacksImplementQueue();
        twoStacksImplementQueue.add(1);
        twoStacksImplementQueue.add(2);
        twoStacksImplementQueue.add(3);

        System.out.println(twoStacksImplementQueue.poll());
        System.out.println(twoStacksImplementQueue.peek());
        System.out.println(twoStacksImplementQueue.poll());
        System.out.println(twoStacksImplementQueue.peek());
        System.out.println(twoStacksImplementQueue.poll());
        System.out.println(twoStacksImplementQueue.peek());
        System.out.println(twoStacksImplementQueue.poll());
        System.out.println(twoStacksImplementQueue.peek());

    }
}
