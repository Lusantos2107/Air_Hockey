public class Driver
{
  public static void main(String[] args)
  {
    GameArena Arena = new GameArena (1200, 700);
    Table table = new Table(100, 100);
    Mallet mallet = new Mallet(100, 100);


    table.addtable(Arena);
    mallet.addmallet(Arena);
  



    }

}
