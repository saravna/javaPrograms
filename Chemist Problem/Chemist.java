import java.util.*;

public class Chemist{
    static int count=0;
    static ArrayList<String> cc=new ArrayList<>();
    static ArrayList<String> compounds=new ArrayList<>();
    static ArrayList<String> elements=new ArrayList<>();
    static void contains(String s){
        if(!cc.contains(s) && compounds.contains(s)){
            cc.add(s);
            count++;
            int index=compounds.indexOf(s);
            String temp[]=elements.get(index).split("\\+");
            for(int i=0;i<temp.length;i++){
                contains(temp[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String temp=sc.nextLine();
            compounds.add(temp.split("\\=")[0]);
            elements.add(temp.split("\\=")[1]);
        }
        int m=Integer.parseInt(sc.nextLine());
        String reqCompund[]=new String[m];
        for(int i=0;i<m;i++){
            reqCompund[i]=sc.nextLine();
            contains(reqCompund[i]);
        }
        System.out.println(count);
        sc.close();
    }
}