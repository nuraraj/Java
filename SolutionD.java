
public abstract class Animal{
     private String type;
     private String appearance;
     
     public Animal(String type, String appearance){
     this.type = type;
     this.appearance = appearance;
     }
     public abstract void sing();
     public abstract void move();
     @Override
     public final String toString(){
       return type + " : " + appearance;
     }
}

public abstract class Bird extends Animal{
         public Bird(String type, String appearance){
         super(type, appearance);
         }
         @Override
         public final void sing(){
         System.out.println("sing.");
         }
         @Override
         public final void move(){
         System.out.println("Fly.");
         }
}

public abstract class Fish extends Animal{
         public Fish(String type, String appearance){
         super(type, appearance);
         }
         @Override
         public final void move(){
         System.out.println("swim.");
         }
}

public final class Duck extends Bird{
     public Duck(){
     super("Duck", "Quack");
     }
}

public final class Chicken extends Bird{
     public Chicken(){
     super("Chicken", "Cluck");
     }
}

public final class Rooster extends Bird{
     public Rooster(){
     super("Rooster", "Cock-a-doodle-doo");
     }
}

public final class Parrot extends Bird{
     public Parrot(){
     super("Parrot", "Cock-a-doodle-doo");
     }
}

public final class Shark extends Fish{
     public Shark(){
     super("Shark", "No sound");
     }
}

public final class Clownfish extends Fish{
     public Clownfish(){
     super("Clownfish", "No sound");
     }
}

public final class Dolphin extends Fish{
     public Dolphin(){
     super("Dolphin", "Dolphin sound");
     }
}

public final class Frog extends Animal{
     public Frog(){
     super("Frog", "Ribbit.");
     }
      @Override
         public final void move(){
         System.out.println("Jump.");
         }
}

public final class Dog extends Animal{
     public Dog(){
     super("Dog", "Bark.");
     }
      @Override
         public final void move(){
         System.out.println("Walk.");
         }
}

public final class Butterfly extends Animal{
     public Butterfly(){
     super("Butterfly", "No Sound.");
     }
      @Override
         public final void move(){
         System.out.println("Fly.");
         }
}

public final class Cat extends Animal{
     public Cat(){
     super("Cat", "Meow.");
     }
      @Override
         public final void move(){
         System.out.println("Walk.");
         }
}





public class Solution { 
     public static void main(String[] args) { 
         
    Animal[] animals = new Animal[]
     {
     new Bird(),
     new Duck(),
     new Chicken(),
     new Rooster(),
     new Parrot(),
     new Fish(),
     new Shark(),
     new Clownfish(),
     new Dolphin(),
     new Frog(),
     new Dog(),
     new Butterfly(),
     new Cat()
     };
      
      for (int i = 0; i < animals.length; i++){
        int countFly;
        int countSing;
        int countWalk;
        int countSwim;
          
         if(animals[i].sing() ="sing."){
             countSing +=;
         }
         
         if(animals[i].move() ="Walk."){
             countWalk +=;
         }else if(animals[i].move() ="Fly."){
             countFly +=;
         }else if(animals[i].move() ="swim."){
             countSwim +=;
         }else{
             //do nothing.
         }
           
      }


     } 
} 
