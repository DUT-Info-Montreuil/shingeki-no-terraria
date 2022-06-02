package jeu.model.inventaire.ressource;

import jeu.Parametre;
import jeu.model.Terrain;

public class Terre extends Ressource {

	public Terre() {
		super(6, 12);
	}

	public void poserBloc (int numeroTuilesCasser, Terrain terrain) {  // ensuite rajouter l'objet miner dans l'inventaire 
		//rajouter condition pour pas build au meme endroit
		if(terrain.getTerrain()[numeroTuilesCasser] ==0)     {
			terrain.getTerrain()[numeroTuilesCasser]=Parametre.blocHerbe; // 0 = le ciel
		}
	}
}