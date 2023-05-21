/**
 * This class (Driver) connects to other classes used in the game and provides an active listener
 * for when keys, collision activated and goal activation. 
 * @author Luis Santos
 */


public class Driver
{
  public static void main(String[] args)
  {

    //Instance variables 
    double[] velocity = {0, 0};
    GameArena Arena = new GameArena (1200, 700);
    Table table = new Table(100, 100);
    Mallet player1 = new Mallet(350, 350);
    Mallet player2 = new Mallet(850, 350);
    Puck puck = new Puck(600, 350);

    //Content to add to the GameArena 
    table.addtable(Arena);
    player1.addmallet(Arena);  
    player2.addmallet(Arena);
    puck.addpuck(Arena);

    //While loop constantly running to see if key has been pressed
    while (true){

      if (Arena.upPressed()){
        player2.move(0, -10);
        player2.setYvelocity(-10);
        //System.out.println("in buttion");
      }
      if (Arena.downPressed()){
        player2.move(0, 10);
        player2.setYvelocity(10);
      }
      if (Arena.leftPressed()){
        player2.move(-10, 0);
        player2.setXvelocity(-10);
      }
      if (Arena.rightPressed()){
        player2.move(10, 0);
        player2.setXvelocity(10);
      }
      if (Arena.letterPressed('w')){
        player1.move(0, -10);
        player1.setYvelocity(-10);
      }
      if (Arena.letterPressed('s')){
        player1.move(0, 10);
        player1.setYvelocity(10);
      }
      if (Arena.letterPressed('a')){
        player1.move(-10, 0);
        player1.setXvelocity(-10);
      }
      if (Arena.letterPressed('d')){
        player1.move(10, 0);
        player1.setXvelocity(10);
      }

      //Stops the mallets from escaping the table, 
      //Limiting player 1 for the left secion and player 2 to the right 
      if (player1.getYPosition()<= -220){
        player1.move(0, 10);
      }
      if (player2.getYPosition()<= -220){
        player2.move(0, 10);
      }
      if (player1.getYPosition()>= 220){
        player1.move(0, -10);
      }
      if (player2.getYPosition()>= 220){
        player2.move(0, -10);
      }
      if (player1.getXPosition()<= -220){
        player1.move(10, 0);
      }
      if (player2.getXPosition()<= -220){
        player2.move(10, 0);
      }
      if (player1.getXPosition()>= 220){
        player1.move(-10, 0);
      }
      if (player2.getXPosition()>= 220){
        player2.move(-10, 0);
      }

      //Checks if Puck hits boarder if so deflect will be activated
      if (puck.getXPosition()<= -485){
        velocity[0] = velocity[0] * -1;
      }
      if (puck.getXPosition()>= 485){
        velocity[0] = velocity[0] * -1;
      }
      if (puck.getYPosition()<= -235){
        velocity[1] = velocity[1] * -1;
      }
      if (puck.getYPosition()>= 235){
        velocity[1] = velocity[1] * -1;
      }

      //Checks if collision between Mallet and Puck occures
      if (puck.collidesCheck(player1) == true){
        velocity = puck.deflect(player1);
      }
      
      if (puck.collidesCheck(player2) == true){
        velocity = puck.deflect(player2);
      }
      
      velocity[0] *= 0.99; 
      velocity[1] *= 0.99;
      puck.move(velocity[0], velocity[1]);

      if (Arena.enterPressed()){
        player1.setXPosition(350);
        player1.setYPosition(350);
        player2.setXPosition(850);
        player2.setYPosition(350);
        velocity[0] = 0;
        velocity[1] = 0;
        puck.setXPosition(600);
        puck.setYPosition(350);
        
        // if (player1.getYPosition()<= -2200){
        //   player1.move(0, 10);
        //   System.out.println("yes");
        // }
        // if (player2.getYPosition()<= -2200){
        //   player2.move(0, 10);
        // }
        // if (player1.getYPosition()>= 2200){
        //   player1.move(0, -10);
        // }
        // if (player2.getYPosition()>= 2200){
        //   player2.move(0, -10);
        // }
        // if (player1.getXPosition()<= -2200){
        //   player1.move(10, 0);
        // }
        // if (player2.getXPosition()<= -2200){
        //   player2.move(10, 0);
        // }
        // if (player1.getXPosition()>= 2200){
        //   player1.move(-10, 0);
        // }
        // if (player2.getXPosition()>= 2200){
        //   player2.move(-10, 0);
        // }
  
      }


      if (puck.getXPosition() >= 121 && (puck.getYPosition() >= 200 && puck.getYPosition() <= 400)){
        velocity[0] = 0;
        velocity[1] = 0;
        System.out.println("in buttion");

        puck.setXPosition(600);
        puck.setYPosition(350);
        
        player1.setXPosition(350);
        player1.setYPosition(350);
        
        player2.setXPosition(850);
        player2.setYPosition(350);
      }

/*      if (puck.getXPosition() >= 1100 && (puck.getYPosition() >= 200 && puck.getYPosition() <= 400)){
        puck.setXPosition(600);
        puck.setYPosition(350);
        player1.setXPosition(850);
        player1.setYPosition(350);
        player2.setXPosition(850);
        player2.setYPosition(850);
      }
*/ 


      //acts a buffer for 0.15 milliseconds to record the movements
      Arena.pause();

    }



    }

}
