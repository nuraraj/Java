class Insect {
    boolean fly(){ 
            System.out.println("I can fly");
            return true; 
        };
    boolean crawl(){ 
            System.out.println("I crawl");
            return true; 
        };
    boolean sound(){ 
            System.out.println("I make sound");
            return true; 
        }         ;
}

class Butterfly extends Insect {

     class ButterflyMorph extends Insect{
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
}
