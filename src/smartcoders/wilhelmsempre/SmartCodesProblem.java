package smartcoders.wilhelmsempre;

import smartcoders.wilhelmsempre.equations.FirstEquation;
import smartcoders.wilhelmsempre.equations.SecondEquation;
import smartcoders.wilhelmsempre.equations.ThirdEquation;

public class SmartCodesProblem
{
    public static void main(String[] args)
    {
        double x = 42;
        double y = 24;

        EquationSolver equationSolver = new EquationSolver();

        equationSolver.addEquation(new FirstEquation(x, y));
        equationSolver.addEquation(new SecondEquation(x, y));
        equationSolver.addEquation(new ThirdEquation(x, y));

        equationSolver.solve();
    }
}
