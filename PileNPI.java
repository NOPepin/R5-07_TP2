/**
 * PileNPI
 */
import java.util.Stack;
public class PileNPI 
{
    private Stack pile;

    public PileNPI()
    {
        this.pile = new Stack<Double>();
    }

    public void empiler(String s)
    {
        this.pile.push(Double.parseDouble(s));
    }

    public double depiler()
    {
        if(this.pile.size() != 0)
        {
            return NAN;
        }
        
        return this.pile.pop();
    }
}