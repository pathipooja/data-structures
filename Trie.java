/**
 *
 * @author Pooja
 */
import java.util.Scanner;
public class Trie {
    char c;
    Trie[] children;
    boolean word;
    
    public Trie(){
    this.c=0;
    this.children=new Trie[26];
    this.word=false;
    }
    
    public void add(String s){
    if(s.isEmpty()){
    this.word=true;
    return;
    }
    char letter=s.charAt(0);
    int index=letter-'a';
    if(this.children[index]==null)
    {
    this.children[index]= new Trie();
    }
    this.children[index].add(s.substring(1));
    }
    
    public boolean isWord(String s){
    
    if(s.isEmpty())
    {
        return this.word;
    }
    char letter=s.charAt(0);
    int index=letter-'a';
        if(this.children[index]==null)
       {
            return false;
       }
    return this.children[index].isWord(s.substring(1));
    }
    
    public static void main(String args[])
    {
    Trie t=new Trie();
    boolean a;
    Scanner s=new Scanner(System.in);
    boolean loop=true;
    int i,con;
    String str;
    while(loop)
    {    
      System.out.println("Menu\n1.Insertion\n2.Search\nEnter your choice\n");
        i=s.nextInt();
	switch(i){
            case 1:
                 System.out.println("enter your word to insert\n");
                 str=s.next();
                 t.add(str);
                 break;
            case 2:
                 System.out.println("enter your word to search\n");
                 str=s.next();
                 a=t.isWord(str);
                 System.out.println(a);
                 break;
            default:
                System.out.println("invalid choice!!!");
                }
        System.out.println("Do you want to continue???1=Yes , 0=No\n");
	con=s.nextInt();
	if(con==0)
        {
        loop=false;
        }
    }
    }
}
