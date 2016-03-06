/**
 */
package fr.unice.isa.tcf.interfaces;

import javax.ejb.Local;

import fr.unice.isa.tcf.entities.Vente;

/**
 * @author islamefelipefernandes
 *
 */
@Local
public interface ILectureRemboucement {
	
	boolean efecuterRemboucement(double persentage); 
	Vente voirDetaillesVenteRemboucement(); // pour voir detailles de la vente qui va être ramboursser
	boolean refouserRemboucement(); 
}
