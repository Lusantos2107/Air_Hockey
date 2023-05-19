public class Mallet {

    private Ball mallet = new Ball(0, 0, 80, "RED", 2);
    private double xcor;
    private double ycor;
    private double Xvelocity;
    private double Yvelocity;

  

	//sets the position of the mallets 
    public Mallet(double x, double y)
	{
        mallet.setXPosition(x + 250);
        mallet.setYPosition(y + 250);

    }
	//Allows for the movement of the mallets 
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


    //Returning the X and Y position of the Mallets
    //Setting the X and Y cords of the Mallets
    public double getYPosition(){
        return this.ycor;
    }

    public void setYPosition(double ycord){
        this.ycor = ycord;
    }

    public double getXPosition(){
        return this.xcor;
    }

    public void setXPosition(double xcord){
        this.xcor = xcord;
    }

    //Returning the X and Y velocity of the Mallets
    //Setting the x and Y velocity of the Mallets
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

