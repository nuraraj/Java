class Animal { 
 public void walk(){ 
 System.out.println("I am walking"); 
 } 
} 

class Bird extends Animal { 
 public void fly() { 
 System.out.println("I am flying"); 
 } 
 //A1. to enable to call sing() function for bird.
public String sing() {
   //System.out.println("I am singing");   
   return ("I am singing");
 }
 
 //A2. DUck & Chicken
 public void Duck(){
    System.out.println("Quack , quack"); 
    System.out.println("I can swim"); 
 }
 public void Chicken(String sound){
     System.out.println(sound); 
     System.out.println("I can't fly"); 
 }
 
 //A4
 public void parrot(String sound){
     System.out.println(sound); 
 }
 
} 


public class Solution { 
 public static void main(String[] args) { 
 Bird bird = new Bird();
 bird.walk(); 
 bird.fly(); 
 
 //A1.1
 String sing = bird.sing(); 
 if (sing != "I am singing"){
     System.out.println("Bird not singing.");
 }else{
      System.out.println(sing);
 }
  
 
 //A2
 bird.Duck();
 bird.Chicken("Cluck, cluck");
 
 //A3
 bird.Chicken("Cock-a-doodle-doo");
 
 //A4
 //A4.1
 bird.parrot("Woof, woof");
 //A4.2
 bird.parrot("Me ow");
 //A4.3
 bird.parrot("Cock-a-doodle-doo");
 } 
} 
