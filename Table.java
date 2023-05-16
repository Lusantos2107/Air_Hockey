public class Table {
    
    //Construction of the Table 

    //The two WHITE boxes + the line that divides them
    private Rectangle left = new Rectangle(0, 0, 500, 500, "WHITE"); 
    private Rectangle right = new Rectangle(0, 0, 500, 500, "WHITE");

    private Line middle = new Line(0, 0, 0, 0, 5, "BLUE");

    //The middle of the Table using to balls to create the layout
    private Ball ball1 = new Ball(0, 0, 130, "BLUE", 1);
    private Ball ball2 = new Ball(0, 0, 120, "WHITE", 2);

    //The Boarder of the Table that does not layer over the WHITE box
    private Rectangle top = new Rectangle( 0, 0, 1040, 20, "BLUE");
    private Rectangle bottom = new Rectangle(0, 0, 1040, 20, "BLUE");
    private Rectangle side1 = new Rectangle(0, 0, 20, 500, "BLUE");
    private Rectangle side2 = new Rectangle(0, 0, 20, 500, "BLUE");

    //The Goals layered in the WHITE box
    private Rectangle goal1 = new Rectangle(0, 0, 20, 300, "GREY", 1);
    private Rectangle goal2 = new Rectangle(0, 0, 20, 300, "GREY", 1);


    public Table(double x, double y)
	{
        //Setting the X and Y positions for the Constructions of the Table where X and Y are both pre-set to 100
        left.setXPosition(x);
        left.setYPosition(y);
        right.setXPosition(x + 500);
        right.setYPosition(y);

        middle.setLinePosition(x + 500, y , x + 500, y + 500);

        ball1.setXPosition(x + 500);
        ball1.setYPosition(y + 250);
        ball2.setXPosition(x + 500);
        ball2.setYPosition(y + 250);
        
        top.setXPosition(x - 20);
        top.setYPosition(y - 20);
        bottom.setXPosition(x - 20);
        bottom.setYPosition(y + 500);
        side1.setXPosition(x - 20);
        side1.setYPosition(y);
        side2.setXPosition(x + 1000);
        side2.setYPosition(y);

        goal1.setXPosition(x);
        goal1.setYPosition(y + 100);
        goal2.setXPosition(x + 980);
        goal2.setYPosition(y + 100);
	}

    public void addtable(GameArena Arena)
    {

        //Adding the Constructions and their X and Y positions to the GameArena
        Arena.addRectangle(left);
        Arena.addRectangle(right);
        Arena.addLine(middle);
        Arena.addBall(ball1);
        Arena.addBall(ball2);
        Arena.addRectangle(top);
        Arena.addRectangle(bottom);
        Arena.addRectangle(side1);
        Arena.addRectangle(side2);
        Arena.addRectangle(goal1);
        Arena.addRectangle(goal2);
    }
}