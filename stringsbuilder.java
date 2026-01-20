public class stringsbuilder {
    public static void main(String[] args){
        StringBuilder ar=new StringBuilder("lodu");
        System.out.println(ar);
        //char at index mai name.charAt() laga ke likhna hai
        System.out.println(ar.charAt(0));
        //ismai humein do points dene hai jiss char pe humko change karnahai 
        //dusra humein ky char dena hai isko name.setCharAt() se represent karte hai
        ar.setCharAt(2,'x');
        System.out.println(ar);
        
        //insert mai name.insert(x,y) dete hai ismai x position hai or y jo bhi aapka man
        // ye use hota hai shift karne ke liye ki name same rahega bss position change hojayegi
        ar.insert(0,'s');
          System.out.println(ar);

          //delete fuction mai hum jo bhi part chahe vo delete kar sakte hai

          ar.delete(0,3);
            System.out.println(ar);

            //if we want to add something at the last then we can use .append() function
            ar.append("x");
             ar.append("x");
              ar.append("x");
               ar.append("x");
            System.out.println(ar.length());

    }
}
