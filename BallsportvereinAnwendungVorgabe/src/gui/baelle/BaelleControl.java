package gui.baelle;

import business.baelle.*;
import javafx.stage.Stage;
import ownUtil.Observer;

public class BaelleControl implements Observer {
	
	private BaelleView baelleView;
	private BaelleModel baelleModel;

	public BaelleControl(Stage primaryStage){
		this.baelleModel = baelleModel.getInstanze();
		this.baelleView = new BaelleView(this, primaryStage, 
			baelleModel);
		baelleModel.addObserver(this);
	}
	
	void leseBaelleAusDatei(){
	   	try{
   			baelleModel.leseBaelleAusDatei();
   			baelleView.zeigeInformationsfensterAn(
   				"Die B�lle wurden gelesen!");
	    } 
		catch(Exception exc){
			baelleView.zeigeFehlermeldungsfensterAn("",
				"Unbekannter Fehler beim Lesen!");
		}
    }

	@Override
	public void update() {
		this.baelleView.fuelleComboBoxEinkaufsdatum();
	}

}
