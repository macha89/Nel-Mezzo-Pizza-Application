
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh
 */
public class Order {
    ArrayList<Pizza> PizzaList = new ArrayList<Pizza>();
    double orderCost;
    
    Order()
    {
        this.orderCost=0;
    }
    
    double getOrderCost()
    {
        this.orderCost=0;
        for(int i=0;i<PizzaList.size();i++)
            this.orderCost+=PizzaList.get(i).getCost();
        
        this.orderCost=Math.round(this.orderCost * 100D) / 100D;
        return this.orderCost;       
    }
    
    void addPizzaToOrder(Pizza p)
    {
        PizzaList.add(p);
    } 
        
    void editPizza(int index, Pizza p)
    {
        Pizza x=PizzaList.get(index);
        x.sauce=p.sauce;
        x.size=p.size;
        x.crust=p.crust;
        x.topping1=p.topping1;
        x.topping2=p.topping2;
        x.cost=x.getCost();
    }
    
    void deletePizza(int index)
    {
        PizzaList.remove(index);
    }
    
    Pizza getPizza(int index)
    {
        return PizzaList.get(index);
    }
    
    String getOrderInfo()
    {
        String s="";
        for(int i=0;i<PizzaList.size();i++)
            s+=PizzaList.get(i).getPizzaInfo();
        return s;
    }
    
    int getPizzaCount()
    {
        return PizzaList.size();
    }
    
}
        