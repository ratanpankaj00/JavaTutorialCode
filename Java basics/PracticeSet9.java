public class PracticeSet9 {
    public class Cylinder {
        float height;
        float radius;

        public void setHeight(float n) {
            height = n;
        }

        public void setRadius(float n) {
            radius = n;
        }

        public float getCurvedSurfaceArea() {
            return 2f * 3.14f * radius * height;
        }

        public float getVolume() {
            return 3.14f * radius * radius * height;
        }
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setHeight(5.4);
        cylinder1.setRadius(2.5);
    }
}