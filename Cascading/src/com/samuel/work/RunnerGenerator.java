package com.samuel.work;

public class RunnerGenerator {
    public static void main(String[] args)
    {
      //  Generator gen=new Generator();
        //gen.powerSupply();

      Generator g=new Invertor();
        g.powerSupply(); // runtime poly


     //   g.service();   //  in this case we need to cascade

        Invertor l=(Invertor)g;
        l.service();               // cascading done


       // Invertor i =new Invertor();
       // i.service();
      //  i.running();


    }
}
