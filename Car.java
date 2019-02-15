class Car {

   int Year;
   String Brand, Model;

    public Car(String brand, String model, int year) 
    {
      Brand = brand;
      Model = model;
      Year = year;
    }

 
    public String getBrand() 
    {
      return Brand;
    }

    public int getYear() 
    {
       return Year;
    }
 
    public String getModel()
    {
       return Model;
    }
 }