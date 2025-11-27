package gui.sportartikel;

import business.baelle.BaelleModel;
import javafx.stage.Stage;
import ownUtil.Observer;

public class SportartikelControl implements Observer {
	
	private SportartikelView sportartikelView;
	
	private BaelleModel baelleModel;

	public SportartikelControl(Stage stage){
		this.baelleModel = baelleModel.getInstanze();
		this.sportartikelView = new SportartikelView(this, stage, 
			baelleModel);
		baelleModel.addObserver(this);
	}

	@Override
	public void update() {
		this.sportartikelView.zeigeBaelleAn();
		
	}

}
