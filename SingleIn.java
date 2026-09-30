class Phone {
    void call() {
        System.out.println("Calling...");
    }
}

class SmartPhone extends Phone {
    void browse() {
        System.out.println("Browsing internet...");
    }
}

public class SingleIn {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.browse();
    }
}