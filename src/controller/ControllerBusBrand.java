package controller;

import model.bo.Brand;
import service.BrandService;
import view.TelaBusBrand;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBusBrand implements ActionListener {

    TelaBusBrand searchScreen;
    BrandService service = new BrandService();
    DefaultTableModel table;

    public ControllerBusBrand(TelaBusBrand searchScreen) {
        addListeners(searchScreen);
        this.table = (DefaultTableModel) this.searchScreen.getjTable1().getModel();
        fillData();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.searchScreen.getjButtonCarregar()) {
            ControllerCadBrand.code =
                    (int) this.searchScreen.getjTable1().getValueAt(this.searchScreen.getjTable1().getSelectedRow(), 0);
            this.searchScreen.dispose();
        } else if (e.getSource() == this.searchScreen.getjButtonSair()) {
            this.searchScreen.dispose();
        }
    }

    public void addListeners(TelaBusBrand searchScreen) {
        this.searchScreen = searchScreen;
        searchScreen.getjButtonCarregar().addActionListener(this);
        searchScreen.getjButtonSair().addActionListener(this);
    }

    public void fillData() {
        for (Brand model : this.service.buscar()) {
            this.table.addRow(new Object[]{
                    model.getId(),
                    model.getDescription(),
            });
        }
    }
}