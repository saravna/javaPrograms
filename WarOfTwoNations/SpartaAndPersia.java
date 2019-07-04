import java.util.*;
public class SpartaAndPersia{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character, Integer> persians=new HashMap<>();
        HashMap<Character, Integer> spartans=new HashMap<>();
        int n=Integer.parseInt(sc.nextLine());
        int pe=0,sp=0;
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            int j=0;
            while(s.charAt(j)!='$' && j<s.length()){
                char temp;
                int c=0;
                if(s.charAt(j)>='a' && s.charAt(j)<='z'){
                    temp=s.charAt(j);
                    j++;
                    c=0;
                    while(s.charAt(j)=='.' || s.charAt(j)=='X'){
                        if(s.charAt(j)=='X')
                            c++;
                        c++;
                        j++;
                    }
                    if(persians.containsKey(temp)){
                        persians.put(temp,persians.get(temp)+c);
                    } else {
                        persians.put(temp,c);
                    }
                } else if(s.charAt(j)>='A' && s.charAt(j)<='Z'){
                    temp=s.charAt(j);
                    j++;
                    c=0;
                    while(s.charAt(j)=='.' || s.charAt(j)=='X'){
                        if(s.charAt(j)=='X')
                            c++;
                        c++;
                        j++;
                    }
                    if(spartans.containsKey(temp)){
                        spartans.put(temp,spartans.get(temp)+c);
                    } else {
                        spartans.put(temp,c);
                    }
                }
                //System.out.println(persians+" "+spartans+" "+j);
            }
        }
        sp=(spartans.get('H')*5)+(spartans.get('E')*10)+(spartans.get('A')*3)+spartans.get('C');
        pe=(persians.get('h')*5)+(persians.get('e')*10)+(persians.get('a')*3)+persians.get('c');
        if(sp>pe)
            System.out.println("Sparta Wins");
        else    
            System.out.println("Persia Wins");
    }
}