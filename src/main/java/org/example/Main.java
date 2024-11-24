package org.example;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                // إنشاء فنانين
                String artiste1 = "الهادي حبوبة";
                String artiste2 = "صابر الرباعي";

                // إنشاء أغاني
                Chanson chanson1 = new Chanson(240, 2020, "Pop", artiste1);
                Chanson chanson2 = new Chanson(180, 2022, "Raï", artiste2);
                Chanson chanson3 = new Chanson(300, 2021, "Classique", artiste1);
                Chanson chanson4 = new Chanson(200,2023,"Melody",artiste2);
                // إنشاء ألبومات
                Disque disque1 = new Disque(1000, 2023, "Pop, Classique", "أجمل الأغاني");
                Disque disque2 = new Disque(1200, 2024, "Raï", "أغاني الأفراح");

                // إضافة الأغاني للألبومات
                disque1.addChanson(chanson1);
                disque1.addChanson(chanson3);
                disque2.addChanson(chanson2);
                disque2.addChanson(chanson4);

                // عرض معلومات الألبومات
                System.out.println("------------------------");
                System.out.println("معلومات الألبوم: " + disque1.nomPub());
                System.out.println("السعة الفارغة: " + disque1.getCapaciteLibre());
                System.out.println("عدد الأغاني: " + disque1.nbChansons());
                System.out.println("سعر البيع: " + disque1.prix() + " دينار");

                System.out.println("------------------------");
                System.out.println("معلومات الألبوم: " + disque2.nomPub());
                System.out.println("السعة الفارغة: " + disque2.getCapaciteLibre());
                System.out.println("عدد الأغاني: " + disque2.nbChansons());
                System.out.println("سعر البيع: " + disque2.prix() + " دينar");

                // نشر الأعمال الفنية
                System.out.println("------------------------");
                System.out.println("الأعمال الفنية المنشورة:");
                System.out.println("  - " + chanson1.nomPub());
                System.out.println("  - " + chanson2.nomPub());
                System.out.println("  - " + disque1.nomPub());
                System.out.println("  - " + disque2.nomPub());
                //محاولة اضافة اغنية لا يتسع لها القرص
                if(disque1.addChanson(new Chanson(1000,2020,"Rock","Smash Mouth"))){
                    System.out.println("تم اضافة الاغنية بنجاح");
                }else{
                    System.out.println("لا يمكن اضافة الاغنية القرص لا يتسع");
                }
            }
        }

