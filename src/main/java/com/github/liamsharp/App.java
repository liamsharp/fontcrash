package com.github.liamsharp;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class App 
{
    public static void main( String[] args )
    {
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
        
    }
}
