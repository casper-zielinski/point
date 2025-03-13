package at.fhj.msd;

public class Point {
      private double x;
      private double y;

    
      public Point(double x, double y)
      {
            this.x = x;
            this.y = y;
      }

      public Point()
      {
            this.x = 0;
            this.y = 0;
      }

      public double distancefromzero()
      {
            return Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
      }

      public double getX()
      {
            return this.x;
      }

      public double getY()
      {
            return this.y;
      }

      public double distanceMax(Point point)
      {
            double a = point.getX() - this.x;

            if (a < 0)
            {
                  a = a * (-1);
            }

            double b = point.getY() - this.y;

            if (b < 0)
            {
                  b = b * (-1);
            }

            return Double.max(a, b);
            
      }

      public double distanceNorm1 (Point point)
      {
            double a = point.getX() - this.x;
            double b = point.getY() - this.y;

            if (a < 0)
            {
                  a = a * (-1);
            }

            if (b < 0)
            {
                  b = b * (-1);
            }

            return a + b;
     
      }

      public double distanceNorm2(Point point)
      {
            double a = point.getX() - this.x;
            double b = point.getY() - this.y;
            return  Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

      }
}
