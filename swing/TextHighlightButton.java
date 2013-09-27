/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acherons.eos.core;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Bobby
 */
public class TextHighlightButton extends JButton
{
    private Color defaultColor;
    private Color highlightColor;
    private Color clickColor;
    private boolean hasClickColor;
    
    public TextHighlightButton(String text,Color defaultColor,Color highlightColor)
    {
         super(text);
         super.setContentAreaFilled(false);
         setOpaque(false);
         setFocusPainted(false);
        this.defaultColor=defaultColor;
        this.highlightColor=highlightColor;
        hasClickColor=false;
        setBorder(null);
    }
    
    public TextHighlightButton (String text,Color defaultColor,Color highlightColor, Color clickColor)
    {
        super(text);
         super.setContentAreaFilled(false);
         setOpaque(false);
         setFocusPainted(false);
        this.defaultColor=defaultColor;
        this.highlightColor=highlightColor;
        this.clickColor=clickColor;
        hasClickColor=true;
        setBorder(null);
    }
    
    
        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) 
            {
               if(hasClickColor)
                   this.setForeground(clickColor);
               else
                 this.setForeground(highlightColor);
            } 
            else if (getModel().isRollover()) 
            {
               this.setForeground(highlightColor);
            }
            else 
            {
               this.setForeground(defaultColor);
            }
            super.paintComponent(g);
        }
    }



