public class AutoMorphic {
    public static String autoMorphic(int number)
    {
        return ((""+(number*number)).endsWith(""+number))?"Automorphic":"Not!!";
    }
}