package com.oop_cw.pase_01.controller;

import com.oop_cw.pase_01.model.Product;
import com.oop_cw.pase_01.view.ProductDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProductDisplayController {

    public ProductDisplayController() {

        ProductDisplay frame = new ProductDisplay();
        frame.setSize(900, 600);
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Westminster Shopping Center");
        frame.setLocationRelativeTo(null);
    }
}
