package smartcoders.wilhelmsempre;

import java.util.ArrayList;
import java.util.List;

public class EquationSolver
{
    private List<EquationInterface> equations = new ArrayList<>();

    public void addEquation(EquationInterface equation)
    {
        this.equations.add(equation);
    }

    public void removeEquation(EquationInterface equation)
    {
        if (this.equations.contains(equation)) {
            this.equations.remove(equation);
        }
    }

    public void solve()
    {
        for (EquationInterface equation : this.equations) {
            double result = equation.solve();

            System.out.println(result);
        }
    }
}
