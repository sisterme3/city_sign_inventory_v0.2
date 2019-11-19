package sample;

import javafx.stage.Stage;

public class Button_Action extends Scene_changer{


    public void AddAction(Stage s){
        s.setScene(AddScene());

    }

    public void ReserveAction(Stage s){
        s.setScene(ReserveScene());

    }

    public void ReportAction(Stage s){
        s.setScene(ReportScene());

    }

    public void RecommendationAction(Stage s){
     s.setScene(RecommendationScene());

    }

    public void InventoryAction(Stage s){
     s.setScene(InventoryScene());
    }

    public void BackAction(Stage s){
        //s.setScene(s.setScene();)

    }



}
