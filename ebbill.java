import java.util.*;
public class ebbill{
    public static void main(String[] args) {
        String a[]={"Jan 1, 2020:shop1 320$shop2 220$shop3 330$shop4 420$shop5 5",
        "Jan 2, 2020:shop5 318$shop4 320$shop3 330$shop2 420$shop1 5",
        "Jan 3, 2020:shop1 316$shop1 820$shop3 330$shop4 420$shop5 5",
        "Jan 4, 2020:shop5 5",
        "Jan 5, 2020:shop3 330$shop4 420",
        "Jan 6, 2020:shop1 324$shop3 330$shop4 420$shop5 5",
        "Jan 7, 2020:shop1 320$shop2 220$shop3 330$shop4 420$shop5 51",
        "Jan 8, 2020:" };
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("shop1",0);
        hm.put("shop2",0);
        hm.put("shop3",0);
        hm.put("shop4",0);
        hm.put("shop5",0);
        for(int i=0;i<a.length;i++){
            if(a[i].split(":").length==2){
                String details=a[i].split(":")[1];
                String shops[]=details.split("\\$");
                for(int j=0;j<shops.length;j++){
                    String shop=shops[j].split(" ")[0];
                    int power=Integer.parseInt(shops[j].split(" ")[1]);
                    hm.put(shop,hm.get(shop)+power);
                }
            }    
        }
        System.out.println(hm);
        for(int i=1;i<=5;i++){
            String temp="shop"+i;
            int power=hm.get(temp);
            int bill=0;
            if(power>1000 && power<2000)
                bill=(int)(power*0.33);
            else if(power>2000 && power<5000)
                bill=(int)(power*0.3);
            else if(power>5000)
                bill=(int)(power*0.2);
            System.out.println(temp+":"+bill);
        }
    }
}