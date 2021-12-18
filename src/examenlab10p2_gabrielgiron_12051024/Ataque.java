/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p2_gabrielgiron_12051024;

import java.util.Random;

/**
 *
 * @author Galex
 */
public class Ataque extends Carros{
    Random R = new Random();
    int Bonus = 4+R.nextInt(11);
    Double BonusAtk = 0.00;
    Double Valor;
    
    public Ataque(String Nombre, int Velocidad, int Derrape, double Ataque, double Vida) {
        super(Nombre, Velocidad, Derrape, Ataque, Vida);
        Valor = Ataque;
        setBonus();
        Ataque = Ataque + BonusAtk;
        System.out.println(Ataque);
    }
    
    private void setBonus()
    {
        switch(Bonus)
        {
            case 5:
            {
                BonusAtk = Valor*0.50;
                break;
            }
            case 6:
            {
                BonusAtk = Valor * 0.60;
                break;
            }
            case 7:
            {
                BonusAtk = Valor * 0.70;
                break;
            }
            case 8:
            {
                BonusAtk = Valor * 0.80;
                break;
            }
            case 9:
            {
                BonusAtk = Valor * 0.90;
                break;
            }
            case 10:
            {
                BonusAtk = Valor;
                break;
            }
        }
    }
}
