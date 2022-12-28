/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebookjava;

import java.io.*;

/**
 *
 * @author wacky
 */
public class Sim implements Serializable
{
    private String simCard;

    public Sim(String simCard) {
        this.simCard = simCard;
    }
    
    public boolean equals(Sim sim)
    {
        return (this.simCard.equals(sim.simCard));
    }

    public String getSimCard() {
        return simCard;
    }

    public void setSimCard(String simCard) {
        this.simCard = simCard;
    }

    
    
    
}
