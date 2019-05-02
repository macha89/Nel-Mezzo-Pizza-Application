/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh
 */

public class Pizza {
    int size,crust,sauce,topping1,topping2;
    double cost;
    
    public double[][] costlist = {
        {9.45,11.87,15.90},
        {1.08,1.10,2.14},
        {0.00,0.50},
        {0.00,0.08,0.02,0.06,0.10,0.03,0.05,0.20,0.07,0.09}
    };
    
    public String[][] typelist = {
        {"SMALL","MEDIUM","LARGE"},
        {"THIN", "DEEP","STUFFED"},
        {"TOMATO","PESTO"},
        {"NONE","OLIVES","EXTRA CHEESE","CHILLI","PEPPERONI","MUSHROOM","ROCKET","JALAPENOS","ONION","ANCHOVY"}
    };
    
    Pizza()
    {
        this.size=0;
        this.crust=0;
        this.sauce=0;
        this.topping1=0;
        this.topping2=0;
        this.cost=0;
    }
    
    public Integer getSizeIndex()    //[0][]
    {
        return(this.size);
    }
    
    public Integer getCrustIndex()   //[1][]
    {
        return(this.crust);
    }
    
    public Integer getSauceIndex()   //[2][]
    {
        return(this.sauce);
    }
    
    public Integer getTopping1Index()    //[3][]
    {
        return(this.topping1);
    }
    
    public Integer getTopping2Index()    //[4][]
    {
        return(this.topping2);
    }
        
    public double getCost()
    {
        this.cost=(costlist[0][this.getSizeIndex()]+costlist[1][this.getCrustIndex()]+costlist[2][this.getSauceIndex()])+(5*+costlist[3][this.getTopping1Index()])+(4*+costlist[3][this.getTopping2Index()]);      
        return Math.round(this.cost * 100D) / 100D;
    }
    
    public String getPizzaInfo()
    {
        String s="";
        double d=this.getCost();
        int sizeIndex=this.getSizeIndex(),crustIndex=this.getCrustIndex(),sauceIndex=this.getSauceIndex(),t1Index=this.getTopping1Index(),t2Index=this.getTopping2Index();
        s+="  TOTAL COST : £"+d+"\n  ";
        s+=typelist[0][sizeIndex]+" Size: £"+costlist[0][sizeIndex]+"\n  ";
        s+=typelist[1][crustIndex]+" Crust: £"+costlist[1][crustIndex]+"\n  ";
        s+="BASE COST: £"+Math.round((costlist[0][sizeIndex]+costlist[1][crustIndex]) * 100D) / 100D+"\n  ";
        if(t1Index!=0)   s+=typelist[3][t1Index]+" Topping: 5 * £"+costlist[3][t1Index]+" = £"+(5*costlist[3][t1Index])+"\n  ";
        if(t2Index!=0)   s+=typelist[3][t2Index]+" Topping: 4 * £"+costlist[3][t2Index]+" = £"+(4*costlist[3][t2Index])+"\n  ";
        s+=typelist[2][sauceIndex]+" Sauce: £"+costlist[2][sauceIndex]+"\n  ";
        s+="\n\n";
        return s;
    }
    
    public void setSizeIndex(String sizeString)  //[0][]
    {
        if(sizeString.equals("SMALL Size: £9.45")) this.size=0;
        else if(sizeString.equals("MEDIUM Size: £11.87")) this.size=1;
        else this.size=2;
    }
    
    public void setCrustIndex(String crustString)  //[1][]
    {
        if(crustString.equals("THIN Crust: £1.08")) this.crust=0;
        else if(crustString.equals("DEEP Crust: £1.10")) this.crust=1;
        else this.crust=2;
    }
    
    public void setSauceIndex(String sauceString)  //[2][]
    {
        if(sauceString.equals("PESTO Sauce: £0.50")) this.sauce=1;
        else this.sauce=0;
    }
    
    public void setTopping1Index(String t1String)  //[3][]
    {
        if(t1String.equals("OLIVES Topping: £0.08")) this.topping1=1;
        else if(t1String.equals("EXTRA CHEESE Topping: £0.02")) this.topping1=2;
        else if(t1String.equals("CHILLI Topping: £0.06")) this.topping1=3;
        else if(t1String.equals("PEPPERONI Topping: £0.10")) this.topping1=4;
        else if(t1String.equals("MUSHROOM Topping: £0.03")) this.topping1=5;
        else if(t1String.equals("ROCKET Topping: £0.05")) this.topping1=6;
        else if(t1String.equals("JALAPENOS Topping: £0.20")) this.topping1=7;
        else if(t1String.equals("ONION Topping: £0.07")) this.topping1=8;
        else if(t1String.equals("ANCHOVY Topping: £0.09")) this.topping1=9;
        else this.topping1=0;
    }
    
    public void setTopping2Index(String t2String)  //[3][]
    {
        if(t2String.equals("OLIVES Topping: £0.08")) this.topping2=1;
        else if(t2String.equals("EXTRA CHEESE Topping: £0.02")) this.topping2=2;
        else if(t2String.equals("CHILLI Topping: £0.06")) this.topping2=3;
        else if(t2String.equals("PEPPERONI Topping: £0.10")) this.topping2=4;
        else if(t2String.equals("MUSHROOM Topping: £0.03")) this.topping2=5;
        else if(t2String.equals("ROCKET Topping: £0.05")) this.topping2=6;
        else if(t2String.equals("JALAPENOS Topping: £0.20")) this.topping2=7;
        else if(t2String.equals("ONION Topping: £0.07")) this.topping2=8;
        else if(t2String.equals("ANCHOVY Topping: £0.09")) this.topping2=9;
        else this.topping2=0;
    }
    
    
}
