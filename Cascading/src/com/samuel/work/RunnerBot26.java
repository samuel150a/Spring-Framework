package com.samuel.work;

public class RunnerBot26 {
    public static void main(String[] args) {
        Bot26 bot = new Bot26();
        bot.operate(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Bot26 serviceBot = new ServiceBot26();
        serviceBot.operate(); // RUNTIME POLYMORPHISM

        ServiceBot26 sb26 = new ServiceBot26();
        sb26.operate(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sb26.deliverPackage();

        BotLab lab = new BotLab();
        lab.show(bot);
        lab.show(sb26);
    }
}
