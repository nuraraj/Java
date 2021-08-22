A. Let’s start with the basics 
-A1. Can you implement the sing() method for the bird? 

--A1.1. How did you unit test it? 
String sing = bird.sing(); 
 if (sing != "I am singing"){
     System.out.println("Bird not singing.");
 }else{
      System.out.println(sing);
 }
 
--A1.2. How did you optimize the code for maintainability?
- By passing in the parameter for more fluidity.
public String sing(String param) {
   return (param);
 }

-A2. Now, we have 2 special kinds of birds: the Duck and the Chicken 

--A2.1. A duck says: “Quack , quack ” 

--A2.2. A duck can swim 

public void Duck(){
    System.out.println("Quack , quack"); 
    System.out.println("I can swim"); 
 }
bird.Duck();


--A2.3. A chicken says: “ Cluck, cluck ” 
bird.Chicken("Cluck, cluck");
--A2.4. A chicken cannot fly 
public void Chicken(String sound){
     System.out.println(sound); 
     System.out.println("I can't fly"); 
 }


-A3. Now how would you model a rooster?  
--A3.1. A rooster says: “ Cock-a-doodle-doo ” 
 bird.Chicken("Cock-a-doodle-doo");
--A3.2. How is the rooster related to the chicken? 
--A3.3. Can you think of other ways to model a rooster without using inheritance?



-A4. Can you model a parrot? We are specifically interested in three parrots, one that lived  in a house with dogs one in a house with cats , the other lived on a farm next to  the rooster. 
--A4.1. A parrot living with dogs says: “Woof, woof” 
 bird.parrot("I'm a parrot. I go Woof, woof");
--A4.2. A parrot living with cats says: “ Me ow” 
 bird.parrot("I'm a parrot. I go Me ow");
--A4.3. A parrot living near the rooster says: “ Cock-a-doodle-doo ” 
 bird.parrot("I'm a parrot. I go Cock-a-doodle-doo");
--A4.4. How do you keep the parrot maintainable? What if we need another parrot lives  near a Duck? Or near a phone that rings frequently? 
- By passing in the parameter of the sounds.So that it is reusable and giving out different values as needed.
public void parrot(String sound){
     System.out.println(sound); 
 }


B. Model fish as well as other swimming animals 
-B1. In addition to the birds, can you model a fish? 
 --B1.1. Fishes don’t sing 
 --B1.2. Fishes don’t walk 
 --B1.3. Fishes can swim 
 - class Fishes extends Animal { 
    void swim(){ 
     System.out.println("I swim"); 
     System.out.println("I don't sing"); 
     System.out.println("I don't walk"); 
    }   
}

-B2. Can you specialize the fish as a Shark and as a Clownfish? 
--B2.1. Sharks are large and grey 
--B2.2. Clownfish are small and colourful (orange) 
--B2.3. Clownfish make jokes 
--B2.4. Sharks eat other fish 
-  void Sharks (){
    Fishes fish = new Fishes();
    System.out.println("I'm a shark");
    System.out.println("I'm large and grey");
    System.out.println("I eat other fish");
    fish.swim();
     
 }
 - void Clownfish (){
    Fishes fish = new Fishes();
    System.out.println("I'm a Clownfish");
    System.out.println("I'm small and colourful");
    System.out.println("I make jokes");
    fish.swim();
 }
 
-B3. Dolphin s are not exactly fish, yet, they are good swimmers 
--B3.1. Can you model a dolphin that swims without inheriting from a fish class? 
- class Dolphins extends SwimmingAnimal { 
    SwimmingAnimal swim = new SwimmingAnimal();
    swim.canSwim();
}
Dolphins dolphin = new Dolphins();
dolphin.dolp();

--B3.2. How do you avoid duplicating code or introducing unneeded overhead?
- by creating a class for Swimming Animal
class SwimmingAnimal {
    public void canSwim() {
         System.out.println("I swim"); 
      }
}


C. Model animals that change their behaviour over time 
-C1. Can you model a butterfly? 
--C1.1. A butterfly can fly 
--C1.2. A butterfly does not make a sound  
-  class ButterflyMorph extends Insect{
        boolean fly(){ 
            System.out.println("I can fly");
            return true; 
        }
        boolean crawl(){ 
            System.out.println("I crawl");
            return true; 
        }
        boolean sound(){ 
            System.out.println("I dont make sound");
            return false; 
        } 
    }
-C2. Can you optimize your model to account for the metamorphosis from caterpillar to  butterfly?  
--C2.1. A caterpillar cannot fly 
--C2.2. A caterpillar can walk (crawl)  

 Insect morph = new CaterpillarMorph();

  void metamorphosis(){
      morph =  new ButterflyMorph();
  }
     class CaterpillarMorph extends Insect {
        boolean fly(){ 
            System.out.println("I cannot fly");
            return false; 
        }
        boolean crawl(){ 
            System.out.println("I crawl");
            return true; 
        }
        boolean sound(){ 
            System.out.println("I make sound");
            return true; 
        }             
    }


D. Counting animals 
Suppose you have an array of animals
-D1. Can you share the code to count: 
--D1.1. How many of these animals can fly?  4
--D1.2. How many of these animals can walk? 2
--D1.3. How many of these animals can sing? 2
--D1.4. How many of these animals can swim? 5

