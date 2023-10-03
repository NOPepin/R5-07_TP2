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

    public void empiler(Double n)
    {
        this.pile.push(n);
    }

    public double depiler()
    {
        if(this.pile.size() != 0)
        {
            return NAN;
        }
        
        return this.pile.pop();
    }

    public String toString()
    {
        return Double.toString(this.pile.peek());
    }
}