package smartcoders.wilhelmsempre.equations;

import smartcoders.wilhelmsempre.EquationInterface;

/**
 * sqrt(x+7) * 12 + y^2 - 4
 */
public class ThirdEquation implements EquationInterface {

    double x;
    double y;

    public ThirdEquation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double solve() {
        return Math.sqrt((x + 7)) * 12 + Math.pow(y, 2) - 4;
    }
}
