package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author el duro
 */
public class Cuadro extends JPanel{
    private int altura;
    private int ancho;
    private Color color;
    private TipoImagen tipoImagen;
    private boolean dibujado;
    
    public Cuadro(int ancho, int altura, Color color){
        this.altura = altura;
        this.ancho = ancho;
        this.color = color;
        dibujado = false;
        init();
    }
    private void init(){
        setSize(ancho, altura);
        setBackground(color);
        
    }
    
    @Override
    protected void paintComponent(Graphics gg){
        super.paintComponent(gg);
        Graphics2D g =(Graphics2D)gg;
        
        ImageIcon imagen  = new ImageIcon();
        if(tipoImagen == TipoImagen.CIRCULO)
            imagen= new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if(tipoImagen == TipoImagen.EQUIS)
            imagen= new ImageIcon(getClass().getResource(Ruta.EQUIS));
        g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(TipoImagen tipoImgen) {
        this.tipoImagen = tipoImgen;
    }

    public boolean isDibujado() {
        return dibujado;
    }

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }
    
    
    
   
    
    
    
}
