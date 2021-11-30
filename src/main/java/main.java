
public class main
{

    public static void main(String[] args)
    {
        Remorque maRemorque = new Remorque(11);
        System.out.println("Le poids de ma remorque est:");
        System.out.println(maRemorque.getPoids());
        System.out.println("tonnes");


        Tracteur monTracteur = new Tracteur(8);
        System.out.println("Le poids de mon tracteur est:");
        System.out.println(monTracteur.getPoids());
        System.out.println("tonnes");


        CamionComposite semiRemorque = new CamionComposite();
        semiRemorque.add(maRemorque);
        semiRemorque.add(monTracteur);
        System.out.println("Le poids de mon semi-remorque est:");
        System.out.println(semiRemorque.getPoids());
        System.out.println("tonnes");
    }
}
