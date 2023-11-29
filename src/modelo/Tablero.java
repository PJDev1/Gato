
package modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author El duro
 */
public class Tablero extends JPanel{
    private int anchoCI;
    private int alturaCI;
    private int margen;
    private Color colorTablero;
    private Color colorCI;
    private TipoImagen jugadorActual;
    private Jugador jugador;
    private Jugador maquina;
    
    
    private ArrayList<Cuadro> cuadros;
    
    public Tablero(){
        init();
        
    }
    private void init(){
        anchoCI = 80;
        alturaCI = 80;
        colorCI = Color.BLUE;
        colorTablero = Color.RED;
        margen= 6;
        jugador = new Jugador();
        maquina = new Jugador();
        cuadros = new ArrayList();
        jugadorActual = TipoImagen.EQUIS;
        
    }
    public void crearTablero(){
        setLayout(null);
        setSize(anchoCI*3+margen*4,alturaCI*3+margen*4);
        setBackground(colorTablero);
        crearCuadrosInternos();
    }
    private void crearCuadrosInternos(){
        int x = margen;
        int y = margen;
        for(int i=0;i<3;i++){
            x=margen;
            for(int j=0;j<3;j++){
                Cuadro cuadro = new Cuadro(anchoCI,alturaCI,colorCI);
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cuadro.setLocation(x,y);
                add(cuadro);
                cuadros.add(cuadro);
                crearEventosCuadro(cuadro);
                
                x+=(anchoCI+margen);
            }
            y+=(alturaCI+margen);
        }
    }
    
    /*public void turnoMaquina() {
    for (Cuadro cuadro : cuadros) {
        if (!cuadro.isDibujado()) {
            cuadro.setTipoImagen(TipoImagen.CIRCULO); // Suponiendo que la máquina siempre juega con círculos
            cuadro.setDibujado(true);
            cuadro.repaint();
            jugadorActual = TipoImagen.EQUIS; // Cambiar el jugador actual al usuario
            break; // Romper el bucle después de realizar un movimiento
        }
    }
    // Aquí podrías agregar lógica adicional para el comportamiento de la máquina
}*/
public void turnoMaquina() {
    Timer timer = new Timer(1000, e -> {
        // Lógica de la máquina después del retraso
        for (Cuadro cuadro : cuadros) {
            if (!cuadro.isDibujado()) {
                cuadro.setTipoImagen(TipoImagen.CIRCULO); // Suponiendo que la máquina siempre juega con círculos
                cuadro.setDibujado(true);
                cuadro.repaint();
                jugadorActual = TipoImagen.EQUIS; // Cambiar el jugador actual al usuario
                break;
            }
        }
    });
    timer.setRepeats(false);
    timer.start();
}

    
    public void crearEventosCuadro(Cuadro cuadro){
        MouseListener evento= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(cuadro.isDibujado())
                    return;
                
                if(jugadorActual == TipoImagen.EQUIS){
                    cuadro.setTipoImagen(TipoImagen.EQUIS);
                    jugadorActual=TipoImagen.CIRCULO;
                }else if(jugadorActual == TipoImagen.CIRCULO){
                    cuadro.setTipoImagen(TipoImagen.CIRCULO);
                    jugadorActual=TipoImagen.EQUIS;
                    
                }
                cuadro.setDibujado(true);
                cuadro.repaint();
                turnoMaquina();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        cuadro.addMouseListener(evento);
        
        
    }

    public TipoImagen getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(TipoImagen jugadorActual) {
        this.jugadorActual = jugadorActual;
    }
    

    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }
    
    

    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getMaquina() {
        return maquina;
    }

    public void setMaquina(Jugador maquina) {
        this.maquina = maquina;
    }
    
    
    
}
