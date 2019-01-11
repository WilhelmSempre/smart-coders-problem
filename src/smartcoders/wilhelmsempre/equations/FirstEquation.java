package smartcoders.wilhelmsempre.equations;

import smartcoders.wilhelmsempre.EquationInterface;

/**
 * y^2 - x - 29
 */
public class FirstEquation implements EquationInterface {

    double x;
    double y;

    public FirstEquation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double solve() {
        return Math.pow(this.y, 2) - x - 29;
    }
}
