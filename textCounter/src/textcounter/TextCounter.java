/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textcounter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joeva
 */
public class TextCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(("src/shrek-script-pdf.pdf"))));
        int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g = 0,h = 0,i = 0,
                j = 0,k = 0,l = 0,m = 0,n = 0,o = 0,p = 0,q = 0,r = 0,
                s = 0,t = 0,u = 0,v = 0,w = 0,x = 0,y = 0,z = 0;
        String cur;
        char let;
        String a1 = "a", b1 = "b", c1 = "c", d1 = "d", e1 = "e", f1 = "f",
               g1 = "g", h1 = "h", i1 = "i", j1 = "j", k1 = "k", l1 = "l", 
               m1 = "m", n1 = "n", o1 = "o", p1 = "p", q1 = "q", r1 = "r", 
               s1 = "s", t1 = "t", u1 = "u", v1 = "v", w1 = "w", x1 = "x", 
               y1 = "y", z1 = "z";
   
        while ((cur = file.readLine()) != null){

            for(int len = 0; len < cur.length(); len++){
                let = cur.charAt(len);
                String letter = Character.toString(let);
                if (letter.equalsIgnoreCase(a1)){
                    a++;
                } else if (letter.equalsIgnoreCase(b1)){
                    b++;
                } else if (letter.equalsIgnoreCase(c1)){
                    c++;
                } else if (letter.equalsIgnoreCase(d1)){
                    d++;
                } else if (letter.equalsIgnoreCase(e1)){
                    e++;
                } else if (letter.equalsIgnoreCase(f1)){
                    f++;
                } else if (letter.equalsIgnoreCase(g1)){
                    g++;
                } else if (letter.equalsIgnoreCase(h1)){
                    h++;
                } else if (letter.equalsIgnoreCase(i1)){
                    i++;
                } else if (letter.equalsIgnoreCase(j1)){
                    j++;
                } else if (letter.equalsIgnoreCase(k1)){
                    k++;
                } else if (letter.equalsIgnoreCase(l1)){
                    l++;
                } else if (letter.equalsIgnoreCase(m1)){
                    m++;
                } else if (letter.equalsIgnoreCase(n1)){
                    n++;
                } else if (letter.equalsIgnoreCase(o1)){
                    o++;
                } else if (letter.equalsIgnoreCase(p1)){
                    p++;
                } else if (letter.equalsIgnoreCase(q1)){
                    q++;
                } else if (letter.equalsIgnoreCase(r1)){
                    r++;
                } else if (letter.equalsIgnoreCase(s1)){
                    s++;
                } else if (letter.equalsIgnoreCase(t1)){
                    t++;
                } else if (letter.equalsIgnoreCase(u1)){
                    u++;
                } else if (letter.equalsIgnoreCase(v1)){
                    v++;
                } else if (letter.equalsIgnoreCase(w1)){
                    w++;
                } else if (letter.equalsIgnoreCase(x1)){
                    x++;
                } else if (letter.equalsIgnoreCase(y1)){
                    y++;
                } else if (letter.equalsIgnoreCase(z1)){
                    z++;
                }
        }
    }
        System.out.println("Number of letters in movie script");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("u = " + u);
        System.out.println("v = " + v);
        System.out.println("w = " + w);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}