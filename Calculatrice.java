/**
 * Calculatrice
 */
public class Calculatrice 
{
    private PileNPI maPile;

    public Calculatrice(PileNPI pile)
    {
        this.maPile = pile;
    }

    public void lecture(String s)
    {
        double valeur = NAN;
        try
        {
            valeur = Double.parseDouble(s);
        } 
        catch (NumberFormatException e) {}

        if(Double.isNaN(valeur))
        {
			// on a une opération
			switch (s) {
				case "+":
					addition();
				break;

				case "-":
					soustraction();
				break;

				case "*":
					multiplication();
				break;

				case "=":
					resultat();
				break;

				case "P":
					System.out.println(this.maPile);
				break;
			
				default:
					System.out.println("opération inconnue");
				break;
			}
        }
		else
		{
			// on a un nombre
			this.maPile.empiler(valeur);
		}
    }

	private addition()
	{

	}
}