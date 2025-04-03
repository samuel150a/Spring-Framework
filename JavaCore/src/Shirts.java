class Shirts
{
    public static void main(String[] args)
    {
        String Element1="AllenSolly";
        String Element2="peterengland";
        String Element3="Arrow";
        String Element4="Raymond";
        String Element5="Levi";
        String[] Shirts={Element1,Element2,Element3,Element4,Element5};
        for(int i=0;i<2;i++)
        {
            System.out.println(Shirts[i]);
        }
        for(String ForEach:Shirts)
        {
            System.out.println("the list is " +ForEach);
        }
    }

}