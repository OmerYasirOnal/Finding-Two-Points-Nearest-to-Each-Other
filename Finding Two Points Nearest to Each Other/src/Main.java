public class Main {
    public static void main(String[] args) {

        double[][] coordinat = {
                //Creating points.
                {(-1), 3},
                {(-1), (-1)},
                {1, 1},
                {2, (0.5)},
                {2, (-1)},
                {3, 3},
                {4, 2},
                {4, (-0.5)},
        };
        smallestDistance(coordinat);
        //We print the method we created below.
    }

    public static void smallestDistance(double[][] coordinat) {

        double[] firstPoint = new double[2];
        double[] secondPoint = new double[2];

        double pythagorasTheorem = 0;
        double distance = Math.sqrt(Math.pow(((coordinat[0][0]) - (coordinat[1][0])), 2)
                + Math.pow(((coordinat[0][1]) - (coordinat[1][1])), 2));
        //We should be determinate a starting value to compare.

        for (int row = 0; row < coordinat.length; row++) {
            for (int row1 = 1; row1 < coordinat.length; row1++) {
                //Square root formula( (x{2} - x{1})^{2} + (y{2}-y{1})^{2})
                pythagorasTheorem = Math.sqrt(Math.pow(((coordinat[row][0]) - (coordinat[row1][0])), 2)
                        + Math.pow(((coordinat[row][1]) - (coordinat[row1][1])), 2));

                if (pythagorasTheorem < distance && pythagorasTheorem != 0) {
                    //We are comparing the values on our determined value
                    distance = pythagorasTheorem;
                    firstPoint[0] = coordinat[row][0];
                    firstPoint[1] = coordinat[row][1];
                    secondPoint[0] = coordinat[row1][0];
                    secondPoint[1] = coordinat[row1][1];
                }

            }
        }

        System.out.println("first point: " + "[" + firstPoint[0] + "," + firstPoint[1] + "]" +
                " second point: " + "[" + secondPoint[0] + "," + secondPoint[1] + "]" + " distance = " + distance);
    }
}