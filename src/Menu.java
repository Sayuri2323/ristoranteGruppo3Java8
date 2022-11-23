package src;

import java.util.ArrayList;
import java.util.List;

public class Menu {

   private String resturantName;
   private String typeOfMenu;

   public List<IPortata> listaPortate = new ArrayList<>();

   public Menu(String resturantName, String typeOfMenu){
       this.resturantName=resturantName;
       this.typeOfMenu=typeOfMenu;
   }
    public String getResturantName() {
        return resturantName;
    }
    public String getTypeOfMenu() {
        return typeOfMenu;
    }

    public void printMenu(){
       System.out.println(resturantName);
       System.out.println(typeOfMenu);
   }

}