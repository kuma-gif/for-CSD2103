/*  เขียนโปรแกรมพิมพ์จำนวนที่หารด้วย 5 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 100  */
public class a14 {
    public static void main(String[] args) {
        System.out.println("จำนวนที่หารด้วย 5 ลงตัวที่อยู่ระหว่าง 1 และ 100:");
        // ใช้ลูป for เพื่อวนรอบตั้งแต่ 1 ถึง 100 โดยเพิ่มค่าของตัวนับ i เริ่มจาก 1 และเพิ่มขึ้นไปเรื่อยๆ จนถึงค่า 100
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}