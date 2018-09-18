/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qca.generator;
import qca.generator.Plan;
/**
 *
 * @author Gabriel Soares
 */
public class Cell {
    private int x, y;
    private String id;
    private boolean onMap;
    private int dots;
    private String type;
    private int clockZone;
    public final static String[] validTypes = {
        Cell.fixed,
        Cell.input,
        Cell.output,
        Cell.normal
    };
    public final static String fixed = "FIXED";
    public final static String input = "INPUT";
    public final static String output = "OUTPUT";
    public final static String normal = "NORMAL";
    
    public Cell(int x, int y, String type){
        this.x = x;
        this.y = y;
        this.onMap = false;
        this.dots = 4;
        this.type = type;
    }
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.onMap = false;
        this.dots = 4;
        this.type = Cell.normal;
    }
    public void setX (int coord_x){
        this.x = coord_x;
    }
    public void setY (int coord_y){
        this.y = coord_y;
    }
    public void setId (String cell_id){
        this.id = cell_id;
    }
    public void setOnMap (boolean state){
        this.onMap = state;
    }
    public void setClockZone(int clockZone){
        this.clockZone = clockZone;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    boolean placeCell ( Plan plan){
        if (plan.getSpaces(plan, this.x, this.y)){
            System.out.println("Falha! Espaço ocupado!");
            return false;
        }else{
            this.setOnMap(true);
            plan.putCell(this, this.x, this.y);
            return true;
        }
    }
}
    