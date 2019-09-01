package Duck;

import Fly.FlyBehavior;
import Quack.Quack;
import Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuck(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Swim-swim-swim");
    }

    public void setFlyBehavior(FlyBehavior fl){
        flyBehavior = fl;
    }

    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
}
