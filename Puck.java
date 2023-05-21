public class Puck {

   //instance variables for Puck
    private Ball puck = new Ball(0, 0, 30, "RED", 2);
    private double xcor;
    private double ycor;
    private double Xvelocity;
    private double Yvelocity;

    
   //sets the position of the Puck
   public Puck(double x, double y)
	 {
        puck.setXPosition(x);
        puck.setYPosition(y);
    }

   //Adds puck (ball) to GameArena
   public void addpuck(GameArena Arena)
    {
        Arena.addBall(puck);
    }

   //Allows for the movement of the Puck
   public void move(double dx, double dy)
    {
         this.xcor += dx;
         this.ycor += dy;
         puck.move(dx, dy);
    }


   //Returning the X and Y position of the Puck
   //Setting the X and Y cords of the Puck
   public double getYPosition(){
      return this.ycor;
   }

   public void setYPosition (double ycord){
      this.ycor = ycord;
   }

   public double getXPosition(){
      return this.xcor;
   }   
    
   public void setXPosition (double xcord){
      this.xcor = xcord;
   }


   //Returning the X and Y velocity of the Puck
   //Setting the x and Y velocity of the Puck
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
      return this.Yvelocity;
   }

   public boolean collidesCheck(Mallet mallet){

      if (puck.collides(mallet.getMallet()) == true){
         return true;
      }

      else{
         return false;
      }
   }

   
 // The position and speed of each of the two balls in the x and y axis before collision.
  // YOU NEED TO FILL THESE VALUES IN AS APPROPRIATE...
public double[] deflect(Mallet mallet){

   double xPosition1 = mallet.getXPosition(); 
   double yPosition1 = mallet.getYPosition();
   double xSpeed1 = mallet.getXvelocity();
   double ySpeed1 = mallet.getYvelocity();

   double xPosition2 = puck.getXPosition(); 
   double yPosition2 = puck.getYPosition();
   double xSpeed2 = Xvelocity;
   double ySpeed2 = Yvelocity;
 



 // Calculate initial momentum of the balls... We assume unit mass here.
    double p1InitialMomentum = Math.sqrt(xSpeed1 * xSpeed1 + ySpeed1 * ySpeed1);
    double p2InitialMomentum = Math.sqrt(xSpeed2 * xSpeed2 + ySpeed2 * ySpeed2);
 // calculate motion vectors
    double[] p1Trajectory = {xSpeed1, ySpeed1};
    double[] p2Trajectory = {xSpeed2, ySpeed2};
 // Calculate Impact Vector
    double[] impactVector = {xPosition2 - xPosition1, yPosition2 - yPosition1};
    double[] impactVectorNorm = normalizeVector(impactVector);
 // Calculate scalar product of each trajectory and impact vector
    double p1dotImpact = Math.abs(p1Trajectory[0] * impactVectorNorm[0] + p1Trajectory[1] * impactVectorNorm[1]);
    double p2dotImpact = Math.abs(p2Trajectory[0] * impactVectorNorm[0] + p2Trajectory[1] * impactVectorNorm[1]);
 // Calculate the deflection vectors - the amount of energy transferred from one ball to the other in each axis
    double[] p1Deflect = { -impactVectorNorm[0] * p2dotImpact, -impactVectorNorm[1] * p2dotImpact };
    double[] p2Deflect = { impactVectorNorm[0] * p1dotImpact, impactVectorNorm[1] * p1dotImpact };
 // Calculate the final trajectories
    double[] p1FinalTrajectory = {p1Trajectory[0] + p1Deflect[0] - p2Deflect[0], p1Trajectory[1] + p1Deflect[1] - p2Deflect[1]};
    double[] p2FinalTrajectory = {p2Trajectory[0] + p2Deflect[0] - p1Deflect[0], p2Trajectory[1] + p2Deflect[1] - p1Deflect[1]};
 // Calculate the final energy in the system.
    double p1FinalMomentum = Math.sqrt(p1FinalTrajectory[0] * p1FinalTrajectory[0] + p1FinalTrajectory[1] * p1FinalTrajectory[1]);
    double p2FinalMomentum = Math.sqrt(p2FinalTrajectory[0] * p2FinalTrajectory[0] + p2FinalTrajectory[1] * p2FinalTrajectory[1]);

  //Scale the resultant trajectories if we've accidentally broken the laws of physics.
    double mag = (p1InitialMomentum + p2InitialMomentum) / (p1FinalMomentum + p2FinalMomentum);
  //Calculate the final x and y speed settings for the two balls after collision.
    xSpeed1 = p1FinalTrajectory[0] * mag;
    ySpeed1 = p1FinalTrajectory[1] * mag;
    xSpeed2 = p2FinalTrajectory[0] * mag;
    ySpeed2 = p2FinalTrajectory[1] * mag;

    double [] velocity = {xSpeed2 , ySpeed2};
    return velocity;

 //return p2FinalTrajectory;
 }
 /**
 * Converts a vector into a unit vector.
 * Used by the deflect() method to calculate the resultant direction after a collision.
 */
 private double[] normalizeVector(double[] vec)
 {
   double mag = 0.0;
   int dimensions = vec.length;
   double[] result = new double[dimensions];
for (int i=0; i < dimensions; i++)
   mag += vec[i] * vec[i];
   mag = Math.sqrt(mag);
 if (mag == 0.0)
 {
   result[0] = 1.0;
 for (int i=1; i < dimensions; i++)
 result[i] = 0.0;
 }
 else{
   for (int i=0; i < dimensions; i++)
   result[i] = vec[i] / mag;
 }
 return result;
}

}
