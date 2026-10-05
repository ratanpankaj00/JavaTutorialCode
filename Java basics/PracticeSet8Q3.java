public class PracticeSet8Q3 {
    public static class Square{
        float side;
        float area;
        float perimeter;
        public void setSide(float n){this.side = n;}
        public float getArea(){area = 3.14f*side*side;return area;}
        public float getPerimeter(){perimeter = 4f*side;return perimeter;}

    }
    
    public static void main(String[] args){
        Square sq1 = new Square();
        sq1.setSide(2.5f);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
    }
}
