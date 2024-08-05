package list.task.hospital;

import java.util.ArrayList;

import list.task.DBConnecter;

//-실습[3]  
//	소규모 병원
//-병원 정보를 담을 클래스 선언 
//   -의사 클래스
//   -간호사 클래스
//   -환자 클래스
//   -진료비 
//   
// CURD 
//   -환자 추가 
//   -환자 삭제 
//   -의사가 환자 정보 조회
//   -진료비 5% 할인


public class Clinic {
//   -환자 추가 
   public void add(Hospital hospital) {
      DBConnecter.hospitals.add(hospital);
   }
//   -환자  삭제 
   public void remove (Hospital hospital) {
      DBConnecter.hospitals.remove(hospital);
   }
   
//   -의사가 환자 정보 조회
   public Hospital inquire(String docter) {
      ArrayList<Hospital> hospitals = (ArrayList<Hospital>) DBConnecter.hospitals.clone();
      
      for (int i = 0; i <hospitals.size(); i++) {
         if(hospitals.get(i).getDocter().equals(docter)) {
            return hospitals.get(i);
         }

      }   
      return null;
   }
   
//   -진료비  5% 할인     // 질문: 진료비만  5%할인을 적용할수 있는 방법? 
   public void downdata(Hospital hospital) {
   ArrayList<Hospital>hospitals = (ArrayList<Hospital>) DBConnecter.hospitals.clone();            // 주소 값
   hospital.setMedicalexpenses((int)(hospital.getMedicalexpenses()*(1-0.05)));         // 5%의 할인율 1 에서 0.05를 빼야 할인율을 적용할수 있다. 
      DBConnecter.hospitals.get(0)   ;   //검색부터 ?
   }
   
   
}
