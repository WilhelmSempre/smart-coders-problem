package smartcoders.wilhelmsempre.equations;

import smartcoders.wilhelmsempre.EquationInterface;

/**
 * y^2 - 16^2 + 3
 */
public class SecondEquation implements EquationInterface {

    double x;
    double y;

    public SecondEquation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double solve() {
        return Math.pow(this.y, 2) - Math.pow(16, 2) + 3;
    }
}
