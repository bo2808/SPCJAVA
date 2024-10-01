/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class hinhchunhat extends hinhhoc {
    public hinhchunhat() {
        super();
    }
    public hinhchunhat(int dai , int rong){
        super (dai,rong);     
    }
    public double tinhchuvi() {
        return(this.getdai() + this.rong()) * 2;     
    }
    public double tinhdientich() {
        return this.getdai() * this.getrong();
    }
}
