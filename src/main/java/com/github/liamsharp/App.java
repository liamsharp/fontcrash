package com.github.liamsharp;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Logging fonts:");
        
        final Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        for (Font font : fonts)
        {
            System.out.println(font);
        }
        System.out.println("done");
        
    }
}
