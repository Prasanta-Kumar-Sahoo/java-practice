/* Write a program to find area and perimeter of circle,square,rectangle and triangle using method 
overloading? */
class Shape
{
    void areaPerimeter(int a,int b, int c,int h)
    {
        int p = a+b+c;
        int ar =(b*h)/2;
        System.out.println("Area of Triangle is "+ar);
        System.out.println("Perimeter of Triangle is "+p);
    }
    void areaPerimeter(int l,int b)
    {
        int p = 2*(l+b);
        int a =l*b;
        System.out.println("Area of Rectangle is "+a);
        System.out.println("Perimeter of Rectangle is "+p);
    }
    void areaPerimeter(int s)
    {
        int p = 4*s;
        int a =s*s;
        System.out.println("Area of Rectangle is "+a);
        System.out.println("Perimeter of Rectangle is "+p);
    }
}
class P1
{
    public static void main(String[] args) 
    {
        Shape s = new Shape();
        s.areaPerimeter(6, 7, 12, 10);
        s.areaPerimeter(15, 8);
        s.areaPerimeter(13);
    }
}