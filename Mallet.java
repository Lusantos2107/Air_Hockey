public class Mallet {


    private Ball mallet1 = new Ball(0, 0, 80, "RED", 1);
    private Ball mallet2 = new Ball(0, 0, 80, "RED", 1);


    public Mallet(double x, double y)
	{
        mallet1.setXPosition(x + 250);
        mallet1.setYPosition(y + 250);

        mallet2.setXPosition(x + 750);
        mallet2.setYPosition(y + 250);

    }
    public void move(double dx, double dy)
	{
		mallet1.setXPosition(50);
		mallet1.setYPosition(50);
	}

    //public void keyPressed(KeyEvent e)
	//{
	//	keyAction(e,true);
	//}

	//public void keyAction(KeyEvent e,boolean yn)
	//{
	//	int code = e.getKeyCode();

	//	if (code == KeyEvent.VK_UP)
	//		up = yn;
	//	if (code == KeyEvent.VK_DOWN)
	//		down = yn;
	//	if (code == KeyEvent.VK_LEFT)
	//		left = yn;
	//	if (code == KeyEvent.VK_RIGHT)
	//		right = yn;
	//	if (code == KeyEvent.VK_SPACE)
	//		space = yn;
	//	if (code == KeyEvent.VK_SHIFT)
	//		shift = yn;
	//	if (code == KeyEvent.VK_ESCAPE)
	//		esc = yn;
	//	if (code == KeyEvent.VK_ENTER)
	//		enter = yn;
	//	//ASCII A-Z check
	//	if (isAsciiAZ(code))
	//		alphasPressed[code-asciiAZOffset] = yn;
	//}

	//public void keyReleased(KeyEvent e){
	//	keyAction(e,false);
	//}
    

    

    public void addmallet(GameArena Arena)
    {
        Arena.addBall(mallet1);
        Arena.addBall(mallet2);

    }

}
