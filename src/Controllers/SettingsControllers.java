package Controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import programacionmensual.SystemView;

public class SettingsControllers implements MouseListener{
    private SystemView views;
    
    public SettingsControllers(SystemView view){
        this.views = view;
        this.views.jLabelAgregar.addMouseListener(this);
        this.views.jLabelIntegrantes.addMouseListener(this);
        this.views.jLabelProgramacion.addMouseListener(this);
        this.views.jLabelRestricciones.addMouseListener(this);
        this.views.jLabelDevocionales.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }   

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == views.jLabelAgregar){
            views.jPanelAgregar.setBackground(new Color(106,107,112));
        }else if(e.getSource() == views.jLabelIntegrantes){
            views.jPanelIntegrantes.setBackground(new Color(106,107,112));
        }else if(e.getSource() == views.jLabelProgramacion){
            views.jPanelProgramacion.setBackground(new Color(106,107,112));
        }else if(e.getSource() == views.jLabelRestricciones){
            views.jPanelRestricciones.setBackground(new Color(106,107,112));
        }else if(e.getSource() == views.jLabelDevocionales){
            views.jPanelDevocionales.setBackground(new Color(106,107,112));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == views.jLabelAgregar){
            views.jPanelAgregar.setBackground(new Color(75,76,82));
        }else if(e.getSource() == views.jLabelIntegrantes){
            views.jPanelIntegrantes.setBackground(new Color(75,76,82));
        }else if(e.getSource() == views.jLabelProgramacion){
            views.jPanelProgramacion.setBackground(new Color(75,76,82));
        }else if(e.getSource() == views.jLabelRestricciones){
            views.jPanelRestricciones.setBackground(new Color(75,76,82));
        }else if(e.getSource() == views.jLabelDevocionales){
            views.jPanelDevocionales.setBackground(new Color(75,76,82));
        }
    }
    
}
