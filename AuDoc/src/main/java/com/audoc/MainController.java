/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audoc;

import com.audoc.model.Functions;
import com.audoc.view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Buy
 */
public class MainController implements ActionListener{
    
    private final Functions manage;
    private final MainFrame mainFrame;

    public MainController(Functions manage, MainFrame mainFrame) {
        this.manage = manage;
        this.mainFrame = mainFrame;
    }
    
    public static  void main(String[] args){
        MainFrame frame = MainFrame.startFrame();
        MainController controller  = new MainController(new Functions(), frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mainFrame.getButtonAddSeanses()){
            addSeanse();
        }else if(e.getSource()==mainFrame.getButtonRemove()){
            removeSeanse();
        }
    }

    private void removeSeanse() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addSeanse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
