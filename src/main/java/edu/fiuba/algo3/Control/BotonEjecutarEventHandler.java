package edu.fiuba.algo3.Control;

import edu.fiuba.algo3.Vista.PanelDibujo;
import edu.fiuba.algo3.modelo.TableroAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonEjecutarEventHandler implements EventHandler<ActionEvent> {
    private TableroAlgoritmo armadorAlgoritmo;
    private PanelDibujo panelDibujo;
    public BotonEjecutarEventHandler(TableroAlgoritmo armadorAlgoritmo, PanelDibujo panelDibujo) {
        this.armadorAlgoritmo = armadorAlgoritmo;
        this.panelDibujo = panelDibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        panelDibujo.resetear();
        armadorAlgoritmo.ejecutarAlgoritmo();
        panelDibujo.dibujarAlgoritmo();
        }
}
