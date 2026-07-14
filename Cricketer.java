class crickete{
      
private int id;
private String name;
private int runs;
private int matches;

  public void setid(int i){
    id = i;
  }

  public int getid(){
    return id;
  }

    public void setname(String s){
    name = s;
  }

  public String getname(){
    return name;
  }

    public void setruns(int r){
    runs = r;
  }

  public int getruns(){
    return runs;
  }

      public void setmatches(int m){
    matches = m;
  }

  public int getmatches(){
    return matches;
  }



public int getaverage(){
    return runs/matches;
}
}

public class Cricketer{
    public static void main(String[] args) {
        

        crickete c1 = new crickete();

        c1.setid(18);
        c1.setname("Virat Kohli");
        c1.setruns(14000);
        c1.setmatches(300);
        c1.getaverage();


        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getruns());
        System.out.println(c1.getmatches());
        System.out.println(c1.getaverage());


    }
}