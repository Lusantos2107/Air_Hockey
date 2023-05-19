public class Driver
{
  public static void main(String[] args)
  {
    GameArena Arena = new GameArena (1200, 700);
    Table table = new Table(100, 100);
    Mallet player1 = new Mallet(100, 100);
    Mallet player2 = new Mallet(600, 100);
    Puck puck = new Puck(100, 100);

    //Content to add to the GameArena 
    table.addtable(Arena);
    player1.addmallet(Arena);  
    player2.addmallet(Arena);
    puck.addpuck(Arena);



  //public boolean collides(){
  //}



    //While loop constantly running to see if key has been pressed
    while (true){

      if (Arena.upPressed()){
        player2.move(0, -10);
        System.out.println("in buttion");
        //player2.setXvelocity(10);
      }
      if (Arena.downPressed()){
        player2.move(0, 10);
      }
      if (Arena.leftPressed()){
        player2.move(-10, 0);
      }
      if (Arena.rightPressed()){
        player2.move(10, 0);
      }
      if (Arena.letterPressed('w')){
        player1.move(0, -10);
      }
      if (Arena.letterPressed('s')){
        player1.move(0, 10);
      }
      if (Arena.letterPressed('a')){
        player1.move(-10, 0);
      }
      if (Arena.letterPressed('d')){
        player1.move(10, 0);
      }

  //Stops the mallets and puck from escaping the table, 
  //Limiting player one for the left secion and player 2 to the right 

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
      //acts a buffer for 0.15 milliseconds to record the movements
      Arena.pause();

    }



    }

}
