public class Wrapper {
    public static void main(String[] args) {
        // value types:gives pure values 
        int x=87;
        System.out.println(x);
        // goes to heap and creates a reference 
        Integer y=20;
        // in integer pool 
        Integer z=20;
        // pointed at the same reference 
        // goes to pool when size is 1Byte must be within -128 to 127
        System.out.println(y==z);
        // Boxing
        Integer s1=220;
        Integer s2=220;
        System.out.println(s1==s2);
        // autoboxing (unboxing,boxing)
        // needed to do this manually before , by wrapper
        s2++;
        // as it has reference
        System.out.println(s2);
        System.out.println(s2.toString());
        // xxxValue()
        System.out.println(s2.byteValue());
        System.out.println(Integer.parseInt("24"));
        // Float Long Character Character.isAlpahbetic()
        // collections work on object and wrappers take us towards it 
        // jAVA is not purely objcet oriented as we use primitive data types 
        
    }
}
