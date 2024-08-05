package list.task.hospital;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Page {
public static void main(String[] args) {
   
   // 의사 (에스쿱스, 호시, 조슈아, ) 간호사(태연, 수영, 윤아, 유리) 
   
   //   -환자 추가 
   Hospital 윤도운 = new Hospital("조슈아", "태연", "윤도운", 10000);
   Hospital 영케이 = new Hospital("호시", "윤아", "영케이", 15000);
   Hospital  박성진  = new Hospital("조슈아", "태연", "박성진", 30000);
   Hospital 원필 = new Hospital("에스쿱스", "유리", "원필", 35000);
   Hospital 양요섭 = new Hospital("조슈아", "수영", "양요섭", 8000);
   Hospital 윤두준 = new Hospital("호시", "수영", "윤두준", 18000);
   Hospital 이기광 = new Hospital("호시", "윤아", "이기광", 50000);
   Hospital 손동운 = new Hospital("에스쿱스", "유리", "손동운", 60000);
   Hospital 버논 = new Hospital("에스쿱스", "태연", "버논", 20000);
   
   
   
//   -환자  삭제 
   
   
//   -의사가 환자 정보 조회
   Clinic clinic = new Clinic();
   ArrayList<Hospital> hospitals = null;
   
   if(clinic.inquire("조슈아")== null) {
      clinic.add(박성진);
   }
         System.out.println(clinic.inquire("조슈아").getPatient());         
         
         
//   -진료비 5% 할인   만약, 박성진을  진료비 할인을 해준다면 
         if(clinic.inquire("조슈아")==null) {
            clinic.add(박성진);
         }
         
         Hospital hospital = clinic.inquire("조슈아");
         if(hospital != null) {
            hospital.setMedicalexpenses(30000);
            clinic.downdata(hospital);
         }
         System.out.println(DBConnecter.hospitals);
}
}
