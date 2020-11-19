import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {

        BanqueWS stubWS = new BanqueService().getBanqueWSPort();
        System.out.println("conversion de 300€ en francs " + stubWS.conversion(300.0));
        Compte cp = stubWS.getCompte(2L);
        System.out.println(cp.getSolde());

        List<Compte> comptes = stubWS.listeComptes();
        System.out.println("Liste des comptes :");
        comptes.forEach( cpte -> {
            System.out.println("--------------------");
            System.out.println("compte n° " + cpte.getId());
            System.out.println("solde : " + cpte.getSolde());
        });

    }

}



