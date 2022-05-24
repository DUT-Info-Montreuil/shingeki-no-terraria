
package jeu.model;

import java.util.ArrayList;

import jeu.Parametre;
import jeu.controleur.MouseClick;
import jeu.controleur.MouseMoved;

public class Heros extends Personnage{

	private MouseMoved sourisCoordonn�es;
	private Terrain terrain;
	//changer le type terrain en type environnement
	public Heros(int x, int y, Terrain terrain) {
		super(x, y, 5, 9, terrain);
	}

	@Override
	public void seDeplace(Parametre.DIRECTION d) {
		switch(d) {
		case LEFT:
			this.CoordonneeXProperty().setValue(CoordonneeXProperty().getValue() - 6);
			break;

		case RIGHT:
			this.CoordonneeXProperty().setValue(CoordonneeXProperty().getValue() + 6);
			break;

		default:
			System.out.println("Entrée incorrecte");
			break;
		}
	}

	private int clamp (int val1 , int min, int max) {  // Pour borner un chiffre entre 2valeur pour pas que l'image s'enleve
		int valeurClamp = val1;
		
		if(valeurClamp<min) {
			valeurClamp = min;
		}
		else if(valeurClamp>max) {
			valeurClamp= max;
		}
		return valeurClamp;
	}
	
	@Override
	public void perdrePv() { // en option mettre le nb de pv perdu en param�tre
			
			int pv = clamp(this.PvProperty().getValue()-1, 0, 9);
			this.PvProperty().setValue(pv);  // -1 pour le h�ros 
		}
	

	@Override
	public void augmenterPv() { // en option mettre le nb de pv augmenter en param�tre

			int pv = clamp(this.PvProperty().getValue()+1, 0, 9);	
			this.PvProperty().setValue(pv);  // -1 pour le h�ros 
	}

	public void miner (int num�roTuilesCasser, Terrain terrain) {  // ensuite rajouter l'objet miner dans l'inventaire 
		System.out.println("minage" + num�roTuilesCasser);
		System.out.println("Affichage du terrain"+terrain.getTerrain());
		terrain.affichertableau(terrain);
		
				terrain.changerTuiles(num�roTuilesCasser);
				System.out.println("C'est cass� Yes");			
				terrain.affichertableau(terrain);
			}

//		public void construire(Terrain terrain) {
//			
//		}
		}
//}
	//}
//	public boolean estMort(int pv) { // a finir
//			boolean estMort = false;
//			
//			if(pv==0) {
//				estMort =true;
//			}
//			return estMort;
//			
//	}
	
	
	
	


