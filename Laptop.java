class Laptops{
    private String brand;
    private String processor; 
    private int ram; 
    private int storage; 
    private int price;

    public void setbrand(String b){    
        brand = b;
     }
     public String getbrand(){
         return brand;
     }

     public void setprocessor(String p){ 
        processor = p; 
    } 
    
    public String getprocessor(){ 
        return processor; 
    } 
    
    public void setram(int r){ 
        ram = r; } 
        public int getram(){ 
            return ram; 
        }
        
    public void setstorage(int s){ 
        storage = s; 
    } 
    
    public int getstorage(){ 
        return storage; 
    } 
    
    public void setprice(int p){ 
        price = p; 
    } 
    
    public int getprice(){ 
        return price; 
    }
}

public class Laptop {
    public static void main(String[] args) {
        
        Laptops l1 = new Laptops(); 
        Laptops l2 = new Laptops(); 
        Laptops l3 = new Laptops(); 
        Laptops l4 = new Laptops(); 
        Laptops l5 = new Laptops();

        l1.setbrand("Dell"); 
        l1.setprocessor("intel i5"); 
        l1.setram(8); 
        l1.setstorage(512); 
        l1.setprice(60000);

        l2.setbrand("Dell"); 
        l2.setprocessor("intel i5"); 
        l2.setram(8); 
        l2.setstorage(512); 
        l2.setprice(60000);

        l3.setbrand("Dell"); 
        l3.setprocessor("intel i5"); 
        l3.setram(8); 
        l3.setstorage(512); 
        l3.setprice(60000);

        l4.setbrand("Dell"); 
        l4.setprocessor("intel i5"); 
        l4.setram(8); 
        l4.setstorage(512); 
        l4.setprice(60000);

        l5.setbrand("Dell"); 
        l5.setprocessor("intel i5"); 
        l5.setram(8); 
        l5.setstorage(512); 
        l5.setprice(60000);


        System.out.println(l1.getbrand()); 
        System.out.println(l1.getprocessor()); 
        System.out.println(l1.getram()); 
        System.out.println(l1.getstorage()); 
        System.out.println(l1.getprice()); 
        
        if(l1.getprice() > 70000){ 
            System.out.println("Premium Laptop"); 
        }else{ 
            System.out.println("Budget Laptop"); 
        }

        System.out.println(l2.getbrand()); 
        System.out.println(l2.getprocessor()); 
        System.out.println(l2.getram()); 
        System.out.println(l2.getstorage()); 
        System.out.println(l2.getprice()); 
        
        if(l2.getprice() > 70000){ 
            System.out.println("Premium Laptop"); 
        }else{ 
            System.out.println("Budget Laptop"); 
        }
        
        System.out.println(l3.getbrand()); 
        System.out.println(l3.getprocessor()); 
        System.out.println(l3.getram()); 
        System.out.println(l3.getstorage()); 
        System.out.println(l3.getprice()); 
        
        if(l3.getprice() > 70000){ 
            System.out.println("Premium Laptop"); 
        }else{ 
            System.out.println("Budget Laptop"); 
        }

         System.out.println(l4.getbrand()); 
        System.out.println(l4.getprocessor()); 
        System.out.println(l4.getram()); 
        System.out.println(l4.getstorage()); 
        System.out.println(l4.getprice()); 
        
        if(l4.getprice() > 70000){ 
            System.out.println("Premium Laptop"); 
        }else{ 
            System.out.println("Budget Laptop"); 
        }

         System.out.println(l5.getbrand()); 
        System.out.println(l5.getprocessor()); 
        System.out.println(l5.getram()); 
        System.out.println(l5.getstorage()); 
        System.out.println(l5.getprice()); 
        
        if(l5.getprice() > 70000){ 
            System.out.println("Premium Laptop"); 
        }else{ 
            System.out.println("Budget Laptop"); 
        }
    }
}
