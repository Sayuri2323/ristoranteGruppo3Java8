package src;

public class Menu {

   private String resturantName;
   private String typeOfMenu;

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