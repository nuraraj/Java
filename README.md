A1. Can you implement the sing() method for the bird? 
A1.1. How did you unit test it? 
"String sing = bird.sing(); 
 if (sing != "I am singing"){
     System.out.println("Bird not singing.");
 }else{
      System.out.println(sing);
 }"
A1.2. How did you optimize the code for maintainability?
- By passing in the parameter for more fluidity.


A2. Now, we have 2 special kinds of birds: the Duck and the Chicken 
A2.1. A duck says: “Quack , quack ” 
A2.2. A duck can swim 
public void Duck(){
    System.out.println("Quack , quack"); 
    System.out.println("I can swim"); 
 }
bird.Duck();


A2.3. A chicken says: “ Cluck, cluck ” 
A2.4. A chicken cannot fly 
public void Chicken(String sound){
     System.out.println(sound); 
     System.out.println("I can't fly"); 
 }
bird.Chicken("Cluck, cluck");

A3. Now how would you model a rooster?  
A3.1. A rooster says: “ Cock-a-doodle-doo ” 
A3.2. How is the rooster related to the chicken? 
A3.3. Can you think of other ways to model a rooster without using inheritance?
