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
 --B1.1. Fish es don’t sing 
 --B1.2. Fish es don’t walk 
 --B1.3. Fish es can swim 

