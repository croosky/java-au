+ [Min Stack](#min-stack)
+ [Implement Stack using Queues](#implement-stack-using-queues)
+ [Implement Queue using Stacks](#implement-queue-using-stacks)

[comment]: <> (Stop)

## Min Stack

https://leetcode.com/problems/min-stack/

``` java
Stack<Integer> stack;
Stack<Integer> minStack;

public MinStack() {
    stack = new Stack<Integer>();
    minStack = new Stack<Integer>();
    
}

public void push(int val) {
    if(minStack.isEmpty() || val <= minStack.peek()) {
        minStack.push(val);
    }
    stack.push(val);
    
}

public void pop() {
    int pop = stack.pop();
    if(pop == minStack.peek()) {
        minStack.pop();
    }
    
}

public int top() {
    return stack.peek();
}

public int getMin() {
    return minStack.peek();
}

```
## Implement Stack using Queues

https://leetcode.com/problems/implement-stack-using-queues/

``` java
Queue<Integer> queue;

public MyStack() {
    queue = new LinkedList<Integer>();
}

public void push(int x) {
    queue.add(x);
    for (int i=0; i<queue.size()-1;i++){
        queue.add(queue.remove());
    }
}

public int pop() {
    return queue.remove();
}

public int top() {
    return queue.peek();
}

public boolean empty() {
    return queue.isEmpty();
}

```
## Implement Queue using Stacks

https://leetcode.com/problems/implement-queue-using-stacks/

``` java
Stack<Integer> stack1;
Stack<Integer> stack2;

public MyQueue() {
    stack1 = new Stack<Integer>();
    stack2 = new Stack<Integer>();
}

public void push(int x) {
    stack1.push(x);
}

public int pop() {
    if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.pop();
}

public int peek() {
    if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.peek();
}

public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
}

```