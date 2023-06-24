package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackIterator<T> implements Iterator<T>{
    private List<T> arr = new ArrayList<>();
    private int current = 0;

    public StackIterator(Stack<T> stack) {
        List<T> stackArr = new ArrayList<>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stackArr.add(stack.pop());
        }

        Collections.reverse(stackArr);
        this.arr = stackArr;
    }

    @Override
    public boolean hasNext() {
        return (current + 1) <= arr.size();
    }

    @Override
    public T next() {
        var next = arr.get(current);
        current++;
        return next;

    }
}
