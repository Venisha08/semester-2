package ps1;

public class TrianglesThirdEdge {

    public static int nextEdge(int side1,int side2)
    {
       return (side1+side2)-1;
    }
    public static void main(String[] args) {
        System.out.println(nextEdge(8,10));
        System.out.println(nextEdge(5,7));
        System.out.println(nextEdge(9,2));

    }
}
