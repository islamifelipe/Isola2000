package fr.unice.isa.tcf.interfaces;


import fr.unice.isa.tcf.entities.Usager;
import fr.unice.isa.tcf.entities.forfaits.Forfait;

public interface ICommande {


    Usager getClient();

    Forfait getForfait();

    int getQuantity();
}
