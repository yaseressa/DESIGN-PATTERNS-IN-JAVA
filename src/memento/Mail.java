package memento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Mail {
    private String content;
    public static MailHistory history = new MailHistory();

    public MailState createMail() {
        MailState currentState = new MailState(content);
        history.push(currentState);
        return currentState;
    }
    public void restoreMail(MailState back){
        var temp = new ArrayList<>(history.getHistory());
        for (int i = temp.size() - 1; i >= 0; i--) {
            MailState popped = temp.remove(i);
            if (popped.equals(back)){
                this.content = popped.getContent();
                return;
            }
        }
        content = "Not Found";
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent(){return content;}




    public static class MailState{
        private String content;
     public MailState(String current){
         this.content = current;
     }

        public String getContent() {
            return content;
        }

    }




    private static class MailHistory{
        private List<MailState> history = new ArrayList<>();
        void push(MailState state){
            history.add(state);
        }
        MailState pop(){
            return history.remove(history.size() - 1);
        }

        public List<MailState> getHistory(){
            return history;
        }
    }
}
