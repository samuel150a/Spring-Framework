package com.samuel.work;

public class RunnerShowerGel79 {
    public static void main(String[] args) {
        ShowerGel79 showerGel = new ShowerGel79();
        showerGel.use(); // PARENT CLASS METHOD

        ShowerGel79 aloeShowerGel = new AloeShowerGel79();
        aloeShowerGel.use(); // RUNTIME POLYMORPHISM

        AloeShowerGel79 asg = new AloeShowerGel79();
        asg.use(); // CHILD CLASS METHOD
        asg.hydrate();

        ShowerGelStore store = new ShowerGelStore();
        store.show(showerGel);
        store.show(asg);
    }
}
