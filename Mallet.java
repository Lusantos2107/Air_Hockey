/**
 * This class provides the parameters and conditions for the physical movement
 * and atributes for the Mallets in the game.
 * @author Luis Santos
 */


public class Mallet {
    //Instance variables for Mallet
    private Ball mallet = new Ball(0, 0, 80, "RED", 2);
    private double xcor;
    private double ycor;
    private double Xvelocity;
    private double Yvelocity;


    /**
     * Sets the position of the mallets 
     * 
     * @param x The position in the X axis
     * @param y The position in the Y axis
     */
    public Mallet(double x, double y)
	{
        mallet.setXPosition(x);
        mallet.setYPosition(y);
    }

    /**
     * Allows for the movement of the mallets 
     * 
     * @param dx The movement in the X axis
     * @param dy The movement in the Y axis
     */
    public void move(double dx, double dy)
	{
		this.xcor += dx;
        this.ycor += dy;
        mallet.move(dx, dy);
    }
	
    //Adds mallet (ball) to the GameArena
    public void addmallet(GameArena Arena)
    {
        Arena.addBall(mallet);
    }

    //Allows for getMallet to be used in Puck class as mallet
    public Ball getMallet(){
        return mallet;
    }


    //Returning the X and Y position of the Mallets
    //Setting the X and Y cords of the Mallets
    public double getYPosition(){
        return this.ycor;
    }
   
    public void setYPosition(double ycord){
        this.mallet.setYPosition(ycord);
    }

    public double getXPosition(){
        return this.xcor;
    }

    public void setXPosition(double xcord){
        this.mallet.setXPosition(xcord);
    }

    //

    /**
    * Returning the X and Y velocity of the Mallets
    * Setting the x and Y velocity of the Mallets
    *
    * @param Xvelocity The current X velocity stored
    * @param Yvelocity The current X velocity stored
    */
    public void setXvelocity (double Xvelocity){
        this.Xvelocity = Xvelocity;
    }

    public double getXvelocity (){
        return this.Xvelocity;
    }

    public void setYvelocity (double Yvelocity){
        this.Yvelocity = Yvelocity;
    }

    public double getYvelocity (){
        return Yvelocity;
    }




}

