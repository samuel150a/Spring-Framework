package com.samuel.work;

public class BotLab {
    public BotLab() {
        System.out.println("Running the BotLab constructor");
    }

    public void show(Bot26 bot) {
        if (bot != null) {
            bot.operate();
            if (bot instanceof ServiceBot26) {
                ServiceBot26 ref = (ServiceBot26) bot;
                ref.deliverPackage();
            } else {
                System.out.println("Bot26 is not an instance of ServiceBot26, cannot call cascaded method");
            }
        } else {
            System.out.println("Bot26 is null");
        }
    }
}
