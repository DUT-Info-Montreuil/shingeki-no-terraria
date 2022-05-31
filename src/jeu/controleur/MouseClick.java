package jeu.controleur;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import jeu.Parametre;
import jeu.model.Heros;
import jeu.model.Terrain;
import jeu.model.inventaire.arme.Pelle;
import jeu.vue.TerrainVue;

public class MouseClick implements EventHandler<MouseEvent> {

	private Heros eren;
	public Terrain terrain;
	public TerrainVue terrainVue;
	public Pelle pelle;
	public static int tailleTuile = 32;
	public static int tailleMapLongueur = 40;  // nombre de tuiles dans une ligne

	public MouseClick(Heros eren, Terrain terrain, TerrainVue terrainVue) {
		this.eren = eren;
		this.terrain = terrain;
		this.terrainVue = terrainVue;
		this.pelle = new Pelle();
	}

	@Override
	public void handle(MouseEvent arg0) {
		int x = (int)arg0.getX()/tailleTuile;
		int y = (int)arg0.getY()/tailleTuile;


		int positionTuileDansTableau;
		System.out.println("\nAffichage X " + x+ " Affichage Y "+ y);
		positionTuileDansTableau = (y * tailleMapLongueur  ) + x;

		int obj = this.eren.getObjetHeros().getIdObjet();
		
		switch (obj) {

		case 0: 

			break;
		case 3:
			pelle.creuser(positionTuileDansTableau,terrain);
			terrainVue.changementTuileMinage(positionTuileDansTableau,terrain,Parametre.changementDuBlocCasserPelle); // changer et faire une fonction qui actualise juste l'image chang�
			System.out.println("\n positionTuileDansTableau " + positionTuileDansTableau);

		}

		}

	}




