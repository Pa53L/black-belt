package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> f1 = new ArrayList<>();
        f1.add(Action.BUMAGA);
        f1.add(Action.BUMAGA);
        f1.add(Action.BUMAGA);
        f1.add(Action.NOJNICI);
        f1.add(Action.NOJNICI);
        f1.add(Action.KAMEN);

        List<Action> f2 = new ArrayList<>();
        f2.add(Action.BUMAGA);
        f2.add(Action.NOJNICI);
        f2.add(Action.KAMEN);
        f2.add(Action.NOJNICI);
        f2.add(Action.KAMEN);
        f2.add(Action.BUMAGA);

        new BestFriend("Pasha", f1, exchanger);
        new BestFriend("Anna", f2, exchanger);

    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if (myAction == Action.KAMEN && friendsAction == Action.NOJNICI
        || myAction == Action.BUMAGA && friendsAction == Action.KAMEN
        || myAction == Action.NOJNICI && friendsAction == Action.BUMAGA) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
