public class Stringtut {
    public static void main(String[] args) {
        String name="Miza";
        // class -> variable-> creates an object in heap 
        // when JRE is trigerred :Miza goes to stringpool 
        // name stores to the reference 
        // works as class and data type String literal 
        String naam="Miza";
        System.out.println(naam);
        String hs="Miza";
        // creates a same refernce literal approach one object is only created 
        // String is class represents strings 
        // wrapper of char array 
        // is immutable ,uses StringPool, can be created by String literal and new String
        // provides lots of prebuilt methods 
        // heap->String Pool ->creates an address 
        naam="help";
        // now new reference is created but older reamins there 
        System.out.println(name==hs);
        String n3=new String("miza");
        System.out.println(hs==n3);;
        // as both have diff address
        // will always go to pool 
        String n4=new String("Miza").intern();
        System.out.println(n4==name);
        // intern () works in the pool :no object created if present already 
        System.out.println(name.equals(n4));
        // equals compares the value and == compares the reference 
        // String is immuntable
        String sql="select* form users";
        sql+="dzhjff";
        // we are always creating new strings 
System.out.println(sql);
        // String Buffer :synchornized :when multiple users try to access then one has to be syncronized likea lock
        StringBuffer sb=new StringBuffer("jzhffzf");
        sb.append("zjdhfhesf");
        // only one thread at a time other has to wait 
        // gives us 16 capacity and length is 0 
        StringBuilder sa=new StringBuilder("dqad");
        sa.append("ff");
        System.out.println(sa.length());
        System.out.println(sa.capacity());
        // no lock here 
        // deafult is 16 : lenght>default then 
        // new capacity =old*2 +2
        
    }
}
