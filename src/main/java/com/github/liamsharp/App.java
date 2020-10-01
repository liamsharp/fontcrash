package com.github.liamsharp;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Setting Windows look and feel");
        
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (IllegalAccessException | ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException e)
        {
            System.err.println("Unable to set system look and feel: " + e);
        }
        
        System.out.println("Getting local graphics environment");
        final GraphicsEnvironment localGraphicsEnvironment = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        System.out.println("Getting all fonts");
        final Font[] fonts = localGraphicsEnvironment.getAllFonts();
        System.out.println("Logging " + fonts.length + " fonts");
        for (Font font : fonts)
        {
            System.out.println(font);
        }
        System.out.println("done");

        System.out.println("Creating JLabel");
        JLabel jLabel  = new JLabel();
        System.out.println("done " + jLabel);
        
        System.out.println("Creating Canvas");
        Canvas canvas = new Canvas();
        System.out.println("done" + canvas);
    }
}
