package gui;

import business.Freizeitbad;
import business.FreizeitbaederModel;
import javafx.stage.Stage;
import ownUtil.PlausiException;

public class FreizeitbaederControl {
	FreizeitbaederModel model; 
	FreizeitbaederView view; 
	
	public FreizeitbaederControl(Stage primaryStage) {
		this.model = new FreizeitbaederModel();
		this.view = new FreizeitbaederView(model, this, primaryStage);
	}
	
	public void nehmeFreizeitbadAuf(){
    	try{
    		model.setFreizeitbad(new Freizeitbad(
    				view.getTxtName().getText(),
    				view.getTxtGeoeffnetVon().getText(),
    				view.getTxtGeoeffnetBis().getText(),
    				view.getTxtBeckenlaenge().getText(),
    				view.getTxtWassTemperatur().getText()
    				));
    		
    		view.zeigeInformationsfensterAn("Das Freizeitbad wurde aufgenommen!");
       	}
       	catch(PlausiException exc){
       		view.zeigeFehlermeldungsfensterAn(exc.getPlausiTyp() + "er ", exc.getMessage());
     	}
    }
}
