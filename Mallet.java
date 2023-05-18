public class Mallet {


    private Ball mallet = new Ball(0, 0, 80, "RED", 2);
  

	//sets the position of the mallets 
    public Mallet(double x, double y)
	{
        mallet.setXPosition(x + 250);
        mallet.setYPosition(y + 250);


    }
	//Allows for the movement of the mallets 
    public void move(double dx, double dy)
	{
		mallet.move(dx, dy);
    }
	//Adds mallet (ball) to the GameArena
    public void addmallet(GameArena Arena)
    {
        Arena.addBall(mallet);

    }
    //Returning the X and Y position of the mallets
    public double getYPosition(){
        return mallet.getYPosition();
    }
    public double getXPosition(){
        return mallet.getXPosition();
    }





}

