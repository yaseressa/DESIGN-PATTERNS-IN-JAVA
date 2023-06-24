import state.Admin;
import iterator.BrowseHistory;
import state.User;
import memento.Mail;

public class Main {
    public static void main(String[] args) {
        // check Memento Pattern
        mementoChecker();
        // check State Pattern
        stateChecker();
        // check Iterator Pattern
        iteratorChecker();
    }
    static void mementoChecker(){
        var mail = new Mail();
        mail.setContent("Hello, My Name is Omer");
        var state1 = mail.createMail();
        System.out.println(mail.getContent());
        mail.setContent("Hello, My Name is Ali");
        var state2 = mail.createMail();
        System.out.println(mail.getContent());
        mail.setContent("Hello, My Name is Abdi");
        var state3 = mail.createMail();
        System.out.println(mail.getContent());
        mail.restoreMail(state2);
        System.out.println(mail.getContent());
    }
    static void stateChecker(){
        var user1 = new User(new Admin());
        user1.changeBackground();
    }
    static void iteratorChecker(){
        var browser = new BrowseHistory<String>();
        browser.push("google.com");
        browser.push("yahoo.com");
        browser.push("twitter.com");
        browser.push("youtube.com");
        var iterator = browser.createIterator();
        while(iterator.hasNext()){
            System.out.print(" " + iterator.next() + " ");
        }
    }
}