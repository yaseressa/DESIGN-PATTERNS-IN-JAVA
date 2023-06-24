package iterator;

import iterator.StackIterator;
import memento.Mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BrowseHistory<T> {
    private Stack<T> history = new Stack<>();
   public void push(T state){
        history.push(state);
    }

    public T pop(){
        return history.pop();
    }
    public StackIterator<T> createIterator(){
        return new StackIterator<>(history);
    }
}
