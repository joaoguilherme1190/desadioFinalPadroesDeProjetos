package one.digitalinnovation.desafio;

import one.digitalinnovation.desafio.Facade.Facade;
import one.digitalinnovation.desafio.Singleton.SingletonEager;
import one.digitalinnovation.desafio.Singleton.SingletonLazy;
import one.digitalinnovation.desafio.Singleton.SingletonLazyHolder;
import one.digitalinnovation.desafio.Strategy.*;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Guilherme", "71693019");
    }

}