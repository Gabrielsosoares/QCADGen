/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qca.generator;
/**
 *
 * @author Gabriel Soares
 */
public class Plan {
    private int height;
    private int width;
    private int numberOfSpaces;
    private boolean spaces[][];
    private Cell cells[];
    private static int numberOfCells;
    public Plan(int height, int width){
        this.height = height;
        this.width = width;
        this.numberOfSpaces = height*width;
        this.spaces = new boolean[height][width];
        this.cells = new Cell[numberOfSpaces];
        this.numberOfCells = 0;
    }
    public boolean getSpaces (Plan plan, int x, int y){
        return plan.spaces[x][y];
    }

    public void putCell (Cell cell, int x, int y){
        this.cells[this.numberOfCells] = cell;
        this.spaces[x][y] = true;
        this.numberOfCells++;
    }
    public void showPlan(){
        
    }
}
