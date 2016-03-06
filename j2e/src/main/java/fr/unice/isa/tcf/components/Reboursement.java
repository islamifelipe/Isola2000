package fr.unice.isa.tcf.components;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.unice.isa.tcf.entities.Vente;
import fr.unice.isa.tcf.interfaces.*;
import fr.unice.isa.tcf.utils.Database;

/**
 * @author islamefelipefernandes
 *
 */
@Stateless(name = "reboursement")
public class Reboursement implements ILectureRemboucement {

	@EJB(name = "vente-remboursement") private IRemboursement rembousement;
	@EJB Database memory;
	
	@Override
	public boolean efecuterRemboucement( double persentage) {
		
		if (rembousement.getVente() != null){

			memory.getVentes().remove(rembousement.getVente());
			rembousement.resultatRemboursement(true, rembousement.getVente(), persentage);
			
			return true;
		} else {
			rembousement.resultatRemboursement(false, rembousement.getVente(), 0);
			return false;
		}
	}

	@Override
	public Vente voirDetaillesVenteRemboucement() {
		return rembousement.getVente();
	}

	@Override
	public boolean refouserRemboucement() {
		rembousement.resultatRemboursement(false, rembousement.getVente(), 0);
		return false;
	}

}
